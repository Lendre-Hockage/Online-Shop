import java.util.Scanner;

public class List {
    public static void items(){
        //Вывести файл с списком из Admin'а
        System.out.println("1)Колбаса \n2)Сыр \n3)Книга 'Кого-нибудь' \n4)Телефон \n5)Консерва из Дмитрича в соб.с. \n6)Мидии \n");
        Scanner scan = new Scanner(System.in);
        String S,R, Li = "";
        boolean flag = false;
        while (flag == false) {
            System.out.println("Вы хотите добавить что-нибудь в Вашу корзину?\n1.Да    2.Нет");
            S = scan.next();
            switch(S){
                case "1": System.out.println("Что именно?\n1)Колбаса \n2)Сыр \n3)Книга 'Кого-нибудь' \n4)Телефон \n5)Консерва из Дмитрича в соб.с. \n6)Мидии \n"); R = scan.next();
                switch(R)
                {
                    case "1":Li = Li + "Колбаса\n";break;
                    case "2":Li = Li + "Сыр\n";break;
                    case "3":Li = Li + "Книга\n";break;
                    case "4":Li = Li + "Телефон\n";break;
                    case "5":Li = Li + "Консерва\n";break;
                    case "6":Li = Li + "Мидии\n";break;
                    default:System.out.println("Такого товара нет в списке!");
                }break;
                case "2":flag = true;break;
                default:System.out.println("Вы ввели несуществующее действие!");
            }
        }
        System.out.println("Ваш список продуктов:\n" + Li + "\n1.Оплатить покупки    2.Очистить корзину    3.Выйти");
        String T;
        T = scan.next();
        switch(T){
            case "1":System.out.println("Покупка оплачена! Деньги списаны с Вашего счета");break;
            case "2":Li = "";System.out.println("Корзина очищена!");break;
            case "3":System.out.println("Всего доброго, путник!");break;
            default:System.out.println("Такого действия нет.");
        }
    }
}
