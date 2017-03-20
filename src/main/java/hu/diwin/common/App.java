package hu.diwin.common;

import org.hibernate.Session;
import hu.diwin.persistance.HibernateUtil;


public class App {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Stock stock = new Stock();

        stock.setStockCode("23443");
        stock.setStockName("Energy Drink");

        session.save(stock);
        session.getTransaction().commit();
    }
}
