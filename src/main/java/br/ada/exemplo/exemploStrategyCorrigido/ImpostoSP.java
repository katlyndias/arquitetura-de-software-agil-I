package br.ada.exemplo.exemploStrategyCorrigido;

public class ImpostoSP implements StrategyImposto{
    @Override
    public double calcularImposto(double valor) {
        System.out.println("Imposto SP");
        return valor * 0.08;
    }
}
