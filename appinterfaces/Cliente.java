package projeto.aula01.appinterfaces;

import android.util.Log;

public class Cliente implements Icrud {
    private static final String TAG = "Crud";
    private String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void incluir() {

        Log.i(TAG, "incluir: Cliente");
    }

    @Override
    public void alterar() {
        Log.i(TAG, "alterar: o Cliente");

    }

    @Override
    public void deletar() {
        Log.i(TAG, "deletar: o Cliente");
    }

    @Override
    public void testar() {
        Log.i(TAG, "testar: Clientes");
    }
}
