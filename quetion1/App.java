package Ch_22.Spring1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext b=new ClassPathXmlApplicationContext("config.xml");
        student a=b.getBean("600",student.class);
        employe s=b.getBean("900",employe.class);
        System.out.println(a);
        System.out.println(s);
  
    }
}
