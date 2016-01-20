package QuizCardBuilder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

/**
 * Created by runyyf on 2016-01-20.
 */
public class QuizCardBuilder {

    private JTextArea question;
    private JTextArea answer;
    private ArrayList<QuizCard> cardList ;
    private JFrame frame;

    public static void main(String[] args){
        QuizCardBuilder builder = new QuizCardBuilder();
        builder.go();

    }
    public void go(){
        frame = new JFrame("Quiz Card Builder");
        JPanel mainPanel = new JPanel();
        Font bigFont = new Font("sanserif",Font.BOLD,24);

        question = new JTextArea(6,20);   //rows and columns
        question.setLineWrap(true);    //换行策略 true表示单行字符满了就换行
        question.setWrapStyleWord(true); //换行方式，完整单词后换行
        question.setFont(bigFont);

        JScrollPane qScroller = new JScrollPane(question);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);  //垂直滚动条
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER); //水平滚动条

        answer = new JTextArea(6,20);
        answer.setLineWrap(true);
        answer.setWrapStyleWord(true);
        answer.setFont(bigFont);

        JScrollPane aScroller = new JScrollPane(answer);
        aScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        aScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JButton nextButton = new JButton("NEXT CARD");
        cardList = new ArrayList<QuizCard>();


        JLabel qLabel = new JLabel("Question :");
        JLabel aLabel = new JLabel("Answer :");

        mainPanel.add(qLabel);
        mainPanel.add(qScroller);
        mainPanel.add(aLabel);
        mainPanel.add(aScroller);
        mainPanel.add(nextButton);

        nextButton.addActionListener(new NextCardListener());
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        newMenuItem.addActionListener(new NewMenuListener());
        saveMenuItem.addActionListener(new SaveMenuListener());

        fileMenu.add(newMenuItem);
        fileMenu.add(saveMenuItem);
        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER,mainPanel);
        frame.setSize(500,600);
        frame.setVisible(true);

    }

    public class  NextCardListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            QuizCard card = new QuizCard(question.getText(),answer.getText());
            cardList.add(card);
            clearCard();
        }
    }

    private class SaveMenuListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            QuizCard card = new QuizCard(question.getText(),answer.getText());
            cardList.add(card);

            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showSaveDialog(frame);
            saveFile(fileChooser.getSelectedFile());
        }
    }

    private class NewMenuListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            cardList.clear();
            clearCard();
        }
    }

    public  void  clearCard(){
        question.setText("");
        answer.setText("");
        question.requestFocus();
    }
    private void saveFile(File file){
        try {
            BufferedWriter write = new BufferedWriter(new FileWriter(file));

            for (QuizCard card:cardList){
                write.write(card.getQuestion()+"/");
                write.write(card.getAnswer()+"\n");
            }

            write.close();

        } catch (IOException e) {
            System.out.println("can not write the cardList out");
            e.printStackTrace();
        }


    }


}
