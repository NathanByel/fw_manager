package com.company;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import static com.company.Localisator.setLocalisation;
import static com.company.LookAndFeel.setNimbus;

public class MainWindow extends JFrame{
    JPanel panel1;
    private JButton buttonOpenFile;
    private JTextField textFieldFilePath;
    private JButton buttonEncrypt;
    private JTextArea textArea1;


    public MainWindow() {
        setNimbus();
        setLocalisation();

        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setLocationRelativeTo(null);

        buttonOpenFile = new JButton("Open");
        //button.setPreferredSize(new Dimension(200, 100));
        add(buttonOpenFile, BorderLayout.PAGE_END);

        textFieldFilePath = new JTextField();
        add(textFieldFilePath, BorderLayout.PAGE_END);

        GridLayout ddd = new GridLayout(2, 2, new Insets(10, 10, 10, 10), -1, -1));

GridLayoutManager fff;
        panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 2, new Insets(10, 10, 10, 10), -1, -1));
        buttonEncrypt = new JButton();
        buttonEncrypt.setText("Encrypt");
        panel1.add(buttonEncrypt, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        textFieldFilePath = new JTextField();
        panel1.add(textFieldFilePath, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        buttonOpenFile = new JButton();
        buttonOpenFile.setText("Open file");
        panel1.add(buttonOpenFile, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        textArea1 = new JTextArea();
        panel1.add(textArea1, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));

        setContentPane(panel1);

        addListeners();
        setVisible(true);
    }

    private void addListeners() {
        buttonOpenFile.addActionListener(e -> {
            System.out.println("Open clicked");
            fileOpenDialog();
        });

        buttonEncrypt.addActionListener(e -> {

        });
    }

    private String fileOpenDialog() {
        JFileChooser fileOpen = new JFileChooser();
        fileOpen.setAcceptAllFileFilterUsed(false);
        fileOpen.addChoosableFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.getName().endsWith(".bin") || f.isDirectory();
            }

            @Override
            public String getDescription() {
                return "Bin files";
            }
        });

        fileOpen.addChoosableFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.getName().endsWith(".hex") || f.isDirectory();
            }

            @Override
            public String getDescription() {
                return "Hex files";
            }
        });

        int ret = fileOpen.showOpenDialog(null);
        if (ret == JFileChooser.APPROVE_OPTION) {
            File file = fileOpen.getSelectedFile();

            textFieldFilePath.setText(file.getAbsolutePath());
        }

        return null;
    }
}
