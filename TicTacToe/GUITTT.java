import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import java.util.*;
import java.awt.font.TextAttribute;
/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 10.06.2024
 * @author 
 */

public class GUITTT extends JFrame {
  // Anfang Attribute
  // start attributes
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  private JButton jButton3 = new JButton();
  private JButton jButton4 = new JButton();
  private JButton jButton5 = new JButton();
  private JButton jButton6 = new JButton();
  private JButton jButton7 = new JButton();
  private JButton jButton8 = new JButton();
  private JButton jButton9 = new JButton();
  private JLabel lScore = new JLabel();
  private JLabel lKreuz = new JLabel();
  private JLabel lKreis = new JLabel();
  private JLabel lTitel = new JLabel();
  private static TTT t1 = new TTT();
  private JLabel l0 = new JLabel();
  private JLabel l01 = new JLabel();
  private JButton bClear = new JButton();
  private JButton bClearscore1 = new JButton();
  // end attributes
  
  // Ende Attribute
  
  public GUITTT() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 720; 
    int frameHeight = 520;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("TICTACTOE");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    cp.setBackground(Color.WHITE);
    // start components
    // Anfang Komponenten
    
    jButton1.setBounds(40, 48, 129, 129);
    jButton1.setText("");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    jButton1.setBackground(new Color(0xFFC800));
    cp.add(jButton1);
    jButton2.setBounds(176, 48, 129, 129);
    jButton2.setText("");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    jButton2.setBackground(new Color(0xFFC800));
    cp.add(jButton2);
    jButton3.setBounds(312, 48, 129, 129);
    jButton3.setText("");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton3_ActionPerformed(evt);
      }
    });
    jButton3.setBackground(new Color(0xFFC800));
    cp.add(jButton3);
    jButton4.setBounds(40, 184, 129, 129);
    jButton4.setText("");
    jButton4.setMargin(new Insets(2, 2, 2, 2));
    jButton4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton4_ActionPerformed(evt);
      }
    });
    jButton4.setBackground(new Color(0xFFC800));
    cp.add(jButton4);
    jButton5.setBounds(176, 184, 129, 129);
    jButton5.setText("");
    jButton5.setMargin(new Insets(2, 2, 2, 2));
    jButton5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton5_ActionPerformed(evt);
      }
    });
    jButton5.setBackground(new Color(0xFFC800));
    cp.add(jButton5);
    jButton6.setBounds(312, 184, 129, 129);
    jButton6.setText("");
    jButton6.setMargin(new Insets(2, 2, 2, 2));
    jButton6.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton6_ActionPerformed(evt);
      }
    });
    jButton6.setBackground(new Color(0xFFC800));
    cp.add(jButton6);
    jButton7.setBounds(40, 320, 129, 129);
    jButton7.setText("");
    jButton7.setMargin(new Insets(2, 2, 2, 2));
    jButton7.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton7_ActionPerformed(evt);
      }
    });
    jButton7.setBackground(new Color(0xFFC800));
    cp.add(jButton7);
    jButton8.setBounds(176, 320, 129, 129);
    jButton8.setText("");
    jButton8.setMargin(new Insets(2, 2, 2, 2));
    jButton8.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton8_ActionPerformed(evt);
      }
    });
    jButton8.setBackground(new Color(0xFFC800));
    cp.add(jButton8);
    jButton9.setBounds(312, 320, 129, 129);
    jButton9.setText("");
    jButton9.setMargin(new Insets(2, 2, 2, 2));
    jButton9.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton9_ActionPerformed(evt);
      }
    });
    jButton9.setBackground(new Color(0xFFC800));
    cp.add(jButton9);
    lScore.setBounds(464, 56, 110, 20);
    lScore.setText("Score ");
    lScore.setFont(new Font("Dialog", Font.BOLD, 20));
    cp.add(lScore);
    lKreuz.setBounds(464, 96, 110, 20);
    lKreuz.setText("Kreuz");
    lKreuz.setFont(new Font("Dialog", Font.BOLD, 16));
    cp.add(lKreuz);
    lKreis.setBounds(576, 96, 110, 20);
    lKreis.setText("Kreis");
    lKreis.setFont(new Font("Dialog", Font.BOLD, 16));
    cp.add(lKreis);
    l0.setBounds(482, 128, 110, 20);
    l0.setText("0");
    l0.setFont(new Font("Dialog", Font.BOLD, 16));
    cp.add(l0);
    l01.setBounds(592, 128, 110, 20);
    l01.setText("0");
    l01.setFont(new Font("Dialog", Font.BOLD, 16));
    cp.add(l01);
    lTitel.setBounds(178, 10, 119, 20);
    lTitel.setText("TicTacToe");
    Hashtable<TextAttribute, Object> lTitel_map = new Hashtable<TextAttribute, Object>();
    lTitel.setFont(new Font("Dialog", Font.BOLD, 24));
    cp.add(lTitel);
    bClear.setBounds(456, 184, 211, 129);
    bClear.setText("Clear");
    bClear.setMargin(new Insets(2, 2, 2, 2));
    bClear.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bClear_ActionPerformed(evt);
      }
    });
    bClear.setBackground(new Color(0xEC6000));
    bClear.setFont(new Font("Dialog", Font.BOLD, 20));
    cp.add(bClear);
    // Ende Komponenten
    
    bClearscore1.setBounds(456, 320, 211, 129);
    bClearscore1.setText("Clearscore");
    bClearscore1.setMargin(new Insets(2, 2, 2, 2));
    bClearscore1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bClearscore1_ActionPerformed(evt);
      }
    });
    bClearscore1.setBackground(new Color(0xEC6000));
    bClearscore1.setFont(new Font("Dialog", Font.BOLD, 20));
    cp.add(bClearscore1);
    // end components
    setVisible(true);
  } // end of public GUITTT
  
  // Anfang Methoden
  
  // start methods
  public static void main(String[] args) { 
    new GUITTT();  
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    if (t1.getSb(0) == "a") {                               // Wenn das Feld leer ist, also mit einem Platzhalter gefüllt ist kann es belegt werden  
      if (t1.getDran() == 1) {                              // Kreuz ist Spieler 1 und Kreis Spieler 2
        jButton1.setIcon(new ImageIcon("C:\\Users\\Tom\\OneDrive\\Dokumente\\1Oberstufe\\Informatik GK\\TicTacToe\\Bilder\\Kreuz.png"));   
      }
      else {
        jButton1.setIcon(new ImageIcon("C:\\Users\\Tom\\OneDrive\\Dokumente\\1Oberstufe\\Informatik GK\\TicTacToe\\Bilder\\Kreis.png"));
      }
      Buttonpress(0);
    } // end of jButton9_ActionPerformed
    else {
      JOptionPane.showMessageDialog(null, "Feld bereits besetzt" , "", JOptionPane.INFORMATION_MESSAGE);   // Wenn das Feld schon besetzt ist dann wird eine Nachricht ausgegeben
    } // end of if-else
  } // end of jButton1_ActionPerformed

  public void jButton2_ActionPerformed(ActionEvent evt) {
    if (t1.getSb(1) == "a") {
      if (t1.getDran() == 1) {
        jButton2.setIcon(new ImageIcon("C:\\Users\\Tom\\OneDrive\\Dokumente\\1Oberstufe\\Informatik GK\\TicTacToe\\Bilder\\Kreuz.png"));
      }
      else {
        jButton2.setIcon(new ImageIcon("C:\\Users\\Tom\\OneDrive\\Dokumente\\1Oberstufe\\Informatik GK\\TicTacToe\\Bilder\\Kreis.png"));
      }
      Buttonpress(1);
    } // end of jButton9_ActionPerformed
    else {
      JOptionPane.showMessageDialog(null, "Feld bereits besetzt" , "", JOptionPane.INFORMATION_MESSAGE);
    } // end of if-else
  } // end of jButton2_ActionPerformed

  public void jButton3_ActionPerformed(ActionEvent evt) {
    if (t1.getSb(2) == "a") {
      if (t1.getDran() == 1) {
        jButton3.setIcon(new ImageIcon("C:\\Users\\Tom\\OneDrive\\Dokumente\\1Oberstufe\\Informatik GK\\TicTacToe\\Bilder\\Kreuz.png"));
      }
      else {
        jButton3.setIcon(new ImageIcon("C:\\Users\\Tom\\OneDrive\\Dokumente\\1Oberstufe\\Informatik GK\\TicTacToe\\Bilder\\Kreis.png"));
      }
      Buttonpress(2);
    } // end of jButton9_ActionPerformed
    else {
      JOptionPane.showMessageDialog(null, "Feld bereits besetzt" , "", JOptionPane.INFORMATION_MESSAGE);
    } // end of if-else
  } // end of jButton3_ActionPerformed

  public void jButton4_ActionPerformed(ActionEvent evt) {
    if (t1.getSb(3) == "a") {
      if (t1.getDran() == 1) {
        jButton4.setIcon(new ImageIcon("C:\\Users\\Tom\\OneDrive\\Dokumente\\1Oberstufe\\Informatik GK\\TicTacToe\\Bilder\\Kreuz.png"));
      }
      else {
        jButton4.setIcon(new ImageIcon("C:\\Users\\Tom\\OneDrive\\Dokumente\\1Oberstufe\\Informatik GK\\TicTacToe\\Bilder\\Kreis.png"));
      }
      Buttonpress(3);
    } // end of jButton9_ActionPerformed
    else {
      JOptionPane.showMessageDialog(null, "Feld bereits besetzt" , "", JOptionPane.INFORMATION_MESSAGE);
    } // end of if-else
  } // end of jButton4_ActionPerformed

  public void jButton5_ActionPerformed(ActionEvent evt) {
    if (t1.getSb(4) == "a") {
      if (t1.getDran() == 1) {
        jButton5.setIcon(new ImageIcon("C:\\Users\\Tom\\OneDrive\\Dokumente\\1Oberstufe\\Informatik GK\\TicTacToe\\Bilder\\Kreuz.png"));
      }
      else {
        jButton5.setIcon(new ImageIcon("C:\\Users\\Tom\\OneDrive\\Dokumente\\1Oberstufe\\Informatik GK\\TicTacToe\\Bilder\\Kreis.png"));
      }
      Buttonpress(4);
    } // end of jButton9_ActionPerformed
    else {
      JOptionPane.showMessageDialog(null, "Feld bereits besetzt" , "", JOptionPane.INFORMATION_MESSAGE);
    } // end of if-else
  } // end of jButton5_ActionPerformed

  public void jButton6_ActionPerformed(ActionEvent evt) {
    if (t1.getSb(5) == "a") {
      if (t1.getDran() == 1) {
        jButton6.setIcon(new ImageIcon("C:\\Users\\Tom\\OneDrive\\Dokumente\\1Oberstufe\\Informatik GK\\TicTacToe\\Bilder\\Kreuz.png"));
      }
      else {
        jButton6.setIcon(new ImageIcon("C:\\Users\\Tom\\OneDrive\\Dokumente\\1Oberstufe\\Informatik GK\\TicTacToe\\Bilder\\Kreis.png"));
      }
      Buttonpress(5);
    } // end of jButton9_ActionPerformed
    else {
      JOptionPane.showMessageDialog(null, "Feld bereits besetzt" , "", JOptionPane.INFORMATION_MESSAGE);
    } // end of if-else
  } // end of jButton6_ActionPerformed

  public void jButton7_ActionPerformed(ActionEvent evt) {
    if (t1.getSb(6) == "a") {
      if (t1.getDran() == 1) {
        jButton7.setIcon(new ImageIcon("C:\\Users\\Tom\\OneDrive\\Dokumente\\1Oberstufe\\Informatik GK\\TicTacToe\\Bilder\\Kreuz.png"));
      }
      else {
        jButton7.setIcon(new ImageIcon("C:\\Users\\Tom\\OneDrive\\Dokumente\\1Oberstufe\\Informatik GK\\TicTacToe\\Bilder\\Kreis.png"));
      }
      Buttonpress(6);
    } // end of jButton9_ActionPerformed
    else {
      JOptionPane.showMessageDialog(null, "Feld bereits besetzt" , "", JOptionPane.INFORMATION_MESSAGE);
    } // end of if-else
  } // end of jButton7_ActionPerformed

  public void jButton8_ActionPerformed(ActionEvent evt) {
    if (t1.getSb(7) == "a") {
      if (t1.getDran() == 1) {
        jButton8.setIcon(new ImageIcon("C:\\Users\\Tom\\OneDrive\\Dokumente\\1Oberstufe\\Informatik GK\\TicTacToe\\Bilder\\Kreuz.png"));
      }
      else {
        jButton8.setIcon(new ImageIcon("C:\\Users\\Tom\\OneDrive\\Dokumente\\1Oberstufe\\Informatik GK\\TicTacToe\\Bilder\\Kreis.png"));
      }
      Buttonpress(7);
    } // end of jButton9_ActionPerformed
    else {
      JOptionPane.showMessageDialog(null, "Feld bereits besetzt" , "", JOptionPane.INFORMATION_MESSAGE);
    } // end of if-else
  } // end of jButton8_ActionPerformed

  public void jButton9_ActionPerformed(ActionEvent evt) {
    if (t1.getSb(8) == "a") {
      if (t1.getDran() == 1) {
        jButton9.setIcon(new ImageIcon("C:\\Users\\Tom\\OneDrive\\Dokumente\\1Oberstufe\\Informatik GK\\TicTacToe\\Bilder\\Kreuz.png"));
      }
      else {
        jButton9.setIcon(new ImageIcon("C:\\Users\\Tom\\OneDrive\\Dokumente\\1Oberstufe\\Informatik GK\\TicTacToe\\Bilder\\Kreis.png"));
      }
      Buttonpress(8);
    } // end of jButton9_ActionPerformed
    else {
      JOptionPane.showMessageDialog(null, "Feld bereits besetzt" , "", JOptionPane.INFORMATION_MESSAGE);
    } // end of if-else
  }
    
  public void bClear_ActionPerformed(ActionEvent evt) {
    clearall();
  } // end of bClear_ActionPerformed
  
  public void Buttonpress(int i) {
    if (t1.getDran() == 1) {
      t1.setSb("X",i);                     //Das Spielbrett wird intern mit einem jeweiligen Zeichen belegt
      if (t1.werHatGewonnen() == 1) {         // Wenn eine Gewinnbedigung für Spieler 1 erfüllt ist dann gewinnt dieser
        t1.setScore(t1.getScore(0) + 1, 0);    // Wenn man gewinnt bekommt man einen Punkt
        l0.setText(String.valueOf(t1.getScore(0)));
        t1.setDran(1);                         // Und das Spiel wird zurückgesetzt
        JOptionPane.showMessageDialog(null, "X hat gewonnen in " + t1.getZug() + " Zügen" , "", JOptionPane.INFORMATION_MESSAGE); // Eine Pop-Up Nachricht zeigt an wer gewonnen hat
        clearall();                        // Das Spiel wird zurückgesetzt
      } // end of if
      else {
        t1.setDran(2); // Wenn niemand gewinnt dann ist der andere dran
      }
    } else {
      t1.setSb("O",i);
      if (t1.werHatGewonnen() == 2) {
        t1.setScore(t1.getScore(1)+1,1);  
        l01.setText(String.valueOf(t1.getScore(1)));
        t1.setDran(1);
        JOptionPane.showMessageDialog(null, "O hat gewonnen in "+ t1.getZug() + " Zügen", "", JOptionPane.INFORMATION_MESSAGE);
        clearall();
      } // end of if
      t1.setDran(1);
    } // end of if-else
    if (t1.Voll()==1) {           //Wenn das Feld Voll ist ohne das jemand gewonnen hat muss es Untendschieden sein
      JOptionPane.showMessageDialog(null, "Unentschieden in "+ t1.getZug() + " Zügen" , "", JOptionPane.INFORMATION_MESSAGE); //  Eine Pop-Up Nachricht zeigt dies an
      clearall();                 // Das Spiel wird zurückgesetzt
    } // end of if
    t1.setZug(t1.getZug()+1);
  }
  public void bClearscore1_ActionPerformed(ActionEvent evt) {    // Wenn der Knopf gedrückt wird dann wird der Spielstand zurückgestzt
    l0.setText("0");
    t1.setScore(0,1);                              
    l01.setText("0");
    t1.setScore(0,0);
  } // end of bClearscore1_ActionPerformed

  // end methods
  public void clearall() {
    t1.clearsb();                         // Die Bilder werden entfernt und auch das interne Feld wird zurückgesetzt
    jButton1.setIcon(new ImageIcon(""));
    jButton2.setIcon(new ImageIcon(""));
    jButton3.setIcon(new ImageIcon(""));
    jButton4.setIcon(new ImageIcon(""));
    jButton5.setIcon(new ImageIcon(""));
    jButton6.setIcon(new ImageIcon(""));
    jButton7.setIcon(new ImageIcon(""));
    jButton8.setIcon(new ImageIcon(""));
    jButton9.setIcon(new ImageIcon(""));
    t1.setDran(1);
    t1.setZug(0);
  }
} // end of class GUITTT
//H:\\Tik Tok Toe\\Tik Tak Toe Bilder\\
//jButton1.setIcon(new ImageIcon(""));
