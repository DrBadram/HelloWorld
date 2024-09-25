import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Hashtable;
import java.awt.font.TextAttribute;

/**
 *
 * Description
 *
 * @version 1.0 from 24.06.2024
 * @author 
 */

public class Test extends JFrame {
  // start attributes
  private JLabel jLabel1 = new JLabel();
  private JButton jButton1 = new JButton();
  private JLabel jLabel2 = new JLabel();
  // end attributes
  
  public Test() { 
    // Frame init
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 481; 
    int frameHeight = 330;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Test");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    cp.setBackground(Color.WHITE);
    // start components
    
    jLabel1.setBounds(88, 80, 80, 24);
    jLabel1.setText("Text");
    jLabel1.setFont(new Font("Dialog", Font.BOLD, 16));
    jLabel1.setBackground(Color.WHITE);
    cp.add(jLabel1);
    jButton1.setBounds(72, 136, 240, 136);
    jButton1.setText("");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    jButton1.setBackground(new Color(0xFFC800));
    cp.add(jButton1);
    jLabel2.setBounds(216, 80, 80, 24);
    jLabel2.setText("Text");
    Hashtable<TextAttribute, Object> jLabel2_map = new Hashtable<TextAttribute, Object>();
    jLabel2_map.put(TextAttribute.FAMILY, "Dialog");
    jLabel2_map.put(TextAttribute.SIZE, new Integer(12));
    jLabel2_map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
    jLabel2.setFont(new Font(jLabel2_map));
    cp.add(jLabel2);
    // end components
    
    setVisible(true);
  } // end of public Test
  
  // start methods
  
  public static void main(String[] args) {
    new Test();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    
  } // end of jButton1_ActionPerformed

  // end methods
} // end of class Test
