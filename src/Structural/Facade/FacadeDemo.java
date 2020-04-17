package Structural.Facade;

import java.util.List;

public class FacadeDemo {

    public static void main(String[] args) {
        JdbcFacade jdbcFacade = new JdbcFacade();
        jdbcFacade.createTable();
        jdbcFacade.insertIntoTable();
        List<Address> addresses = jdbcFacade.getAddresses();
        System.out.println(addresses);
    }
}
