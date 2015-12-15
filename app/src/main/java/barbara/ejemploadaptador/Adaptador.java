package barbara.ejemploadaptador;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {

    //aqui siempre hay que seguir los mismos pasos
    private Context context;
    private ArrayList<persona> lista;
    private View fila;

    //aqui declaro dondo quiero que se muestren los datos
    private TextView txtNombre,txtApellido,txtTelefono;

    //constructor


    public Adaptador(ArrayList<persona> lista, Context context) {
        this.lista = lista;
        this.context = context;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //estructura
        fila=inflater.inflate(R.layout.activity_adaptador,null);
        txtNombre=(TextView)fila.findViewById(R.id.txtNombre);
        txtApellido=(TextView)fila.findViewById(R.id.txtApellido);
        txtTelefono=(TextView)fila.findViewById(R.id.txtTelefono);

        //indico los datos que hay que introducir en la estructura
        txtNombre.setText(lista.get(position).getNombre());
        txtApellido.setText(lista.get(position).getNombre());
        txtTelefono.setText(lista.get(position).getNombre());




        return fila;
    }




}
