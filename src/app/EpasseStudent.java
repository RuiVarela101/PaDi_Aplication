package app;
import java.time.LocalDate;
import java.util.ArrayList;

public class EpasseStudent extends EpassStandard{
    private String escola;
    private int ano;
    private int viagemFree;
    private ArrayList <Zona> zonas;

    public EpasseStudent(int ano, String escola, String codigoDoc, TipoDocumento tipoDoc, LocalDate ddn, String nome, String email){
        super( codigoDoc, tipoDoc, ddn, nome, email);
        this.ano = ano;
        this.escola = escola;
        this.zonas = new ArrayList<Zona>();
    }

    public EpasseStudent(EpasseStudent outro, DocumentoID docID, LocalDate ddn, String nome, String email){
        super(docID, ddn, nome, email);
        this.ano = outro.ano;
        this.escola = outro.escola;
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
        zonas.add(new Zona(nome));
    }

    public void addZona(Zona zonaViagem){
        zonas.add(zonaViagem);
    }

    public ArrayList<Zona> getZonas() {
        return zonas;
    }

}
