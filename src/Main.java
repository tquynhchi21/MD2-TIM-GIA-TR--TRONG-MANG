import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] students = {"Ba", "Chi", "Đức", "Hùng", "Hà", "Tùng", "Long",
                "Khánh", "Huy", "Chính", "Chiến", "Nam", "Tú", "Phú", "Đạt", "Bằng"};

        System.out.println("Enter a name: ");
        String name = sc.nextLine();
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Position of the name " + students[i] + " in list is " + (i + 1));
                return;
            }
        }
        System.out.println("No such name");

    }
}