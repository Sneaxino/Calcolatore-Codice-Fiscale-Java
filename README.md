# 🇮🇹 Calcolatore Codice Fiscale in Java

Un'applicazione Java console-based che calcola il Codice Fiscale italiano partendo dai dati anagrafici dell'utente. 

Questo progetto è stato sviluppato a scopo didattico per applicare i concetti di Programmazione Orientata agli Oggetti (OOP), manipolazione di stringhe e algoritmi di controllo.

## ⚙️ Funzionalità
Il programma richiede in input tramite console:
- Nome e Cognome
- Data di nascita (formato dd/mm/yyyy) e Sesso (M/F)
- Comune di nascita (Attualmente supportati: Napoli, Salerno, Avellino, Benevento, Caserta)

Attraverso classi separate, il programma elabora i dati seguendo l'algoritmo ufficiale del Ministero delle Finanze per generare i 16 caratteri alfanumerici, incluso il complesso calcolo del carattere di controllo finale.

## 🛠️ Tecnologie Utilizzate
- **Linguaggio:** Java
- **Paradigma:** Object-Oriented Programming (OOP)
- **Ambiente:** Visual Studio Code

## 🚀 Come eseguire il progetto in locale

1. Clona la repository sul tuo computer:
   ```bash
   git clone https://github.com/Sneaxino/Calcolatore-Codice-Fiscale-Java.git
   ```
2. Apri il progetto con il tuo IDE preferito (VS Code, IntelliJ, Eclipse).
3. Esegui il file `App.java` situato nel package `CodFiscale`.
4. Segui le istruzioni a schermo per inserire i tuoi dati.

## 📁 Struttura del Codice
Il progetto è suddiviso in classi specifiche per mantenere il codice modulare e pulito:
- `App.java`: Main class che gestisce l'interfaccia utente (I/O).
- `Nome.java` / `Cognome.java`: Gestione vocali/consonanti per i primi 6 caratteri.
- `Anno.java`: Elaborazione di data di nascita e sesso.
- `Comune.java`: Mappatura dei codici catastali dei comuni.
- `Controllo.java`: Algoritmo per il calcolo dell'ultimo carattere di verifica.