package projetofinal;

public class OrdemDeServiço {
    
    private String sobre;
    private Solicitante sol;
    private Executor exe;

    public OrdemDeServiço(String sobre, Solicitante sol, Executor exe) {
        this.sobre = sobre;
        this.sol = sol;
        this.exe = exe;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    public Solicitante getSol() {
        return sol;
    }

    public void setSol(Solicitante sol) {
        this.sol = sol;
    }

    public Executor getExe() {
        return exe;
    }

    public void setExe(Executor exe) {
        this.exe = exe;
    }
    
    @Override
    public String toString(){
        return "Detalhes sobre O.S.: " + this.sobre + "\nSobre Solicitante -> " + this.sol + "\nSobre Executor -> " + this.exe + "\n\n";
    }
}