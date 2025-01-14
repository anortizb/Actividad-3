package ejercicioresuelto10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {
    private JTextField txtNumeroInscripcion, txtNombres, txtPatrimonio, txtEstrato;
    private JTextArea txtResultado;
    private JButton btnCalcular, btnLimpiar;

    public VentanaPrincipal() {
        // Configuración de la ventana
        setTitle("Cálculo de Matrícula");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel de entrada
        JPanel panelEntrada = new JPanel(new GridLayout(5, 2, 10, 10));
        panelEntrada.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelEntrada.add(new JLabel("Número de Inscripción:"));
        txtNumeroInscripcion = new JTextField();
        panelEntrada.add(txtNumeroInscripcion);

        panelEntrada.add(new JLabel("Nombres del Estudiante:"));
        txtNombres = new JTextField();
        panelEntrada.add(txtNombres);

        panelEntrada.add(new JLabel("Patrimonio del Estudiante:"));
        txtPatrimonio = new JTextField();
        panelEntrada.add(txtPatrimonio);

        panelEntrada.add(new JLabel("Estrato Social del Estudiante:"));
        txtEstrato = new JTextField();
        panelEntrada.add(txtEstrato);

        btnCalcular = new JButton("Calcular Matrícula");
        btnLimpiar = new JButton("Limpiar");
        panelEntrada.add(btnCalcular);
        panelEntrada.add(btnLimpiar);

        // Panel de resultado
        txtResultado = new JTextArea();
        txtResultado.setEditable(false);
        txtResultado.setLineWrap(true);
        txtResultado.setWrapStyleWord(true);
        JScrollPane scrollResultado = new JScrollPane(txtResultado);
        scrollResultado.setBorder(BorderFactory.createTitledBorder("Resultado"));

        add(panelEntrada, BorderLayout.NORTH);
        add(scrollResultado, BorderLayout.CENTER);

        // Acción del botón "Calcular"
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int numeroInscripcion = Integer.parseInt(txtNumeroInscripcion.getText());
                    String nombres = txtNombres.getText();
                    double patrimonio = Double.parseDouble(txtPatrimonio.getText());
                    int estrato = Integer.parseInt(txtEstrato.getText());

                    double pagoMatricula = 50000;

                    if (patrimonio > 2000000 && estrato > 3) {
                        pagoMatricula += 0.03 * patrimonio;
                    }

                    String resultado = String.format(
                            "EL ESTUDIANTE CON NÚMERO DE INSCRIPCIÓN %d\n" +
                            "Y NOMBRE %s DEBE PAGAR: $%.2f",
                            numeroInscripcion, nombres, pagoMatricula);
                    txtResultado.setText(resultado);
                } catch (NumberFormatException ex) {
                    txtResultado.setText("Por favor, ingrese valores válidos en todos los campos.");
                }
            }
        });

        // Acción del botón "Limpiar"
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNumeroInscripcion.setText("");
                txtNombres.setText("");
                txtPatrimonio.setText("");
                txtEstrato.setText("");
                txtResultado.setText("");
            }
        });
    }
}

