// GUI Imports
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

  JTextField xValues = new JTextField(30);
  JTextField yValues = new JTextField(30);

  JLabel xLabel = new JLabel("X Axis Values:");
  JLabel yLabel = new JLabel("Y Axis Values:");

  JFrame dataFrame = new JFrame();

    // JFrame Formatting
    dataFrame.setSize(275, 200);
    dataFrame.setLocationRelativeTo(null);
    dataFrame.setTitle("Set X & Y Values");
    dataFrame.setLayout(null);
    dataFrame.setVisible(true);

    // JTextField Formatting & Adding to JFrame

    xValues.setBounds(128, 10, 118, 25);
    yValues.setBounds(128, 45, 118, 25);

    dataFrame.add(xValues);
    dataFrame.add(yValues);

