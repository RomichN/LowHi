import java.util.Scanner;
public class Main{
        static int theNumber;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int inputNum;
            String gameOver;
            do{
                theNumber = (int)(Math.random() * 100 + 1);
                System.out.println("Введите число от 0 до 100:");
                inputNum = scan.nextInt();
                while (inputNum != theNumber){
                    System.out.println("Вы ввели "+ inputNum + " и это " + extendResponse(inputNum));
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

        private static String extendResponse(int inpNum){
            int digitDiff = Math.abs(inpNum - theNumber);
            String ret = null;
            String overSize = inpNum > theNumber ? "много" : "мало";
            if(digitDiff >= 50){ ret = "ну о-о-очень  " + overSize + "! Попробуйте еще раз.";}
            else if(digitDiff >= 30){ ret = "ну о-очень  " + overSize + "! Попробуйте еще раз.";}
            else if(digitDiff >= 20){ ret = "ну очень  " + overSize + "! Попробуйте еще раз.";}
            else if(digitDiff >= 10){ ret = overSize + ", еще немного! Попробуйте еще раз.";}
            else if(digitDiff >= 5){ ret = overSize + "! Попробуйте еще раз.";}
            else if(digitDiff >= 1){ ret = "совсем рядом, но по-прежнему " + overSize + "! Попробуйте еще раз.";}
            return ret;
        }

}
