package BackEnd;

import BackEnd.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        ContaCorrente Conta = new ContaCorrente();
        Conta.setNomeCompleto("Felipe da Fonseca Valente");
        Conta.setCPF("922.222.201-89");
        Conta.setCEP(6920001);
        Conta.setSaldo(35000);
        Conta.setRG("20000-7");
        Conta.setSenha4Digitos(2004);
        Conta.setSenha6digitos(233300);
        Conta.mostrarDados(233300);

    }
}