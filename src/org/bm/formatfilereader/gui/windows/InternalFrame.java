package org.bm.formatfilereader.gui.windows;

import javax.swing.JInternalFrame;

public abstract class InternalFrame extends JInternalFrame {

   public abstract Menu getMenu();

   @Override
   public abstract String getName();

   public InternalFrame() {
      this.setClosable(true);
      this.setIconifiable(true);
      this.setMaximizable(true);
      this.setTitle(getName());
   }

}
