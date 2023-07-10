import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
       /* //componente JFrame
       JFrame miJFrame = new JFrame("Menu");
       miJFrame.setSize(500,300);

       //componente JPanel();
        JPanel miJPanel = new JPanel();
        miJPanel.setSize(300,300);

        // usamos este diseño para centrar los componentes de JPanel`

        miJPanel.setLayout(new GridBagLayout());
        //componente JtextField
        JLabel miJLabel = new JLabel();
        //miJLabel.setText("Menu");
        //componente JOption
        JOptionPane miJOptionPane = new JOptionPane();
        //
        String conversorOpciones = (JOptionPane.showInputDialog(null,"Seleccionar conversion",
                "Menu",JOptionPane.PLAIN_MESSAGE,null,
                new Object[]{"Conversor de Moneda","Conversor de Temperatura"},
                "Selecciona")).toString();


        //miJPanel.add(miJLabel);
        miJPanel.add(miJOptionPane);

        miJFrame.add(miJPanel);
        miJFrame.setVisible(true);
    }*/
        MyFrame frame = new MyFrame();
    }
}