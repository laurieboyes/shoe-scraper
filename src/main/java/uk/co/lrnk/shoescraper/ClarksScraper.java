package uk.co.lrnk.shoescraper;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClarksScraper implements ShoeScraper {

    @Override
    public List<Shoe> scrape() {
        return null;
    }
}
