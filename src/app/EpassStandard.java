package app;

import java.time.LocalDate;

public abstract class EpassStandard extends Epass implements TituloTransporte{
    private Titular titular;
    private int pontos;
    private int numeroViagens;
    private String chave;

    public EpassStandard(String codigoDoc, TipoDocumento tipoDoc, LocalDate ddn, String nome, String email){
        super();
        this.titular = new Titular(codigoDoc, tipoDoc, nome, ddn, email);
        this.pontos = 0;
        this.numeroViagens = 0;
        this.chave = gerarChave();
    }

    public EpassStandard(DocumentoID docID, LocalDate ddn, String nome, String email){
        super();
        this.titular = new Titular(docID, nome, ddn, email);
        this.pontos = 0;
        this.numeroViagens = 0;
        this.chave = gerarChave();
    }

    public EpassStandard(DocumentoID docID, String nome, LocalDate ddn, String morada, String email, int telemovel){
        super();
        this.titular = new Titular(docID, nome, ddn, morada, email, telemovel);
        this.pontos = 0;
        this.numeroViagens = 0;
        this.chave = gerarChave();
    }

    public EpassStandard(Titular titular){
        super();
        this.titular = titular;
        this.pontos = 0;
        this.numeroViagens = 0;
        this.chave = gerarChave();
    }

    public EpassStandard(EpassStandard pass){
        super();
        this.titular = pass.getTitular();
        this.pontos = pass.pontos;
        this.numeroViagens = pass.numeroViagens;
        this.chave = pass.chave;
    }

    protected String gerarChave(){
        String[] fullname = titular.getNome().split(" ");
        String firstname = fullname[0].toUpperCase();
        int listsize = fullname.length;
        String lastname = fullname[listsize-1].toUpperCase();
        firstname = firstname.substring(0,5);
        lastname = lastname.substring(0,5);
        String fAlter = "";
        String lAlter = "";
        for (int i = 4 ; i >= 0; i--){
            fAlter += firstname.charAt(i);
            lAlter += lastname.charAt(i);
        }
        return fAlter+lAlter+titular.getDdn()+getCodigo();
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
