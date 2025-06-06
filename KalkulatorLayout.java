import javax.swing.*;
import java.awt.*;

public class KalkulatorLayout {
    public static void main(String[] args) {
        // Buat frame
        JFrame frame = new JFrame("Kalkulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout(5, 5));

        // Buat JTextField (paling atas)
        JTextField textField = new JTextField();
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(textField, BorderLayout.NORTH);

        // Panel tombol (Grid 4 baris, 5 kolom)
        JPanel panel = new JPanel(new GridLayout(4, 5, 5, 5));

        // Label tombol sesuai gambar
        String[] tombol = {
            "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "0",
            "+", "-", "*", "/", "=",
            "%", "Mod", "Exit", "", ""
        };

        // Tambahkan tombol ke panel
        for (String label : tombol) {
            if (label.equals("")) {
                panel.add(new JLabel()); // slot kosong untuk menyesuaikan layout
            } else {
                JButton btn = new JButton(label);
                if (label.equals("Exit")) {
                    btn.addActionListener(e -> System.exit(0));
                }
                panel.add(btn);
            }
        }

        // Tambahkan panel ke frame
        frame.add(panel, BorderLayout.CENTER);

        // Tampilkan
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
