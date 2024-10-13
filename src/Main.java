import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int konacnaSuma = 43;
        int uneseniBroj;
        int zbrojSvih = 0;
        int brojPutaUnosa = 0;

        Scanner scanner = new Scanner(System.in);
        
        while (zbrojSvih < konacnaSuma) {
            System.out.println("Molim unesite neki broj: ");
            uneseniBroj = scanner.nextInt();


            if (uneseniBroj == 0) {
                System.out.println("Unos prekinut. Trenutni zbroj je: " + zbrojSvih);
                break;
            }

            if (uneseniBroj < 0) {
                System.out.println("Negativni brojevi se ignoriraju. Pokušajte ponovo.");
                continue;
            }

            zbrojSvih += uneseniBroj;
            brojPutaUnosa++;
        }

        if (zbrojSvih >= konacnaSuma) {
            System.out.println("Konačna suma je dostignuta ili premašena!");
            System.out.println("Broj unosa je: " + brojPutaUnosa);
            System.out.println("Konačni zbroj unesenih brojeva je: " + zbrojSvih);
        }
    }
}
