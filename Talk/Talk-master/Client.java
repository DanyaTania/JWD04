import java.net.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * создание клиента со всеми необходимыми утилитами, точка входа в программу в классе Client
 */

class TaskNumber implements Serializable{
    private static int task;
    public void setTask(int n){
        this.task=n;
    }
    public static int getTask(){
        return task;
    }
}
class Logon implements Externalizable {
    private String login;
    //private String password;

    public Logon() {
    }
    public Logon(String login) {
        this.login = login;
        //this.password = password;
    }
    @Override
    public String toString() {
        return  login;
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(login);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        login = (String) in.readObject();
    }
}
class ClientSomthing {
    
    private Socket socket;
    private BufferedReader in; // поток чтения из сокета
    private BufferedWriter out; // поток чтения в сокет
    private BufferedReader inputUser; // поток чтения с консоли
    private String addr; // ip адрес клиента
    private int port; // порт соединения
    private String doParsing; // имя клиента
    private Date time;
    private String dtime;
    private SimpleDateFormat dt1;



    /**
     * для создания необходимо принять адрес и номер порта
     *
     * @param addr
     * @param port
     */
    
    public ClientSomthing(String addr, int port) {
        this.addr = addr;
        this.port = port;
        try {
            this.socket = new Socket(addr, port);
        } catch (IOException e) {
            System.err.println("Socket failed");
        }
        try {
            // потоки чтения из сокета / записи в сокет, и чтения с консоли
            inputUser = new BufferedReader(new InputStreamReader(System.in));
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.pressdoParsing(); // перед началом необходимо спросит имя
            new ReadMsg().start(); // нить читающая сообщения из сокета в бесконечном цикле
            new WriteMsg().start(); // нить пишущая сообщения в сокет приходящие с консоли в бесконечном цикле
        } catch (IOException e) {
            // Сокет должен быть закрыт при любой
            // ошибке, кроме ошибки конструктора сокета:
            ClientSomthing.this.downService();
        }
        // В противном случае сокет будет закрыт
        // в методе run() нити.
    }
    
    /**
     * просьба ввести имя,
     * и отсылка эхо с приветсвием на сервер
     */
    
    private void pressdoParsing() {
        System.out.print("Good day! Should you do a synstaxic text analysis (yes/no)?");
        try {
            doParsing = inputUser.readLine();
            if(doParsing.contains("yes")){
            out.write(" Let's start"+  "\n"+"Type the number:\n"+

                                "1\n"+
                                "Найти наибольшее количество предложений текста, в которых есть одинаковые слова.\n"+
                                "2\n"+
                                "Вывести все предложения заданного текста в порядке возрастания количества слов в каждом из них.\n"+
                                "3\n"+
                                "Найти такое слово в первом предложении, которого нет ни в одном из остальных предложений.\n"+
                                "4\n"+
                                "Во всех вопросительных предложениях текста найти и напечатать без повторений слова заданной длины.\n"+
                                "5\n"+
                                "В каждом предложении текста поменять местами первое слово с последним, не изменяя длины предложения.\n"+
                                "6\n"+
                                "Напечатать слова текста в алфавитном порядке по первой букве. Слова, начинающиеся с новой буквы, печатать с красной строки.\n"+
                                "7\n"+
                                "Рассортировать слова текста по возрастанию доли гласных букв (отношение количества гласных к общему количеству букв в слове).\n"+
                                "8\n"+
                                "Слова текста, начинающиеся с гласных букв, рассортировать в алфавитном порядке по первой согласной букве слова.\n"+
                                "9\n"+
                                "Все слова текста рассортировать по возрастанию количества заданной буквы в слове.\n"+
                                "Слова с одинаковым количеством букв расположить в алфавитном порядке.\n"+
                                "10\n"+
                                "Существует текст и список слов. Для каждого слова из заданного списка найти,\n"+
                                "сколько раз оно встречается в каждом предложении, и рассортировать слова по убыванию общего количества вхождений.\n"+
                                "11\n"+
                                " В каждом предложении текста исключить подстроку максимальной длины, начинающуюся и заканчивающуюся заданными символами.\n"+
                                "12\n"+
                                " Из текста удалить все слова заданной длины, начинающиеся на согласную букву.\n"+
                                "13 \n"+
                                "Отсортировать слова в тексте по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.\n"+
                                "14 \n"+
                                " В заданном тексте найти подстроку максимальной длины, являющуюся палиндромом, т.е. читающуюся слева направо и справа налево одинаково.\n"+
                                "15\n"+
                                " Преобразовать каждое слово в тексте, удалив из него все последующие (предыдущие) вхождения первой (последней) буквы этого слова.\n"+
                                "16 \n"+
                                "В некотором предложении текста слова заданной длины заменить указанной  подстрокой, длина которой может не совпадать с длиной слова.\n"+"continue"+"\n !");

            }
            else{out.write(" Bye"+  "\n");}
            out.flush();
        } catch (IOException ignored) {
        }
        
    }
    
    /**
     * закрытие сокета
     */
    private void downService() {
        try {
            if (!socket.isClosed()) {
                socket.close();
                in.close();
                out.close();
            }
        } catch (IOException ignored) {}
    }
    
    // нить чтения сообщений с сервера
    private class ReadMsg extends Thread {
        @Override
        public void run() {
            
            String str;
            try {
                while (true) {
                    str = in.readLine(); // ждем сообщения с сервера
                    if (str.equals("stop")) {
                        ClientSomthing.this.downService(); //
                        break; // выходим из цикла если пришло "stop"
                    }

                    System.out.println(str); // пишем сообщение с сервера на консоль
                }
            } catch (IOException e) {
                ClientSomthing.this.downService();
            }
        }
    }
    
    // нить отправляющая сообщения приходящие с консоли на сервер
    public class WriteMsg extends Thread {
        
        @Override
        public void run() {
            while (true) {
                String userWord;
                try {
                    time = new Date(); // текущая дата
                    dt1 = new SimpleDateFormat("HH:mm:ss"); // берем только время до секунд
                    dtime = dt1.format(time); // время
                    userWord = inputUser.readLine(); // сообщения с консоли
                    if (MathHelp.isNumber(userWord )){
                        TaskNumber task=new TaskNumber();
Logon taskN=new Logon(userWord);
                        // task.setTask(Integer.parseInt(userWord));//в task задание по синтаксическому разбору

                        ObjectOutputStream out2 = new ObjectOutputStream(new FileOutputStream("Externals.out"));
                        out2.writeObject(taskN);
                        //out.writeObject(renat);
                        out2.close();


                        out.write("task:"+userWord );}
                    if (userWord.equals("no")) {
                        out.write("stop" + "\n");
                        ClientSomthing.this.downService(); //
                        break; // выходим из цикла если пришло "no"
                    } else {

                        out.write("(" + dtime + ") "  + "Вы сказали: " + userWord + "\n"); }// отправляем на сервер


                    out.flush(); // чистим
                } catch (IOException e) {
                    ClientSomthing.this.downService(); // в случае исключения тоже харакири
                    
                }
                
            }
        }
    }
}

public class Client {
    
    public static String ipAddr = "localhost";
    public static int port = 8080;
    
    /**
     * создание клиент-соединения с узананными адресом и номером порта
     * @param args
     */
    
    public static void main(String[] args) throws IOException {
        new ClientSomthing(ipAddr, port);


    }
}