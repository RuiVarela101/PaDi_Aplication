package app;

import java.time.LocalDate;

public abstract class EpassStandard extends Epass implements TituloTransporte{
    private Titular titular;
    private int pontos;
    private int numeroViagens;
    private String chave;

    public EpassStandard(String codigoDoc, TipoDocumento tipoDoc, LocalDate ddn, String nome, String email){
        this.titular = new Titular(codigoDoc, tipoDoc, nome, ddn, email);
    }

    public EpassStandard(DocumentoID docID, LocalDate ddn, String nome, String email){
        this.titular = new Titular(docID, nome, ddn, email);
    }

    public EpassStandard(DocumentoID docID, String nome, LocalDate ddn, String morada, String email, int telemovel){
        this.titular = new Titular(docID, nome, ddn, morada, email, telemovel);
    }

    public EpassStandard(EpassStandard pass){
        this.titular = pass.titular;
        this.pontos = pass.pontos;
        this.numeroViagens = pass.numeroViagens;
        this.chave = pass.chave;
    }

    public Titular getTitular() {
        return titular;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getNumeroViagens() {
        return numeroViagens;
    }

    public void setNumeroViagens(int numeroViagens) {
        this.numeroViagens = numeroViagens;
    }

    public String getChave() {
        return chave;
    }

    public void carregar(double saldo){
    }

    public void pagarViagem(double saldo){
    }

    public boolean checkValidade(){
        return true;
    }

    public boolean passarSaldo(EpassStandard outro, double saldo){
        return true;
    }

}
