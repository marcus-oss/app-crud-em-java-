package projeto.aula01.appinterfaces;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Cliente objCliente;
    Produtos objProduto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objCliente = new Cliente();
        objProduto = new Produtos();

        objProduto.setNome("Ssd");
        objProduto.incluir();
        objProduto.alterar();

        objCliente.setNome("Vinicius");
        objCliente.setEmail("teste@gmail");

        objCliente.incluir();
        objCliente.alterar();


    }
}