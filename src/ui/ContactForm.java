package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame {

    private JPanel rootPanel;
    private JTextField textName;
    private JTextField textPhone;
    private JButton buttonCancel;
    private JButton buttonSave;

    public ContactForm() {
        setContentPane(rootPanel);
        setSize(500, 250);
        setVisible(true);

        //Obtem o tamanho da tela
        //getDefaultToolkit obtem a tela do monitor
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        //Define a posição da janela no monitor
        setLocation(dim.width/2 - getSize().width / 2, dim.height/2 - getSize().height / 2);

        setListeners();
    }

    private void setListeners() {

        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainForm();
                dispose();
            }
        });
    }
}
