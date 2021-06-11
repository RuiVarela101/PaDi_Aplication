package app;

import java.time.LocalDate;

public class EpassFuncionario extends EpassStandard{
    public EpassFuncionario(String codigoDoc, TipoDocumento tipoDoc, LocalDate ddn, String nome, String email) {
        super(codigoDoc, tipoDoc, ddn, nome, email);
    }

    public EpassFuncionario(DocumentoID docID, LocalDate ddn, String nome, String email) {
        super(docID, ddn, nome, email);
    }

    public EpassFuncionario(DocumentoID docID, String nome, LocalDate ddn, String morada, String email, int telemovel) {
        super(docID, nome, ddn, morada, email, telemovel);
    }

    public EpassFuncionario(EpassStandard pass) {
        super(pass);
    }
}
