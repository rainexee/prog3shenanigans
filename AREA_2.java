import java.util.Random;
import java.util.Scanner;

public class AREA_2 {

    String Name = "";
    String Job = "";
    int LEVEL = 0 ;
    int HEALTH = 0 , DEXTERITY = 0, INTELLIGENCE = 0, ENDURANCE = 0, STRENGTH = 0, FAITH = 0;
    int RUNES = 0;

    int past = 0;
    int floor_3[][] = {{0, 0, 2, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 4, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 5, 0, 0}};
    int floor_2[][] = {{0, 0, 0, 2, 0, 0, 0}, {0, 0, 0, 3, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0}, {3, 0, 3, 3, 3, 0, 3}, {0, 0, 0, 0, 0, 0, 0}, {0, 0, 3, 0, 3, 0, 0}, {0, 0, 0, 5, 0, 0, 0}};
    int AreaFloor_2[][] = {{0, 0, 5, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 3, 0, 3, 0}, {0, 0, 2, 0, 0}};
    Scanner scanner = new Scanner(System.in);

    //inherited AREA_2 stats
    AREA_2(String Name, String Job, int LEVEL, int HEALTH, int DEXTERITY, int INTELLIGENCE, int ENDURANCE, int STRENGTH, int FAITH){
        this.Name = Name;
        this.Job = Job;
        this.LEVEL = LEVEL;
        this.HEALTH = HEALTH;
        this.DEXTERITY = DEXTERITY;
        this.INTELLIGENCE = INTELLIGENCE;
        this.ENDURANCE = ENDURANCE;
        this.STRENGTH = STRENGTH;
        this.FAITH = FAITH;
    }

    //updates values
    void update_values(String Name, String Job, int LEVEL, int HEALTH, int DEXTERITY, int INTELLIGENCE, int ENDURANCE, int STRENGTH, int FAITH){
        this.Name = Name;
        this.Job = Job;
        this.LEVEL = LEVEL;
        this.HEALTH = HEALTH;
        this.DEXTERITY = DEXTERITY;
        this.INTELLIGENCE = INTELLIGENCE;
        this.ENDURANCE = ENDURANCE;
        this.STRENGTH = STRENGTH;
        this.FAITH = FAITH;
    }
    
    public  int[] Search_coordinate_values(int[][] floor, int targetValue) {
        int[] coordinates = {-1, -1}; // The default value

        for (int i = 0; i < floor.length; i++) {
            for (int j = 0; j < floor[i].length; j++) {
                if (floor[i][j] == targetValue) {
                    coordinates[0] = i; // the row index
                    coordinates[1] = j; // the column index
                    return coordinates;
                }
            }
        }

        return coordinates; // Return default if coordinates not found
    }

    //function that gives the ability to make movement on the player's tile
    void Move(int floor[][], char choice){
        int[] place = Search_coordinate_values(floor, 5);
        int length = floor[0].length;
        System.out.println(length);
    
        if (choice == 'W' || choice == 'w'){
            if (place[0] == 0){
                System.out.println("Out of bounds!");
                AreaFloor_2();
            } else {
                past = floor[place[0] - 1][place[1]];
                floor[place[0] - 1][place[1]] = floor[place[0]][place[1]];
                floor[place[0]][place[1]] = 0;
                AreaFloor_2();
            }
        } else if (choice == 'S' || choice == 's'){
            if (place[0] == 6){
                System.out.println("Out of bounds!");
                AreaFloor_2();
            } else {
                past = floor[place[0] + 1][place[1]];
                floor[place[0] + 1][place[1]] = floor[place[0]][place[1]];
                floor[place[0]][place[1]] = 0;
                AreaFloor_2();
            }
        } else if (choice == 'A' || choice == 'a'){
            if (place[1] == 0){
                System.out.println("Out of bounds!");
                AreaFloor_2();
            } else {
                past = floor[place[0]][place[1] - 1];
                floor[place[0]][place[1] - 1] = floor[place[0]][place[1]];
                floor[place[0]][place[1]] = 0;
                AreaFloor_2();
            }
        } else if (choice == 'D' || choice == 'd'){
            if (place[1] == length - 1){
                System.out.println("Out of bounds!");
                AreaFloor_2();
            } else {
                past = floor[place[0]][place[1] + 1];
                floor[place[0]][place[1] + 1] = floor[place[0]][place[1]];
                floor[place[0]][place[1]] = 0;
                AreaFloor_2();
            }
        } else {
            AreaFloor_2();
        }
    }
    


