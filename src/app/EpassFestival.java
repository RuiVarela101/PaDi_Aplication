package app;

public class EpassFestival extends PasseSazonal implements CartaoPagamento{
    private double saldoCartaoPgmt;
    private String nomeEvento;

    public EpassFestival(double saldo, String evento){
        this.saldoCartaoPgmt = saldo;
        this.nomeEvento = evento;
    }

    public EpassFestival(String evento){
        this.nomeEvento = evento;
    }

    public EpassFestival(EpassFestival outro){
        this.saldoCartaoPgmt = outro.saldoCartaoPgmt;
        this.nomeEvento = outro.nomeEvento;
    }

    public double getSaldoCartaoPgmt() {
        return saldoCartaoPgmt;
    }

    public void setSaldoCartaoPgmt(double saldoCartaoPgmt) {
        this.saldoCartaoPgmt = saldoCartaoPgmt;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public boolean pagar(double valor){
        return true;
    }
    public void creditar(double valor){

    }

    @Override
    public void carregarPasse(double saldo) {

    }

    @Override
    public void pagarViagem(double saldo) {

    }
}
