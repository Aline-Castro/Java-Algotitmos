import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String name = scanner.nextLine();
        System.out.print("Digite sua data de nascimento (dd/MM/yyyy): ");
        String birthdate = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(birthdate, formatter);
        System.out.println(name + ", você nasceu em um(a) " + date.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("pt")) + ".");
    }
}
