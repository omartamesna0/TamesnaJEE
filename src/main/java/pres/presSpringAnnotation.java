package pres;

import dao.IDao;
import metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class presSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("dao" ,"metier","ext");
        Imetier imetier = context.getBean(Imetier.class);
        System.out.println("Resultat :"+imetier.calcul());
    }
}
