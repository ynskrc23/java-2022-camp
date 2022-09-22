package oop1;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Vade oranı";

        Product product1 = new Product();
        product1.setName("Delongi kahve makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("bilmemne.jpg");

        Product product2 = new Product();
        product2.setName("Semg kahve makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(8);
        product2.setUnitsInStock(2);
        product2.setImageUrl("bilmemne.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen kahve makinesi");
        product3.setUnitPrice(4500);
        product3.setDiscount(9);
        product3.setUnitsInStock(4);
        product3.setImageUrl("bilmemne.jpg");

        Product[] products = {product1,product2,product3};

        System.out.println("<ul>");
        for(Product product : products) {
            System.out.println("<li>"+product.getName()+"</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05462503614");
        individualCustomer.setCustomerNumber("46238227");
        individualCustomer.setFirstName("yunus");
        individualCustomer.setLastName("karaca");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("twins techology");
        corporateCustomer.setPhone("05342501608");
        corporateCustomer.setTaxNumber("1111111111");
        corporateCustomer.setCustomerNumber("58253417");

        Customer[] customers = {individualCustomer, corporateCustomer};
    }
}
