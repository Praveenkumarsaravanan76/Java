import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        int health = 100;
        int coins = 0;
        boolean gameOver = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("====== Welcome to Treasure Hunt ======");
        System.out.println("Starting Health: " + health);
        System.out.println("Starting Coins : " + coins);
        System.out.println("--------------------------------------");
        while (!gameOver) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Fight");
            System.out.println("2. Search for treasure");
            System.out.println("3. Rest");
            System.out.println("4. Check status");
            System.out.println("5. Quit game");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            if (choice == 1) { 
                health -= 20;
                coins += 10;
                System.out.println("You fought bravely! (-20 health, +10 coins)");
            }
            else if (choice == 2) { 
                health -= 10;
                coins += 20;
                System.out.println("You found some treasure! (-10 health, +20 coins)");
            }
            else if (choice == 3) { 
                health += 15;
                coins -= 5;
                System.out.println("You took a rest. (+15 health, -5 coins)");
            }
            else if (choice == 4) { 
                System.out.println("Health: " + health + " | Coins: " + coins);
            }
            else if (choice == 5) { 
                System.out.println("Thanks for playing! Goodbye!");
                gameOver = true;
            }
            else { 
                System.out.println("Invalid choice. Try again.");
            }
            if (coins >= 100) {
                System.out.println("You are collected 100 coins so You win ");
                gameOver = true;
            } else if (health <= 0) {
                System.out.println(" You are died. Game over govindha govindha!");
                gameOver = true;
            }
        }
        sc.close();
    }
}
