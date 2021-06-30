package ui;

import app.EpassStandard;

public interface TituloTransporte {
    public void carregar(double saldo);
    public void pagarViagem(double saldo);
    public boolean checkValidade();
    public boolean passarSaldo(EpassStandard outro, double saldo);
}
