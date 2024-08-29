package article;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArticleController {
    Scanner sc;
    List<Article> articleList = new ArrayList<>();
    int lastId = 1;

    public ArticleController(Scanner sc){
        this.sc = sc;
    }
}
