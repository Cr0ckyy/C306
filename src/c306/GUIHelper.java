package c306;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class GUIHelper {

   private static JFrame win = new JFrame();
   private static DefaultListModel<String> listModel = new DefaultListModel<String>();
   private static JList<String> jlist = new JList<String>(listModel);
   private static boolean visible = false;
   
   public static void showMenu(String title, String[] menu, Runnable[] action) {
      win.setTitle(title); 
      win.setJMenuBar(createMenu(title, menu, action));
      showUI();
   }

   public static void addPanel(JPanel pnl)
   {
      win.add(pnl, BorderLayout.NORTH);
   }
   
   private static void showUI() {
      win.add(createMsgArea(), BorderLayout.CENTER);
      win.setBounds(100, 100, 600, 400);
      win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      win.setVisible(true);
      visible = true;
   }
   
   private static JPanel createMsgArea() {
      JPanel pnlMessage = new JPanel(new BorderLayout());
      JScrollPane scrollPane = new JScrollPane(jlist);
      pnlMessage.setBorder(new TitledBorder("Display Area"));
      pnlMessage.add(scrollPane, BorderLayout.CENTER);
      jlist.setFont(new Font("Consolas", Font.PLAIN, 12));

      JPanel pnlButton = new JPanel(new FlowLayout());
      JButton btnClear = new JButton("Clear");
      btnClear.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            SwingUtilities.invokeLater(() -> listModel.clear());
         }
      });

      pnlButton.add(btnClear);
      pnlMessage.add(pnlButton, BorderLayout.SOUTH);
      return pnlMessage;
   }
   
   private static JMenuBar createMenu(String title, String[] menuItems, Runnable[] menuActions) {
      JMenuBar menuBar = new JMenuBar();
      JMenu menu = new JMenu("Action");
      menuBar.add(menu);
      for (int i = 0; i < menuItems.length; i++) {
         JMenuItem mi = new JMenuItem(menuItems[i]);
         final var x = i;
         mi.addActionListener(e -> {
            SwingUtilities.invokeLater(() -> menuActions[x].run());
         });
         menu.add(mi);
      }
      return menuBar;
   }

   public static void output(String line) {
      if (!visible) 
         showUI();
      String[] lines = line.split("\n");
      for (int i = 0; i < lines.length; i++) {
         listModel.addElement(lines[i]);
      }
      jlist.setSelectedIndex(listModel.size() - 1);
      jlist.ensureIndexIsVisible(listModel.size() - 1);
   }

   public static void display(String msg) {
      JOptionPane.showMessageDialog(null, msg, "Display", JOptionPane.INFORMATION_MESSAGE);
   }

   public static Integer readInt(String prompt) {
      Integer value = null;
      boolean valid = false;
      while (!valid) {
         try {
            String input = JOptionPane.showInputDialog(null, prompt, "Input", JOptionPane.QUESTION_MESSAGE);
            if (input != null) {
               value = Integer.parseInt(input);
            }
            valid = true;
         } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Please enter an integer.", "Error", JOptionPane.ERROR_MESSAGE);
         }
      }
      return value;
   }

   public static Double readDouble(String prompt) {
      Double value = null;
      boolean valid = false;
      while (!valid) {
         try {
            String input = JOptionPane.showInputDialog(null, prompt, "Input", JOptionPane.QUESTION_MESSAGE);
            if (input != null) {
               value = Double.parseDouble(input);
            }
            valid = true;
         } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Please enter an double.", "Error", JOptionPane.ERROR_MESSAGE);
         }
      }
      return value;
   }

   public static Character readChar(String prompt) {
      Character value = null;
      boolean valid = false;
      while (!valid) {
         String input = readString(prompt);
         if (input.length() != 1) {
            JOptionPane.showMessageDialog(null, "Please enter a character.", "Error", JOptionPane.ERROR_MESSAGE);
         } else {
            value = input.charAt(0);
            valid = true;
         }
      }
      return value;
   }

   public static Boolean readBoolean(String prompt) {
      Boolean value = null;
      int input = JOptionPane.showConfirmDialog(null, prompt, "Input", JOptionPane.YES_NO_OPTION);
      if (input == JOptionPane.YES_OPTION) {
         value = true;
      } else if (input == JOptionPane.NO_OPTION) {
         value = false;
      }
      return value;
   }

   public static String readString(String prompt) {
      String value = JOptionPane.showInputDialog(null, prompt, "Input", JOptionPane.QUESTION_MESSAGE);
      return value;
   }
}
