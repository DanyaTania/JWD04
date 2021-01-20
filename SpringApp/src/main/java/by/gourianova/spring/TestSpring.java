package by.gourianova.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public  static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Book book=context.getBean("bookBean",Book.class);
        TextHandler textHandler=new TextHandler(book);
        textHandler.HandlingBook();
        context.close();
    }
}
