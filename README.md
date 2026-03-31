# Calcolatore Codice Fiscale (Java)

Questo è un progetto in Java che ho sviluppato per mettere in pratica i concetti di Programmazione Orientata agli Oggetti (OOP) e la manipolazione delle stringhe. 

L'applicazione funziona da terminale e permette di calcolare un Codice Fiscale italiano partendo dai dati anagrafici dell'utente.

## Come funziona
Tramite la classe principale (`App.java`), il programma chiede all'utente di inserire:
- Nome e Cognome
- Data di nascita e sesso (M/F)
- Comune di nascita (al momento i comuni supportati come test sono: Napoli, Salerno, Avellino, Benevento, Caserta)

Il calcolo non avviene tutto in un unico blocco, ma è stato suddiviso in varie classi separate (`Nome.java`, `Cognome.java`, `Anno.java`, `Comune.java`) per mantenere il codice ordinato e modulare. È presente anche l'algoritmo per il calcolo del carattere di controllo finale (`Controllo.java`).

## Come testare il codice in locale
1. Scarica i file o clona questa repository.
2. Apri la cartella del progetto nel tuo IDE preferito (es. Visual Studio Code o Eclipse).
3. Assicurati di mantenere i file all'interno della cartella `src/CodFiscale` per rispettare il *package*.
4. Avvia il file `App.java` (che contiene il metodo `main`) e segui le istruzioni a schermo.

## Autore
Sviluppato da **Carmine Ciccarelli**
- Il mio profilo LinkedIn https://www.linkedin.com/in/carmine-ciccarelli-bb685a3bb/
