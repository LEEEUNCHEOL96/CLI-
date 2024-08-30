package article;

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

    public void setSubject(String subject) { //수정 제목 저장
        this.subject = subject;
    }

    String getContent() {
        return this.content;
    }

    public void setModify(String content) { // 수정 내용 저장
        this.content = content;
    }
}