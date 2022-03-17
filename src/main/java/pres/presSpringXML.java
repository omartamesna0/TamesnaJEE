package pres;

import dao.IDao;
import metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class presSpringXML {
    public static  void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Imetier metier=(Imetier) context.getBean("Imetier");
        System.out.println("Resultat = " +metier.calcul());
    }
}
