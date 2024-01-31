package projeto.aula01.appinterfaces;

import android.util.Log;

public class Produtos implements Icrud {
    private static final String TAG = "Crud";
    private String nome;
    private String produto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    @Override
    public void incluir() {
        Log.i(TAG, "incluir: Produto");
    }

    @Override
    public void alterar() {
        Log.i(TAG, "alterar: Produto");
    }

    @Override
    public void deletar() {

        Log.i(TAG, "deletar: Produto");
    }

    @Override
    public void testar() {

    }
}
