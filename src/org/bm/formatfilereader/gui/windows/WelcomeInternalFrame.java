package org.bm.formatfilereader.gui.windows;

import javax.swing.JLabel;

public class WelcomeInternalFrame extends InternalFrame {

   @Override
   public Menu getMenu() {
      return Menu.HELP;
   }

   @Override
   public String getName() {

      return "Welcome";
   }

   public WelcomeInternalFrame() {
      super();
      JLabel label = new JLabel("Welcome !");
      this.getContentPane().add(label);

      this.setSize(640, 480);
      this.setLocation(200, 200);

   }

}
