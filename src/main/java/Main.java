import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Produto produto = new ProdutoBuilder()
                .id(1)
                .titulo("Produto 1")
                .descricao("Descrição do Produto 1")
                .marca("Marca 1")
                .modelo("Modelo 1")
                .estoque(1)
                .preco(1.)
                .dataCadastro(LocalDate.now())
                .dataUltimaAtualizacao(LocalDate.now())
                .urlFoto("https://example.com/produto1.png")
                .categoria("Categoria 1")
                .peso(0.)
                .altura(0.)
                .largura(0.)
                .profundidade(0.)
                .build();

        System.out.println(produto);
    }
}
