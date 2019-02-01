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
         ArrayList times = new ArrayList();
        times.add(new Pessoa(1,"Sao Paulo"));
        times.add(new Pessoa(2,"Atletico Go"));

        Intent it = new Intent(this, Tela2Activity.class);
        it.putExtra("times", times);
        it.putExtra("time", time.get(0));
        startActivity(it);

        Time time = (Time) getIntent().getSerializableExtra("time");
        ArrayList times2 = (ArrayList)
                getIntent().getSerializableExtra("times");
        System.out.println("Times: "+ time.getNome());
        System.out.println(
                "Times: "+ times.get(0).getNome());
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
    public class Time implements Serializable{
        int number;
        String equipo;

        public Time(int number, String equipo) {
            this.number = 0;
            this.equipo = "";
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getEquipo() {
            return equipo;
        }

        public void setEquipo(String equipo) {
            this.equipo = equipo;
        }

    }

}

