package projetofinal;

public class Executor extends Pessoa {
    private boolean livre;

    public Executor(String nome, String nId) {
        super(nome, nId);
    }

    public boolean isLivre() {
        return livre;
    }

    public void setLivre(boolean livre) {
        this.livre = livre;
    }
    
    @Override
    public String toString(){
        return "Nome: " + this.getNome() + ";\nNúmero de Identificação: " + this.getnId() + ";\nEstá livre? " + this.livre + "\n";
    }
}
