package model.text;

public class Comment extends Message {

    private String articleID;

    public Comment(String content, String author, String articleID) {
        super(content, author);
        this.articleID = articleID;
    }
}
