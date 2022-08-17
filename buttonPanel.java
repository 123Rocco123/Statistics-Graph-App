// GUI Imports
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

class buttonPanel {
  JPanel buttonPanelObj = new JPanel();

  JButton insertData = new JButton("Insert Data");
  JButton displayData = new JButton("Display Graph");

  JButton zoomIn = new JButton("Zoom In");
  JButton zoomOut = new JButton("Zoom Out");

  public buttonPanel() {
    buttonPanelObj.setBounds(10, 310, 465, 140);
    buttonPanelObj.setBorder(BorderFactory.createLineBorder(Color.black));
  }
}
