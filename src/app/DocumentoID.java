package app;

import java.util.Scanner;

public class DocumentoID {
    private String codigoID;
    private TipoDocumento tipo;

    public DocumentoID(String codigoID, TipoDocumento tipo){
        this.codigoID = codigoID;
        this.tipo = tipo;
    }

    public String getCodigoID() {
        return codigoID;
    }

    public TipoDocumento getTipo(){
        return tipo;
    }

   /* public void documentType(){
        Scanner key = new Scanner(System.in);
        String x;
        int y;
        System.out.println("Tipo documento: ");
        x = key.nextLine();
        if (x.equals(" BI"))
            y = 1;
        else if (x.equals(" CUC"))
        y = 2;
                else if(x.equals(" PASSPORT"))
            y = 3;
        else if (x.equals("TER"))
            y = 4;
            else y = 0;
    }*/

}
