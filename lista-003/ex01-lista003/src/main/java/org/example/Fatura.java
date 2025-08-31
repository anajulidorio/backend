package org.example;

public class Fatura {
    private String numero;
    private String descricao;
    private Integer quantidade;
    private Double precoPorItem;

    public Fatura (String numero, String descricao, Integer quantidade, Double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;

        if (quantidade < 0) {
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
        }

        if (precoPorItem < 0) {
            this.precoPorItem = 0.0;
        } else {
            this.precoPorItem = precoPorItem;
        }
    }
        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade (int quantidade) {
            if (quantidade < 0) {
                this.quantidade = 0;
            } else {
                this.quantidade = quantidade;
            }
        }

        public Double getPrecoPorItem() {
            return precoPorItem;
        }

        public void setPrecoPorItem (Double precoPorItem) {
            if (precoPorItem < 0) {
                this.precoPorItem = 0.0;
            } else {
                this.precoPorItem = precoPorItem;
            }
        }

        public Double getTotalFatura() {
            return quantidade * precoPorItem;
        }
}
