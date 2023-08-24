public class Main {


    static String str;
    static int[] tablica;

    public static void main(String[] args) {
        System.out.println("Ćwiczenie wyłapywania wyjątków:" );
        try {
            System.out.println("Czy pusty?" + str.isEmpty());
        } catch(NullPointerException exception) {
            System.out.println("nie utworzyles stringa");
        }
        tablica = new int[1];
        try {
            tablica [0] = 101;
            tablica [1] = 202;
            System.out.println("wszystko poszlo dobrze");
        } catch (NullPointerException e) {
            System.out.println("Utworz conajmniej dwa elementy w tablicy");
        } catch (IndexOutOfBoundsException i) {
            System.out.println("Przypisales element poza zakresem tablicy");
        } finally {
            System.out.println("Blok kodu który zawsze się wykona");
        }

        System.out.println("ten tekst oznacza koniec programu");

    }
}