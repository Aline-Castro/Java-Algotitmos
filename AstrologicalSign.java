import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AstrologicalSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = scanner.nextLine();

        System.out.print("Digite sua data de nascimento (dd/MM/yyyy): ");
        String dateString = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dateString, formatter);

        int day = date.getDayOfMonth();
        int month = date.getMonthValue();

        String astroSign = "";

        if (month == 1) {
            if (day < 20)
                astroSign = "Capricórnio";
            else
                astroSign = "Aquário";
        } else if (month == 2) {
            if (day < 19)
                astroSign = "Aquário";
            else
                astroSign = "Peixes";
        } else if (month == 3) {
            if (day < 21)
                astroSign = "Peixes";
            else
                astroSign = "Áries";
        } else if (month == 4) {
            if (day < 20)
                astroSign = "Áries";
            else
                astroSign = "Touro";
        } else if (month == 5) {
            if (day < 21)
                astroSign = "Touro";
            else
                astroSign = "Gêmeos";
        } else if (month == 6) {
            if (day < 21)
                astroSign = "Gêmeos";
            else
                astroSign = "Câncer";
        } else if (month == 7) {
            if (day < 23)
                astroSign = "Câncer";
            else
                astroSign = "Leão";
        } else if (month == 8) {
            if (day < 23)
                astroSign = "Leão";
            else
                astroSign = "Virgem";
        } else if (month == 9) {
            if (day < 23)
                astroSign = "Virgem";
            else
                astroSign = "Libra";
        } else if (month == 10) {
            if (day < 23)
                astroSign = "Libra";
            else
                astroSign = "Escorpião";
        } else if (month == 11) {
            if (day < 22)
                astroSign = "Escorpião";
            else
                astroSign = "Sagitário";
        } else if (month == 12) {
            if (day < 22)
                astroSign = "Sagitário";
            else
                astroSign ="Capricórnio";
        }

        System.out.println(name + ", seu signo astrológico é: " +astroSign);
    }
}
