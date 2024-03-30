import java.util.Scanner;

public class ChooseJob {
    private Scanner scanner = new Scanner(System.in);

    public void chooseJob(CharacterCreation characterCreation) {
        System.out.println("Select your Job Class!\n");
        System.out.printf("Classes: \t HEALTH \t DEXTERITY \t INTELLIGENCE \t ENDURANCE \t STRENGTH \t FAITH\n");
        System.out.println("[1] VAGABOND \t 15 \t\t 13 \t\t 9 \t\t 11 \t\t 14 \t\t 9");
        System.out.println("[2] SAMURAI \t 12 \t\t 15 \t\t 9 \t\t 13 \t\t 12 \t\t 8");
        System.out.println("[3] WARRIOR \t 11 \t\t 16 \t\t 10 \t\t 11 \t\t 10 \t\t 8");
        System.out.println("[4] HERO \t 14 \t\t 9 \t\t 7 \t\t 12 \t\t 16 \t\t 8");
        System.out.println("[5] ASTROLOGER \t 9 \t\t 12 \t\t 16 \t\t 9 \t\t 8 \t\t 7");
        System.out.println("[6] PROPHET \t 10 \t\t 10 \t\t 7 \t\t 8 \t\t 11 \t\t 16");

        // Display other job options

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                characterCreation.JOB = "VAGABOND";
                characterCreation.HEALTH = 15;
                characterCreation.DEXTERITY = 13;
                characterCreation.INTELLIGENCE = 9;
                characterCreation.ENDURANCE = 11;
                characterCreation.STRENGTH = 14;
                characterCreation.FAITH = 9;
                characterCreation.createCharacter();
                break;
                case 2:
                characterCreation.JOB = "SAMURAI";
                characterCreation.HEALTH = 12;
                characterCreation.DEXTERITY = 15;
                characterCreation.INTELLIGENCE = 9;
                characterCreation.ENDURANCE = 13;
                characterCreation.STRENGTH = 12;
                characterCreation.FAITH = 8;
                characterCreation.createCharacter();
                break;
            case 3:
                characterCreation.JOB = "WARRIOR";
                characterCreation.HEALTH = 11;
                characterCreation.DEXTERITY = 16;
                characterCreation.INTELLIGENCE = 10;
                characterCreation.ENDURANCE = 11;
                characterCreation.STRENGTH = 10;
                characterCreation.FAITH = 8;
                characterCreation.createCharacter();
                break;
            case 4:
                characterCreation.JOB = "HERO";
                characterCreation.HEALTH = 14;
                characterCreation.DEXTERITY = 9;
                characterCreation.INTELLIGENCE = 7;
                characterCreation.ENDURANCE = 12;
                characterCreation.STRENGTH = 16;
                characterCreation.FAITH = 8;
                characterCreation.createCharacter();
                break;
            case 5:
                characterCreation.JOB = "ASTROLOGER";
                characterCreation.HEALTH = 9;
                characterCreation.DEXTERITY = 12;
                characterCreation.INTELLIGENCE = 16;
                characterCreation.ENDURANCE = 9;
                characterCreation.STRENGTH = 8;
                characterCreation.FAITH = 7;
                characterCreation.createCharacter();
                break;
            case 6:
                characterCreation.JOB = "PROPHET";
                characterCreation.HEALTH = 10;
                characterCreation.DEXTERITY = 10;
                characterCreation.INTELLIGENCE = 7;
                characterCreation.ENDURANCE = 8;
                characterCreation.STRENGTH = 11;
                characterCreation.FAITH = 16;
                characterCreation.createCharacter();
            // Handle other cases
            default:
                System.out.println("Invalid Choice");
                chooseJob(characterCreation);
        }
    }
}
