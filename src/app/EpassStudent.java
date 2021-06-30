package app;
import java.time.LocalDate;
import java.util.ArrayList;

public class EpassStudent extends EpassStandard{
    private String escola;
    private int ano;
    private int viagemFree;
    private ArrayList <Zona> zonas;

    public EpassStudent(int ano, String escola, String codigoDoc, TipoDocumento tipoDoc, LocalDate ddn, String nome, String email){
        super( codigoDoc, tipoDoc, ddn, nome, email);
        this.ano = ano;
        this.escola = escola;
        this.zonas = new ArrayList<Zona>();
        this.viagemFree = 0;
    }

    public EpassStudent(EpassStudent outro, DocumentoID docID, LocalDate ddn, String nome, String email){
        super(docID, ddn, nome, email);
        this.ano = outro.ano;
        this.escola = outro.escola;
        this.zonas = new ArrayList<Zona>();
        this.viagemFree = 0;
    }

    public EpassStudent(Titular titular, String escola, int ano){
        super(titular);
        this.ano = ano;
        this.escola = escola;
        this.zonas = new ArrayList<Zona>();
        this.viagemFree = 0;
    }

    public String getEscola() {
        return escola;
        }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void addZona(String nome) {
        this.zonas.add(new Zona(nome));
    }

    public void addZona(Zona zonaViagem){
        this.zonas.add(zonaViagem);
    }

    public ArrayList<Zona> getZonas() {
        return zonas;
    }

    @Override
    public void carregarPasse(double saldo) {

    }
}
