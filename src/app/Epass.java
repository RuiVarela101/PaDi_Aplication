package app;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Epass {
    private long codigo;
    private double saldo;
    private double precoViagem;
    private LocalDateTime emissao;
    private LocalDate carregamento;
    private LocalDate validade;
    private static long ultCodigo;

    static{
        if(Long.valueOf(ultCodigo) == null){
            ultCodigo = 0;
        }
    }

    public Epass(double saldo, double precoViagem){
        this.saldo = saldo;
        this.precoViagem = precoViagem;
    }

    public Epass(double precoViagem){
        this.precoViagem = precoViagem;
    }

    public Epass(double saldo, double precoViagem, LocalDate carregamento,LocalDate validade){
        this.saldo = saldo;
        this.precoViagem = precoViagem;
        this.carregamento = carregamento;
        this.validade = validade;
    }

    public Epass(double saldo, LocalDate carregamento){
        this.saldo = saldo;
        this.carregamento = carregamento;
    }

    public Epass() {
        this.codigo = ultCodigo + 1;
        ultCodigo++;
        this.saldo = 0;
        this.emissao = LocalDateTime.now();

    }

    public long getCodigo() {
        return codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getPrecoViagem() {
        return precoViagem;
    }

    public void setPrecoViagem(double precoViagem) {
        this.precoViagem = precoViagem;
    }

    public LocalDateTime getEmissao() {
        return emissao;
    }

    public LocalDate getCarregamento() {
        return carregamento;
    }

    public void setCarregamento(LocalDate carregamento) {
        this.carregamento = carregamento;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public static long getUltCodigo() {
        return ultCodigo;
    }

    public static void setUltCodigo(long ultCodigo) {
        Epass.ultCodigo = ultCodigo;
    }

    public String toString(){
        return "Not Ready";
    }

    public boolean  equals(Epass outro){
        return outro.codigo == this.codigo;
    }

}
