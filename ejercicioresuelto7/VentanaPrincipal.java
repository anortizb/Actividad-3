/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioresuelto7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {
    private JTextField txtA, txtB;
    private JTextArea txtResultado;
    private JButton btnComparar, btnLimpiar;

    public VentanaPrincipal() {
        // Configuración de la ventana
        setTitle("Comparación de Valores");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel de entrada
        JPanel panelEntrada = new JPanel(new GridLayout(3, 2));
        panelEntrada.add(new JLabel("Valor de A:"));
        txtA = new JTextField();
        panelEntrada.add(txtA);

        panelEntrada.add(new JLabel("Valor de B:"));
        txtB = new JTextField();
        panelEntrada.add(txtB);

        btnComparar = new JButton("Comparar");
        btnLimpiar = new JButton("Limpiar");
        panelEntrada.add(btnComparar);
        panelEntrada.add(btnLimpiar);

        // Panel de resultado
        txtResultado = new JTextArea();
        txtResultado.setEditable(false);
        JScrollPane scrollResultado = new JScrollPane(txtResultado);

        add(panelEntrada, BorderLayout.NORTH);
        add(scrollResultado, BorderLayout.CENTER);

        // Acción del botón "Comparar"
        btnComparar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double A = Double.parseDouble(txtA.getText());
                    double B = Double.parseDouble(txtB.getText());

                    if (A > B) {
                        txtResultado.setText("A es mayor que B");
                    } else if (A == B) {
                        txtResultado.setText("A es igual a B");
                    } else {
                        txtResultado.setText("A es menor que B");
                    }
                } catch (NumberFormatException ex) {
                    txtResultado.setText("Por favor, ingrese valores numéricos válidos.");
                }
            }
        });

        // Acción del botón "Limpiar"
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtA.setText("");
                txtB.setText("");
                txtResultado.setText("");
            }
        });
    }

}
