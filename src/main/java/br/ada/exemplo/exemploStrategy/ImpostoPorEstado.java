package br.ada.exemplo.exemploStrategy;

public class ImpostoPorEstado {
    private EstrategiaImposto estrategia;

    // Método para definir a estratégia
    public void setEstrategia(EstrategiaImposto estrategia) {
        this.estrategia = estrategia;
    }

    // Método para calcular o imposto usando a estratégia selecionada
    public double calcularImposto(double valor) {
        if (estrategia == null) {
            throw new IllegalStateException("Estratégia não definida");
        }
        return estrategia.calcularImposto(valor);
    }

    public static void main(String[] args) {
        ImpostoPorEstado calculadora = new ImpostoPorEstado();

        // Define a estratégia para São Paulo
        calculadora.setEstrategia(new ImpostoSP());
        double impostoSP = calculadora.calcularImposto(1000);
        System.out.println("Imposto para São Paulo: " + impostoSP);

        // Define a estratégia para Rio de Janeiro
        calculadora.setEstrategia(new ImpostoRJ());
        double impostoRJ = calculadora.calcularImposto(1000);
        System.out.println("Imposto para Rio de Janeiro: " + impostoRJ);

        // Define a estratégia para Minas Gerais
        calculadora.setEstrategia(new ImpostoMG());
        double impostoMG = calculadora.calcularImposto(1000);
        System.out.println("Imposto para Minas Gerais: " + impostoMG);
    }
}
