package br.ada.exemplo.exemploStrategy;

class ImpostoMG implements EstrategiaImposto {
    @Override
    public double calcularImposto(double valor) {
        return valor * 0.07;
    }
}
