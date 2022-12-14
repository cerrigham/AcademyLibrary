import java.util.Objects;

public class LibraryItemIdTitleClassNameItem extends LibraryItemIdTitle {

    private String className;

    public LibraryItemIdTitleClassNameItem() {}

    public LibraryItemIdTitleClassNameItem(Long id, String title, String className) {
        super.setId(id);
        super.setTitle(title);
        this.className = className;
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
        return Objects.equals(super.getId(), that.getId()) && Objects.equals(super.getTitle(), that.getTitle()) &&
                Objects.equals(className, that.className);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), className);
    }

    @Override
    public String toString() {
        return "LibraryItemIdTitleClassNameItem{" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
