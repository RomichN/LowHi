import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int inputNum;
            String overSize;
            String gameOver;
            do{
                int theNumber = (int)(Math.random() * 100 + 1);
                System.out.println("Введите число от 0 до 100:");
                inputNum = scan.nextInt();
                while (inputNum != theNumber){
                    overSize = inputNum > theNumber ? "много" : "мало";
                    System.out.println("Вы ввели "+ inputNum + " и это " + overSize);
                    inputNum = scan.nextInt();
                }
                System.out.println("Ну наконец-то! Молодец!");
                System.out.println("Играем заново? (y/n)");
                gameOver = scan.next();
            }
            while(gameOver.equalsIgnoreCase("y"));
            System.out.println("Спасибо за игру!");
            scan.close();
        }
}
