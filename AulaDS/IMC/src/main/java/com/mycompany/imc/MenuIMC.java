/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imc;

/**
 *
 * @author Admin
 */
public class MenuIMC {
    private Situacao situacao;
    private IMC imc;
    private int opcao;
    private ConversorNumeros conversor;
    private EntradaSaidaDados io;
    
    public MenuIMC(){
            this.imc = new IMC();
            this.opcao = -1;
            this.conversor = new ConversorNumeros();
            this.io = new EntradaSaidaDados();

        }

        public void executarIMC(){
            do{
                this.executarMenuPrincipal();
                this.avaliarOpcaoEscolhida();
            }while(this.opcao!=5);
        }

        private void executarMenuPrincipal(){
            String mensagemMenu = "Selecione uma opção"
                    +"\n 1 - Cadastrar Dados"
                    +"\n 2 - Exibir Dados"
                    +"\n 3 - Calcular"
                    +"\n 4 - Exibir Situação"
                    +"\n 5 - Sair";
            String entradaDados = io.entradaDados(mensagemMenu);
            this.opcao = conversor.StringToInt(entradaDados);

        }

        public void avaliarOpcaoEscolhida(){
            switch(this.opcao){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break; 
                case 4:

                    break;
                case 5:
                    io.saidaDados("Finalizando Programa!");
                    break;
                default:
                    io.saidaDados("Opção Inválida");
                    break;

            }
        }
}
