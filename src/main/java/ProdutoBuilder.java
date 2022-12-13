import java.time.LocalDate;
import java.util.Objects;

public class ProdutoBuilder {
    private long id;
    private String titulo;
    private String descricao;
    private String marca;
    private String modelo;
    private int estoque;
    private double preco;
    private LocalDate dataCadastro;
    private LocalDate dataUltimaAtualizacao;
    private String urlFoto;
    private String categoria;
    private double peso;
    private double altura;
    private double largura;
    private double profundidade;

    public ProdutoBuilder id(long id) {
        this.id = id;
        return this;
    }

    public ProdutoBuilder titulo(String titulo) {
        this.titulo = Objects.requireNonNull(titulo);
        return this;
    }

    public ProdutoBuilder descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public ProdutoBuilder marca(String marca) {
        this.marca = marca;
        return this;
    }

    public ProdutoBuilder modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public ProdutoBuilder estoque(int estoque) {
        this.estoque = estoque;
        return this;
    }

    public ProdutoBuilder preco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("preco deve ser maior que zero");
        }

        this.preco = preco;
        return this;
    }

    public ProdutoBuilder dataCadastro(LocalDate dataCadastro) {
        if (dataCadastro.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("dataCadastro não pode estar no passado");
        }

        this.dataCadastro = dataCadastro;
        return this;
    }

    public ProdutoBuilder dataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        if (dataUltimaAtualizacao.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("dataUltimaAtualizacao não pode estar no passado");
        }

        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        return this;
    }

    public ProdutoBuilder urlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
        return this;
    }

    public ProdutoBuilder categoria(String categoria) {
        this.categoria = Objects.requireNonNull(categoria);
        return this;
    }

    public ProdutoBuilder peso(double peso) {
        this.peso = peso;
        return this;
    }

    public ProdutoBuilder altura(double altura) {
        this.altura = altura;
        return this;
    }

    public ProdutoBuilder largura(double largura) {
        this.largura = largura;
        return this;
    }

    public ProdutoBuilder profundidade(double profundidade) {
        this.profundidade = profundidade;
        return this;
    }

    public Produto build() {
        return new Produto(id, titulo, descricao, marca, modelo, estoque, preco, dataCadastro, dataUltimaAtualizacao, urlFoto, categoria, peso, altura, largura, profundidade);
    }
}