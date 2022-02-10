package com.github.volzock.gui.pages;

import java.awt.*;
import javax.swing.JPanel;

import com.github.volzock.gui.components.StudentPanel;
import com.github.volzock.gui.components.StudentsPane;

public class StudentsPage extends JPanel {
    Label pageName = new Label("Students");

    public StudentsPage() {
        this.setLayout(new BorderLayout());
        Choice choice = new Choice();
        Button btn = new Button();

        choice.add("math");
        choice.add("lang");
        choice.add("prog");
        choice.add("ecolog");

        this.add(this.pageName, BorderLayout.NORTH);
        this.add(new StudentsPane());
        this.add(choice, BorderLayout.SOUTH);
//        this.add(btn, BorderLayout.SOUTH);
    }
}
