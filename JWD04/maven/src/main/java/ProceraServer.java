import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//import org.apache.tomcat.util.json.JSONParser;
import json.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class ProceraServer implements Runnable {

  private static final Logger LOG = LoggerFactory.getLogger(ProceraServer.class);
    private static final int PORT = 50402;
    private final ExecutorService executorService = Executors.newSingleThreadExecutor();
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    @PostConstruct
    public void init() {
        executorService.execute(this);
    }

    @Override
    public void run() {
        LOG.debug("Start ProceraEndpoint...");
        try {
            serverSocket = new ServerSocket(PORT);
            LOG.debug("serverSocket was initialized [{}]", serverSocket);
            while (true) {
                LOG.debug("waiting for messages...");
                clientSocket = serverSocket.accept();
                try {
                    out = new PrintWriter(clientSocket.getOutputStream(), true);
                    in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    String inputLine;
                    if ((inputLine = in.readLine()) != null) {


                        LOG.debug("received message: [{}]", inputLine);
                        JSONParser jsonParser = new JSONParser(inputLine);
                        LinkedHashMap<String, Object> params = jsonParser.parseObject();
                        String id = params.get("id").toString();
                        LOG.debug("id is [{}]", id);
                        out.println("{\"id\":" + id + ", \"result\": null}");
                    }
                } catch (Exception e) {
                    LOG.error("Procera message handling error", e);
                } finally {
                    if (Objects.nonNull(in)) {
                        in.close();
                    }
                    if (Objects.nonNull(out)) {
                        out.close();
                    }
                }
            }
        } catch (Exception e) {
            LOG.error("Procera server start failed", e);
        } finally {
            try {

                if (Objects.nonNull(clientSocket)) {
                    clientSocket.close();
                }
            } catch (Exception e) {
                LOG.error("Procera stop clientSocket failed", e);
            }
            try {
                if (Objects.nonNull(serverSocket)) {
                    serverSocket.close();
                }
            } catch (Exception e) {
                LOG.error("Procera stop serverSocket failed", e);
            }
        }

    }

    @PreDestroy
    public void stop() throws Exception {

        if (Objects.nonNull(in)) {
            in.close();
        }
        if (Objects.nonNull(out)) {
            out.close();
        }
        try {
            if (Objects.nonNull(clientSocket)) {
                clientSocket.close();
            }
        } catch (Exception e) {
            LOG.error("Procera PreDestroy stop clientSocket failed", e);
        }
        try {
            if (Objects.nonNull(serverSocket)) {
                serverSocket.close();
            }
        } catch (Exception e) {
            LOG.error("Procera PreDestroy stop serverSocket failed", e);
        }
        executorService.shutdownNow();
    }

}
