import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {
        // Obtendo o idioma do sistema
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma do sistema é: " + idioma.getDisplayLanguage());
    }
}