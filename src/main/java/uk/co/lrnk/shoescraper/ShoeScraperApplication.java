package uk.co.lrnk.shoescraper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ShoeScraperApplication implements CommandLineRunner {

    @Autowired
    private ShoeScraper shoeScraper;

    public static void main(String[] args) {
        SpringApplication.run(ShoeScraperApplication.class, args);
    }

    public void run(String[] args) {
        List<Shoe> shoes = shoeScraper.scrape();
        System.out.println("I’m doing something!");
        System.out.println(shoes);
    }

}
