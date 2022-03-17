package metier;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


import org.springframework.stereotype.Component;


import dao.IDao;
@Component
public class ImetierImpl implements Imetier {

    //Couplage faible
    private IDao dao ;

    public ImetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
double tmp=dao.getData();
double res=tmp*2;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
