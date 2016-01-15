package SoundTest;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by runyyf on 2016-01-14.
 */
public class ButtonEvent implements ActionListener {
    JButton button;
    int count;

    public void go(){
        JFrame frame = new JFrame();
        button = new JButton("click me");

        button.addActionListener(this); //register to button

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        count++;
        button.setText(" i have been clicked  "+count);
    }

    public static void main(String[] args){
        ButtonEvent gui = new ButtonEvent();
        gui.go();
    }
}
