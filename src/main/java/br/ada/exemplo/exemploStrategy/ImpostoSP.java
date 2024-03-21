package br.ada.exemplo.exemploStrategy;

class ImpostoSP implements EstrategiaImposto {
    @Override
    public double calcularImposto(double valor) {
        return valor * 0.08;
    }
}
