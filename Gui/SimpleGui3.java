package SoundTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by runyyf on 2016-01-14.
 */
public class SimpleGui3 implements ActionListener{

    JFrame frame;

    public void actionPerformed(ActionEvent event){
        frame.repaint();
    }

    public void go(){

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //关闭windows时结束程序

        JButton button = new JButton("change colors");
        button.addActionListener(this);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH,button);
        frame.getContentPane().add(BorderLayout.CENTER,drawPanel);

        frame.setSize(300, 300);//frame size
        frame.setVisible(true);

    }


    public static void main(String[] args){
        SimpleGui3 gui3 = new SimpleGui3();
        gui3.go();
    }
}
