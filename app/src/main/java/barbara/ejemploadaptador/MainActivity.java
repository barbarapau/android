package barbara.ejemploadaptador;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private ArrayList<persona>listado=new ArrayList<>();
    private ListView list;
    private Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list=(ListView)findViewById(R.id.listView);

        persona p1=new persona("Luisa","Garcia",954852595);
        persona p2=new persona("Tomas","Sanz",66666666);
        persona p3=new persona("Maria","Valencia",984852595);
        listado.add(p1);
        listado.add(p2);
        listado.add(p3);

        adaptador=new Adaptador(listado,this);
        list.setAdapter(adaptador);



    }
}
