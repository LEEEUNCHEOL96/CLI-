import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    Scanner sc;
    List<Article> articleList = new ArrayList<>(); // 글로벌영역으로 빼주기

    App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        int lastId = 1;
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

                for (int i = articleList.size() - 1; i >= 0; i--) {
                    Article article = articleList.get(i);
                    System.out.printf("%d / %s / %s\n", article.getId(), article.getSubject(), article.getContent());
                }

            } else if (command.startsWith("삭제")) {
                String[] comandList = command.split("\\?", 2);
                String[] comandList2 = comandList[1].split("=", 2);

                String key = comandList2[0];
                String removeId = comandList2[1];
                int id2 = Integer.parseInt(removeId);

                Article article = _getFindId(id2);

                if (article == null) {
                    System.out.printf("%d번 게시물은 존재하지 않습니다.\n", id2);
                } else {
                    articleList.remove(article);
                    System.out.printf("%d번 게시물이 삭제되었습니다.\n", id2);
                }
            } else if (command.startsWith("수정")) {
                String[] comandList = command.split("\\?", 2);
                String[] comandList2 = comandList[1].split("=", 2);

                String key = comandList2[0];
                String modifiedId = comandList2[1];
                int id2 = Integer.parseInt(modifiedId);


                Article article = _getFindId(id2);

                if (article == null) {
                    System.out.printf("%d번 게시물은 존재하지 않습니다.\n", id2);
                } else {
                    System.out.printf("제목(기존) : %s \n", article.getSubject());
                    System.out.print("제목 : ");
                    String modifySubject = sc.nextLine();
                    article.setSubject(modifySubject);

                    System.out.printf("내용(기존) : %s \n", article.getContent());
                    System.out.print("내용 : ");
                    String modifyContent = sc.nextLine();
                    article.setModify(modifyContent);

                    System.out.printf("%d번 게시물이 수정 되었습니다. \n", id2);
                }
            }
        }
    }

    private Article _getFindId(int id2) { //중복로직 제거
        for (Article i : articleList) {
            if (i.getId() == id2) {
                return i;
            }
        }
        return null;
    }
}