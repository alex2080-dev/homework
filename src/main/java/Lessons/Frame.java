package Lessons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Frame extends JFrame {

    Font font = new Font("Serif", Font.ITALIC, 18);

    int index1 = 0;
    int i = 0;
    int y = 0;
    int prep = 0;
    int postp = 0;
    int last = 0;
    int count = 0;
    int counta = 0;
    String ch = "";
    String chpre = "";
    StringBuffer nb = new StringBuffer();

    String nbformat = " <span style=\"color:#FF0000;\"><strong>[";
    String nbformat2 = "]</strong></span> ";
    String startformat = " <div style=\"font-size:12.0pt\"><br> ";
    String hformat = "div style=\"text-align: center;\"><strong";
    String hformat2 = "strong></div";
    String aformat = "<span style=\"color:#2E62AE;\"><abbr title=\"  \">[*]</abbr></span>";


    public Frame() {
       setBounds(50, 50, 500,500);
       setTitle("Урок 8 - графическое представление данных");
       setFont(font);
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

       JPanel panel  = new JPanel();
       add(panel);

       TextArea textArea1 = new TextArea();

       TextArea textArea2 = new TextArea();
       JButton button = new JButton("Restr");

       panel.add(textArea1);
       panel.add(textArea2);
       panel.add(button);

       button.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {

               StringBuilder sb = new StringBuilder(1502000);
               StringBuilder sbready = new StringBuilder(1502000);

              sb.append(textArea1.getText());

               sbready.append(startformat);
               for (i = 1; i<sb.length(); i++) {
                   ch=String.valueOf(sb.charAt(i));


                   if  (ch.charAt(0) == ']' & sb.charAt(i-1) != '*'  ) { System.out.println("наличие [");
                       nb.delete(0, nb.length());
                       sb.deleteCharAt(i);
                       for (y = i-1; index1 != 88 | y == 0; y--) {	System.out.println("цикл");
                           last = y+1;
                           ch=String.valueOf(sb.charAt(y));
                           if (ch.charAt(0) == '0' | ch.charAt(0) == '1' | ch.charAt(0) == '2' | ch.charAt(0) == '3' | ch.charAt(0) == '4' | ch.charAt(0) == '5' | ch.charAt(0) == '6' | ch.charAt(0) == '7' | ch.charAt(0) == '8' | ch.charAt(0) == '9' | ch.charAt(0) == 'I' | ch.charAt(0) == 'V' | ch.charAt(0) == 'X'| ch.charAt(0) == 'i' | ch.charAt(0) == 'v' | ch.charAt(0) == 'x') {
                               nb.append(ch);
                               sb.deleteCharAt(y);
                               count = count + 1;
                           }
                           else { index1 = 88; postp = y+1; }
                       }
                       nb.reverse();	 System.out.println(nb.toString());
                       sbready.append(sb.substring(prep, postp)).append(nbformat).append(nb).append(nbformat2);
                       prep = i-count; count = 0; index1 = 0;

                   }


                   if  (sb.charAt(i) == '<') {
                       if  (sb.charAt(i+1) == 'a' & sb.charAt(i+2) != 'b') { System.out.println("наличие a"); if  (sb.charAt(i+3) == 'h') {counta = 99;}

                           while  (sb.charAt(i) != '>') {sb.deleteCharAt(i);} sb.deleteCharAt(i);if (counta == 99) {sb.insert(i, aformat); counta = 0;}
                       }


                       if  (sb.charAt(i+1) == '/') { System.out.println("|aaaa");
                           if  (sb.charAt(i+2) == 'a' & sb.charAt(i+3) != 'b') {sb.deleteCharAt(i);sb.deleteCharAt(i);sb.deleteCharAt(i);sb.deleteCharAt(i);}}

                   }

                   if  (sb.charAt(i) == '<') {
                       if  (sb.charAt(i+1) == 'a' & sb.charAt(i+2) != 'b') { System.out.println("aaaa"); if  (sb.charAt(i+3) == 'h') {counta = 99;}

                           while  (sb.charAt(i) != '>') {sb.deleteCharAt(i);} sb.deleteCharAt(i);if (counta == 99) {sb.insert(i, aformat); counta = 0;}
                       }


                       if  (sb.charAt(i+1) == '/') { System.out.println("|aaaa");
                           if  (sb.charAt(i+2) == 'a' & sb.charAt(i+3) != 'b') {sb.deleteCharAt(i);sb.deleteCharAt(i);sb.deleteCharAt(i);sb.deleteCharAt(i);}}

                   }



                   if  (ch.charAt(0) == 'h') { System.out.println("hhhh");
                       chpre=String.valueOf(sb.charAt(i-1));
                       if  (chpre.charAt(0) == '/') {sb.deleteCharAt(i);sb.deleteCharAt(i);sb.insert(i, hformat2);} else {if (chpre.charAt(0) == '<') {sb.deleteCharAt(i);sb.deleteCharAt(i);sb.insert(i, hformat);}}
                   }


               }
               sbready.append(sb.substring(last, i)).append("</div>");

               textArea2.setText(sbready.toString());

           }








       }
       );

       setVisible(true);
    }
}


