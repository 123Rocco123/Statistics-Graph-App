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
    mainFrame.setLocationRelativeTo(null);
    mainFrame.setTitle("Analysis Program");
    mainFrame.setVisible(true);
  }
}
