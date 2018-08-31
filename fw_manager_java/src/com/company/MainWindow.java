package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import static com.company.Localisator.setLocalisation;
import static com.company.LookAndFeel.setNimbus;

public class MainWindow extends JFrame{
    public MainWindow() {
        setNimbus();
        setLocalisation();

        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setLocationRelativeTo(null);

        JButton button = new JButton("Open");
        //button.setPreferredSize(new Dimension(200, 100));
        add(button, BorderLayout.PAGE_END);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Open clicked");
                JFileChooser fileOpen = new JFileChooser();
                //fileOpen.

                int ret = fileOpen.showOpenDialog(null);// showDialog();
                if (ret == JFileChooser.APPROVE_OPTION) {
                    File file = fileOpen.getSelectedFile();
                    /*
                     * Какие-то действия.
                     */
                }
            }
        });



        setVisible(true);
    }
}
