package formdatadiri;

import java.awt.*;
import javax.swing.*;

class Layout extends JFrame {
    JLabel judul = new JLabel ("Data Diri Mahasiswa");
    JLabel lNama = new JLabel ("Nama");
    JLabel lNIM = new JLabel ("NIM");
    JLabel ljk = new JLabel ("Jenis Kelamin");
    JLabel lAgama = new JLabel ("Agama");
    JLabel lAlamat = new JLabel ("Alamat");
    
    JTextField fNama = new JTextField(20);
    JTextField fNIM = new JTextField(9);
    
    JRadioButton L = new JRadioButton ("L");
    JRadioButton P = new JRadioButton("P");
    
    String[] namaAgama = {"Islam", "Kristen", "Katholik", "Hindu", "Buddha"};
    JComboBox cmbAgama = new JComboBox(namaAgama);
    
    JTextArea aAlamat = new JTextArea();
    
    JButton btnOk = new JButton("OK");
    
    public Layout(){
        setTitle("Data Diri Mahasiswa");
        setSize(600,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setLayout(null);
        add(judul);
        add(lNama);
        add(fNama);
        add(lNIM);
        add(fNIM);
        add(ljk);
        add(L);
        add(P);
        add(lAgama);
        add(cmbAgama);
        add(lAlamat);
        add(aAlamat);
        add(btnOk);
        
        judul.setBounds(230, 50, 150, 30);
        lNama.setBounds(150, 80, 100, 60);
        fNama.setBounds(230, 100, 200, 25);
        lNIM.setBounds(150, 123, 100, 60);
        fNIM.setBounds(230, 140, 200, 25);
        ljk.setBounds(150, 170, 100, 60);
        L.setBounds(270, 189, 50, 25);
        P.setBounds(340, 191, 50, 20);
        lAgama.setBounds(150, 220, 100, 60);
        cmbAgama.setBounds(230, 240, 100, 25);
        lAlamat.setBounds(150, 270, 100, 60);
        aAlamat.setBounds(230, 290, 200, 80);
        btnOk.setBounds(350, 390, 80, 25);
    }  
}
        
public class mainClass {

    public static void main(String[] args) {
        Layout L = new Layout();
    }
    
}
