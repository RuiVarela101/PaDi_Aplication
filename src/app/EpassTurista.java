package app;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EpassTurista extends PasseSazonal{
    private Duracao duracao;

    public EpassTurista(Duracao duracao){
        super();
        this.duracao = duracao;
        if(duracao == Duracao.Sete){
            this.setSaldo(1500);
            this.setCarregamento(LocalDate.now());
            this.setValidade(this.getCarregamento().plusDays(7));
        }
        else if(duracao == Duracao.Tres){
            this.setSaldo(700);
            this.setCarregamento(LocalDate.now());
            this.setValidade(this.getCarregamento().plusDays(3));
        }
        else if(duracao == Duracao.Um){
            this.setSaldo(500);
            this.setCarregamento(LocalDate.now());
            this.setValidade(this.getCarregamento().plusDays(1));
        }

    }

    public EpassTurista(EpassTurista outro){
        super();
        this.setSaldo(outro.getSaldo());
        this.setPrecoViagem(outro.getPrecoViagem());
        this.setCarregamento(outro.getCarregamento());
        this.setValidade(outro.getValidade());
    }

    public Duracao getDuracao() {
        return duracao;
    }
}
