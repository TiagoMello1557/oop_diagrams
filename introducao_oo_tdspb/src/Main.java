public class Main {
    public static void main(String[] args) {
       var produto1 = new Produto(
               "Coca-Cola",
               5.0,
               "Refrigerante de cola",
               10);
        System.out.println(produto1.getNome() + "-" + produto1.getPreco());
        produto1.setPreco(10.0);
        var produto2 = new Produto(
                "Pepsi",
                4.0,
                "Refrigerante de cola",
                11);
        if(produto1 == produto2);

        var produto3 = new ProdutoFisico();
        produto3.setNome("Fanta");
    }
}