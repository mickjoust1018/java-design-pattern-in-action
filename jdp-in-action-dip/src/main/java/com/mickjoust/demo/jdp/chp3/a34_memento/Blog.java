package com.mickjoust.demo.jdp.chp3.a34_memento;

/**
 * @author mickjoust
 */
public class Blog {

    private long id;
    private String title;
    private String content;

    public Blog(long id, String title) {
        super();
        this.id = id;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public BlogMemento createMemento() {
        BlogMemento m = new BlogMemento(id, title, content);
        return m;
    }

    public void restore(BlogMemento m) {
        this.id = m.getId();
        this.title = m.getTitle();
        this.content = m.getContent();
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
