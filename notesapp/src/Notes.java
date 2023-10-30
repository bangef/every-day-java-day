import java.util.ArrayList;
import java.util.List;

public class Notes {
  private List<Note> notesCollections;

  public Notes() {
    this.notesCollections = new ArrayList<>();
  }

  public void add(Note note) {
    this.notesCollections.add(note);
  }

  public void remove(Note note) {
    Note existNote = this.find(note);
    this.notesCollections.remove(existNote);
  }

  public Note find(Note note) throws NoteNotExistExceptions {
    List<Note> existNote = this.notesCollections.stream()
        .filter(thisNote -> thisNote.equals(note))
        .toList();
    boolean isNoteNotExist = existNote.isEmpty();
    if (isNoteNotExist) {
      throw new NoteNotExistExceptions();
    }
    return existNote.get(0);
  }

  @Override
  public String toString() {
    return "Notes [notesCollections=" + this.notesCollections + "]";
  }
}
