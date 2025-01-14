package Empleado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {
    private JTextField txtNombre, txtSalarioPorHora, txtHorasTrabajadas;
    private JTextArea txtResultado;
    private JButton btnCalcular, btnLimpiar;

    public VentanaPrincipal() {
        // Configuración de la ventana
        setTitle("Cálculo de Salario Mensual");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel de entrada
        JPanel panelEntrada = new JPanel(new GridLayout(4, 2));
        panelEntrada.add(new JLabel("Nombre del Empleado:"));
        txtNombre = new JTextField();
        panelEntrada.add(txtNombre);

        panelEntrada.add(new JLabel("Salario por Hora:"));
        txtSalarioPorHora = new JTextField();
        panelEntrada.add(txtSalarioPorHora);

        panelEntrada.add(new JLabel("Horas Trabajadas:"));
        txtHorasTrabajadas = new JTextField();
        panelEntrada.add(txtHorasTrabajadas);

        btnCalcular = new JButton("Calcular");
        btnLimpiar = new JButton("Limpiar");
        panelEntrada.add(btnCalcular);
        panelEntrada.add(btnLimpiar);

        // Panel de resultado
        txtResultado = new JTextArea();
        txtResultado.setEditable(false);
        JScrollPane scrollResultado = new JScrollPane(txtResultado);

        add(panelEntrada, BorderLayout.NORTH);
        add(scrollResultado, BorderLayout.CENTER);

        // Acción del botón "Calcular"
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = txtNombre.getText();
                    double salarioPorHora = Double.parseDouble(txtSalarioPorHora.getText());
                    int horasTrabajadas = Integer.parseInt(txtHorasTrabajadas.getText());

                    double salarioMensual = Empleado.salarioMensual(salarioPorHora, horasTrabajadas);

                    if (salarioMensual > 450000) {
                        txtResultado.setText("Nombre: " + nombre + "\nSalario Mensual: $" + salarioMensual);
                    } else {
                        txtResultado.setText("Nombre: " + nombre);
                    }
                } catch (NumberFormatException ex) {
                    txtResultado.setText("Por favor, ingrese valores válidos.");
                }
            }
        });

        // Acción del botón "Limpiar"
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNombre.setText("");
                txtSalarioPorHora.setText("");
                txtHorasTrabajadas.setText("");
                txtResultado.setText("");
            }
        });
    }
}

