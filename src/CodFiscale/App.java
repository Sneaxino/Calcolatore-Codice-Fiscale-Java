package CodFiscale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int x = 0;
        String comunemaiuscolo = "";
        String codfiscale = "";
     Scanner sc=new Scanner(System.in);
     System.out.println("Inserisci il tuo nome: ");
     String nome= sc.nextLine();
     System.out.println("Inserisci il tuo cognome: ");
     String cognome= sc.nextLine();
     System.out.println("Inserisci il la tua data di nascita(dd/mm/yyyy): ");
     String nascita =sc.nextLine();
     System.out.println("Inserisci il tuo sesso(M-F): ");
     String sesso =sc.nextLine();
     
     while(x == 0){
     System.out.println("Inserisci il tuo Comune di nascita: ");
     System.out.println("Comuni attualmente disponibili: Napoli, Salerno, Avellino, Benevento, Caserta");
     String comune =sc.nextLine();
     comune = comune.replaceAll(" ", "");
    comunemaiuscolo = comune.toUpperCase();
     if(comunemaiuscolo.equals("NAPOLI") || comunemaiuscolo.equals("BENEVENTO") || comunemaiuscolo.equals("AVELLINO") || comunemaiuscolo.equals("SALERNO") || comunemaiuscolo.equals("CASERTA")){
        x++;
     }
     else{
        System.out.println("Il comune non è presente tra quelli registrati, riprova");
     }
    }      

//aggiungiamo alla stringa i 3 caratteri x il cognome
     Cognome CFC = new Cognome(cognome, codfiscale);
     codfiscale = CFC.LettCognome();
     
     
     Nome NFC = new Nome(nome, codfiscale);
     codfiscale = NFC.LettNome();
     

     Anno CodAnno = new Anno(nascita, sesso, codfiscale);
     codfiscale = CodAnno.LettAnno();
     

     Comune codComune = new Comune(comunemaiuscolo, codfiscale);
     codfiscale = codComune.LettComune();
    
     Controllo codControllo = new Controllo(codfiscale);
     codfiscale = codControllo.LettControllo();

     System.out.println(codfiscale);
    
     sc.close();
}
    }
