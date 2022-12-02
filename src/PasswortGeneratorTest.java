public class PasswortGeneratorTest {
    public static void main(String[] args) {

        // Test 1
        String test1 = "java ist eine objekt-orientierte sprache!";
        PasswortGenerator passwortGenerator1 = new PasswortGenerator(test1);
        passwortGenerator1.erstellePasswort();

        System.out.println("1. Test aus Aufgabe:");
        System.out.println("Passwort soll sein: jIeOs");
        passwortGenerator1.printPasswort();

        System.out.println();

        // Test 2
        String test2 = "Java ist auch eine Insel (von Christian Ullenboom)";
        PasswortGenerator passwortGenerator2 = new PasswortGenerator(test2);
        passwortGenerator2.erstellePasswort();

        System.out.println("2. Test aus Aufgabe:");
        System.out.println("Passwort soll sein: jIaEiVcU");
        passwortGenerator2.printPasswort();

    }
}