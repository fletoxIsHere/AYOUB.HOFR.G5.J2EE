package ext;

import dao.IDao;

public class DaoImplVWS implements IDao {

    @Override
    public double getData() {
        System.out.println("version web service");
        double res = 2323.32;
        return res;
    }
}
