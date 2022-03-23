package com.Boletines;
import javax.swing.*;
import java.awt.*;

public class ComponentesGUI {
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
        boton1 = new JButton("Aceptar");
        boton2 = new JButton("Limpiar");
        nombre = new JLabel("Nombre");
        password = new JLabel("Password");
        jta = new JTextArea("Area de texto");
        jta.setColumns(40);
        jta.setRows(10);
        jtf1 = new JTextField();
        jtf1.setColumns(15);
        jtf2 = new JTextField();
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
        marco.add(panel);
        this.cerrarVentana();
    }
}
