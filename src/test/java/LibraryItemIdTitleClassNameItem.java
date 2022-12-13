import java.util.Objects;

public class LibraryItemIdTitleClassNameItem {

    private Long id;
    private String title;
    private String className;

    public LibraryItemIdTitleClassNameItem() {}

    public LibraryItemIdTitleClassNameItem(Long id, String title, String className) {
        this.id = id;
        this.title = title;
        this.className = className;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryItemIdTitleClassNameItem that = (LibraryItemIdTitleClassNameItem) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) &&
                Objects.equals(className, that.className);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, className);
    }

    @Override
    public String toString() {
        return "LibraryItemIdTitleClassNameItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