    //symbol function
    char symbol(int floor){
        switch (floor) {
            case 0:
                return ' '; // empty tile             
            case 1: 
                return 'E'; // fast travel tile
            case 2:
                return 'D'; // door tile
            case 3:
                return '?'; // enemy/treasure tile
            case 4:
                return 'B'; // boss tile
            case 5:
                return 'P'; // player tile
        }
        return (' ');
    }

    //grid layout functions
    void Grid_layout1 (){
        int i, r;
        System.out.printf("+--+--+--+\n");
        for (i = 0; i < 7; i++){
            System.out.printf("|");
            for (r = 0; r < 3; r++){
                System.out.printf("%c |", symbol(AreaFloor_2[i][r]));
            }
            System.err.println();
            System.out.printf("+--+--+--+\n");
        }
    }

    void Grid_layout2 (){
        int i, r;
        System.out.printf("+--+--+--+--+--+--+--+\n");
        for (i = 0; i < 7; i++){
            System.out.printf("|");
            for (r = 0; r < 7; r++){
                System.out.printf("%c |", symbol(floor_2[i][r]));
            }
            System.err.println();
            System.out.printf("+--+--+--+--+--+--+--+\n");
        }
    }

    void Grid_layout3 (){
        int i, r;
        System.out.printf("+--+--+--+--+--+\n");
        for (i = 0; i < 7; i++){
            System.out.printf("|");
            for (r = 0; r < 5; r++){
                System.out.printf("%c |", symbol(floor_3[i][r]));
            }
            System.err.println();
            System.out.printf("+--+--+--+--+--+\n");
        }

    }

