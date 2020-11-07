import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Registration {

    public static void regist(){  //Занесение в BD данных пользователя
        Scanner registr = new Scanner(System.in);
        try (FileWriter fw = new FileWriter("C://reg/reg.txt", true)){

            System.out.println("Введите логин и пароль через пробел (В самом логине или пароле пробелов быть не должно");
            String regis = registr.nextLine();
            fw.write(regis + "\n");
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    }

