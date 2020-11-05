package JAVA_TICTACTOE;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JAVA_TICTACTOE extends javax.swing.JFrame {
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    boolean checker;
    
    public JAVA_TICTACTOE() {
        initComponents();
    }
    private void gameScore()
    {
        jlblPlayerX.setText(String.valueOf(xCount));
        jlblPlayerO.setText(String.valueOf(oCount));
        
    }
     private void chooseAPlayer()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "0";
        }
        else 
        {
            startGame = "X";
        }    
        
    }
     
     private void winningGame()
     {
         String b1 = jbtn1.getText();
         String b2 = jbtn2.getText();
         String b3 = jbtn3.getText();
         String b4 = jbtn4.getText();
         String b5 = jbtn5.getText();
         String b6 = jbtn6.getText();
         String b7 = jbtn7.getText();
         String b8 = jbtn8.getText();
         String b9 = jbtn9.getText();
         String b10 = jbtn10.getText();
         String b11 = jbtn11.getText();
         String b12 = jbtn12.getText();
         String b13 = jbtn13.getText();
         String b14 = jbtn14.getText();
         String b15 = jbtn15.getText();
         String b16 = jbtn16.getText();
         String b17 = jbtn17.getText();
         String b18 = jbtn18.getText();
         String b19 = jbtn19.getText();
         String b20 = jbtn20.getText();
         String b21 = jbtn21.getText();
         String b22 = jbtn22.getText();
         String b23 = jbtn23.getText();
         String b24 = jbtn24.getText();
         String b25 = jbtn25.getText();
         String b26 = jbtn26.getText();
         String b27 = jbtn27.getText();
         String b28 = jbtn28.getText();
         String b29 = jbtn29.getText();
         String b30 = jbtn30.getText();
         String b31 = jbtn31.getText();
         String b32 = jbtn32.getText();
         String b33 = jbtn33.getText();
         String b34 = jbtn34.getText();
         String b35= jbtn35.getText();
         String b36 = jbtn36.getText();
         String b37 = jbtn37.getText();
         String b38 = jbtn38.getText();
         String b39 = jbtn39.getText();
         String b40 = jbtn40.getText();
         String b41 = jbtn41.getText();
         String b42 = jbtn42.getText();
         String b43 = jbtn43.getText();
         String b44 = jbtn44.getText();
         String b45 = jbtn45.getText();
         String b46 = jbtn46.getText();
         String b47 = jbtn47.getText();
         String b48 = jbtn48.getText();
         String b49 = jbtn49.getText();
         String b50 = jbtn50.getText();
         String b51 = jbtn51.getText();
         String b52 = jbtn52.getText();
         String b53 = jbtn53.getText();
         String b54 = jbtn54.getText();
         String b55 = jbtn55.getText();
         String b56 = jbtn56.getText();
         String b57 = jbtn57.getText();
         String b58 = jbtn58.getText();
         String b59 = jbtn59.getText();
         String b60 = jbtn60.getText();
         String b61 = jbtn61.getText();
         String b62 = jbtn62.getText();
         String b63 = jbtn63.getText();
         String b64 = jbtn64.getText();
         
         
         if (b1 == ("X") && b2 == ("X") && b3 == ("X") && b4 == ("X") && b5 == ("X") && b6 == ("X") && b7 == ("X") && b8 == ("X") )
         {
            JOptionPane.showMessageDialog(this, "Player X Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn1.setBackground(Color.PINK);
            jbtn2.setBackground(Color.PINK);
            jbtn3.setBackground(Color.PINK);
            jbtn4.setBackground(Color.PINK);
            jbtn5.setBackground(Color.PINK);
            jbtn6.setBackground(Color.PINK);
            jbtn7.setBackground(Color.PINK);
            jbtn8.setBackground(Color.PINK);
            xCount++;
            gameScore();
         }
         if (b9 == ("X") && b10 == ("X") && b11 == ("X") && b12 == ("X") && b13 == ("X") && b14 == ("X") && b15 == ("X") && b16 == ("X") )
         {
            JOptionPane.showMessageDialog(this, "Player X Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn9.setBackground(Color.YELLOW);
            jbtn10.setBackground(Color.YELLOW);
            jbtn11.setBackground(Color.YELLOW);
            jbtn12.setBackground(Color.YELLOW);
            jbtn13.setBackground(Color.YELLOW);
            jbtn14.setBackground(Color.YELLOW);
            jbtn15.setBackground(Color.YELLOW);
            jbtn16.setBackground(Color.YELLOW);
            xCount++;
            gameScore();
         }
         if (b17 == ("X") && b18 == ("X") && b19 == ("X") && b20 == ("X") && b21 == ("X") && b22 == ("X") && b23 == ("X") && b24 == ("X") )
         {
            JOptionPane.showMessageDialog(this, "Player X Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn17.setBackground(Color.CYAN);
            jbtn18.setBackground(Color.CYAN);
            jbtn19.setBackground(Color.CYAN);
            jbtn20.setBackground(Color.CYAN);
            jbtn21.setBackground(Color.CYAN);
            jbtn22.setBackground(Color.CYAN);
            jbtn23.setBackground(Color.CYAN);
            jbtn24.setBackground(Color.CYAN);
            xCount++;
            gameScore();
         }
          if (b25 == ("X") && b26 == ("X") && b27 == ("X") && b28 == ("X") && b29 == ("X") && b30 == ("X") && b31 == ("X") && b32 == ("X") )
         {
            JOptionPane.showMessageDialog(this, "Player X Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn25.setBackground(Color.YELLOW);
            jbtn26.setBackground(Color.YELLOW);
            jbtn27.setBackground(Color.YELLOW);
            jbtn28.setBackground(Color.YELLOW);
            jbtn29.setBackground(Color.YELLOW);
            jbtn30.setBackground(Color.YELLOW);
            jbtn31.setBackground(Color.YELLOW);
            jbtn32.setBackground(Color.YELLOW);
            xCount++;
            gameScore();
         }
          if (b33 == ("X") && b34 == ("X") && b35 == ("X") && b36 == ("X") && b37 == ("X") && b38 == ("X") && b39 == ("X") && b40 == ("X") )
         {
            JOptionPane.showMessageDialog(this, "Player X Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn33.setBackground(Color.YELLOW);
            jbtn34.setBackground(Color.YELLOW);
            jbtn35.setBackground(Color.YELLOW);
            jbtn36.setBackground(Color.YELLOW);
            jbtn37.setBackground(Color.YELLOW);
            jbtn38.setBackground(Color.YELLOW);
            jbtn39.setBackground(Color.YELLOW);
            jbtn40.setBackground(Color.YELLOW);
            xCount++;
            gameScore();
         }
          if (b41 == ("X") && b42 == ("X") && b43 == ("X") && b44 == ("X") && b45 == ("X") && b46 == ("X") && b47 == ("X") && b48 == ("X") )
         {
            JOptionPane.showMessageDialog(this, "Player X Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn41.setBackground(Color.YELLOW);
            jbtn42.setBackground(Color.YELLOW);
            jbtn43.setBackground(Color.YELLOW);
            jbtn44.setBackground(Color.YELLOW);
            jbtn45.setBackground(Color.YELLOW);
            jbtn46.setBackground(Color.YELLOW);
            jbtn47.setBackground(Color.YELLOW);
            jbtn48.setBackground(Color.YELLOW);
            xCount++;
            gameScore();
         }
          if (b49 == ("X") && b50 == ("X") && b51 == ("X") && b52 == ("X") && b53 == ("X") && b54 == ("X") && b55 == ("X") && b56 == ("X") )
         {
            JOptionPane.showMessageDialog(this, "Player X Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn49.setBackground(Color.CYAN);
            jbtn50.setBackground(Color.CYAN);
            jbtn51.setBackground(Color.CYAN);
            jbtn52.setBackground(Color.CYAN);
            jbtn53.setBackground(Color.CYAN);
            jbtn54.setBackground(Color.CYAN);
            jbtn55.setBackground(Color.CYAN);
            jbtn56.setBackground(Color.CYAN);
            xCount++;
            gameScore();
         }
           if (b57 == ("X") && b58 == ("X") && b59 == ("X") && b60 == ("X") && b61 == ("X") && b62 == ("X") && b63 == ("X") && b64 == ("X") )
         {
            JOptionPane.showMessageDialog(this, "Player X Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn57.setBackground(Color.PINK);
            jbtn58.setBackground(Color.PINK);
            jbtn59.setBackground(Color.PINK);
            jbtn60.setBackground(Color.PINK);
            jbtn61.setBackground(Color.PINK);
            jbtn62.setBackground(Color.PINK);
            jbtn63.setBackground(Color.PINK);
            jbtn64.setBackground(Color.PINK);
            xCount++;
            gameScore();
         }
          if (b1 == ("X") && b9 == ("X") && b17 == ("X") && b25 == ("X") && b33 == ("X") && b41 == ("X") && b49 == ("X") && b57 == ("X") )
         {
            JOptionPane.showMessageDialog(this, "Player X Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn1.setBackground(Color.YELLOW);
            jbtn9.setBackground(Color.YELLOW);
            jbtn17.setBackground(Color.YELLOW);
            jbtn25.setBackground(Color.YELLOW);
            jbtn33.setBackground(Color.YELLOW);
            jbtn41.setBackground(Color.YELLOW);
            jbtn49.setBackground(Color.YELLOW);
            jbtn57.setBackground(Color.YELLOW);
            xCount++;
            gameScore();
         }
          if (b2 == ("X") && b10 == ("X") && b18 == ("X") && b26 == ("X") && b34 == ("X") && b42 == ("X") && b50 == ("X") && b58 == ("X") )
         {
            JOptionPane.showMessageDialog(this, "Player X Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn2.setBackground(Color.PINK);
            jbtn10.setBackground(Color.PINK);
            jbtn18.setBackground(Color.PINK);
            jbtn26.setBackground(Color.PINK);
            jbtn34.setBackground(Color.PINK);
            jbtn42.setBackground(Color.PINK);
            jbtn50.setBackground(Color.PINK);
            jbtn58.setBackground(Color.PINK);
            xCount++;
            gameScore();
         }
          if (b3 == ("X") && b11 == ("X") && b19 == ("X") && b27 == ("X") && b35 == ("X") && b43 == ("X") && b51 == ("X") && b59 == ("X") )
         {
            JOptionPane.showMessageDialog(this, "Player X Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn3.setBackground(Color.CYAN);
            jbtn11.setBackground(Color.CYAN);
            jbtn19.setBackground(Color.CYAN);
            jbtn27.setBackground(Color.CYAN);
            jbtn35.setBackground(Color.CYAN);
            jbtn43.setBackground(Color.CYAN);
            jbtn51.setBackground(Color.CYAN);
            jbtn59.setBackground(Color.CYAN);
            xCount++;
            gameScore();
         }
          if (b4 == ("X") && b12 == ("X") && b20 == ("X") && b28 == ("X") && b36 == ("X") && b44 == ("X") && b52 == ("X") && b60 == ("X") )
         {
            JOptionPane.showMessageDialog(this, "Player X Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn4.setBackground(Color.PINK);
            jbtn12.setBackground(Color.PINK);
            jbtn20.setBackground(Color.PINK);
            jbtn28.setBackground(Color.PINK);
            jbtn36.setBackground(Color.PINK);
            jbtn44.setBackground(Color.PINK);
            jbtn52.setBackground(Color.PINK);
            jbtn60.setBackground(Color.PINK);
            xCount++;
            gameScore();
         }
           if (b5 == ("X") && b13 == ("X") && b21 == ("X") && b29 == ("X") && b37 == ("X") && b45 == ("X") && b53 == ("X") && b61 == ("X") )
         {
            JOptionPane.showMessageDialog(this, "Player X Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn5.setBackground(Color.YELLOW);
            jbtn13.setBackground(Color.YELLOW);
            jbtn21.setBackground(Color.YELLOW);
            jbtn29.setBackground(Color.YELLOW);
            jbtn37.setBackground(Color.YELLOW);
            jbtn45.setBackground(Color.YELLOW);
            jbtn53.setBackground(Color.YELLOW);
            jbtn61.setBackground(Color.YELLOW);
            xCount++;
            gameScore();
         }
           if (b6 == ("X") && b14 == ("X") && b22 == ("X") && b30 == ("X") && b38 == ("X") && b46 == ("X") && b54 == ("X") && b62 == ("X") )
         {
            JOptionPane.showMessageDialog(this, "Player X Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn6.setBackground(Color.YELLOW);
            jbtn14.setBackground(Color.YELLOW);
            jbtn22.setBackground(Color.YELLOW);
            jbtn30.setBackground(Color.YELLOW);
            jbtn38.setBackground(Color.YELLOW);
            jbtn46.setBackground(Color.YELLOW);
            jbtn54.setBackground(Color.YELLOW);
            jbtn62.setBackground(Color.YELLOW);
            xCount++;
            gameScore();
         }
           if (b7 == ("X") && b15 == ("X") && b23 == ("X") && b31 == ("X") && b39 == ("X") && b47 == ("X") && b55 == ("X") && b63 == ("X") )
         {
            JOptionPane.showMessageDialog(this, "Player X Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn7.setBackground(Color.YELLOW);
            jbtn15.setBackground(Color.YELLOW);
            jbtn23.setBackground(Color.YELLOW);
            jbtn31.setBackground(Color.YELLOW);
            jbtn39.setBackground(Color.YELLOW);
            jbtn47.setBackground(Color.YELLOW);
            jbtn55.setBackground(Color.YELLOW);
            jbtn63.setBackground(Color.YELLOW);
            xCount++;
            gameScore();
         }
            if (b8 == ("X") && b16 == ("X") && b24 == ("X") && b32 == ("X") && b40 == ("X") && b48 == ("X") && b56 == ("X") && b64 == ("X") )
         {
            JOptionPane.showMessageDialog(this, "Player X Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn8.setBackground(Color.YELLOW);
            jbtn16.setBackground(Color.YELLOW);
            jbtn24.setBackground(Color.YELLOW);
            jbtn32.setBackground(Color.YELLOW);
            jbtn40.setBackground(Color.YELLOW);
            jbtn48.setBackground(Color.YELLOW);
            jbtn56.setBackground(Color.YELLOW);
            jbtn64.setBackground(Color.YELLOW);
            xCount++;
            gameScore();
         }
            if (b1 == ("X") && b10 == ("X") && b19 == ("X") && b28 == ("X") && b37 == ("X") && b46 == ("X") && b55 == ("X") && b64 == ("X") )
         {
            JOptionPane.showMessageDialog(this, "Player X Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn1.setBackground(Color.CYAN);
            jbtn10.setBackground(Color.CYAN);
            jbtn19.setBackground(Color.CYAN);
            jbtn28.setBackground(Color.CYAN);
            jbtn37.setBackground(Color.CYAN);
            jbtn46.setBackground(Color.CYAN);
            jbtn55.setBackground(Color.CYAN);
            jbtn64.setBackground(Color.CYAN);
            xCount++;
            gameScore();
         }
            if (b8 == ("X") && b15 == ("X") && b22 == ("X") && b29 == ("X") && b36 == ("X") && b43 == ("X") && b50 == ("X") && b57 == ("X") )
             {
            JOptionPane.showMessageDialog(this, "Player X Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn8.setBackground(Color.CYAN);
            jbtn15.setBackground(Color.CYAN);
            jbtn22.setBackground(Color.CYAN);
            jbtn29.setBackground(Color.CYAN);
            jbtn36.setBackground(Color.CYAN);
            jbtn43.setBackground(Color.CYAN);
            jbtn50.setBackground(Color.CYAN);
            jbtn57.setBackground(Color.CYAN);
            xCount++;
            gameScore();
         }
            if (b1 == ("0") && b2 == ("0") && b3 == ("0") && b4 == ("0") && b5 == ("0") && b6 == ("0") && b7 == ("0") && b8 == ("0") )
         {
            JOptionPane.showMessageDialog(this, "Player 0 Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn1.setBackground(Color.PINK);
            jbtn2.setBackground(Color.PINK);
            jbtn3.setBackground(Color.PINK);
            jbtn4.setBackground(Color.PINK);
            jbtn5.setBackground(Color.PINK);
            jbtn6.setBackground(Color.PINK);
            jbtn7.setBackground(Color.PINK);
            jbtn8.setBackground(Color.PINK);
            oCount++;
            gameScore();
         }
         if (b9 == ("0") && b10 == ("0") && b11 == ("0") && b12 == ("0") && b13 == ("0") && b14 == ("0") && b15 == ("0") && b16 == ("0") )
         {
            JOptionPane.showMessageDialog(this, "Player 0 Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn9.setBackground(Color.YELLOW);
            jbtn10.setBackground(Color.YELLOW);
            jbtn11.setBackground(Color.YELLOW);
            jbtn12.setBackground(Color.YELLOW);
            jbtn13.setBackground(Color.YELLOW);
            jbtn14.setBackground(Color.YELLOW);
            jbtn15.setBackground(Color.YELLOW);
            jbtn16.setBackground(Color.YELLOW);
            oCount++;
            gameScore();
         }
         if (b17 == ("0") && b18 == ("0") && b19 == ("0") && b20 == ("0") && b21 == ("0") && b22 == ("0") && b23 == ("0") && b24 == ("0") )
         {
            JOptionPane.showMessageDialog(this, "Player 0 Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn17.setBackground(Color.CYAN);
            jbtn18.setBackground(Color.CYAN);
            jbtn19.setBackground(Color.CYAN);
            jbtn20.setBackground(Color.CYAN);
            jbtn21.setBackground(Color.CYAN);
            jbtn22.setBackground(Color.CYAN);
            jbtn23.setBackground(Color.CYAN);
            jbtn24.setBackground(Color.CYAN);
            oCount++;
            gameScore();
         }
          if (b25 == ("0") && b26 == ("0") && b27 == ("0") && b28 == ("0") && b29 == ("0") && b30 == ("0") && b31 == ("0") && b32 == ("0") )
         {
            JOptionPane.showMessageDialog(this, "Player 0 Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn25.setBackground(Color.YELLOW);
            jbtn26.setBackground(Color.YELLOW);
            jbtn27.setBackground(Color.YELLOW);
            jbtn28.setBackground(Color.YELLOW);
            jbtn29.setBackground(Color.YELLOW);
            jbtn30.setBackground(Color.YELLOW);
            jbtn31.setBackground(Color.YELLOW);
            jbtn32.setBackground(Color.YELLOW);
            oCount++;
            gameScore();
         }
          if (b33 == ("0") && b34 == ("0") && b35 == ("0") && b36 == ("0") && b37 == ("0") && b38 == ("0") && b39 == ("0") && b40 == ("0") )
         {
            JOptionPane.showMessageDialog(this, "Player 0 Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn33.setBackground(Color.YELLOW);
            jbtn34.setBackground(Color.YELLOW);
            jbtn35.setBackground(Color.YELLOW);
            jbtn36.setBackground(Color.YELLOW);
            jbtn37.setBackground(Color.YELLOW);
            jbtn38.setBackground(Color.YELLOW);
            jbtn39.setBackground(Color.YELLOW);
            jbtn40.setBackground(Color.YELLOW);
            oCount++;
            gameScore();
         }
          if (b41 == ("0") && b42 == ("0") && b43 == ("0") && b44 == ("0") && b45 == ("0") && b46 == ("0") && b47 == ("0") && b48 == ("0") )
         {
            JOptionPane.showMessageDialog(this, "Player 0 Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn41.setBackground(Color.YELLOW);
            jbtn42.setBackground(Color.YELLOW);
            jbtn43.setBackground(Color.YELLOW);
            jbtn44.setBackground(Color.YELLOW);
            jbtn45.setBackground(Color.YELLOW);
            jbtn46.setBackground(Color.YELLOW);
            jbtn47.setBackground(Color.YELLOW);
            jbtn48.setBackground(Color.YELLOW);
            oCount++;
            gameScore();
         }
          if (b49 == ("0") && b50 == ("0") && b51 == ("0") && b52 == ("0") && b53 == ("0") && b54 == ("0") && b55 == ("0") && b56 == ("0") )
         {
            JOptionPane.showMessageDialog(this, "Player 0 Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn49.setBackground(Color.CYAN);
            jbtn50.setBackground(Color.CYAN);
            jbtn51.setBackground(Color.CYAN);
            jbtn52.setBackground(Color.CYAN);
            jbtn53.setBackground(Color.CYAN);
            jbtn54.setBackground(Color.CYAN);
            jbtn55.setBackground(Color.CYAN);
            jbtn56.setBackground(Color.CYAN);
            oCount++;
            gameScore();
         }
           if (b57 == ("0") && b58 == ("0") && b59 == ("0") && b60 == ("0") && b61 == ("0") && b62 == ("0") && b63 == ("0") && b64 == ("0") )
         {
            JOptionPane.showMessageDialog(this, "Player 0 Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn57.setBackground(Color.PINK);
            jbtn58.setBackground(Color.PINK);
            jbtn59.setBackground(Color.PINK);
            jbtn60.setBackground(Color.PINK);
            jbtn61.setBackground(Color.PINK);
            jbtn62.setBackground(Color.PINK);
            jbtn63.setBackground(Color.PINK);
            jbtn64.setBackground(Color.PINK);
            oCount++;
            gameScore();
         }
          if (b1 == ("0") && b9 == ("0") && b17 == ("0") && b25 == ("0") && b33 == ("0") && b41 == ("0") && b49 == ("0") && b57 == ("0") )
         {
            JOptionPane.showMessageDialog(this, "Player 0 Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn1.setBackground(Color.YELLOW);
            jbtn9.setBackground(Color.YELLOW);
            jbtn17.setBackground(Color.YELLOW);
            jbtn25.setBackground(Color.YELLOW);
            jbtn33.setBackground(Color.YELLOW);
            jbtn41.setBackground(Color.YELLOW);
            jbtn49.setBackground(Color.YELLOW);
            jbtn57.setBackground(Color.YELLOW);
            oCount++;
            gameScore();
         }
          if (b2 == ("0") && b10 == ("0") && b18 == ("0") && b26 == ("0") && b34 == ("0") && b42 == ("0") && b50 == ("0") && b58 == ("0") )
         {
            JOptionPane.showMessageDialog(this, "Player 0 Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn2.setBackground(Color.PINK);
            jbtn10.setBackground(Color.PINK);
            jbtn18.setBackground(Color.PINK);
            jbtn26.setBackground(Color.PINK);
            jbtn34.setBackground(Color.PINK);
            jbtn42.setBackground(Color.PINK);
            jbtn50.setBackground(Color.PINK);
            jbtn58.setBackground(Color.PINK);
            oCount++;
            gameScore();
         }
          if (b3 == ("0") && b11 == ("0") && b19 == ("0") && b27 == ("0") && b35 == ("0") && b43 == ("0") && b51 == ("0") && b59 == ("0") )
         {
            JOptionPane.showMessageDialog(this, "Player 0 Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn3.setBackground(Color.CYAN);
            jbtn11.setBackground(Color.CYAN);
            jbtn19.setBackground(Color.CYAN);
            jbtn27.setBackground(Color.CYAN);
            jbtn35.setBackground(Color.CYAN);
            jbtn43.setBackground(Color.CYAN);
            jbtn51.setBackground(Color.CYAN);
            jbtn59.setBackground(Color.CYAN);
            oCount++;
            gameScore();
         }
          if (b4 == ("0") && b12 == ("0") && b20 == ("0") && b28 == ("0") && b36 == ("0") && b44 == ("0") && b52 == ("0") && b60 == ("0") )
         {
            JOptionPane.showMessageDialog(this, "Player 0 Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn4.setBackground(Color.PINK);
            jbtn12.setBackground(Color.PINK);
            jbtn20.setBackground(Color.PINK);
            jbtn28.setBackground(Color.PINK);
            jbtn36.setBackground(Color.PINK);
            jbtn44.setBackground(Color.PINK);
            jbtn52.setBackground(Color.PINK);
            jbtn60.setBackground(Color.PINK);
            oCount++;
            gameScore();
         }
           if (b5 == ("0") && b13 == ("0") && b21 == ("0") && b29 == ("0") && b37 == ("0") && b45 == ("0") && b53 == ("0") && b61 == ("0") )
         {
            JOptionPane.showMessageDialog(this, "Player 0 Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn5.setBackground(Color.YELLOW);
            jbtn13.setBackground(Color.YELLOW);
            jbtn21.setBackground(Color.YELLOW);
            jbtn29.setBackground(Color.YELLOW);
            jbtn37.setBackground(Color.YELLOW);
            jbtn45.setBackground(Color.YELLOW);
            jbtn53.setBackground(Color.YELLOW);
            jbtn61.setBackground(Color.YELLOW);
            oCount++;
            gameScore();
         }
           if (b6 == ("0") && b14 == ("0") && b22 == ("0") && b30 == ("0") && b38 == ("0") && b46 == ("0") && b54 == ("0") && b62 == ("0") )
         {
            JOptionPane.showMessageDialog(this, "Player 0 Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn6.setBackground(Color.YELLOW);
            jbtn14.setBackground(Color.YELLOW);
            jbtn22.setBackground(Color.YELLOW);
            jbtn30.setBackground(Color.YELLOW);
            jbtn38.setBackground(Color.YELLOW);
            jbtn46.setBackground(Color.YELLOW);
            jbtn54.setBackground(Color.YELLOW);
            jbtn62.setBackground(Color.YELLOW);
            oCount++;
            gameScore();
         }
           if (b7 == ("0") && b15 == ("0") && b23 == ("0") && b31 == ("0") && b39 == ("0") && b47 == ("0") && b55 == ("0") && b63 == ("0") )
         {
            JOptionPane.showMessageDialog(this, "Player 0 Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn7.setBackground(Color.YELLOW);
            jbtn15.setBackground(Color.YELLOW);
            jbtn23.setBackground(Color.YELLOW);
            jbtn31.setBackground(Color.YELLOW);
            jbtn39.setBackground(Color.YELLOW);
            jbtn47.setBackground(Color.YELLOW);
            jbtn55.setBackground(Color.YELLOW);
            jbtn63.setBackground(Color.YELLOW);
            oCount++;
            gameScore();
         }
            if (b8 == ("0") && b16 == ("0") && b24 == ("0") && b32 == ("0") && b40 == ("0") && b48 == ("0") && b56 == ("0") && b64 == ("0") )
         {
            JOptionPane.showMessageDialog(this, "Player 0 Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn8.setBackground(Color.YELLOW);
            jbtn16.setBackground(Color.YELLOW);
            jbtn24.setBackground(Color.YELLOW);
            jbtn32.setBackground(Color.YELLOW);
            jbtn40.setBackground(Color.YELLOW);
            jbtn48.setBackground(Color.YELLOW);
            jbtn56.setBackground(Color.YELLOW);
            jbtn64.setBackground(Color.YELLOW);
            oCount++;
            gameScore();
         }
            if (b1 == ("0") && b10 == ("0") && b19 == ("0") && b28 == ("0") && b37 == ("0") && b46 == ("0") && b55 == ("0") && b64 == ("0") )
         {
            JOptionPane.showMessageDialog(this, "Player 0 Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn1.setBackground(Color.CYAN);
            jbtn10.setBackground(Color.CYAN);
            jbtn19.setBackground(Color.CYAN);
            jbtn28.setBackground(Color.CYAN);
            jbtn37.setBackground(Color.CYAN);
            jbtn46.setBackground(Color.CYAN);
            jbtn55.setBackground(Color.CYAN);
            jbtn64.setBackground(Color.CYAN);
            oCount++;
            gameScore();
         }
            if (b8 == ("0") && b15 == ("0") && b22 == ("0") && b29 == ("0") && b36 == ("0") && b43 == ("0") && b50 == ("0") && b57 == ("0") )
         {
            JOptionPane.showMessageDialog(this, "Player 0 Wins",
            "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtn8.setBackground(Color.CYAN);
            jbtn15.setBackground(Color.CYAN);
            jbtn22.setBackground(Color.CYAN);
            jbtn29.setBackground(Color.CYAN);
            jbtn36.setBackground(Color.CYAN);
            jbtn43.setBackground(Color.CYAN);
            jbtn50.setBackground(Color.CYAN);
            jbtn57.setBackground(Color.CYAN);
            oCount++;
            gameScore();
         }
            
            
     }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jbtn2 = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtn10 = new javax.swing.JButton();
        jbtn11 = new javax.swing.JButton();
        jbtn12 = new javax.swing.JButton();
        jbtn13 = new javax.swing.JButton();
        jbtn14 = new javax.swing.JButton();
        jbtn15 = new javax.swing.JButton();
        jbtn16 = new javax.swing.JButton();
        jbtn17 = new javax.swing.JButton();
        jbtn18 = new javax.swing.JButton();
        jbtn19 = new javax.swing.JButton();
        jbtn20 = new javax.swing.JButton();
        jbtn21 = new javax.swing.JButton();
        jbtn22 = new javax.swing.JButton();
        jbtn23 = new javax.swing.JButton();
        jbtn24 = new javax.swing.JButton();
        jbtn25 = new javax.swing.JButton();
        jbtn26 = new javax.swing.JButton();
        jbtn27 = new javax.swing.JButton();
        jbtn28 = new javax.swing.JButton();
        jbtn29 = new javax.swing.JButton();
        jbtn30 = new javax.swing.JButton();
        jbtn31 = new javax.swing.JButton();
        jbtn32 = new javax.swing.JButton();
        jbtn33 = new javax.swing.JButton();
        jbtn34 = new javax.swing.JButton();
        jbtn35 = new javax.swing.JButton();
        jbtn36 = new javax.swing.JButton();
        jbtn37 = new javax.swing.JButton();
        jbtn38 = new javax.swing.JButton();
        jbtn39 = new javax.swing.JButton();
        jbtn40 = new javax.swing.JButton();
        jbtn41 = new javax.swing.JButton();
        jbtn42 = new javax.swing.JButton();
        jbtn43 = new javax.swing.JButton();
        jbtn44 = new javax.swing.JButton();
        jbtn45 = new javax.swing.JButton();
        jbtn46 = new javax.swing.JButton();
        jbtn47 = new javax.swing.JButton();
        jbtn48 = new javax.swing.JButton();
        jbtn49 = new javax.swing.JButton();
        jbtn50 = new javax.swing.JButton();
        jbtn51 = new javax.swing.JButton();
        jbtn52 = new javax.swing.JButton();
        jbtn53 = new javax.swing.JButton();
        jbtn54 = new javax.swing.JButton();
        jbtn55 = new javax.swing.JButton();
        jbtn56 = new javax.swing.JButton();
        jbtn57 = new javax.swing.JButton();
        jbtn58 = new javax.swing.JButton();
        jbtn59 = new javax.swing.JButton();
        jbtn60 = new javax.swing.JButton();
        jbtn61 = new javax.swing.JButton();
        jbtn62 = new javax.swing.JButton();
        jbtn63 = new javax.swing.JButton();
        jbtn64 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        Exit = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jlblPlayerO = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlblPlayerX = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtn2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 80, 70));

        jbtn1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 70));

        jbtn3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 80, 70));

        jbtn4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 80, 70));

        jbtn5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 80, 70));

        jbtn6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 80, 70));

        jbtn7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 80, 70));

        jbtn8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 80, 70));

        jbtn9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, 70));

        jbtn10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn10ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 80, 70));

        jbtn11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn11ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 80, 70));

        jbtn12.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn12ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 80, 70));

        jbtn13.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn13ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 80, 70));

        jbtn14.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn14ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 80, 70));

        jbtn15.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn15ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 80, 70));

        jbtn16.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn16ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn16, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 80, 70));

        jbtn17.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn17ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 80, 70));

        jbtn18.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn18ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 80, 70));

        jbtn19.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn19ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn19, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 80, 70));

        jbtn20.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn20ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn20, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 80, 70));

        jbtn21.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn21ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn21, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 80, 70));

        jbtn22.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn22ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn22, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 80, 70));

        jbtn23.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn23ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn23, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 80, 70));

        jbtn24.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn24ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn24, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 80, 70));

        jbtn25.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn25ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 80, 70));

        jbtn26.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn26ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn26, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 80, 70));

        jbtn27.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn27ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn27, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 80, 70));

        jbtn28.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn28ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn28, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 80, 70));

        jbtn29.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn29ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn29, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 80, 70));

        jbtn30.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn30ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn30, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 80, 70));

        jbtn31.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn31ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn31, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 80, 70));

        jbtn32.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn32ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn32, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 80, 70));

        jbtn33.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn33ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 80, 70));

        jbtn34.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn34ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn34, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 80, 70));

        jbtn35.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn35ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn35, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 80, 70));

        jbtn36.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn36ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn36, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 80, 70));

        jbtn37.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn37ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn37, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 80, 70));

        jbtn38.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn38ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn38, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 80, 70));

        jbtn39.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn39ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn39, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 80, 70));

        jbtn40.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn40ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn40, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 80, 70));

        jbtn41.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn41ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 80, 70));

        jbtn42.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn42ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn42, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 80, 70));

        jbtn43.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn43ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn43, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 80, 70));

        jbtn44.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn44ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn44, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 80, 70));

        jbtn45.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn45ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn45, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 80, 70));

        jbtn46.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn46ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn46, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 80, 70));

        jbtn47.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn47ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn47, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 80, 70));

        jbtn48.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn48ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn48, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 80, 70));

        jbtn49.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn49ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn49, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 80, 70));

        jbtn50.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn50ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn50, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 80, 70));

        jbtn51.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn51ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn51, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 80, 70));

        jbtn52.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn52ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn52, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 80, 70));

        jbtn53.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn53ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn53, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 80, 70));

        jbtn54.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn54ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn54, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 500, 80, 70));

        jbtn55.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn55ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn55, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 80, 70));

        jbtn56.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn56ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn56, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, 80, 70));

        jbtn57.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn57ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn57, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 80, 70));

        jbtn58.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn58ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn58, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, 80, 70));

        jbtn59.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn59ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn59, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, 80, 70));

        jbtn60.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn60ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn60, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, 80, 70));

        jbtn61.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn61ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn61, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 580, 80, 70));

        jbtn62.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn62ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn62, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 580, 80, 70));

        jbtn63.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn63ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn63, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, 80, 70));

        jbtn64.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn64ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn64, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 580, 80, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 750, 670));

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(51, 153, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setFont(new java.awt.Font("Tahoma", 1, 58)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 102, 102));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel6.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 300, 140));

        Reset.setFont(new java.awt.Font("Tahoma", 1, 58)); // NOI18N
        Reset.setForeground(new java.awt.Color(255, 51, 255));
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel6.add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 310, 140));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 660, 190));

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel2.setText("Player O:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 290, 90));

        jlblPlayerO.setFont(new java.awt.Font("Tahoma", 1, 58)); // NOI18N
        jlblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerO.setText("0");
        jlblPlayerO.setOpaque(true);
        jPanel4.add(jlblPlayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 310, 110));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel5.setText("Player X:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 290, 90));

        jlblPlayerX.setFont(new java.awt.Font("Tahoma", 1, 58)); // NOI18N
        jlblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerX.setText("0");
        jlblPlayerX.setOpaque(true);
        jPanel4.add(jlblPlayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 310, 110));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 660, 380));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, 680, 670));

        jPanel7.setBackground(new java.awt.Color(51, 153, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(51, 153, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 550, 230));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TIC TAC TOE GAME");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 770, 100));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1440, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1480, 820));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private JFrame frame;
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "confirm if you want to exit",
            "Tic Tac Toe", JOptionPane.YES_NO_OPTION ) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        } 
    }//GEN-LAST:event_ExitActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        jbtn1.setEnabled(true);
        jbtn2.setEnabled(true);
        jbtn3.setEnabled(true);
        jbtn4.setEnabled(true);
        jbtn5.setEnabled(true);
        jbtn6.setEnabled(true);
        jbtn7.setEnabled(true);
        jbtn8.setEnabled(true);
        jbtn9.setEnabled(true);
        jbtn10.setEnabled(true);
        jbtn11.setEnabled(true);
        jbtn12.setEnabled(true);
        jbtn13.setEnabled(true);
        jbtn14.setEnabled(true);
        jbtn15.setEnabled(true);
        jbtn16.setEnabled(true);
        jbtn17.setEnabled(true);
        jbtn18.setEnabled(true);
        jbtn19.setEnabled(true);
        jbtn20.setEnabled(true);
        jbtn21.setEnabled(true);
        jbtn22.setEnabled(true);
        jbtn23.setEnabled(true);
        jbtn24.setEnabled(true);
        jbtn25.setEnabled(true);
        jbtn26.setEnabled(true);
        jbtn27.setEnabled(true);
        jbtn28.setEnabled(true);
        jbtn29.setEnabled(true);
        jbtn30.setEnabled(true);
        jbtn30.setEnabled(true);
        jbtn32.setEnabled(true);
        jbtn33.setEnabled(true);
        jbtn34.setEnabled(true);
        jbtn35.setEnabled(true);
        jbtn36.setEnabled(true);
        jbtn37.setEnabled(true);
        jbtn38.setEnabled(true);
        jbtn39.setEnabled(true);
        jbtn40.setEnabled(true);
        jbtn41.setEnabled(true);
        jbtn42.setEnabled(true);
        jbtn43.setEnabled(true);
        jbtn44.setEnabled(true);
        jbtn45.setEnabled(true);
        jbtn46.setEnabled(true);
        jbtn47.setEnabled(true);
        jbtn48.setEnabled(true);
        jbtn49.setEnabled(true);
        jbtn50.setEnabled(true);
        jbtn51.setEnabled(true);
        jbtn52.setEnabled(true);
        jbtn53.setEnabled(true);
        jbtn54.setEnabled(true);
        jbtn55.setEnabled(true);
        jbtn56.setEnabled(true);
        jbtn57.setEnabled(true);
        jbtn58.setEnabled(true);
        jbtn59.setEnabled(true);
        jbtn60.setEnabled(true);
        jbtn61.setEnabled(true);
        jbtn62.setEnabled(true);
        jbtn63.setEnabled(true);
        jbtn64.setEnabled(true);
        
        jbtn1.setText("");
        jbtn2.setText("");
        jbtn3.setText("");
        jbtn4.setText("");
        jbtn5.setText("");
        jbtn6.setText("");
        jbtn7.setText("");
        jbtn8.setText("");
        jbtn9.setText("");
        jbtn10.setText("");
        jbtn11.setText("");
        jbtn12.setText("");
        jbtn13.setText("");
        jbtn14.setText("");
        jbtn15.setText("");
        jbtn16.setText("");
        jbtn17.setText("");
        jbtn18.setText("");
        jbtn19.setText("");
        jbtn20.setText("");
        jbtn21.setText("");
        jbtn22.setText("");
        jbtn23.setText("");
        jbtn24.setText("");
        jbtn25.setText("");
        jbtn26.setText("");
        jbtn27.setText("");
        jbtn28.setText("");
        jbtn29.setText("");
        jbtn30.setText("");
        jbtn31.setText("");
        jbtn32.setText("");
        jbtn33.setText("");
        jbtn34.setText("");
        jbtn35.setText("");
        jbtn36.setText("");
        jbtn37.setText("");
        jbtn38.setText("");
        jbtn39.setText("");
        jbtn40.setText("");
        jbtn41.setText("");
        jbtn42.setText("");
        jbtn43.setText("");
        jbtn44.setText("");
        jbtn45.setText("");
        jbtn46.setText("");
        jbtn47.setText("");
        jbtn48.setText("");
        jbtn49.setText("");
        jbtn50.setText("");
        jbtn51.setText("");
        jbtn52.setText("");
        jbtn53.setText("");
        jbtn54.setText("");
        jbtn55.setText("");
        jbtn56.setText("");
        jbtn57.setText("");
        jbtn58.setText("");
        jbtn59.setText("");
        jbtn60.setText("");
        jbtn61.setText("");
        jbtn62.setText("");
        jbtn63.setText("");
        jbtn64.setText("");
     
        jbtn1.setBackground(Color.LIGHT_GRAY);
        jbtn2.setBackground(Color.LIGHT_GRAY);
        jbtn3.setBackground(Color.LIGHT_GRAY);
        jbtn4.setBackground(Color.LIGHT_GRAY);
        jbtn5.setBackground(Color.LIGHT_GRAY);
        jbtn6.setBackground(Color.LIGHT_GRAY);
        jbtn7.setBackground(Color.LIGHT_GRAY);
        jbtn8.setBackground(Color.LIGHT_GRAY);
        jbtn9.setBackground(Color.LIGHT_GRAY);
        jbtn10.setBackground(Color.LIGHT_GRAY);
        jbtn11.setBackground(Color.LIGHT_GRAY);
        jbtn12.setBackground(Color.LIGHT_GRAY);
        jbtn13.setBackground(Color.LIGHT_GRAY);
        jbtn14.setBackground(Color.LIGHT_GRAY);
        jbtn15.setBackground(Color.LIGHT_GRAY);
        jbtn16.setBackground(Color.LIGHT_GRAY);
        jbtn17.setBackground(Color.LIGHT_GRAY);
        jbtn18.setBackground(Color.LIGHT_GRAY);
        jbtn19.setBackground(Color.LIGHT_GRAY);
        jbtn20.setBackground(Color.LIGHT_GRAY);
        jbtn21.setBackground(Color.LIGHT_GRAY);
        jbtn22.setBackground(Color.LIGHT_GRAY);
        jbtn23.setBackground(Color.LIGHT_GRAY);
        jbtn24.setBackground(Color.LIGHT_GRAY);
        jbtn25.setBackground(Color.LIGHT_GRAY);
        jbtn26.setBackground(Color.LIGHT_GRAY);
        jbtn27.setBackground(Color.LIGHT_GRAY);
        jbtn28.setBackground(Color.LIGHT_GRAY);
        jbtn29.setBackground(Color.LIGHT_GRAY);
        jbtn30.setBackground(Color.LIGHT_GRAY);
        jbtn31.setBackground(Color.LIGHT_GRAY);
        jbtn32.setBackground(Color.LIGHT_GRAY);
        jbtn33.setBackground(Color.LIGHT_GRAY);
        jbtn34.setBackground(Color.LIGHT_GRAY);
        jbtn35.setBackground(Color.LIGHT_GRAY);
        jbtn36.setBackground(Color.LIGHT_GRAY);
        jbtn37.setBackground(Color.LIGHT_GRAY);
        jbtn38.setBackground(Color.LIGHT_GRAY);
        jbtn39.setBackground(Color.LIGHT_GRAY);
        jbtn40.setBackground(Color.LIGHT_GRAY);
        jbtn41.setBackground(Color.LIGHT_GRAY);
        jbtn42.setBackground(Color.LIGHT_GRAY);
        jbtn43.setBackground(Color.LIGHT_GRAY);
        jbtn44.setBackground(Color.LIGHT_GRAY);
        jbtn45.setBackground(Color.LIGHT_GRAY);
        jbtn46.setBackground(Color.LIGHT_GRAY);
        jbtn47.setBackground(Color.LIGHT_GRAY);
        jbtn48.setBackground(Color.LIGHT_GRAY);
        jbtn49.setBackground(Color.LIGHT_GRAY);
        jbtn50.setBackground(Color.LIGHT_GRAY);
        jbtn51.setBackground(Color.LIGHT_GRAY);
        jbtn52.setBackground(Color.LIGHT_GRAY);
        jbtn53.setBackground(Color.LIGHT_GRAY);
        jbtn54.setBackground(Color.LIGHT_GRAY);
        jbtn55.setBackground(Color.LIGHT_GRAY);
        jbtn56.setBackground(Color.LIGHT_GRAY);
        jbtn57.setBackground(Color.LIGHT_GRAY);
        jbtn58.setBackground(Color.LIGHT_GRAY);
        jbtn59.setBackground(Color.LIGHT_GRAY);
        jbtn60.setBackground(Color.LIGHT_GRAY);
        jbtn61.setBackground(Color.LIGHT_GRAY);
        jbtn62.setBackground(Color.LIGHT_GRAY);
        jbtn63.setBackground(Color.LIGHT_GRAY);
        jbtn64.setBackground(Color.LIGHT_GRAY);
     
      
        
        jbtn1.setBackground(Color.LIGHT_GRAY);
        jbtn2.setBackground(Color.LIGHT_GRAY);
        jbtn3.setBackground(Color.LIGHT_GRAY);
        jbtn4.setBackground(Color.LIGHT_GRAY);
        jbtn5.setBackground(Color.LIGHT_GRAY);
        jbtn6.setBackground(Color.LIGHT_GRAY);
        jbtn7.setBackground(Color.LIGHT_GRAY);
        jbtn8.setBackground(Color.LIGHT_GRAY);
        jbtn9.setBackground(Color.LIGHT_GRAY);
        jbtn10.setBackground(Color.LIGHT_GRAY);
        jbtn11.setBackground(Color.LIGHT_GRAY);
        jbtn12.setBackground(Color.LIGHT_GRAY);
        jbtn13.setBackground(Color.LIGHT_GRAY);
        jbtn14.setBackground(Color.LIGHT_GRAY);
        jbtn15.setBackground(Color.LIGHT_GRAY);
        jbtn16.setBackground(Color.LIGHT_GRAY);
        jbtn17.setBackground(Color.LIGHT_GRAY);
        jbtn18.setBackground(Color.LIGHT_GRAY);
        jbtn19.setBackground(Color.LIGHT_GRAY);
        jbtn20.setBackground(Color.LIGHT_GRAY);
        jbtn21.setBackground(Color.LIGHT_GRAY);
        jbtn22.setBackground(Color.LIGHT_GRAY);
        jbtn23.setBackground(Color.LIGHT_GRAY);
        jbtn24.setBackground(Color.LIGHT_GRAY);
        jbtn25.setBackground(Color.LIGHT_GRAY);
        jbtn26.setBackground(Color.LIGHT_GRAY);
        jbtn27.setBackground(Color.LIGHT_GRAY);
        jbtn28.setBackground(Color.LIGHT_GRAY);
        jbtn29.setBackground(Color.LIGHT_GRAY);
        jbtn30.setBackground(Color.LIGHT_GRAY);
        jbtn31.setBackground(Color.LIGHT_GRAY);
        jbtn32.setBackground(Color.LIGHT_GRAY);
        jbtn33.setBackground(Color.LIGHT_GRAY);
        jbtn34.setBackground(Color.LIGHT_GRAY);
        jbtn35.setBackground(Color.LIGHT_GRAY);
        jbtn36.setBackground(Color.LIGHT_GRAY);
        jbtn37.setBackground(Color.LIGHT_GRAY);
        jbtn38.setBackground(Color.LIGHT_GRAY);
        jbtn39.setBackground(Color.LIGHT_GRAY);
        jbtn40.setBackground(Color.LIGHT_GRAY);
        jbtn41.setBackground(Color.LIGHT_GRAY);
        jbtn42.setBackground(Color.LIGHT_GRAY);
        jbtn42.setBackground(Color.LIGHT_GRAY);
        jbtn44.setBackground(Color.LIGHT_GRAY);
        jbtn45.setBackground(Color.LIGHT_GRAY);
        jbtn46.setBackground(Color.LIGHT_GRAY);
        jbtn47.setBackground(Color.LIGHT_GRAY);
        jbtn48.setBackground(Color.LIGHT_GRAY);
        jbtn49.setBackground(Color.LIGHT_GRAY);
        jbtn50.setBackground(Color.LIGHT_GRAY);
        jbtn51.setBackground(Color.LIGHT_GRAY);
        jbtn52.setBackground(Color.LIGHT_GRAY);
        jbtn53.setBackground(Color.LIGHT_GRAY);
        jbtn54.setBackground(Color.LIGHT_GRAY);
        jbtn55.setBackground(Color.LIGHT_GRAY);
        jbtn56.setBackground(Color.LIGHT_GRAY);
        jbtn57.setBackground(Color.LIGHT_GRAY);
        jbtn58.setBackground(Color.LIGHT_GRAY);
        jbtn59.setBackground(Color.LIGHT_GRAY);
        jbtn60.setBackground(Color.LIGHT_GRAY);
        jbtn61.setBackground(Color.LIGHT_GRAY);
        jbtn62.setBackground(Color.LIGHT_GRAY);
        jbtn63.setBackground(Color.LIGHT_GRAY);
        jbtn64.setBackground(Color.LIGHT_GRAY);
       
    }//GEN-LAST:event_ResetActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
        jbtn2.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
      jbtn1.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
        jbtn3.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
      jbtn4.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
        jbtn5.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
        jbtn6.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
       jbtn7.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
       jbtn8.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
        jbtn9.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn10ActionPerformed
      jbtn10.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn10ActionPerformed

    private void jbtn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn11ActionPerformed
       jbtn11.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn11ActionPerformed

    private void jbtn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn12ActionPerformed
        jbtn12.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn12ActionPerformed

    private void jbtn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn13ActionPerformed
        jbtn13.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn13ActionPerformed

    private void jbtn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn14ActionPerformed
       jbtn14.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn14ActionPerformed

    private void jbtn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn15ActionPerformed
        jbtn15.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn15ActionPerformed

    private void jbtn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn16ActionPerformed
        jbtn16.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn16ActionPerformed

    private void jbtn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn17ActionPerformed
       jbtn17.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn17ActionPerformed

    private void jbtn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn18ActionPerformed
        jbtn18.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn18ActionPerformed

    private void jbtn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn19ActionPerformed
       jbtn19.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn19ActionPerformed

    private void jbtn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn20ActionPerformed
       jbtn20.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn20ActionPerformed

    private void jbtn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn21ActionPerformed
        jbtn21.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn21ActionPerformed

    private void jbtn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn22ActionPerformed
        jbtn22.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn22ActionPerformed

    private void jbtn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn23ActionPerformed
      jbtn23.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn23ActionPerformed

    private void jbtn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn24ActionPerformed
       jbtn24.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn24ActionPerformed

    private void jbtn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn25ActionPerformed
       jbtn25.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn25ActionPerformed

    private void jbtn26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn26ActionPerformed
        jbtn26.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn26ActionPerformed

    private void jbtn27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn27ActionPerformed
       jbtn27.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn27ActionPerformed

    private void jbtn28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn28ActionPerformed
       jbtn28.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn28ActionPerformed

    private void jbtn29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn29ActionPerformed
       jbtn29.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn29ActionPerformed

    private void jbtn30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn30ActionPerformed
      jbtn30.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn30ActionPerformed

    private void jbtn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn31ActionPerformed
       jbtn31.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn31ActionPerformed

    private void jbtn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn32ActionPerformed
       jbtn32.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn32ActionPerformed

    private void jbtn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn33ActionPerformed
       jbtn33.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn33ActionPerformed

    private void jbtn34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn34ActionPerformed
        jbtn34.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn34ActionPerformed

    private void jbtn35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn35ActionPerformed
        jbtn35.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn35ActionPerformed

    private void jbtn36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn36ActionPerformed
      jbtn36.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn36ActionPerformed

    private void jbtn37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn37ActionPerformed
       jbtn37.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn37ActionPerformed

    private void jbtn38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn38ActionPerformed
       jbtn38.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn38ActionPerformed

    private void jbtn39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn39ActionPerformed
       jbtn39.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn39ActionPerformed

    private void jbtn40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn40ActionPerformed
        jbtn40.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn40ActionPerformed

    private void jbtn41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn41ActionPerformed
       jbtn41.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn41ActionPerformed

    private void jbtn42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn42ActionPerformed
       jbtn42.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn42ActionPerformed

    private void jbtn43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn43ActionPerformed
        jbtn43.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn43ActionPerformed

    private void jbtn44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn44ActionPerformed
       jbtn44.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn44ActionPerformed

    private void jbtn45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn45ActionPerformed
       jbtn45.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn45ActionPerformed

    private void jbtn46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn46ActionPerformed
        jbtn46.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn46ActionPerformed

    private void jbtn47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn47ActionPerformed
        jbtn47.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn47ActionPerformed

    private void jbtn48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn48ActionPerformed
        jbtn48.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn48ActionPerformed

    private void jbtn49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn49ActionPerformed
       jbtn49.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn49ActionPerformed

    private void jbtn50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn50ActionPerformed
        jbtn50.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn50ActionPerformed

    private void jbtn51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn51ActionPerformed
       jbtn51.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn51ActionPerformed

    private void jbtn52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn52ActionPerformed
        jbtn52.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn52ActionPerformed

    private void jbtn53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn53ActionPerformed
        jbtn53.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn53ActionPerformed

    private void jbtn54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn54ActionPerformed
       jbtn54.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn54ActionPerformed

    private void jbtn55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn55ActionPerformed
        jbtn55.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn55ActionPerformed

    private void jbtn56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn56ActionPerformed
       jbtn56.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn56ActionPerformed

    private void jbtn57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn57ActionPerformed
      jbtn57.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn57ActionPerformed

    private void jbtn58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn58ActionPerformed
        jbtn58.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn58ActionPerformed

    private void jbtn59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn59ActionPerformed
        jbtn59.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn59ActionPerformed

    private void jbtn60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn60ActionPerformed
       jbtn60.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn60ActionPerformed

    private void jbtn61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn61ActionPerformed
        jbtn61.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn61ActionPerformed

    private void jbtn62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn62ActionPerformed
        jbtn62.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn62ActionPerformed

    private void jbtn63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn63ActionPerformed
       jbtn63.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn63ActionPerformed

    private void jbtn64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn64ActionPerformed
       jbtn64.setText(startGame);
      if(startGame.equalsIgnoreCase("X"))
      {
          checker = false;
      }
      else
      {
          checker = true;
      }
      chooseAPlayer();
      winningGame();
    }//GEN-LAST:event_jbtn64ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JAVA_TICTACTOE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn10;
    private javax.swing.JButton jbtn11;
    private javax.swing.JButton jbtn12;
    private javax.swing.JButton jbtn13;
    private javax.swing.JButton jbtn14;
    private javax.swing.JButton jbtn15;
    private javax.swing.JButton jbtn16;
    private javax.swing.JButton jbtn17;
    private javax.swing.JButton jbtn18;
    private javax.swing.JButton jbtn19;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn20;
    private javax.swing.JButton jbtn21;
    private javax.swing.JButton jbtn22;
    private javax.swing.JButton jbtn23;
    private javax.swing.JButton jbtn24;
    private javax.swing.JButton jbtn25;
    private javax.swing.JButton jbtn26;
    private javax.swing.JButton jbtn27;
    private javax.swing.JButton jbtn28;
    private javax.swing.JButton jbtn29;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn30;
    private javax.swing.JButton jbtn31;
    private javax.swing.JButton jbtn32;
    private javax.swing.JButton jbtn33;
    private javax.swing.JButton jbtn34;
    private javax.swing.JButton jbtn35;
    private javax.swing.JButton jbtn36;
    private javax.swing.JButton jbtn37;
    private javax.swing.JButton jbtn38;
    private javax.swing.JButton jbtn39;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn40;
    private javax.swing.JButton jbtn41;
    private javax.swing.JButton jbtn42;
    private javax.swing.JButton jbtn43;
    private javax.swing.JButton jbtn44;
    private javax.swing.JButton jbtn45;
    private javax.swing.JButton jbtn46;
    private javax.swing.JButton jbtn47;
    private javax.swing.JButton jbtn48;
    private javax.swing.JButton jbtn49;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn50;
    private javax.swing.JButton jbtn51;
    private javax.swing.JButton jbtn52;
    private javax.swing.JButton jbtn53;
    private javax.swing.JButton jbtn54;
    private javax.swing.JButton jbtn55;
    private javax.swing.JButton jbtn56;
    private javax.swing.JButton jbtn57;
    private javax.swing.JButton jbtn58;
    private javax.swing.JButton jbtn59;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn60;
    private javax.swing.JButton jbtn61;
    private javax.swing.JButton jbtn62;
    private javax.swing.JButton jbtn63;
    private javax.swing.JButton jbtn64;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JLabel jlblPlayerO;
    private javax.swing.JLabel jlblPlayerX;
    // End of variables declaration//GEN-END:variables
}
