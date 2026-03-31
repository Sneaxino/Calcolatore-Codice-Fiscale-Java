package CodFiscale;

public class Controllo {
    String codfiscale;
    public Controllo (String codfiscale){
        this.codfiscale = codfiscale;
    }
    public String LettControllo(){
        //Calcolo codice di controllo
  char[] arr = codfiscale.toCharArray();
  int somma=0;
  // Loop
  for(int i = 0; i < arr.length; i++) {
  
      // Verifichiamo che l'indice sia dispari
          if (i % 2 != 0) {
          if(arr[i] == 'A' || arr[i] == '0') {
              somma += 0;
          } 
          else if(arr[i] == 'B' || arr[i] == '1') {
              somma += 1;
          }  
          else if(arr[i] == 'C' || arr[i] == '2') {
              somma += 2;
          } 
          else if(arr[i] == 'D' || arr[i] == '3') {
              somma += 3;
          } 
          else if(arr[i] == 'E' || arr[i] == '4') {
              somma += 4;
          } 
          else if(arr[i] == 'F' || arr[i] == '5') {
              somma += 5;
          } 
          else if(arr[i] == 'G' || arr[i] == '6') {
              somma += 6;
          } 
          else if(arr[i] == 'H' || arr[i] == '7') {
              somma += 7;
          } 
          else if(arr[i] == 'I' || arr[i] == '8') {
              somma += 8;
          } 
          else if(arr[i] == 'J' || arr[i] == '9') {
              somma += 9;
          } 
          else if(arr[i] == 'K') {
              somma += 10;
          } 
          else if(arr[i] == 'L') {
              somma += 11;
          } 
          else if(arr[i] == 'M') {
              somma += 12;
          } 
          else if(arr[i] == 'N') {
              somma += 13;
          } 
          else if(arr[i] == 'O') {
              somma += 14;
          } 
          else if(arr[i] == 'P') {
              somma += 15;
          } 
          else if(arr[i] == 'Q') {
              somma += 16;
          } 
          else if(arr[i] == 'R') {
              somma += 17;
          } 
          else if(arr[i] == 'S') {
              somma += 18;
          } 
          else if(arr[i] == 'T') {
              somma += 19;
          } 
          else if(arr[i] == 'U') {
              somma += 20;
          } 
          else if(arr[i] == 'V') {
              somma += 21;
          
          } 
          else if(arr[i] == 'W') {
              somma += 22;
          } 
          else if(arr[i] == 'X') {
              somma += 23;
          } 
          else if(arr[i] == 'Y') {
              somma += 24;
          } 
          else if(arr[i] == 'Z') {
              somma += 25;
          }
      }
  
      // Verifichiamo che l'indice (posizione) sia pari
      if(i%2 == 0){
      if(arr[i] == 'A' || arr[i] == '0') {
          somma += 1;
      } 
      else if(arr[i] == 'B' || arr[i] == '1') {
          somma += 0;
      }  
      else if(arr[i] == 'C' || arr[i] == '2') {
          somma += 5;
      } 
      else if(arr[i] == 'D' || arr[i] == '3') {
          somma += 7;
      } 
      else if(arr[i] == 'E' || arr[i] == '4') {
          somma += 9;
      } 
      else if(arr[i] == 'F' || arr[i] == '5') {
          somma += 13;
      } 
      else if(arr[i] == 'G' || arr[i] == '6') {
          somma += 15;
      } 
      else if(arr[i] == 'H' || arr[i] == '7') {
          somma += 17;
      } 
      else if(arr[i] == 'I' || arr[i] == '8') {
          somma += 19;
      } 
      else if(arr[i] == 'J' || arr[i] == '9') {
          somma += 21;
      } 
      else if(arr[i] == 'K') {
          somma += 2;
      } 
      else if(arr[i] == 'L') {
          somma += 4;
      } 
      else if(arr[i] == 'M') {
          somma += 18;
      } 
      else if(arr[i] == 'N') {
          somma += 20;
      } 
      else if(arr[i] == 'O') {
          somma += 11;
      } 
      else if(arr[i] == 'P') {
          somma += 3;
      } 
      else if(arr[i] == 'Q') {
          somma += 6;
      } 
      else if(arr[i] == 'R') {
          somma += 8;
      } 
      else if(arr[i] == 'S') {
          somma += 12;
      } 
      else if(arr[i] == 'T') {
          somma += 14;
      } 
      else if(arr[i] == 'U') {
          somma += 16;
      } 
      else if(arr[i] == 'V') {
          somma += 10;
      
      } 
      else if(arr[i] == 'W') {
          somma += 22;
      } 
      else if(arr[i] == 'X') {
          somma += 25;
      } 
      else if(arr[i] == 'Y') {
          somma += 24;
      } 
      else if(arr[i] == 'Z') {
          somma += 23;
      }
     }
  }
  
  
  // Resto
  int resto = somma % 26;
  //troviamo il carattere corrispondente al resto
  switch(resto) {
      case 0:
          codfiscale += "A";
          break;
      case 1:
          codfiscale += "B";
          break;
      case 2:
          codfiscale += "C";
          break;
      case 3:
          codfiscale += "D";
          break;
      case 4:
          codfiscale += "E";
          break;
      case 5:
          codfiscale += "F";
          break;
      case 6:
          codfiscale += "G";
          break;
      case 7:
          codfiscale += "H";
          break;
      case 8:
          codfiscale += "I";
          break;
      case 9:
          codfiscale += "J";
          break;
      case 10:
          codfiscale += "K";
          break;
      case 11:
          codfiscale += "L";
          break;
      case 12:
          codfiscale += "M";
          break;
      case 13:
          codfiscale += "N";
          break;
      case 14:
          codfiscale += "O";
          break;
      case 15:
          codfiscale += "P";
          break;
      case 16:
          codfiscale += "Q";
          break;
      case 17:
          codfiscale += "R";
          break;
      case 18:
          codfiscale += "S";
          break;
      case 19:
          codfiscale += "T";
          break;
      case 20:
          codfiscale += "U";
          break;
      case 21:
          codfiscale += "V";
          break;
      case 22:
          codfiscale += "W";
          break;
      case 23:
          codfiscale += "X";
          break;
      case 24:
          codfiscale += "Y";
          break; 
      case 25:
          codfiscale += "Z";
          break;   
      
  }
  
      return codfiscale;
  
    }
}
