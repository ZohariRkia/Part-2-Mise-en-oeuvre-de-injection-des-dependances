package prese;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXML {
    public  static  void main(String [] args){
        ApplicationContext context =new ClassPathXmlApplicationContext("appliccationContext.xml");
        IMetier metier=(IMetier) context.getBean("metier");
        System.out.println("Résultat=>"+metier.calcule());


    }
}