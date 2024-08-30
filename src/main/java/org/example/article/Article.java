package org.example.article; // 패키지 구조 변경

public class Article {
    private final int id;
    private String subject;
    private String content;

    Article(int id, String subject, String content) {
        this.id = id;
        this.subject = subject;
        this.content = content;
    }

    int getId() {
        return this.id;
    }

    String getSubject() {
        return this.subject;
    }

    String getContent() {
        return this.content;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setModify(String content) {
        this.content = content;
    }
}