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
        String[] result = merksatz.split(" ");

        // boolean um Klein- bzw. Großbuchstaben darzustellen
        boolean toUppercase = false;

        for (int i = 0; i < result.length; i++) {

            for (int j = 0; j < result[i].length(); j++) {

                // speichert aktuellen Buchstaben
                String akt = String.valueOf(result[i].charAt(j));

                // speichert aktuellen Buchstaben als Großbuchstaben
                String aktUppercase = akt.toUpperCase();

                // prüft auf die zulässigen Symbole
                if (akt.matches("[a-z]|\s")) {

                    // fügt dem Passwort den zulässigen Groß- oder Kleinbuchstaben hinzu
                    if (toUppercase) {
                        this.passwort = this.passwort.concat(aktUppercase);
                        toUppercase = false;
                        break;
                    }
                    else {
                        this.passwort = this.passwort.concat(akt);
                        toUppercase = true;
                        break;
                    }

                }

            }

        }

    }

    // Methode zum printen des Passworts
    public void printPasswort() {
        System.out.println("Generiertes Passwort: " + this.passwort);
    }
}
