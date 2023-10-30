import java.util.Scanner;

public class Menu {
  Users users;
  Notes notes;
  Scanner scanner;

  public Menu() {
    this.users = new Users();
    this.notes = new Notes();
    this.scanner = new Scanner(System.in);
  }

  public void run() {
    User existUser = this.getViewInputUser();
    Note newNote = this.getViewCreateNote(existUser);
    this.notes.add(newNote);
    System.out.println(notes);
  }

  // private String getViewFull() {
  // String viewFull = this.getViewHeader() + this.getViewChooseUsers();
  // return viewFull;
  // }

  // private String getViewHeader() {
  // return "\n=========Note App=========\n";
  // }

  private Note getViewCreateNote(User existUser) {
    System.out.printf(
        "%nCreate Note %nEnter note title:%n");
    String inputTitle = this.scanner.nextLine();
    System.out.printf(
        "Enter note content:%n");
    String inputContent = this.scanner.nextLine();
    this.scanner.close();
    return new Note(inputTitle, inputContent, existUser);
  }

  private User getViewInputUser() {
    System.out.printf(
        "%n=========Note App=========%nEnter user id: ");
    String inputUser = this.scanner.nextLine();
    return this.users.find(Integer.valueOf(inputUser));
  }
}
