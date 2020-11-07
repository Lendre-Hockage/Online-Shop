import java.util.Scanner;

public class Pokupatel {
    public static void Menu2(){
        System.out.println("Вы вошли как покупатель!");
        System.out.println("Что бы вы хотели сделать: \n1.Список товаров   2.Поддержка   ");
        Scanner scan = new Scanner(System.in);
        String Act = scan.next();
        switch (Act)
        {
            case "1":List.items();break;
            case "2":Help.da();break;
        }
    }
}
