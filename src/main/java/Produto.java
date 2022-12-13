import java.time.LocalDate;

public class Produto {
    private final long id;
    private final String titulo;
    private final String descricao;
    private final String marca;
    private final String modelo;
    private final int estoque;
    private final double preco;
    private final LocalDate dataCadastro;
    private final LocalDate dataUltimaAtualizacao;
    private final String urlFoto;
    private final String categoria;
    private final double peso;
    private final double altura;
    private final double largura;
    private final double profundidade;

    Produto(long id, String titulo, String descricao, String marca, String modelo, int estoque, double preco, LocalDate dataCadastro, LocalDate dataUltimaAtualizacao, String urlFoto, String categoria, double peso, double altura, double largura, double profundidade) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.marca = marca;
        this.modelo = modelo;
        this.estoque = estoque;
        this.preco = preco;
        this.dataCadastro = dataCadastro;
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        this.urlFoto = urlFoto;
        this.categoria = categoria;
        this.peso = peso;
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", estoque=" + estoque +
                ", preco=" + preco +
                ", dataCadastro=" + dataCadastro +
                ", dataUltimaAtualizacao=" + dataUltimaAtualizacao +
                ", urlFoto='" + urlFoto + '\'' +
                ", categoria='" + categoria + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", largura=" + largura +
                ", profundidade=" + profundidade +
                '}';
    }
}
