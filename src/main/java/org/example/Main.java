package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] ars) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Solution obj1 =ctx.getBean("A1", Solution.class);
        obj1.Test1();

        Solution obj2 =ctx.getBean("A2", Solution.class);
        obj2.Test2();

        ctx.close();
    }
}