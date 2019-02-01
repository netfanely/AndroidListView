package helloandroid.br.ufg.inf.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView lista = (ListView) findViewById(R.id.lstEquipes);
        final ArrayList<String> equipes = prencheDados();       //adaptador
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, equipes);
        lista.setAdapter(arrayAdapter);
        //se referencio a lista y tem un vinculo con Equipe
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            //cuando clicar sobrepoe
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               // Log.i("TAG", "usuario clicou no item:" + lista.getItemAtPosition(position).toString());
                   Toast.makeText(getApplicationContext(),"voce clicou em:"+ equipes.get(position),Toast.LENGTH_LONG).show();
            }
        });
    }
    private ArrayList<String> prencheDados(){
        //la lista pronta
            ArrayList<String> dados = new ArrayList<String>();
            dados.add("Sao Paulo");
            dados.add("Atletico Goianiense");
            dados.add("Goias");
            dados.add("Vila Nova");
            dados.add("Flamengo");
            dados.add("Santos");
            dados.add("Palmeiras");
            dados.add("Cruzeiro");
            dados.add("Vitoria");
            dados.add("Bahia");
        return dados;
    }
}

