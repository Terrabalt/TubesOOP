
// Main using java swing
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.color.*;
import java.awt.*;

public class MainSwing{
    protected static JFrame bigFrame;
    protected JLabel label1;
    protected JTextField tField;
    protected JLabel instruction;
    protected static JLabel respond;
    protected JButton submitButton;
    protected JPanel gamePanel;
    protected static String cmd;
    protected static Integer timer = 1;
    
    public MainSwing(){
    // create frame
        bigFrame = new JFrame("Plants vs Zombies");

    // create label (judul)
        label1 = new JLabel("Welcome to Plants vs Zombies");
        label1.setBounds(20, 20, 400, 30);
        label1.setFont(new Font("Calibri", Font.BOLD, label1.getHeight()-10));

    // create textfield to receive command
        tField = new JTextField();
        tField.setBounds(20, 410, 100, 20);

    // create instruction to player
        instruction = new JLabel("Write your command down here");
        instruction.setBounds(20, 380, 300, 20);
    
    // create respond to player's command
        respond = new JLabel();
        respond.setBounds(20, 470, 300, 20);
    
    // create button to submit command
        submitButton = new JButton("Submit");
        submitButton.setBackground(Color.yellow);
        submitButton.setBounds(20, 440, 100, 20);
        submitButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                cmd = tField.getText(); timer ++;
            }
        });  

    // setting frame
        bigFrame.add(label1); bigFrame.add(tField); bigFrame.add(instruction); bigFrame.add(submitButton); bigFrame.add(respond);
        bigFrame.setSize(700, 550);
        bigFrame.setLayout(null);
        bigFrame.setVisible(true);
        bigFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
    }
    // create gmewindow
    public void gameWindow(){
        gamePanel = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawLine(20,50, 500, 5);
                g.drawLine(20,150, 500, 5);
                g.drawLine(20,250, 500, 5);
                g.drawLine(20,350, 500, 5);
            }};
        gamePanel.setVisible(true);
        bigFrame.add(gamePanel);
    }
    // main
    public static void main(String[] args){
        MainSwing main1 = new MainSwing();
        // ArrayList<String> cmdList = new ArrayList<String>();
        cmd = "first";
        while(!(cmd.equals("END"))){
            //String str = timer.toString();
            if(cmd.equals("Play")){
                main1.gameWindow();
            }
            respond.setText(cmd);
        }
    }
}