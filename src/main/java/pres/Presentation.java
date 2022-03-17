package pres;

import dao.DaoImpl;
import ext.DaoImpl2;
import metier.ImetierImpl;

public class Presentation {
    public static void main(String[] args){
        DaoImpl2 dao = new DaoImpl2();
        ImetierImpl metier=new ImetierImpl(dao);
        //metier.setDao(dao);
        System.out.println("Resultants= "+metier.calcul());


    }
}
