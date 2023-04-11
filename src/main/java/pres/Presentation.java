package pres;

import dao.DaoImpl;
import ext.DaoImpl2;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args){

    /*
        Injection des dependaces par instanciation statique => new couplage fort
     */

        DaoImpl2 dao = new DaoImpl2();
        MetierImpl metier = new MetierImpl(dao);
       // metier.setDao(dao);
        System.out.println("resultat="+metier.calcule());

    }
}
