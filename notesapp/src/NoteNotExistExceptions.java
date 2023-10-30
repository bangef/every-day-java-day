
public class NoteNotExistExceptions extends RuntimeException {
  @Override
  public String getMessage() {
    return "Note not exist!";
  }
}
