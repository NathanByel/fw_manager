package com.company;

import javax.swing.*;

public class LookAndFeel {

    public static void setNimbus() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ee) {
            //JDialog msg = new JDialog(null, "Nimbus not found", true);
            //JDialog msg = new JDialog(null, new String("Nimbus not found"));
            JOptionPane.showMessageDialog(null, "Nimbus not found");

            // If Nimbus is not available, you can set the GUI to another look and feel.
        }
    }

    /*
    Changing the Color Theme
    The Nimbus look and feel has a set of default colors, but you are not required to use them.
    You can change the colors to match your corporate brand or other color scheme.

    All of the colors used by Nimbus are stored as a set of UIManager properties. You can change any or all
    of these properties before you set the look and feel. For example:

    UIManager.put("nimbusBase", new Color(...));
    UIManager.put("nimbusBlueGrey", new Color(...));
    UIManager.put("control", new Color(...));

    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
            UIManager.setLookAndFeel(info.getClassName());
            break;
        }
    }
    These three base colors, nimbusBase, nimbusBlueGrey, and control, will address most of your needs.
    See a full list of color keys and their default values on the Nimbus Defaults page.
     */

    /*
    public class WindowUtilities {

    Tell system to use native look and feel, as in previous
    releases. Metal (Java) LAF is the default otherwise.

    //is used in current application
    public static void setNativeLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e) {
            System.out.println("Error setting native LAF: " + e);
        }
    }

    public static void setJavaLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch(Exception e) {
            System.out.println("Error setting Java LAF: " + e);
        }
    }

    public static void setMotifLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        } catch(Exception e) {
            System.out.println("Error setting Motif LAF: " + e);
        }
    }
}
     */
}