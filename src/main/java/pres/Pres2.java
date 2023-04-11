package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.*;

public class Pres2 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("C:\\Users\\Lenovo ThinkPad T570\\IdeaProjects\\Injections\\src\\main\\java\\config.txt "));

        // instanciation dynamique
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao)cDao.newInstance();
        System.out.println(dao.getData());

        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();

        Method method = cMetier.getMethod("setDao",IDao.class);
        //metier.setDao(dao);
        method.invoke(metier,dao);
        System.out.println("resultat =>"+metier.calcule());


    }
}
