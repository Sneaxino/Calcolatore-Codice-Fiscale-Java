package CodFiscale;

public class Comune {
    String comunemaiuscolo;
    String codfiscale;
    public Comune(String comunemaiuscolo, String codfiscale){
        this.comunemaiuscolo=comunemaiuscolo;
        this.codfiscale=codfiscale;
       
    }
    public String LettComune(){
        switch(comunemaiuscolo){
            case "NAPOLI":
               codfiscale+="F839";
                break;
            case "SALERNO":
               codfiscale+="I753";
                break;
            case "AVELLINO":
           codfiscale+="A129";
                break;
            case "CASERTA":
           codfiscale+="C016";
                break;
            case "BENEVENTO":
           codfiscale+="B193";
                break;
        }
        return codfiscale;
    }
}
