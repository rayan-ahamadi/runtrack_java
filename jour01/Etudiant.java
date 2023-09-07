import java.util.List;

public class Etudiant {
    private String name;
    private int[] notes;

    public void addNotes(int note){
        notes[notes.length] = note;
        System.out.println(notes);
    }
    

    public static void main(String[] args) {

    }
}
