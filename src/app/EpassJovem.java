package app;

import java.time.LocalDate;

public class EpassJovem extends EpassStandard{

    public EpassJovem(String codigoDoc, TipoDocumento tipoDoc, LocalDate ddn, String nome, String email) {
        super(codigoDoc, tipoDoc, ddn, nome, email);
    }

    public EpassJovem(DocumentoID docID, LocalDate ddn, String nome, String email) {
        super(docID, ddn, nome, email);
    }

    public EpassJovem(DocumentoID docID, String nome, LocalDate ddn, String morada, String email, int telemovel) {
        super(docID, nome, ddn, morada, email, telemovel);
    }
    public EpassJovem(Titular titular) {
        super(titular);
    }

    public EpassJovem(EpassStandard pass) {
        super(pass);
    }

    @Override
    public void carregarPasse(double saldo) {
    }
}
