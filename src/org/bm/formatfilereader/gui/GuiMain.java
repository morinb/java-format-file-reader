package org.bm.formatfilereader.gui;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Toolkit;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import org.bm.formatfilereader.gui.listeners.DisplayActionListener;
import org.bm.formatfilereader.gui.windows.InternalFrame;
import org.bm.formatfilereader.gui.windows.Menu;
import org.bm.formatfilereader.gui.windows.WelcomeInternalFrame;

public class GuiMain extends JFrame {
   private final Map<Menu, JMenu> menusMap = new HashMap<Menu, JMenu>();

   private final JDesktopPane pane = new JDesktopPane();

   public GuiMain() {
      this.setContentPane(pane);

      JMenuBar menuBar = new JMenuBar();
      createMenus(menuBar);
      this.setJMenuBar(menuBar);

      createMenuForWindow(new WelcomeInternalFrame());

      placeWindowOnScreen();
   }

   private void createMenus(JMenuBar menuBar) {
      JMenu menuFile = new JMenu("File");
      menusMap.put(Menu.FILE, menuFile);

      menuBar.add(menuFile);

      JMenu menuHelp = new JMenu("Help");
      menusMap.put(Menu.HELP, menuHelp);

      menuBar.add(Box.createHorizontalGlue());
      menuBar.add(menuHelp);

   }

   private void createMenuForWindow(InternalFrame frame) {
      JMenu jMenu = menusMap.get(frame.getMenu());

      JMenuItem item = new JMenuItem(frame.getName());
      item.addActionListener(new DisplayActionListener(pane, frame));

      jMenu.add(item);
   }

   private void placeWindowOnScreen() {
      Toolkit tk = Toolkit.getDefaultToolkit();
      Dimension screenSize = tk.getScreenSize();
      Insets screenInsets = tk.getScreenInsets(this.getGraphicsConfiguration());

      int x = 0 + screenInsets.left;
      int y = 0 + screenInsets.top;
      int width = (int) screenSize.getWidth() - screenInsets.right - screenInsets.left;
      int height = (int) screenSize.getHeight() - screenInsets.bottom - screenInsets.top;

      this.setBounds(x, y, width, height);
      this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(3);
      this.setVisible(true);

   }

}
