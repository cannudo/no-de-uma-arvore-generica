public class No {
    private String dado;
    private No noPai;
    private No noFilhoEsquerdo;
    private No noFilhoDireito;

    public No() {
        this.dado = null;
        this.noPai = null;
        this.noFilhoEsquerdo = null;
        this.noFilhoDireito = null;
    }

    public No(String dado) {
        this.dado = dado;
        this.noPai = null;
        this.noFilhoEsquerdo = null;
        this.noFilhoDireito = null;
    }

    public String getDado() {
        return dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }

    public No getNoPai() {
        return noPai;
    }

    public void setNoPai(No noPai) {
        this.noPai = noPai;
    }

    public No getNoFilhoEsquerdo() {
        return noFilhoEsquerdo;
    }

    public void setNoFilhoEsquerdo(No noFilhoEsquerdo) {
        this.noFilhoEsquerdo = noFilhoEsquerdo;
    }

    public No getNoFilhoDireito() {
        return noFilhoDireito;
    }

    public void setNoFilhoDireito(No noFilhoDireito) {
        this.noFilhoDireito = noFilhoDireito;
    }

    public boolean podeSerNoRaiz() {
        boolean condicao = this.getNoPai() == null;

        return condicao;
    }

    public boolean temAlgumNoFilho() {
        boolean condicao = this.getNoFilhoEsquerdo() != null || this.getNoFilhoDireito() != null;

        return condicao;
    }

    public boolean ehNoInterno() {
        boolean condicao = this.temAlgumNoFilho();

        return condicao;
    }

    public boolean ehNoExterno() {
        boolean condicao = !this.temAlgumNoFilho();

        return condicao;
    }

    public String toString() {
        String dado = this.getDado();
        int largura = dado.length() + 4;
        String retorno = null;

        retorno = "+" + "-".repeat(largura - 2) + "+\n";
        retorno += "| " + dado + " |\n";
        retorno += "+" + "-".repeat(largura - 2) + "+\n";

        return retorno;
    }
}