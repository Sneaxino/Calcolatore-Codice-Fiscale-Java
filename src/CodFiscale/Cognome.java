package CodFiscale;

public class Cognome { 
     String cognome;
     String codfiscale;

     public Cognome(String cognome, String codfiscale) {
        this.cognome = cognome;
        this.codfiscale = codfiscale;
    }

    public String LettCognome(){
        int x = 0, pos = 0, y = 0;
    
        String cognome2 = cognome.replace(" ", "");
        String cognomemaiusc = cognome2.toUpperCase();
        char[] arrayconsonanti = new char[50];
        char[] arrayvocali = new char[50];
        
        for(pos = 0; pos < cognomemaiusc.length(); pos++){ //pos parola
            char lettera = cognomemaiusc.charAt(pos);
            switch(lettera){
                case 'A': 
                case 'E': 
                case 'I': 
                case 'O': 
                case 'U': 
                    arrayvocali[y] = lettera;
                    y++;
                    break;
                default: 
                    arrayconsonanti[x] = lettera;
                    x++;
                    break;
            }
        }
        
        if(x - 1 > 1){
           codfiscale += arrayconsonanti[0];
           codfiscale += arrayconsonanti[1];
           codfiscale += arrayconsonanti[2];
        }
        else if(x - 1 == 1){
           codfiscale += arrayconsonanti[0];
           codfiscale += arrayconsonanti[1];
           codfiscale += arrayvocali[0];
        }
        else if(x - 1 == 0){
           codfiscale += arrayconsonanti[0];
           codfiscale += arrayvocali[0];
           codfiscale += arrayvocali[1];
        }
    
       return codfiscale;
    }
}   