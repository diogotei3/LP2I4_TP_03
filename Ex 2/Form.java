import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Form extends Frame implements ActionListener {
        //elementos para funções
        private Label lti=new Label("Título: ");
        private TextField tti = new TextField();
        private Label laut=new Label("Autor: ");
        private TextField taut = new TextField();
        private Label ledi=new Label("Editora: ");
        private TextField tedi = new TextField();
        private Label lano=new Label("Ano edição: ");
        private TextField tano = new TextField();
        private Label lloc=new Label("Localização: ");
        private TextField tloc = new TextField();
        private Label lstat=new Label("Status: ");
        private TextField tstat = new TextField();

        private Button bok = new Button("OK");
        private Button bemp = new Button("Emprestar");
        private Button bdev = new Button("Devolver");
        private Button bmostra = new Button("Mostrar");
        private Button bsair = new Button("Sair");

        LivroDeBiblioteca L1 = new LivroDeBiblioteca();

        Form(){
        //frame
        Frame f = new Frame();
            f.setTitle("TP03 - LP2I4");
            f.setLocation(200, 200);
            f.setSize(400,230);
            f.setBackground(Color.LIGHT_GRAY);
            f.setVisible(true);
            f.addWindowListener(new FechaJanela());
            f.setLayout(new BorderLayout());

        //elementos
        Panel p1 = new Panel(new GridLayout(6,2, 1, 1));

            p1.add(lti); p1.add(tti);
            p1.add(laut);p1.add(taut);
            p1.add(ledi); p1.add(tedi);
            p1.add(lano); p1.add(tano);
            p1.add(lloc); p1.add(tloc);
            p1.add(lstat); p1.add(tstat);

            f.add(p1, BorderLayout.NORTH);

        Panel p2 = new Panel(new GridLayout(1,5,1,1));

            p2.add(bok);
            p2.add(bemp);
            p2.add(bdev);
            p2.add(bmostra);
            p2.add(bsair);

            f.add(p2, BorderLayout.SOUTH);

            //eventos
            bok.addActionListener(this);
            bemp.addActionListener(this);
            bdev.addActionListener(this);
            bmostra.addActionListener(this);
            bsair.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == bok) {
            L1.setTitulo(tti.getText());
            L1.setAutor(taut.getText());
            L1.setEditora(tedi.getText());
            L1.setAnoEdicao(tano.getText());
            L1.setLocalizacao(tloc.getText());

            limpa();
        }

        if (e.getSource() == bemp) {
            L1.Empresta();
        }

        if (e.getSource() == bdev) {
            L1.Devolve();
        }

        if (e.getSource() == bmostra) {
            tti.setText(L1.getTitulo());
            taut.setText(L1.getAutor());
            tedi.setText(L1.getEditora());
            tano.setText(L1.getAnoEdicao());
            tloc.setText(L1.getLocalizacao());
            tstat.setText(String.valueOf(L1.getEmprestado()));
        }

        if (e.getSource() == bsair) {
            System.exit(0);
        }
    }

    public void limpa(){
        tti.setText("");
        taut.setText("");
        tedi.setText("");
        tano.setText("");
        tloc.setText("");
        tstat.setText("");
    }
}

