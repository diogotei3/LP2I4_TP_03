public interface ItemDeBiblioteca {
    public int diasemprestimo = 7;

    abstract public boolean getEmprestado();
    abstract public String getLocalizacao();
    abstract public void Empresta();
    abstract public void Devolve();
}
