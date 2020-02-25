package ui;

import business.ContactBusiness;
import entity.ContactEntity;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MainForm extends JFrame{
    private JPanel rootPanel;
    private JButton buttonNewContact;
    private JButton buttonRemove;
    private JTable tableContacts;
    private JLabel labelContactCount;

    private ContactBusiness mContactBusiness;

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

        mContactBusiness = new ContactBusiness();

        setListeners();
        loadContacts();
    }

    private void loadContacts() {
        List<ContactEntity> contactList = mContactBusiness.getList();

        String[] columnNames = {"Nome", "Telefone"};

        //Cria uma tabela para exibir os contatos
        //O primeiro parametro de default table model espera receber os dados
        //Como não temos nenhum dado inicial, passamos um objeto vazio, com zero linhas e zero colunas
        DefaultTableModel model = new DefaultTableModel(new Object[0][0], columnNames);

        for(ContactEntity contact : contactList) {
            //É criado um objeto com 2 posições, pelo fato de haver 2 colunas
            Object[] o = new Object[2];

            o[0] = contact.getName();
            o[1] = contact.getPhone();

            model.addRow(o);
        }

        //Remove qualquer seleção feita na tabela
        tableContacts.clearSelection();

        //Adiciona o modelo de tabela no elemento tabela do nosso programa
        tableContacts.setModel(model);

        labelContactCount.setText(mContactBusiness.getContactCountDescription());
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
