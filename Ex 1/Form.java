import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Form extends Frame implements ActionListener {
        //elementos para funções
        private Label lA=new Label("A: ");
        private TextField tA = new TextField();
        private Label lB=new Label("B: ");
        private TextField tB = new TextField();
        private Label lsoma=new Label("Soma: ");
        private TextField tsoma = new TextField();
        private Label lsub=new Label("Subtracao: ");
        private TextField tsub = new TextField();
        private Label lmult=new Label("Multiplição: ");
        private TextField tmult = new TextField();
        private Label ldiv=new Label("Divisão: ");
        private TextField tdiv = new TextField();
        private Button blimpa = new Button("Limpar");
        private Button bcalc = new Button("Cacular");
        private Button bsair = new Button("Sair");
        private  int A;
        private int B;

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

        p1.add(lA); p1.add(tA);
        p1.add(lB);p1.add(tB);
        p1.add(lsoma); p1.add(tsoma);
        p1.add(lsub); p1.add(tsub);
        p1.add(lmult); p1.add(tmult);
        p1.add(ldiv); p1.add(tdiv);

        f.add(p1, BorderLayout.NORTH);

        Panel p2 = new Panel(new GridLayout(1,3,1,1));

        p2.add(blimpa);
        p2.add(bcalc);
        p2.add(bsair);

        f.add(p2, BorderLayout.SOUTH);

            //eventos
            blimpa.addActionListener(this);
            bcalc.addActionListener(this);
            bsair.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == blimpa) {
            limpa();
        }

        if (e.getSource()==bcalc){
            //contas
            A=Integer.parseInt(tA.getText());
            B=Integer.parseInt(tB.getText());
            tsoma.setText(String.valueOf(A+B));
            tsub.setText(String.valueOf(A-B));
            tmult.setText(String.valueOf(A*B));
            tdiv.setText(String.valueOf(A/B));
        }

        if (e.getSource() == bsair) {
            System.exit(0);
        }
    }

        public void limpa(){
            tA.setText("");
            tB.setText("");
            tsoma.setText("");
            tsub.setText("");
            tmult.setText("");
            tdiv.setText("");
        }
    }
