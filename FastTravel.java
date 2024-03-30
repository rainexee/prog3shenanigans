// FastTravel.java
public class FastTravel {
    void fastTravel(GameLobby lobby) {
        System.out.println("Fast Travel Options:");
        System.out.println("1. Stormveil Castle");
        System.out.println("2. Raya Lucaria Academy");
        System.out.println("3. The Elden Throne");
        System.out.println("4. Back");

        int choice = UserInput.getUserChoice(4);

        switch (choice) {
            case 1:
                AREA_1 area1 = new AREA_1(lobby.NAME, lobby.JOB, lobby.LEVEL, lobby.HEALTH, lobby.DEXTERITY, lobby.INTELLIGENCE, lobby.ENDURANCE, lobby.STRENGTH, lobby.FAITH);
                area1.AreaFloor_1();
                break;
            case 2:
                
                // Raya Lucaria Academy
                AREA_2 area2 = new AREA_2(lobby.NAME, lobby.JOB, lobby.LEVEL, lobby.HEALTH, lobby.DEXTERITY, lobby.INTELLIGENCE, lobby.ENDURANCE, lobby.STRENGTH, lobby.FAITH);
                area2.AreaFloor_2();
                break;
            case 3:
                System.out.println("\nThe Elden Throne is currently locked.\n");
                // Implement fast travel logic to The Elden Throne
                fastTravel(lobby);
                break;
            case 4:
                // Go back to the main lobby
                break;
            default:
                System.out.println("\nInvalid choice.\n");
                fastTravel(lobby);
                break;
        }
    }
}
