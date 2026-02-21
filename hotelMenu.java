import java.util.*;

public class hotelMenu {

    public static int searchMenu(String menu[], String find) {
        for (int i = 0; i < menu.length; i++) {
            if (find.equals(menu[i])) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu[] = { "burger", "pizza", "somosa", "puri", " chhola", "vada", };
        String find = sc.next();

        int search = searchMenu(menu, find);
        if (search == -1) {
            System.out.println("not in menu");
        } else {
            System.out.println(search);
        }

    }
}