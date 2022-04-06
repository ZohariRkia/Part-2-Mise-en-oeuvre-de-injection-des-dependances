package ext;

import dao.InterfaceDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpl2 implements InterfaceDao {
    @Override
    public  double getData(){

        System.out.println("Version capteurs");
        double temp=6000;
        return temp;
    }
}