    //floor 1 
    void AreaFloor_2(){

        GameLobby Lobby = new GameLobby(Name, Job, LEVEL, HEALTH, DEXTERITY, INTELLIGENCE, ENDURANCE, STRENGTH, FAITH);
        if (AreaFloor_2[4] [1] == 0){
            AreaFloor_2[4] [1] = 0;
        }
        
        if (AreaFloor_2[0][1] == 2 || AreaFloor_2[0][1] == 5){
            Grid_layout1();
        }
        if (AreaFloor_2[0][1] == 0){
            Grid_layout2();
        }
        if (floor_2[0][3] == 0){
            Grid_layout3();
        }


        //displays the controls and stats
        System.out.printf("[W] MOVE UP \t PLAYER: 'P'\n");
        System.out.printf("[S] MOVE DOWN \t AREA: Stormveil Castle\n");
        System.out.printf("[A] MOVE LEFT \t PLAYER HEALTH: %d\n", HEALTH);
        System.out.printf("[D] MOVE RIGHT\t LEVEL: %d\n", LEVEL);
        System.out.printf("[E] INTERACT \t RUNES: %d\n", RUNES);
        System.out.println("Choose action:");

        if (past == 1){
            System.out.println("Return to Game Lobby? [E]\nPress any movement button to cancel.");
        }
        if (past == 2){
            System.out.println("Enter the next floor? [E]\nPress any movement button to cancel.");
        }
        if (past == 3){
            System.out.println("Interact for a surprise on this tile? [E]\nPress any movement button to cancel.");
        }
        if (past == 4){
            System.out.println("Initiate a boss fight? [E]\nPress any movement button to cancel.");
        }



        char choice = scanner.next().charAt(0);

        int[] place = Search_coordinate_values(floor_2, 5);

        if (past == 1 && choice == 'e' || choice == 'E'){
            Lobby.display();
        }

        if (past == 2 && choice == 'e' || choice == 'E'){
            AreaFloor_2[0][1] = 0;
            if (place[0] == 0 && place[1] == 3){
                floor_2[0][3] = 0;
                AreaFloor_2[0][1] = 1;
            }
            AreaFloor_2();
        }

        if (past == 3 && choice == 'e' || choice == 'E'){
            if (new Random().nextDouble() < 0.75){
                past = 0;
                Enemy();
                AreaFloor_2();
            }

            else {
                    past = 0;
                    RUNES += 1 * rng(50, 150);
                    AreaFloor_2();
            }
        }

        if (past == 4 && choice == 'e' || choice == 'E'){
            past = 0;
            System.out.printf(" ENEMY: GODRICK KNIGHT\n");
            System.out.printf(" HEALTH: 200\n");
            int ATTACK = rng(150, 300);
            System.out.printf(" ATTACK: %d\n", ATTACK);
            System.out.printf(" PHYSICAL DEFENSE: 0.35\n");
            System.out.printf(" SORCERY DEFENSE: 0.20\n");
            System.out.printf(" INCANTATION DEFENSE: 0.15\n");
            floor_3[0][2] = 1;
        }
        
        if (past == 0 && choice == 'e' || choice == 'E'){
            System.out.println("Nothing to interact");
            AreaFloor_2();
        }

        if (AreaFloor_2[0][1] == 2 || AreaFloor_2[0][1] == 5 ){
            Move(AreaFloor_2, choice);
        }

        if (AreaFloor_2[0][1] == 0 ){
            Move(floor_2, choice);
        }

        if (floor_2[0][3] == 0){
            Move(floor_3, choice);
        }
       
    }


    private int rng(int min, int max) {
        Random rng = new Random();
        return rng.nextInt(max - min + 1) + min;
    }

    //enemy functions
    void Enemy(){
        Random rng = new Random();

        // Randomized between 1, 2, or 3
        int randomNumber = rng.nextInt(3) + 1;
        int HEALTH, ATTACK;
        if (randomNumber == 1){
            System.out.printf(" ENEMY: GODRICK SOLDIER\n");
            HEALTH = rng(20, 30);
            System.out.printf(" HEALTH: %d\n", HEALTH);
            ATTACK = rng(70, 80);
            System.out.printf(" ATTACK: %d\n", ATTACK);
            System.out.printf(" PHYSICAL DEFENSE: 0.20\n");
            System.out.printf(" SORCERY DEFENSE: 0.15\n");
            System.out.printf(" INCANTATION DEFENSE: 0.10\n");
        }

        if (randomNumber == 2){
            System.out.printf(" ENEMY: GODRICK ARCHER\n");
            HEALTH = rng(25, 35);
            System.out.printf(" HEALTH: %d\n", HEALTH);
            ATTACK = rng(110, 120);
            System.out.printf(" ATTACK: %d\n", ATTACK);
            System.out.printf(" PHYSICAL DEFENSE: 0.50\n");
            System.out.printf(" SORCERY DEFENSE: 0.15\n");
            System.out.printf(" INCANTATION DEFENSE: 0.20\n");
        }
        if (randomNumber == 3){
            System.out.printf(" ENEMY: GODRICK KNIGHT\n");
            HEALTH = rng(70, 80);
            System.out.printf(" HEALTH: %d\n", HEALTH);
            ATTACK = rng(120, 130);
            System.out.printf(" ATTACK: %d\n", ATTACK);
            System.out.printf(" PHYSICAL DEFENSE: 0.25\n");
            System.out.printf(" SORCERY DEFENSE: 0.25\n");
            System.out.printf(" INCANTATION DEFENSE: 0.20\n");
        }
    }
    
}
