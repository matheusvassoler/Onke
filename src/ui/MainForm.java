package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        setListeners();
    }

    //AddActionListener recebe uma instancia responsavel por executar ação do botão
    private void setListeners() {
        buttonNewContact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ContactForm();
                dispose();
            }
        });

        buttonRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
