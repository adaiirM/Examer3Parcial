package Interfaces;

import DAOs.DAOOperaciones;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

public class InterfazInsertar {
    private JTextField textField1;
    private JComboBox comboBox1;
    private JPanel panel;
    private JButton insertarButton;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JButton atrasButton;


    public InterfazInsertar(){
        JFrame ventana = new JFrame("Insertar");
        lanzarVentana(ventana);
        int idTU = 1;

        insertarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (DAOOperaciones.comparar(textField3.getText()) == 0){
                   ventana.dispose();
                   new InterfazInicio();

                }else
                    JOptionPane.showMessageDialog(null, "La matricula ya fue ocupada");
            }
        });

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        atrasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public void lanzarVentana(JFrame ventana){
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setContentPane(panel);
        ventana.pack();
        ventana.setVisible(true);
        ventana.setSize(500, 700);
        ventana.setLocationRelativeTo(null);
    }
}
