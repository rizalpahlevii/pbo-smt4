public class Print extends Resource {
    String author, publisher, category;
    Integer isbn;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public String getCategory() {
        return category;
    }

}
