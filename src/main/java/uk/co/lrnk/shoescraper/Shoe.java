package uk.co.lrnk.shoescraper;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(includeFieldNames = true)
public class Shoe {
    private final String productId;
}
