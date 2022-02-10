package com.github.volzock.gui.components;

import java.awt.*;
import javax.swing.JPanel;

public class StudentPanel extends JPanel{

   public StudentPanel(int id, String name) {
        this.setLayout(new GridLayout(1, 2));
        Label labelName = new Label(String.format("%d. %s", id, name));
        Checkbox checkbox = new Checkbox();

        this.add(labelName);
        this.add(checkbox);

        this.setVisible(true);
    }

    public String getData() {
        Label labelId = (Label) this.getComponent(0);
        Label labelName = (Label) this.getComponent(1);
        Checkbox checkbox = (Checkbox) this.getComponent(2);
        return String.format(
                "%s %s %s",
                labelId.getText(),
                labelName.getText(),
                (checkbox.getState()) ? "true" : "false");
    }
}
