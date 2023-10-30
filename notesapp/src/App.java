public class App {
    public static void main(String[] args) throws Exception {
        try {
            Menu menu = new Menu();
            menu.run();
        } catch (UserNotExistExceptions | NoteNotExistExceptions e) {
            System.out.println(e.getMessage());
        }

        // try {
        // User ficri = new User("ficrihnp");
        // User asep = new User("asep009");
        // User dudi = new User("dud1");
        // Note noteOne = new Note("asdasdasdasd", "asgadasdgeqwgg", ficri);
        // Note noteTwo = new Note("asdasdasdasdas", "asfqwgfqrewaf", asep);
        // Note noteThree = new Note("vfadfsdgasd", "asfqgfasDewqw2e", dudi);
        // Notes notes = new Notes();
        // notes.add(noteOne);
        // notes.add(noteTwo);
        // // notes.add(noteThree);
        // notes.remove(noteThree);
        // System.out.println(notes);
        // } catch (NoteNotExistExceptions e) {
        // System.out.println(e.getMessage());
        // }
    }
}
