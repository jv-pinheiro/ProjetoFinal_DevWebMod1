package projetofinal;

public class Solicitante extends Pessoa {
    private String comEquip;
    private String telefone;

    public Solicitante(String comEquip, String nome, String nId, String telefone) {
        super(nome, nId);
        this.comEquip = comEquip;
        this.telefone = telefone;
    }

    public String getComEquip() {
        return comEquip;
    }

    public void setComEquip(String comEquip) {
        this.comEquip = comEquip;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public String toString(){
        return "Nome: " + this.getNome() + ";\nNúmero de Identificação: " + this.getnId() + ";\nTrouxe Equipamento: " + this.getComEquip() + ";\nTelefone: " + this.getTelefone() + ";";
    }

    
}
