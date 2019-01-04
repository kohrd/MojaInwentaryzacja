package pl.moja.inwentaryzacja.database.models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

@DatabaseTable(tableName = "BOOKS")
public class Book implements BaseModel {

    public Book(){
        //kontruktor
    }

    @DatabaseField(columnName = "AUTHOR_ID", foreign = true, foreignAutoRefresh = true, foreignAutoCreate = true, canBeNull = false)
    private Author author;

    @DatabaseField(columnName = "CATEGORY_ID", foreign = true, foreignAutoRefresh = true, foreignAutoCreate = true, canBeNull = false)
    private Category category;

    @DatabaseField(columnName = "TITLE", canBeNull = false)
    private String title;

    @DatabaseField(columnName = "RELEASE_DATE")
    private Date releDate;

    @DatabaseField(columnName = "ISBN", width = 1)
    private long isbn;

    @DatabaseField(columnName = "RATING", width = 1)
    private int rating;

    @DatabaseField(columnName = "ADDED_DATE", width = 1)
    private Date addedDate;


    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleDate() {
        return releDate;
    }

    public void setReleDate(Date releDate) {
        this.releDate = releDate;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }
}
