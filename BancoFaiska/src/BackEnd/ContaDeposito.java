package BackEnd;

import java.util.Scanner;

public  abstract class ContaDeposito {
    private double Saldo;
    private String NomeCompleto;
    private String CPF;
    private String RG;

        public ContaDeposito(){

        }
        public ContaDeposito(String NomeCompleto, String CPF, String RG, double saldo){
            this.NomeCompleto=NomeCompleto;
            this.CPF=CPF;
            this.RG=RG;
            this.Saldo=saldo;
        }

    public String getNomeCompleto() {
        return NomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        NomeCompleto = nomeCompleto;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }
    public double getSaldo(){
            return Saldo;
    }
    public void setSaldo(double saldo){
            this.Saldo=saldo;
    }
}
