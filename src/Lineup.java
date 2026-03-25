import java.util.ArrayList;

public class Lineup {
    public static void main(String[] args) {
        // Step 1: Create your ArrayList to hold the full roster (10 players)
        ArrayList<String> roster = new ArrayList<String>();

        // Step 2: Add exactly 10 player names using .add()
        // The first 5 you add will be the starters; the last 5 will be the bench
        roster.add("Penny");
        roster.add("Millie ");
        roster.add("Maia");
        roster.add("Lyra");
        roster.add("Aeden");
        roster.add("Shayna");
        roster.add("Rose");
        roster.add("Sarah");
        roster.add("Bestplayer");
        roster.add("Worstplayer");
       


        // Step 3: Print a "STARTERS" label, then loop through and print the first 5 players
        // Each player should be numbered (Player 1, Player 2, etc.)
        int i = 0;
        int number = 1;
        int amount = 10;
        System.out.println("--- Roster ---");
        while ((roster.size() - amount) > 5){
            System.out.println("Player " + number + ": " + roster.get(i));
            i++;
            number++;
            amount = amount -1;
             System.out.println(i);
            // System.out.println(amount);
            
        }
       
    
       
        // System.out.println(roster.size() - amount);
        while ((roster.size()- amount) <= 5 && (roster.size()- amount) < 10){
             if (roster.size() - amount == -5){
            System.out.println("--- Bench ---");
        } 
            System.out.println("Player " +number + ": " + roster.get(i));
            number++;
            i++;
            amount++;
            if (i == roster.size()){
                break;
            }
            // System.out.println(i);
            // System.out.println(roster.size() - amount);
        }
        System.out.println("Total roster: " + roster.size() + " players");

        // Step 4: Print a "BENCH" label, then loop through and print the last 5 players
        // Continue your numbering (Player 6, Player 7, etc.) OR restart at 1 — your choice


        // Step 5: Print the total roster size using .size()

    }
}
