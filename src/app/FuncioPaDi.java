package app;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public interface FuncioPaDi {
    //public ArrayList<EPass> importDados_ePass(ObjectInputStream oin, String nomeF) throws IOException,ClassNotFoundException;
    public void exportDados_ePass(ObjectOutputStream oout, String nome) throws IOException;
    public String info_ePass();
    public void pagarViagem(Epass passe);
    public int passarSaldo(Epass origem, Epass destino);
    public <T extends Epass> void mostrarDados_ePass(T passe);
    public void carregar(Epass passe, double valor);
    public void alterarDados(Epass passe);
    public void novo(String tipoE);
    public Epass findEPass(int codigo);
    public int find(int codigo);
    //public Epass lerDadosEpass(LeituraPorTipo tipo);
    public int leCodigoEpass();
    public ArrayList<Epass> importDados_ePass(ObjectInputStream oin, String nomeF)
            throws IOException, ClassNotFoundException, CloneNotSupportedException;

}

