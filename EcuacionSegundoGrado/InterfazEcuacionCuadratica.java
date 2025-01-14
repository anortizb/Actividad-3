package EcuacionSegundoGrado;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazEcuacionCuadratica extends JFrame {
    private JTextField txtA, txtB, txtC;
    private JTextArea txtResultado;
    private JButton btnCalcular, btnLimpiar;

    public InterfazEcuacionCuadratica() {
        // Configuración de la ventana
        setTitle("Resolución de Ecuación Cuadrática");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel de entrada
        JPanel panelEntrada = new JPanel(new GridLayout(4, 2));
        panelEntrada.add(new JLabel("Coeficiente A:"));
        txtA = new JTextField();
        panelEntrada.add(txtA);

        panelEntrada.add(new JLabel("Coeficiente B:"));
        txtB = new JTextField();
        panelEntrada.add(txtB);

        panelEntrada.add(new JLabel("Coeficiente C:"));
        txtC = new JTextField();
        panelEntrada.add(txtC);

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
                    double A = Double.parseDouble(txtA.getText());
                    double B = Double.parseDouble(txtB.getText());
                    double C = Double.parseDouble(txtC.getText());

                    if (A == 0) {
                        txtResultado.setText("El coeficiente A no puede ser 0.");
                    } else {
                        String resultado = Soluciones.calcularSoluciones(A, B, C);
                        txtResultado.setText(resultado);
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
                txtC.setText("");
                txtResultado.setText("");
            }
        });
    }
}
