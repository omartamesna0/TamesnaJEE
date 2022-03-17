package dao;

import dao.IDao;

public class DaoImplVWS implements IDao{
    @Override
    public double getData() {
        System.out.println("version web serves");
        return 100;
    }
}
