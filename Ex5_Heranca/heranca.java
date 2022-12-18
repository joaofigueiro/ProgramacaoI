package Ex5_Heranca; 

import java.util.Scanner; 

public class heranca{

    public void menu() {
        System.out.println("0 – Sair");
        System.out.println("1 – Conta");
        System.out.println("2 – Conta Especial");
        System.out.println("3 – Investimento");
    }
    
    public void menuConta() {
        System.out.println("0 – Sair");
        System.out.println("1 – Depositar");
        System.out.println("2 – Sacar");
        System.out.println("3 – Resumo Extrato");
    }

    public void menuContaEspecial() {
        System.out.println("0 – Sair");
        System.out.println("1 – Depositar");
        System.out.println("2 – Sacar");
        System.out.println("3 – Efetuar Manutenção");
        System.out.println("4 – Resumo Extrato");
    }
    
    public void menuInvestimento() {
        System.out.println("0 – Sair");
        System.out.println("1 – Depositar");
        System.out.println("2 – Sacar");
        System.out.println("3 – Efetuar Manutenção");
        System.out.println("4 – Resumo Extrato");
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in); 
        heranca heranca = new heranca();
        conta Conta = new conta(1, 1000, "João"); 
        contaEspecial ContaEspecial = new contaEspecial(1, 1000, "Pedro", 100, 5); 
        int control = -1, controlConta = -1, controlContaEsp = -1, controlInvest = -1, valorDeposito = 0, valorSacar = 0;

        while(control != 0){
            heranca.menu();
            control = entrada.nextInt();
            if(control == 1){
                while(controlConta != 0){
                    heranca.menuConta();
                    controlConta = entrada.nextInt(); 
                    if (controlConta == 1){
                        System.out.println("Informe um valor para depósito: ");
                        valorDeposito = entrada.nextInt();  
                        if(valorDeposito < 0){
                            System.out.println("Valores menores que 0 são inválidos para depósito.");
                        } else {
                            Conta.depositar(valorDeposito);
                        }
                    } else if (controlConta == 2){
                        System.out.println("Informe um valor para sacar: ");
                        valorSacar = entrada.nextInt();
                        if(Conta.sacar(valorSacar) == false){
                            System.out.println("Saldo insuficiente.");
                        } else {
                            System.out.println("Saque efetuado com sucesso."); 
                        }
                    } else if (controlConta == 3) {
                        Conta.resumoExtrato();
                    }
                }
            }
            else if(control == 2) {
                while(controlContaEsp != 0){
                    heranca.menuContaEspecial();
                    controlContaEsp = entrada.nextInt(); 
                    if (controlContaEsp == 1){
                        System.out.println("Informe um valor para depósito: ");
                        valorDeposito = entrada.nextInt();  
                        if(valorDeposito < 0){
                            System.out.println("Valores menores que 0 são inválidos para depósito.");
                        } else {
                            ContaEspecial.depositar(valorDeposito);
                        }
                    } else if (controlContaEsp == 2){
                        System.out.println("Informe um valor para sacar: ");
                        valorSacar = entrada.nextInt();
                        if(ContaEspecial.sacar(valorSacar) == false){
                            System.out.println("Saldo insuficiente.");
                        } else {
                            System.out.println("Saque efetuado com sucesso."); 
                        }
                    } else if (controlContaEsp == 3) {
                        ContaEspecial.fazManutencao();
                        System.out.println("Manutenção efetuada com sucesso."); 
                    }
                    else if (controlContaEsp == 4) {
                        ContaEspecial.resumoExtrato();
                    }
                }            
            } else if(control == 3) {
                investimento Investimento = new investimento(1, 3000, "Marcelo", 10);
                while(controlInvest != 0){
                    heranca.menuInvestimento();
                    controlInvest = entrada.nextInt(); 
                    if (controlInvest == 1){
                        System.out.println("Informe um valor para depósito: ");
                        valorDeposito = entrada.nextInt();  
                        if(valorDeposito < 0){
                            System.out.println("Valores menores que 0 são inválidos para depósito.");
                        } else {
                            Investimento.depositar(valorDeposito);
                        }
                    } else if (controlInvest == 2){
                        System.out.println("Informe um valor para sacar: ");
                        valorSacar = entrada.nextInt();
                        if(Investimento.sacar(valorSacar) == false){
                            System.out.println("Saldo insuficiente.");
                        } else {
                            System.out.println("Saque efetuado com sucesso."); 
                        }
                    } else if (controlInvest == 3) {
                        Investimento.fazManutencao();
                        System.out.println("Manutenção efetuada com sucesso."); 
                    } else if (controlInvest == 4) {
                        Investimento.resumoExtrato();
                    }
                } 
            }
        }
        entrada.close();
    }
}
