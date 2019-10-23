/*
package com.ecommerce.microcommerce;


import com.ecommerce.microcommerce.dao.ProductDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

    @Autowired
    private ProductDao productDao;

    @Override
    public void run(String... args) throws Exception {
        productDao.deleteAll();

        productDao.save(Product (1,"Ordinateur portable", 350, 120));
        productDao.save(2,"Aspirateur Robot", 500, 200);
        productDao.save(3,"Table de Ping Pong", 750, 400);
    }
}
*/
