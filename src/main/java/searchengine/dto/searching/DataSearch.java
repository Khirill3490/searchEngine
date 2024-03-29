package searchengine.dto.searching;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DataSearch {
    private String site;
    private String siteName;
    private String uri;
    private String title;
    private String snippet;
    private double relevance;
}
