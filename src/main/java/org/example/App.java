package org.example;

import org.example.article.ArticleController;
import org.example.system.SystemController;

import java.util.Scanner;

public class App {
    Scanner sc;
    ArticleController articleController;
    SystemController systemController;

    App() {
        articleController = new ArticleController(sc);
        systemController = new SystemController();
    }

    public void run() {
        System.out.println("== 게시판 앱 ==");

        while (true) {
            System.out.print("명령) ");
            String command = Container.getSc().nextLine().trim();
            Request request = new Request(command);

            if (request.getCommandList2().equals("종료")) {
                systemController.exit();
                break;
            } else if (request.getCommandList2().equals("등록")) {
                articleController.write();

            } else if (request.getCommandList2().equals("목록")) {
                articleController.list();

            } else if (request.getCommandList2().startsWith("삭제")) {
                articleController.delete(request.getId());

            } else if (request.getCommandList2().startsWith("수정")) {
                articleController.modify(request.getId());

            }
        }
    }
}