package components;
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 


public class Food extends JPanel {
    ImageIcon[] images;
    String[] entree = {"Burger", "Steak", "Ribs", "Wings", "PorkChop"};
	String[] sides= {"Fries","Onion Rings", "Mash Potatoes", "Green Beans","Mac&Cheese"};
 
    public Food() {
        super(new BorderLayout());
 
        //Load the pet images and create an array of indexes.
        images = new ImageIcon[entree.length];
        Integer[] intArray = new Integer[entree.length];
		Integer[] intArray2 = new Integer[sides.length];
		
        for (int i = 0; i < entree.length; i++) {
            intArray[i] = new Integer(i);
            images[i] = createImageIcon("images/" + entree[i] + ".gif");
            if (images[i] != null) {
                images[i].setDescription(entree[i]);
            }
        }
		
		 for (int i = 0; i < sides.length; i++) {
            intArray2[i] = new Integer(i);
            images[i] = createImageIcon("images/" + sides[i] + ".gif");
            if (images[i] != null) {
                images[i].setDescription(entree[i]);
            }
        }
 
        //Create the combo box.
        JComboBox entree = new JComboBox(intArray);
        ComboBoxRenderer renderer= new ComboBoxRenderer();
        renderer.setPreferredSize(new Dimension(200, 130));
        entree.setRenderer(renderer);
        entree.setMaximumRowCount(3);
		
		JComboBox sides = new JComboBox(intArray2);
        ComboBoxRenderer renderer1= new ComboBoxRenderer();
        renderer1.setPreferredSize(new Dimension(200, 130));
        sides.setRenderer(renderer1);
        sides.setMaximumRowCount(3);
 
        //Lay out the demo.
        add(entree,BorderLayout.PAGE_START);
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		
		add(sides,BorderLayout.EAST);
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		
    }
 
    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = FoodDude.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
                return null;
        }
    }
 
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("FoodDude");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        JComponent newContentPane = new CustomComboBox();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
 
    class ComboBoxRenderer extends JLabel
                           implements ListCellRenderer {
        private Font uhOhFont;
 
        public ComboBoxRenderer() {
            setOpaque(true);
            setHorizontalAlignment(CENTER);
            setVerticalAlignment(CENTER);
        }
 
        /*
         * This method finds the image and text corresponding
         * to the selected value and returns the label, set up
         * to display the text and image.
         */
        public Component getListCellRendererComponent(
                                           JList list,
                                           Object value,
                                           int index,
                                           boolean isSelected,
                                           boolean cellHasFocus) {
            //Get the selected index. (The index param isn't
            //always valid, so just use the value.)
            int selectedIndex = ((Integer)value).intValue();
 
            if (isSelected) {
                setBackground(list.getSelectionBackground());
                setForeground(list.getSelectionForeground());
            } else {
                setBackground(list.getBackground());
                setForeground(list.getForeground());
            }
 
            //Set the icon and text.  If icon was null, say so.
            ImageIcon icon = images[selectedIndex];
            String pet = entree[selectedIndex];
            setIcon(icon);
            if (icon != null) {
                setText(pet);
                setFont(list.getFont());
            } else {
                setUhOhText(pet + " (no image available)",
                            list.getFont());
            }
 
            return this;
        }
 
        //Set the font and text when no image was found.
        protected void setUhOhText(String uhOhText, Font normalFont) {
            if (uhOhFont == null) { //lazily create this font
                uhOhFont = normalFont.deriveFont(Font.ITALIC);
            }
            setFont(uhOhFont);
            setText(uhOhText);
        }
    }
}
