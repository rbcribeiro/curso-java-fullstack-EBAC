package objeto;

/**
 * A classe Carro representa um veículo do mundo real.
 * Esta classe inclui propriedades como marca, modelo, ano e cor,
 * bem como métodos para interagir com essas propriedades.
 */
public class Carro {
    // Propriedades do carro
    private String marca;
    private String modelo;
    private int ano;
    private String cor;

    // Construtor
    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    // Método para exibir informações do carro
    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    // Métodos getters e setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public static void main(String[] args) {
        // Criando um objeto Carro
        Carro meuCarro = new Carro("Toyota", "Corolla", 2020, "Prata");

        // Exibindo informações do carro
        meuCarro.exibirInfo();
    }
}
