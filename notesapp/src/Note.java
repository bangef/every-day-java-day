import java.time.LocalDate;
import java.util.UUID;

public class Note {
  private UUID id;
  private String title;
  private String content;
  private LocalDate createdDate;
  private User user;

  public Note(String title, String content, User user) {
    this.id = UUID.randomUUID();
    this.title = title;
    this.content = content;
    this.createdDate = LocalDate.now();
    this.user = user;
  }

  public UUID getId() {
    return this.id;
  }

  public LocalDate getCreatedDate() {
    return this.createdDate;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((title == null) ? 0 : title.hashCode());
    result = prime * result + ((content == null) ? 0 : content.hashCode());
    result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
    result = prime * result + ((user == null) ? 0 : user.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Note other = (Note) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (title == null) {
      if (other.title != null)
        return false;
    } else if (!title.equals(other.title))
      return false;
    if (content == null) {
      if (other.content != null)
        return false;
    } else if (!content.equals(other.content))
      return false;
    if (createdDate == null) {
      if (other.createdDate != null)
        return false;
    } else if (!createdDate.equals(other.createdDate))
      return false;
    if (user == null) {
      if (other.user != null)
        return false;
    } else if (!user.equals(other.user))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Note [\nid=" + this.id + ", title=" + this.title + ", content=" + this.content + ", createdDate="
        + this.createdDate + ", user="
        + this.user + "]\n";
  }
}
