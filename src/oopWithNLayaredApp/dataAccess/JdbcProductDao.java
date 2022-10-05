package oopWithNLayaredApp.dataAccess;

import oopWithNLayaredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
    public void add(Product product) {
        System.out.println("jdbc ile veritabanına eklendi");
    }
}
