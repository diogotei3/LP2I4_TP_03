public class Livro {
    protected String titulo;
    protected String autor;
    protected String editora;
    protected String anoedicao;


    Livro(String t, String a, String e, String ae) {
        this.titulo = t;
        this.autor = a;
        this.editora = e;
        this.anoedicao = ae;
    }

    Livro(){

    }

    public void setTitulo(String t) {
        this.titulo = t;
    }

    public void setAutor(String a) {
        this.autor = a;
    }

    public void setEditora(String e) {
        this.editora = e;
    }

    public void setAnoEdicao(String ae) {
        this.anoedicao = ae;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getEditora() {
        return this.editora;
    }

    public String getAnoEdicao() {
        return this.anoedicao;
    }

    public String getDados() {
        return
        "Titulo. = " + this.titulo +
        "\nAutor.. = " + this.autor +
        "\nEditora = " + this.editora +
        "\nAno.... = " + this.anoedicao;
    }
}