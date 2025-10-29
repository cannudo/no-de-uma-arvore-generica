public class No {
    private String dado;
    private No noPai;
    private No noFilhoEsquerdo;
    private No noFilhoDireito;

    public String toString() {
        String dado = this.dado;
        int largura = dado.length() + 4;
        String retorno = "+" + "-".repeat(largura - 2) + "+\n";
        retorno += "| " + dado + " |\n";
        retorno += "+" + "-".repeat(largura - 2) + "+\n";

        return retorno;
    }
}