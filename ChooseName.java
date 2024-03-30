import java.util.Scanner;

public class ChooseName {
    private Scanner scanner = new Scanner(System.in);
    
    public void chooseName(CharacterCreation characterCreation) {
        System.out.print("NAME: ");
        String name = scanner.nextLine();
        int length = name.length();

        if (length < 1) {
            chooseName(characterCreation);
        } else if (length > 25) {
            characterCreation.NAME = name.substring(0, 25);
            characterCreation.createCharacter();
        } else {
            characterCreation.NAME = name;
            characterCreation.createCharacter();
        }
    }
}
