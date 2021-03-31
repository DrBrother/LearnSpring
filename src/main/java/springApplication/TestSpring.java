package springApplication;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springApplication.conf.SpringConf;

public class TestSpring {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConf.class
        );

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        context.close();

    }
}
