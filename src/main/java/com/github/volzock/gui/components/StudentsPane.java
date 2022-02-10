package com.github.volzock.gui.components;

import javax.swing.JScrollPane;
import javax.swing.JPanel;
import java.awt.GridLayout;

import com.github.volzock.gui.components.StudentPanel;

public class StudentsPane extends JScrollPane{
    public StudentsPane() {
        super(test());
    }

    private static JPanel test() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(20, 1, 0, 0));


        panel.add(new StudentPanel(1, "Kozlov Nikita"));
        panel.add(new StudentPanel(1, "Kozlov Nikita"));
        panel.add(new StudentPanel(1, "Kozlov Nikita"));
        panel.add(new StudentPanel(1, "Kozlov Nikita"));
        panel.add(new StudentPanel(1, "Kozlov Nikita"));
        panel.add(new StudentPanel(1, "Kozlov Nikita"));
        panel.add(new StudentPanel(1, "Kozlov Nikita"));
        panel.add(new StudentPanel(1, "Kozlov Nikita"));
        panel.add(new StudentPanel(1, "Kozlov Nikita"));
        panel.add(new StudentPanel(1, "Kozlov Nikita"));
        panel.add(new StudentPanel(1, "Kozlov Nikita"));
        panel.add(new StudentPanel(1, "Kozlov Nikita"));
        panel.add(new StudentPanel(1, "Kozlov Nikita"));
        panel.add(new StudentPanel(1, "Kozlov Nikita"));
        panel.add(new StudentPanel(1, "Kozlov Nikita"));
        panel.add(new StudentPanel(1, "Kozlov Nikita"));
        panel.add(new StudentPanel(1, "Kozlov Nikita"));
        panel.add(new StudentPanel(1, "Kozlov Nikita"));
        panel.add(new StudentPanel(1, "Kozlov Nikita"));
        panel.add(new StudentPanel(1, "Kozlov Nikita"));

        return panel;
    }
}
