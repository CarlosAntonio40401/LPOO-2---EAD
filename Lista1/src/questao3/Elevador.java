package questao3;

import java.util.Scanner;

public class Elevador {

    public int andarAtual;
    public int totalAndares;
    public int capacidadeElevador;
    public int qtdPessoasElevador;

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getQtdPessoasElevador() {
        return qtdPessoasElevador;
    }

    public void setQtdPessoasElevador(int qtdPessoasElevador) {
        this.qtdPessoasElevador = qtdPessoasElevador;
    }

    public void inicializar(int capacidadeElevador, int totalAndares) {

        this.capacidadeElevador = capacidadeElevador;
        this.totalAndares = totalAndares;

    }

    public int entrar() {

        int espacoRestante = (this.capacidadeElevador - this.qtdPessoasElevador);

        if (espacoRestante > 0) {
            System.out.println("Pode entrar:" + espacoRestante + " pessoas");
            System.out.println("Informe a quantidade de pessoas que irão entrar no elevador:");
            Scanner c = new Scanner(System.in);
            this.qtdPessoasElevador = c.nextInt();
            espacoRestante = (this.capacidadeElevador - this.qtdPessoasElevador);
        } else {
            System.out.println("O elevador está cheio");
        }

        return espacoRestante;
    }

    public int sai() {
        if (this.qtdPessoasElevador > 0) {
            System.out.println("Pode descer uma pessoa que ficaram ainda " + (this.qtdPessoasElevador - 1) + "pessoas no elevador");

        }
        return this.qtdPessoasElevador;
    }

    public int sobe() {
        int andarRestante = (this.totalAndares - this.andarAtual);
        if (andarRestante >= 1) {

            System.out.println("Pode subir, ainda falta " + andarRestante + " andares até o último andar");
            
            this.andarAtual++;
        }
        andarRestante = (this.totalAndares - this.andarAtual);
        return andarRestante;
    }

    public int desce() {
        if (this.andarAtual > 0) {

            System.out.println("Pode descer, ainda falta " + this.andarAtual + " andares até o terreo");
        }

        return this.andarAtual - 1;
    }

}
