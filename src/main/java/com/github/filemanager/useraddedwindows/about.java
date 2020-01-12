package com.github.filemanager.useraddedwindows;

import javax.swing.*;

public class about {

    public void DrawWindow(){
        JFrame aboutWindow = new JFrame("About...");
        aboutWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aboutWindow.setSize(200, 200);
        aboutWindow.setVisible(true);
    }
}
