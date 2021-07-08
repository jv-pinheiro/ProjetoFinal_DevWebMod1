package projetofinal;

import java.util.ArrayList;

public class GerarDados {
    ArrayList <OrdemDeServiço> abrirOS = new ArrayList();
    
    public void OSAbrir(OrdemDeServiço OS){
        abrirOS.add(OS);
    }
    
    public String nOS(){
        return abrirOS.size() + " Ordens de Serviços Abertas!";
    }
    
    public int nOS2(){
        return abrirOS.size();
    }
    
    public void removeOS(int n){
        abrirOS.remove(n);
    }
    
    public ArrayList<OrdemDeServiço> showOS(){
        return abrirOS;
    }
}
