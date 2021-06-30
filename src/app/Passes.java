package app;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Passes{
    private static  ArrayList <Epass> passes = new ArrayList<>();
    private static long numeroCodigos = 0;

    public static void alterarPasse(long codigo){
        if (validarPasse(codigo)){
            for (Epass passe : passes){
                if (passe.getCodigo() == codigo)
                    passe.alterarPasse();
            }
        }
        else
            System.out.println("Passe inexistente!");
    }

    public static <P extends Epass> void adicionarPasse(P passe){
        passes.add(passe);
        numeroCodigos++;
    }

    public static boolean validarPasse(long codigo){
        return (numeroCodigos > codigo && codigo > 0);
    }

    public double getSaldo(long codigo){
        for(Epass passe:passes){
            if (passe.getCodigo() == codigo)
                return passe.getSaldo();
        }
        return -18328;  // codigo para dizer que o passe nao existe
    }

    public void setSaldo(long codigo, double saldo){
        for(Epass passe:passes){
            if (passe.getCodigo() == codigo) {
                passe.setSaldo(saldo);
                System.out.println("Passe: "+codigo+"-> recebeu saldo: "+saldo);
            }
            System.out.println("Erro: Passe inexistente!");
        }

    }

    public void transferirSaldo(long codigo1, long codigo2, double saldo) {
        setSaldo(codigo1, getSaldo(codigo1)-saldo);
        setSaldo(codigo2, saldo+getSaldo(codigo2));
    }

    public <P extends Epass> void pagarViagem(long codigo) {
        double saldo = 0;
        for (Epass passe : passes) {
            if (passe.getCodigo() == codigo)
                passe.pagarViagem(saldo);
        }
        System.out.println("Erro: Passe inexistente!");
    }

    public void carregarPasse(long codigo, double saldo) {
        for (Epass passe : passes) {
            if (passe.getCodigo() == codigo)
                passe.carregarPasse(saldo);
        }
        System.out.println("Erro: Passe inexistente!");
    }
}