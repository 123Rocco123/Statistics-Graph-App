// GUI Imports
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

// mainClass Class is used to contain all of the other class calls
class mainClass {
  JFrame mainFrame = new JFrame();

  public mainClass() {
    // JFrame Settings
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainFrame.setSize(500, 500);
    mainFrame.setLayout(null);
    mainFrame.setLocationRelativeTo(null);
    mainFrame.setTitle("Analysis Program");
    mainFrame.setResizable(false);

    // Panel Class Calls
    graphPanel graphPanelObj = new graphPanel();
    mainFrame.add(graphPanelObj.graphPanel);

    buttonPanel buttonPanelObj = new buttonPanel();
    mainFrame.add(buttonPanelObj.buttonPanelObj);

    mainFrame.setVisible(true);
  }
}
