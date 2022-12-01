public class PasswortGeneratorTest {
    public static void main(String[] args) {

        String merksatz = "Java ist auch eine Insel (von Christian Ullenboom)";
        PasswortGenerator passwortGenerator = new PasswortGenerator(merksatz);
        passwortGenerator.erstellePasswort();
        passwortGenerator.printPasswort();

    }
}