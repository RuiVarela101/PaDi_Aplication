package app;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EpassTeridade extends EpassStandard{
    private LocalDateTime horalni;

    public EpassTeridade(String codigoDoc, TipoDocumento tipoDoc, LocalDate ddn, String nome, String email){
        super(codigoDoc,tipoDoc,ddn,nome,email);
    }

    public EpassTeridade(DocumentoID docID, LocalDate ddn, String nome, String email){
        super(docID,ddn,nome,email);
    }

    public EpassTeridade(DocumentoID docID, String nome, LocalDate ddn, String morada, String email, int telemovel){
        super(docID,nome,ddn,morada,email,telemovel);
    }

    public LocalDateTime getHoralni() {
        return horalni;
    }

    public void setHoralni(LocalDateTime horalni){
        this.horalni = horalni;
    }

}
