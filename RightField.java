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

public class RightField extends JPanel {
  
  JButton[][] jb = new JButton[15][15];
  
  public RightField(){
    init();
  }  
  private void init() {
    setLayout(new BorderLayout());
    JLabel title = new JLabel("                                                            Player 2");
    add(title, BorderLayout.NORTH);
    
    JPanel middlePanel = new JPanel();
    middlePanel.setLayout(new GridLayout(15,15));
    ImageIcon water = new ImageIcon("E:\\APPLEMOBILE\\2.ComputerScience\\FinalProgram\\Battleships\\water.bmp");
    final File sound = new File ("That is PRISTINE.WAV");
    
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
    
    bottomPanel.add(bomb);
    bottomPanel.add(cashAndDone);
    
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
    add(bottomPanel, BorderLayout.SOUTH);    
  }  
  public static void PlaySound (File Sound)
  {    
    try {
      Clip clip = AudioSystem.getClip();
      clip.open(AudioSystem.getAudioInputStream(Sound));
      clip.start();
      
      Thread.sleep(clip.getMicrosecondLength()/1000);
    }catch (Exception e)
    {      
    }
  }  
}