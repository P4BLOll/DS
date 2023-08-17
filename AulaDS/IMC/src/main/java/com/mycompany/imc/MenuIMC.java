/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imc;

import javax.swing.JOptionPane;
import java.lang.*;

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
            }while(this.opcao!=0);
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
                    String mensagemAltura = "Digite sua Altura: ";
                    String mensagemPeso = "Digite seu Peso: ";
                    
                    double valorAltura = conversor.StringToDouble(io.entradaDados(mensagemAltura));
                    double valorPeso = conversor.StringToDouble(io.entradaDados(mensagemPeso));
                    imc.cadastrarDados(valorPeso, valorAltura);
                    break;
                case 2:
                    String mensagemDados = "Dados\n\nPeso: "+imc.getPeso()+"\nAltura: "+imc.getAltura();
                    io.saidaDados(mensagemDados);
                    break;
                case 3:
                    imc.calcularImc();
                    String mensagemCalc = "Cálculo: Peso/Altura^2\n\nResultado: "+imc.getImc();
                    io.saidaDados(mensagemCalc);
                    break; 
                case 4:
                    situacao.verificarSituacao(imc);
                    io.saidaDados(situacao.getSituacao());
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
