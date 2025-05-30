package ejercicio1;

import javax.swing.*;

public class Ventana extends JFrame {

    public Ventana() {
        setTitle("Ventana de Ejemplo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("¡Hola, mundo!", SwingConstants.CENTER);
        add(label);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ventana::new);
    }
}
