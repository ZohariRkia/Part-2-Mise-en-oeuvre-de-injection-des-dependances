package prese;

import ext.DaoImpl2;
import metier.MetierImpl;

public class presentation {
    public static  void main(String [] args){
        /*
        Injection des dependances par Instanciation
        Statique=> new
         */
        DaoImpl2 dao=new DaoImpl2();
       // DaoImpl dao=new DaoImpl();
        //MetierImpl metier=new MetierImpl(dao);
        MetierImpl metier=new MetierImpl(dao);
        metier.setDao(dao);
        System.out.println("Résultat="+metier.calcule());
    }
}
