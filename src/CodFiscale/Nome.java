package CodFiscale;

public class Nome { 
    String nome;
    String codfiscale;

    public Nome(String nome, String codfiscale) {
        this.nome = nome;
        this.codfiscale = codfiscale;
    }

    public String LettNome(){
        int x = 0, pos = 0, y = 0;
        
        //rimuoviamo gli spazi presenti nel nome
        String nome2 = nome.replace(" ", "");
        //rendiamo tutto il nome maiuscolo
        String nomemaiusc = nome2.toUpperCase();
        char[] arrayconsonanti = new char[50];
        char[] arrayvocali = new char[50];
        
        for(pos = 0; pos < nomemaiusc.length(); pos++){ //pos parola
            char lettera = nomemaiusc.charAt(pos);
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
        
        //effettuiamo un controllo su quante consonanti ci sono per capire quali dobbiamo mandare a schermo
        if(x - 1 > 2){
           codfiscale += arrayconsonanti[0];
           codfiscale += arrayconsonanti[2];
           codfiscale += arrayconsonanti[3];
        }
        else if(x - 1 == 2){
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