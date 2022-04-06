package metier;

import dao.InterfaceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class MetierImpl implements  IMetier{
   //coublage faible
    @Autowired
    //@Qualifier("dao")
 //   @Qualifier("dao2")
    private InterfaceDao dao;

    public MetierImpl(InterfaceDao dao) {
        this.dao = dao;
    }

    /*

    Injecter dans la variable Dao un object
    d'une classe qui implement l'interface InterfaceDao
     */
    public void setDao(InterfaceDao dao) {
        this.dao = dao;
    }

    @Override
    public  double calcule(){
        double tmp=dao.getData();
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return  res;

    }
}
