public class Main {

    public static void pegarEmprestado(LivroDeBiblioteca l) {
        if(!l.getEmprestado()) {
            l.Empresta();
            System.out.println("O livro " + l.titulo + " foi emprestado com sucesso! Deverá ser devolvido em 7 dias.");
        } else {
            System.out.println("Negado! O livro " + l.titulo + " já está emprestado! Tente novamente em alguns dias.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Em execucao!");

        //MyFrame
        Form f = new Form();
    }
}
