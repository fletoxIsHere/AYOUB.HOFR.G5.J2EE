package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")

public class MetierImpl implements IMetier {
   // @Autowired

    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcule() {
        double tmp = dao.getData();
        double res= tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }

    // Injecter dans la variable dao un objet d'une class qui implemente l'interface IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
