package Battleships;
import javax.imageio.ImageIO;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class LeftField extends JPanel {
  JButton[][] jb = new JButton[15][15];
    
  
  public LeftField(){
    init();
  }
    
  private void init() {
    setLayout(new BorderLayout());
    JLabel title = new JLabel("                                                            Player 1");
    add(title, BorderLayout.NORTH);
    
    JPanel middlePanel = new JPanel();
    middlePanel.setLayout(new GridLayout(15,15));
    ImageIcon water = new ImageIcon("E:\\APPLEMOBILE\\2.ComputerScience\\FinalProgram\\Battleships\\water.bmp");
    
    for (int i = 0; i < 15; i++){
      for (int j = 0 ; j < 15; j++){
        jb[i][j] = new JButton();
        jb[i][j].setPreferredSize(new Dimension(10,10));
        jb[i][j].setBackground(Color.CYAN);
        middlePanel.add(jb[i][j]);
                                
        jb[i][j].addActionListener(new ActionListener(){        
          public void actionPerformed(ActionEvent e){            
            JOptionPane.showMessageDialog(null,"Action Listener is working");            
          }          
        });          
      }
    }
    
    add(middlePanel, BorderLayout.CENTER);
    
    JPanel bottomPanel = new JPanel();
    bottomPanel.setLayout(new GridLayout(1,2));
    
    JButton bomb = new JButton("Bombs");
    JButton cashAndDone = new JButton ("Cash and Done");
    JButton exit = new JButton("Exit");
    
    bottomPanel.add(bomb);
    bottomPanel.add(cashAndDone);
    bottomPanel.add(exit);
    
    bomb.addActionListener(new ActionListener(){
      
      public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null,"Action Listener is working");        
      }
    });
    
    cashAndDone.addActionListener(new ActionListener(){
      
      public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null,"Action Listener is working");       
      }
    });
    
    exit.addActionListener(new ActionListener(){
      
      public void actionPerformed(ActionEvent e){
        System.exit(0);
        return;
      }
    });
    add(bottomPanel, BorderLayout.SOUTH);   
  }
  
  
}


