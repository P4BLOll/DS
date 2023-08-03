/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caixa;

/**
 *
 * @author Admin
 */
public class Menu {
    private Caixa caixa;
        private int opcao;
        private ConversorNumeros conversor;
        private EntradaSaidaDados io;

        public Menu(){
            this.caixa = new Caixa();
            this.opcao = -1;
            this.conversor = new ConversorNumeros();
            this.io = new EntradaSaidaDados();

        }

        public void executarCaixa(){
            do{
                this.executarMenuPrincipal();
                this.avaliarOpcaoEscolhida();
            }while(this.opcao!=4);
        }

        private void executarMenuPrincipal(){
            String mensagemMenu = "Selecione uma opção"
                    +"\n 1 - Entrada"
                    +"\n 2 - Retirada"
                    +"\n 3 - Consultar Saldo"
                    +"\n 4 - Sair";
            String entradaDados = io.entradaDados(mensagemMenu);
            this.opcao = conversor.StringToInt(entradaDados);

        }

        public void avaliarOpcaoEscolhida(){
            switch(this.opcao){
                case 1:
                    String mensagemEntrada = "Digite o valor de entrada: ";
                    double valorEntrada = conversor.StringToDouble(io.entradaDados(mensagemEntrada));
                    caixa.entrar(valorEntrada);
                    break;
                case 2:
                    String mensagemRetirada = "Digite o valor de retirada: ";
                    double valorRetirada = conversor.StringToDouble(io.entradaDados(mensagemRetirada));
                    caixa.retirar(valorRetirada);
                    break;
                case 3:
                    String mensagemSaldo = "Saldo Atual: " + caixa.getSaldo();
                    io.saidaDados(mensagemSaldo);
                    break; 
                case 4:
                    io.saidaDados("Finalizando Programa!");
                    break;
                default:
                    io.saidaDados("Opção Inválida");
                    break;

            }
        }
}
