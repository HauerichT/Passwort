import java.util.Arrays;

public class PasswortGenerator {

    private String merksatz;
    private String passwort;

    PasswortGenerator(String merksatz) {

        if (merksatz.length() == 0) {
            System.out.println("Keinen Merksatz übergeben.");
            System.exit(0);
        }
        this.merksatz = merksatz;

    }

    public void erstellePasswort() {

        StringBuilder tempMerksatz = new StringBuilder();
        tempMerksatz.append(merksatz.toLowerCase());

        StringBuilder tempPasswort = new StringBuilder();

        for (int i = 0; i < tempMerksatz.length(); i++) {
            String aktChar = Character.toString(tempMerksatz.charAt(i));

            if (aktChar.matches("[a-z]|\s")) {
                tempPasswort.append(tempMerksatz.charAt(i));
            }

        }

        System.out.println(tempPasswort);


    }

    public void printPasswort() {
        //System.out.println("Generiertes Passwort: " + this.passwort);
    }
}
