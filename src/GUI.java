import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private JTextField NIK, nama, ttl, alamat, RtRw, kelDesa, kecamatan,
            expDate, kotaPembuatan;
    private JComboBox<String> agama, status;
    private JRadioButton pria, wanita, wna, wni;
    private JCheckBox swasta, pns, wiraswasta, akademisi, pengangguran;
    private JButton insertButton, uploadFotoButton, uploadTtdButton;
    // private JLabel fotoLabel, ttdLabel;
    private JSpinner tglLahir, tglPembuatan;

    public GUI() {
        setTitle("Form Input Data Penduduk");
        setSize(800, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(20, 2, 5, 5));

        // NIK
        formPanel.add(new JLabel("NIK:"));
        NIK = new JTextField();
        formPanel.add(NIK);

        // Nama
        formPanel.add(new JLabel("Nama:"));
        nama = new JTextField();
        formPanel.add(nama);

        // TTL
        formPanel.add(new JLabel("Tempat Lahir:"));
        ttl = new JTextField();
        formPanel.add(ttl);

        formPanel.add(new JLabel("Tanggal Lahir:"));
        tglLahir = new JSpinner(new SpinnerDateModel());
        formPanel.add(tglLahir);

        // Jenis Kelamin
        formPanel.add(new JLabel("Jenis Kelamin:"));
        pria = new JRadioButton("Pria");
        wanita = new JRadioButton("Wanita");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(pria);
        genderGroup.add(wanita);
        JPanel genderPanel = new JPanel();
        genderPanel.add(pria);
        genderPanel.add(wanita);
        formPanel.add(genderPanel);

        // Golongan darah
        formPanel.add(new JLabel("Golongan Darah:"));
        JComboBox<String> golDarahComboBox = new JComboBox<>(new String[] { "A", "B", "O", "AB" });
        formPanel.add(golDarahComboBox);

        // Alamat
        formPanel.add(new JLabel("Alamat:"));
        alamat = new JTextField();
        formPanel.add(alamat);

        // RT RW
        formPanel.add(new JLabel("RT/RW:"));
        RtRw = new JTextField();
        formPanel.add(RtRw);

        // Kelurahan
        formPanel.add(new JLabel("Kel/Desa:"));
        kelDesa = new JTextField();
        formPanel.add(kelDesa);

        // Kecamatan
        formPanel.add(new JLabel("Kecamatan:"));
        kecamatan = new JTextField();
        formPanel.add(kecamatan);

        // Agama
        formPanel.add(new JLabel("Agama:"));
        agama = new JComboBox<>(new String[] { "Islam", "Kristen", "Hindu", "Budha", "Konghucu" });
        formPanel.add(agama);

        // Status
        formPanel.add(new JLabel("Status Perkawinan:"));
        status = new JComboBox<>(new String[] { "Belum Menikah", "Menikah", "Janda/Duda" });
        status.setPreferredSize(new Dimension(200, 25));
        formPanel.add(status);

        // Pekerjaan
        formPanel.add(new JLabel("Pekerjaan:"));
        swasta = new JCheckBox("Karyawan Swasta");
        pns = new JCheckBox("PNS");
        wiraswasta = new JCheckBox("Wiraswasta");
        akademisi = new JCheckBox("Akademisi");
        pengangguran = new JCheckBox("Pengangguran");
        JPanel pekerjaanPanel = new JPanel();
        pekerjaanPanel.add(swasta);
        pekerjaanPanel.add(pns);
        pekerjaanPanel.add(wiraswasta);
        pekerjaanPanel.add(akademisi);
        pekerjaanPanel.add(pengangguran);
        formPanel.add(pekerjaanPanel);

        // Kewarganegaraan
        formPanel.add(new JLabel("Kewarganegaraan:"));
        wni = new JRadioButton("WNI");
        wna = new JRadioButton("WNA");
        ButtonGroup kewarganegaraanGroup = new ButtonGroup();
        kewarganegaraanGroup.add(wni);
        kewarganegaraanGroup.add(wna);
        JPanel kewarganegaraanPanel = new JPanel();
        kewarganegaraanPanel.add(wni);
        kewarganegaraanPanel.add(wna);
        formPanel.add(kewarganegaraanPanel);

        // Foto
        formPanel.add(new JLabel("Foto:"));
        uploadFotoButton = new JButton("Upload Foto");
        formPanel.add(uploadFotoButton);

        // TTD
        formPanel.add(new JLabel("Tanda Tangan:"));
        uploadTtdButton = new JButton("Upload Tanda Tangan");
        formPanel.add(uploadTtdButton);

        // Exp date
        formPanel.add(new JLabel("Berlaku Hingga:"));
        expDate = new JTextField();
        formPanel.add(expDate);

        // Kota pembuatan
        formPanel.add(new JLabel("Kota Pembuatan:"));
        kotaPembuatan = new JTextField();
        formPanel.add(kotaPembuatan);

        // Tgl pembuatan
        formPanel.add(new JLabel("Tanggal Pembuatan KTP:"));
        tglPembuatan = new JSpinner(new SpinnerDateModel());
        formPanel.add(tglPembuatan);

        // Tombol Insert Data
        insertButton = new JButton("Insert Data");
        formPanel.add(insertButton);

        add(formPanel, BorderLayout.CENTER);

        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (NIK.getText().isEmpty() || nama.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Harap isi semua field yang wajib!");
                } else {
                    JOptionPane.showMessageDialog(null, "Data berhasil disimpan!");
                }
            }
        });
    }

    public static void main(String[] args) {
        GUI form = new GUI();
        form.setVisible(true);
    }
}
