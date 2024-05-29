package BackEnd;
public class ContaCorrente extends ContaDeposito{
     private int senha4Digitos;
     private int senha6digitos;
     private int CEP;
     public ContaCorrente(){

     }
     public ContaCorrente(int CEP, int senha4Digitos, int senha6digitos){
          super();
          this.CEP=CEP;
          this.senha4Digitos=senha4Digitos;
          this.senha6digitos=senha6digitos;
     }

     public int getSenha4Digitos() {
          return senha4Digitos;
     }

     public void setSenha4Digitos(int senha4Digitos) {
          this.senha4Digitos = senha4Digitos;
     }

     public int getSenha6digitos() {
          return senha6digitos;
     }

     public void setSenha6digitos(int senha6digitos) {
          this.senha6digitos = senha6digitos;
     }

     public int getCEP() {
          return CEP;
     }

     public void setCEP(int CEP) {
          this.CEP = CEP;
     }

     @Override
     public String toString() {
          return "CEP = " + CEP;
     }
     public int mostrarDados(int senha) {
          if(senha==getSenha6digitos()) {
               System.out.println("Seus dados:");
               System.out.println("Nome: " + getNomeCompleto());
               System.out.println("RG: " + getRG());
               System.out.println("CPF: " + getCPF());
               System.out.println("Saldo: " + getSaldo());
          }else{
               System.err.println("Senha incorreta");
               return 0;
          }
          return senha;
     }
     public void fazerPagamentos(double conta, int senha){
          if(senha==getSenha4Digitos()){
               if(getSaldo()<conta){
                    System.err.println("Saldo Insuficiente");
               }else {
                    System.out.println("pagamento efetuado com sucesso");
                    System.out.println("Saldo atual:");
                    System.out.println(getSaldo() - conta);
               }
          }else{
               System.err.println("Senha Incorreta");
          }
     }
     public void sacar(double valordeSaque, int senha){
          if(senha==getSenha6digitos()){
               if(valordeSaque>getSaldo()){
                    System.out.println("O valor que você quer sacar excede o saldo existente");
               }else {
                    System.out.println("operação feita comm sucesso. Retire o dinheiro");
                    System.out.println("Saldo atual:");
                    System.out.println(getSaldo()-valordeSaque);
               }
          }else{
               System.err.println("Senha Incorreta");
          }
     }
     public void aplicacoesFinanceiras(int senha, int valorDaAplicacao){
          if(senha==getSenha4Digitos()){
                double rendimento = valorDaAplicacao*0.02;
                double rendimentoAoMes = getSaldo()+rendimento;
               System.out.println("Seu lucro no final da operação é: " + rendimento);
               System.out.println("Saldo atual: " + rendimentoAoMes);
          }else{
               System.err.println("Senha Invalida");
          }
     }
}
