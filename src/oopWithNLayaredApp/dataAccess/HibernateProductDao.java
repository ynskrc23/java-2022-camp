package oopWithNLayaredApp.dataAccess;

import oopWithNLayaredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
    public void add(Product product) {
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}

