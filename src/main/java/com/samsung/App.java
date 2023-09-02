package com.samsung;

import com.samsung.domain.Author;
import com.samsung.repository.AuthorRepository;
import com.samsung.service.LibDemoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.h2.tools.Console;
import java.sql.SQLException;
import java.util.List;

@SpringBootApplication
public class App {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

        context.getBean(LibDemoService.class).bookDemo();

        context.close();
       /* try {
            Console.main(args);
        } catch (SQLException e){
            throw new RuntimeException(e);
        } */

    }
}