package ui;

import javax.swing.*;
import java.awt.*;

public class MainForm extends JFrame{
    private JPanel rootPanel;
    private JButton buttonNewContact;
    private JButton buttonRemove;
    private JTable tableContacts;

    public MainForm() {
        setContentPane(rootPanel);
        setSize(500, 250);
        setVisible(true);

        //Obtem o tamanho da tela
        //getDefaultToolkit obtem a tela do monitor
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        //Define a posição da janela no monitor
        setLocation(dim.width/2 - getSize().width / 2, dim.height/2 - getSize().height / 2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
