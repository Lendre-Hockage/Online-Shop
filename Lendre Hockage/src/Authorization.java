import java.util.Scanner;
import java.io.*;
public class Authorization {


    public static void author(){

        System.out.println("Введите под чьим именем вы заходите:\n1. Админ 2. Покупатель");
        try {
            FileReader fr = new FileReader("C://reg/reg.txt");
            Scanner scan = new Scanner(System.in);
            String Us = scan.next();
            String L, P;
            boolean flag = false;
            while (flag == false) {
                switch (Us) {
                    case "1": {
                        System.out.println("Введите логин и пароль!");
                        L = scan.nextLine();
                        P = scan.next();
                        if (fr.read()!=-1) {
                            flag = true;
                            Admin.Menu1();
                        } else System.out.println("Incorrect data");
                        break;
                    }

                    case "2": {
                        System.out.println("Введите логин и пароль!");
                        L = scan.nextLine();
                        P = scan.next();
                        if (fr.read()!=-1) {
                            flag = true;
                            Pokupatel.Menu2();
                        } else System.out.println("Incorrect data");
                        break;
                    }
                    default:
                        System.out.println("Вы ввели несуществующее значение!");
                }
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
