
package sistema.de.veterinaria;

public class SistemaDeVeterinaria {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
    javax.swing.JFrame ventana = new javax.swing.JFrame("Login");
    ventana.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    ventana.setContentPane(new Login());
    ventana.pack();
    ventana.setLocationRelativeTo(null);
    ventana.setVisible(true);
});
    }
}