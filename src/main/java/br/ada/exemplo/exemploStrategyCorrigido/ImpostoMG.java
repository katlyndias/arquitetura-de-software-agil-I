package br.ada.exemplo.exemploStrategyCorrigido;

public class ImpostoMG implements StrategyImposto{
    @Override
    public double calcularImposto(double valor) {
        System.out.println("Imposto MG");
        return valor * 0.07;
    }
}
