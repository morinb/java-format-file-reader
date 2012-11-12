package org.bm.formatfilereader.gui.listeners;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;

import org.bm.formatfilereader.gui.windows.InternalFrame;

public class DisplayActionListener implements ActionListener {
   private JDesktopPane pane;

   private InternalFrame frame;

   private DisplayActionListener() {}

   public DisplayActionListener(JDesktopPane pane, InternalFrame frame) {
      this.pane = pane;
      this.frame = frame;
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      boolean alreadyAdded = false;
      for (Component c : pane.getComponents()) {
         if (c.equals(frame)) {
            alreadyAdded = true;
            break;
         }
      }

      if (!alreadyAdded) {
         pane.add(frame);
      }
      frame.setVisible(true);
   }

}
