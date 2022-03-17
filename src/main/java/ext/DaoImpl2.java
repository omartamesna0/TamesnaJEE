package ext;

import dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("dao2")

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version capteur");
        double tmp=8000;/*jahanam xD*/
        return tmp;
    }
}
