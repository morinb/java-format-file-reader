package org.bm.formatfilereader;

import javax.swing.SwingUtilities;

import org.bm.formatfilereader.gui.GuiMain;

public class Main {

   /**
    * @param args
    */
   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new GuiMain();
         }
      });

   }

}
