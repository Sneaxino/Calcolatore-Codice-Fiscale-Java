package CodFiscale;

public class Anno {
    String nascita;
    String sesso;
    String codfiscale;
    public Anno(String nascita, String sesso, String codfiscale){
        this.nascita = nascita;
        this.sesso = sesso;
        this.codfiscale = codfiscale;
       
                
}
public String LettAnno(){
     //Ultime 2 cifre dell'anno
    codfiscale+=nascita.substring(8, 10);
     //Andiamo a trovare la lettera associata al mese
     String mese = nascita.substring(3, 5);
   
    switch(mese){
         case"01":codfiscale+="A";
         break;
         case"02":codfiscale+="B";
         break;
         case"03":codfiscale+="C";
         break;
         case"04":codfiscale+="D";
         break;
         case"05":codfiscale+="E";
         break;
         case"06":codfiscale+="H";
         break;
         case"07":codfiscale+="L";
         break;
         case"08":codfiscale+="M";
         break; 
         case"09":codfiscale+="P";
         break; 
         case"10":codfiscale+="R"; 
         break;
         case"11":codfiscale+="S";
         break; 
         case"12":codfiscale+="T";
         break; 
         }

         String giorno = nascita.substring(0, 2);
         if (sesso.equals("M")){
            codfiscale+=giorno;
         }
         else {
             int giornof = Integer.parseInt(giorno);
            codfiscale+=(giornof + 40);
         }
         return codfiscale;
}
}