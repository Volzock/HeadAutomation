package com.github.volzock.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.github.volzock.gui.components.StudentPanel;
import com.github.volzock.gui.pages.StudentsPage;

public class MainFrame extends JFrame {

    public MainFrame() {
        this.setSize(500, 700);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // must be in class, but I'm to lazy to do it :)
        JPanel menu = new JPanel();
        menu.setLayout(new GridLayout(2, 3));
        menu.add(new Button("Students"));
        menu.add(new Button("Students"));

        Container mainLayout = this.getContentPane();
        mainLayout.add(menu, BorderLayout.NORTH);
        mainLayout.add(new StudentsPage());
        this.setVisible(true);
    }
}
