package com.Boletines;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ComponentesGUI extends MouseAdapter implements ActionListener {
    private JFrame marco;
    private JPanel panel;
    private JButton boton1,boton2;
    private JTextField jtf1,jtf2;
    private JLabel nombre,password;
    private JTextArea jta;

    public void Componentes(){
        marco = new JFrame("Boletin 26");
        marco.setSize(600,500);
        panel = new JPanel();
        panel.setSize(600,500);
        boton1 = new JButton("Enviar");


        boton2 = new JButton("Limpiar");


        nombre = new JLabel("Nombre");
        nombre.setFont(new Font("Roboto",Font.BOLD,15));
        password = new JLabel("Password");
        password.setFont(new Font("Roboto",Font.BOLD,15));
        jta = new JTextArea("");
        jta.setColumns(40);
        jta.setRows(10);
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        jta.setBorder(border);
        jtf1 = new JTextField();

        jtf1.setColumns(15);
        jtf2 = new JPasswordField();
        jtf2.setColumns(15);
    }

    public void cerrarVentana(){
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
    }

    public void interfaz(){
        this.Componentes();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,180,40));
        panel.add(nombre);
        panel.add(jtf1);
        panel.add(password);
        panel.add(jtf2);
        panel.add(jta);
        boton1.setBounds(150,500,10,15);
        boton2.setBounds(300,500,10,15);
        panel.add(boton1);
        panel.add(boton2);
        boton1.addActionListener((ActionListener) this);
        boton2.addActionListener(this);
        marco.add(panel);

        this.cerrarVentana();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object objeto = e.getSource();
        if(objeto == boton1){
            jta.setText("Hola " + jtf1.getText() + "!");

        }
        else if (objeto == boton2){
            jtf1.setText("");
            jtf2.setText("");
        }
    }
}
