import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    Scanner sc;

    App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        int lastId = 1;
        List<Article> articleList = new ArrayList<>();

        System.out.println("== 게시판 앱 ==");

        while (true) {
            System.out.print("명령) ");
            String command = sc.nextLine().trim();

            if (command.equals("종료")) {
                break;
            } else if (command.equals("등록")) {
                System.out.print("제목 : ");
                String subject = sc.nextLine().trim();
                System.out.print("내용 : ");
                String content = sc.nextLine().trim();
                System.out.printf("%d번 게시물이 등록되었습니다.\n", lastId);

                Article article = new Article(lastId, subject, content);
                articleList.add(article);

                lastId++;
            } else if (command.equals("목록")) {
                System.out.println("번호 / 제목 / 내용");
                System.out.println("-----------------");

                for (int i = articleList.size() - 1; i >= 0; i--) { //역순으로 출력
                    Article article = articleList.get(i);
                    System.out.printf("%d / %s / %s\n", article.getId(), article.getSubject(), article.getContent());
                }

            } else if (command.startsWith("삭제")) { //삭제 기능 추가
                String[] comandList = command.split("\\?", 2); // ? 정규화 할때는 역슬레쉬를 사용!!!
                String[] comandList2 = comandList[1].split("=", 2);

                String key = comandList2[0];
                String removeId = comandList2[1];
                int reId = Integer.parseInt(removeId);

                for (int i = 0; i < articleList.size(); i ++) {
                    if (articleList.get(i).getId() == reId){
                        articleList.remove(i);
                    }
                }
                System.out.printf("%d번 게시물이 삭제되었습니다.\n", reId);
            }
        }
    }
}