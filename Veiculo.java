package model;

public class Veiculo {
    private Integer id;
    private String marca;
    private String modelo;
    private String ano;
    private Double valorVenda;

    public Veiculo() {
        this.id = 0;
        this.marca = "";
        this.modelo = "";
        this.ano = "";
        this.valorVenda = 0.0;

    }

    public Veiculo(Integer id, String marca, String modelo, String ano, Double valorVenda) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valorVenda = valorVenda;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String printVeiculo() {
        return "Veiculo ID: " + this.id +
                "\nMarca: " + this.marca +
                "\nModelo: " + this.modelo +
                "\nAno: " + this.ano +
                "\nValor Venda: R$" + this.valorVenda;

    }
}
