package Battleships;
import java.awt.GridLayout;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class Board extends JPanel
{
  
  
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
  
  public static void main(String[] args) 
  {
    JFrame frame = new JFrame("Battleship");
    frame.setSize(1900, 1000);
    frame.setLayout(new GridLayout(1, 1));


    frame.add(new LeftField());
    frame.add(new Divider());
    frame.add(new RightField());
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
    
    File sound = new File ("That is PRISTINE.WAV");
    PlaySound(sound);
    
    
  } 
}







