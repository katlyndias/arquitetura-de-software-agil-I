package br.ada.exemplo.exemploStrategy;

class ImpostoRJ implements EstrategiaImposto {
    @Override
    public double calcularImposto(double valor) {
        return valor * 0.09;
    }
}
