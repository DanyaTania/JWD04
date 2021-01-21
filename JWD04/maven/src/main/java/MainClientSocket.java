import com.sun.xml.internal.org.jvnet.staxex.Base64Data;

import java.io.*;
import java.net.*;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.StandardCharsets;

public class MainClientSocket  {
    private Socket clientSocket= null;
    private InputStream sockInput = null;
    private OutputStream sockOutput = null;
    private static String address="212.7.211.158";

    private static String username="tgour153";

    MainClientSocket() throws IOException {

 String address="8081";
        File baseDirectory = new File(address);

        File outputFile = new File(baseDirectory.getAbsolutePath(),"");
        if (!outputFile.getParentFile().exists()) {
            if (!outputFile.getParentFile().mkdirs()) {
                System.out.println(
                        "- ERROR creating output directory '" + outputFile.getParentFile().getAbsolutePath() + "'");
            }
        }
        System.out.println("- Downloading to: " + outputFile.getAbsolutePath());
        String url="";
        try {
            downloadFileFromURL(url, outputFile);
            System.out.println("Done");
            System.exit(0);
        } catch (Throwable e) {
            System.out.println("- Error downloading");
            e.printStackTrace();
            System.exit(1);
        }
    }

        private static void downloadFileFromURL(String urlString, File destination) throws Exception {
            if (System.getenv("host_USERNAME") != null && System.getenv("host_PASSWORD") != null) {

                Authenticator.setDefault(new Authenticator() {

                    final char[] password = System.getenv("host_PASSWORD").toCharArray();

                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });
            }
            URL website = new URL(urlString);
            ReadableByteChannel rbc;
            rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream(destination);
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            fos.close();
            rbc.close();


try ( Socket socket = new Socket( InetAddress.getByName( address ), 80 ) ) {
        // типа гет-запрос
        socket.getOutputStream().write( ("GET /ip HTTP/1.0\n"
                + "Host: address\n"
                + "Accept: text/html\n\n").getBytes( StandardCharsets.US_ASCII ) );
        socket.getOutputStream().flush();

        InputStream is = socket.getInputStream();
        byte[] buffer = new byte[8192];
        // ByteArrayOutputStream используется, как накопитель байт, чтобы
        //   потом превратить в строку все полученные данные.
        //   преобразовывать часть потока в строку опасно, т.к.
        //   если данные идут в многобайтной кодировке, один символ может
        //   быть разрезан между чтениями
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // InputStream.read( byte[] ) возвращает количество прочитанных байт
        //   и -1, если поток кончился (сервер закрыл соединение)
        for ( int received; (received = is.read( buffer )) != -1; ) {
            // записываем прочитанное из потока, от 0 до количества считанных
            baos.write( buffer, 0, received );
        }

        // преобразуем в строку ( кодировку желательно указывать )
        String reply = baos.toString( "UTF-8" );
        // можно так, но toByteArray() создает копию массива, а я у мамы оптимизатор
        //String reply = new String( baos.toByteArray(), StandardCharsets.UTF_8 );

        System.out.println( reply );
    }

    }
    public static void main(String[] args) throws IOException {
        MainClientSocket mainClientSocket=new MainClientSocket();

    }
}