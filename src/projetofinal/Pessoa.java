package projetofinal;

public class Pessoa {
    private String nome;
    private String nId;

    public Pessoa(String nome, String nId) {
        this.nome = nome;
        this.nId = nId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getnId() {
        return nId;
    }

    public void setnId(String nId) {
        this.nId = nId;
    }
}
