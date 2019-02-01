package listview.br.ufg.inf.listviewexample;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by Alunoinf_2 on 01/02/2019.
 */

public class TimesAdapter {
    protected final Context context;
    protected  final ArrayList<Times>  elementos ;

    public TimesAdapter(Context context, ArrayList<Times> elementos) {
        this.context = context;
        this.elementos = elementos;
    }

}
