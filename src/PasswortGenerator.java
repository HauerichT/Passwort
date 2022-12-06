public class PasswortGenerator {

    // Instanzvariablen
    private String merksatz;
    private String passwort = "";

    // Konstruktor
    PasswortGenerator(String merksatz) {

        if (merksatz.length() == 0) {
            System.out.println("Keinen Merksatz übergeben.");
            System.exit(0);
        }
        this.merksatz = merksatz;

    }

    // Methode generiert Passwort aus übergebenen Satz
    public void erstellePasswort() {

        // Leerzeichen am Anfang und Ende entfernen
        merksatz = merksatz.trim();

        // in Kleinbuchstaben umwandeln
        merksatz = merksatz.toLowerCase();

        // String in String-Array splitten
        String[] merksatzSplit = merksatz.split(" ");

        // boolean um Klein- bzw. Großbuchstaben darzustellen
        boolean grossbuchstabe = false;

        for (int i = 0; i < merksatzSplit.length; i++) {

            for (int j = 0; j < merksatzSplit[i].length(); j++) {

                // speichert aktuellen Buchstaben
                String aktuellerBuchstabe = String.valueOf(merksatzSplit[i].charAt(j));

                // speichert aktuellen Buchstaben als Großbuchstaben
                String aktuellerBuchstabeGross = aktuellerBuchstabe.toUpperCase();

                // prüft auf die zulässigen Symbole
                if (aktuellerBuchstabe.matches("[a-z]|\s")) {

                    // fügt dem Passwort den zulässigen Groß- oder Kleinbuchstaben hinzu
                    if (grossbuchstabe) {
                        this.passwort = this.passwort.concat(aktuellerBuchstabeGross);
                        grossbuchstabe = false;
                    }
                    else {
                        this.passwort = this.passwort.concat(aktuellerBuchstabe);
                        grossbuchstabe = true;
                    }
                    break;

                }

            }

        }

    }

    // Methode zum printen des Passworts
    public void printPasswort() {
        System.out.println("Generiertes Passwort: " + this.passwort);
    }
}
