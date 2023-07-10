import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //componente JFrame
       JFrame miJFrame = new JFrame("Ejemplo de Frame- java Swing");
       miJFrame.setSize(500,300);



       //componente JPanel();
        JPanel miJPanel = new JPanel();
        miJPanel.setSize(300,300);

        // usamos este diseño para centrar los componentes de JPanel`

        miJPanel.setLayout(new GridBagLayout());
        //componente JtextField
        JLabel miJLabel = new JLabel();
        miJLabel.setText("Dime tu opinión acerca de Java Swing:  ");
        //componente JtextArea
        JTextArea miJTextArea = new JTextArea(5,20);

        miJPanel.add(miJLabel);
        miJPanel.add(miJTextArea);

        miJFrame.add(miJPanel);
        miJFrame.setVisible(true);
    }
}