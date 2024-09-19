import java.util.Objects;

public class ProdutoFisico extends Produto {
        private double peso;
        private boolean fragil;
        private double altura;
        private double largura;
        private double comprimento;

        public ProdutoFisico() {
        }

        public ProdutoFisico(String nome, double preco, String descricao, int quantidade, double peso, boolean fragil, double altura, double largura, double comprimento) {
            super(nome, preco, descricao, quantidade);
            this.peso = peso;
            this.fragil = fragil;
            this.altura = altura;
            this.largura = largura;
            this.comprimento = comprimento;
        }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isFragil() {
        return fragil;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProdutoFisico that = (ProdutoFisico) o;
        return Double.compare(getPeso(), that.getPeso()) == 0 && isFragil() == that.isFragil() && Double.compare(getAltura(), that.getAltura()) == 0 && Double.compare(getLargura(), that.getLargura()) == 0 && Double.compare(getComprimento(), that.getComprimento()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPeso(), isFragil(), getAltura(), getLargura(), getComprimento());
    }

    @Override
    public String toString() {
        return "ProdutoFisico{" +
                "largura=" + largura +
                ", peso=" + peso +
                ", fragil=" + fragil +
                ", altura=" + altura +
                ", comprimento=" + comprimento +
                "} " + super.toString();
    }
}
