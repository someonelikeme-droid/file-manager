package com.github.filemanager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class aboutApp {
    private JButton closeWindowButton;

    public void setData(closeForms data) {
        closeWindowButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                try {
                    System.exit(1);
                } catch(Throwable t) {
                    //
                }
            }
        });
    }

    public void getData(closeForms data) {
    }

    public boolean isModified(closeForms data) {
        return false;
    }
}
