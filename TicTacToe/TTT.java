/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 10.06.2024
 * @author 
 */

public class TTT {
  
  // Anfang Attribute
  private String[] sb;    //Feldvariable für Spielfeld
  private int Dran;       //Variable wer dran ist
  private int[] Score;    //Feldvariable für die Punkte beider Spieler
  private int Zug;        //Variable wie viele Züge gespielt wurden
  // Ende Attribute
  
  public TTT() {                                      //Konstruktor
    this.sb = new String[9];                          //Feld mit 9 Stellen wird defeniert
    for (int i = 0; i < sb.length; i++) {             //Forschleife füllt Feld mit Platzhaltern
      sb[i]= "a";
    }
    this.Dran = 1;
    this.Score = new int[2];
    this.Zug = 1;
  }

  // Anfang Methoden
  public void setSb(String k, int n){
    sb[n] = k;
  }
  
  public String getSb(int i){
    return sb[i];
  }
  public int getDran() {
    return Dran;
  }

  public void setDran(int DranNeu) {
    Dran = DranNeu;
  }
  
  public int werHatGewonnen() {                       //Überprüft alle Gewinnmöglichkeiten des Feldes
    for (int i = 0; i < 8 ; i++) {
      String sum = null;
      switch (i) {
        case 0 :
          sum = sb[0] + sb[1] + sb [2];
          break;
        case 1 : 
          sum = sb[3] + sb[4] + sb[5];
          break;
        case 2:
          sum = sb[6] + sb[7] + sb [8];
          break;
        case 3 :
          sum = sb[0] + sb[3] + sb [6];
          break;
        case 4 :
          sum = sb[1] + sb[4] + sb [7];
          break;
        case 5 :
          sum = sb[2] + sb[5] + sb [8];
          break;
        case 6 :
          sum = sb[0] + sb[4] + sb [8];
          break;
        case 7 :
          sum = sb[2] + sb[4] + sb [6];
          break;
      } // end of switch
      if (sum.equals("XXX")) {
        return 1;                                     //Wenn X gewinnt wird 1 zurückgegeben
      } // end of if
      if (sum.equals("OOO")) {
        return 2;                                     //Wenn O gewinnt wird 2 zurückgegeben
      }
    } // end of for
    return 0;                                         //Wenn niemand gewinnt wird 0 zurückgegeben
  }

  public int getScore(int pos) {
    int b = Score[pos];
    return b;
  }

  public void setScore(int ScoreNeu, int pos) {
    Score[pos]=ScoreNeu;
  }
  
  public void clearsb() {                             //Lehrt das Feld und füllt es mit Platzhaltern
    for (int i = 0; i < 9; i++) {
      sb[i] = "a";
    }
  }
   public void setZug(int ZugNeu) {
    Zug = ZugNeu;
  }
  public int getZug() {
    return Zug;
  }
  public int Voll() {                                 //Überprüft ob das Feld vollständig gefüllt ist
    int counter = 0;
    for (int i = 0; i < 9; i++) {
      if (sb[i] != "a") {
        counter++;                                    //Wenn ein Feldwert nicht mit Platzhalter gefüllt ist wird hochgezählt
      } // end of if
    }
    if (counter == 9) {                               //Wenn alle 9 Felder nicht mit Platzhaltern gefüllt sind ist das Feld voll also wird 1 zurückgegeben
      return 1; 
    } else {
      return 0;                                      // Wenn das Feld noch nicht voll ist wird 0 zurückgegeben
    } // end of if-else
  }
  // Ende Methoden
} // end of TTT

