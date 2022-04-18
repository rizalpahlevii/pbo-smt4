public class Resource {

    String title, dateBorrowed, dueDate;
    Boolean borrowedStatus;

    public String getTitle() {
        return title;
    }

    public String getDateBorrowed() {
        return dateBorrowed;
    }

    public String getDueDate() {
        return dueDate;
    }

    public Boolean getBorrowedStatus() {
        return borrowedStatus;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDateBorrowed(String dateBorrowed) {
        this.dateBorrowed = dateBorrowed;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void setBorrowedStatus(Boolean borrowedStatus) {
        this.borrowedStatus = borrowedStatus;
    }

}
