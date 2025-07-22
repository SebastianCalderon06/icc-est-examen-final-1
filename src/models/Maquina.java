package models;

import java.util.List;

public class Maquina {
    private String name;
    private String ip;
    private List<Integer> codigos;
    private int subred;
    private int risgo;

    



    public Maquina(String name, String ip, List<Integer> codigos) {
        this.name = name;
        this.ip = ip;
        this.codigos = codigos;
    }





    public String getName() {
        return name;
    }





    public void setName(String name) {
        this.name = name;
    }





    public String getIp() {
        return ip;
    }





    public void setIp(String ip) {
        this.ip = ip;
    }





    public List<Integer> getCodigos() {
        return codigos;
    }





    public void setCodigos(List<Integer> codigos) {
        this.codigos = codigos;
    }





    public int getSubred() {
        return subred;
    }





    public void setSubred(int subred) {
        this.subred = subred;
    }





    public int getRisgo() {
        return risgo;
    }





    public void setRisgo(int risgo) {
        this.risgo = risgo;
    }



    


    
}
