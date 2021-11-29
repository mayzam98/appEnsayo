package com.example.appensayo.ui.gallery;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appensayo.R;
import com.example.appensayo.TerminosCondiciones;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GalleryFragment extends Fragment {


    private String productos = "[{\"nombre\":\"Guantes\",\"categoria\":\"Futbol\",\"precio\":40000,\"enStok\":true,\"sucursal\":[{\"nombre\":\"Sucursal A\",\"direccion\":\"Direccion A\",\"encargado\":{\"nombre\":\"Encargado sucu A\",\"telefono\":\"3333333333\"}},{\"nombre\":\"Sucursal B\",\"direccion\":\"Direccion B\",\"encargado\":{\"nombre\":\"Encargado sucu B\",\"telefono\":\"3333333333\"}}]},{\"nombre\":\"Guantes\",\"categoria\":\"Futbol\",\"precio\":40000,\"enStok\":true,\"sucursal\":[{\"nombre\":\"Sucursal A\",\"direccion\":\"Direccion A\",\"encargado\":{\"nombre\":\"Encargado sucu A\",\"telefono\":\"3333333333\"}},{\"nombre\":\"Sucursal B\",\"direccion\":\"Direccion B\",\"encargado\":{\"nombre\":\"Encargado sucu B\",\"telefono\":\"3333333333\"}}]},{\"nombre\":\"Guantes\",\"categoria\":\"Futbol\",\"precio\":40000,\"enStok\":true,\"sucursal\":[{\"nombre\":\"Sucursal A\",\"direccion\":\"Direccion A\",\"encargado\":{\"nombre\":\"Encargado sucu A\",\"telefono\":\"3333333333\"}},{\"nombre\":\"Sucursal B\",\"direccion\":\"Direccion B\",\"encargado\":{\"nombre\":\"Encargado sucu B\",\"telefono\":\"3333333333\"}}]},{\"nombre\":\"Guantes\",\"categoria\":\"Futbol\",\"precio\":40000,\"enStok\":true,\"sucursal\":[{\"nombre\":\"Sucursal A\",\"direccion\":\"Direccion A\",\"encargado\":{\"nombre\":\"Encargado sucu A\",\"telefono\":\"3333333333\"}},{\"nombre\":\"Sucursal B\",\"direccion\":\"Direccion B\",\"encargado\":{\"nombre\":\"Encargado sucu B\",\"telefono\":\"3333333333\"}}]},{\"nombre\":\"Guantes\",\"categoria\":\"Futbol\",\"precio\":40000,\"enStok\":true,\"sucursal\":[{\"nombre\":\"Sucursal A\",\"direccion\":\"Direccion A\",\"encargado\":{\"nombre\":\"Encargado sucu A\",\"telefono\":\"3333333333\"}},{\"nombre\":\"Sucursal B\",\"direccion\":\"Direccion B\",\"encargado\":{\"nombre\":\"Encargado sucu B\",\"telefono\":\"3333333333\"}}]},{\"nombre\":\"Guantes\",\"categoria\":\"Futbol\",\"precio\":40000,\"enStok\":true,\"sucursal\":[{\"nombre\":\"Sucursal A\",\"direccion\":\"Direccion A\",\"encargado\":{\"nombre\":\"Encargado sucu A\",\"telefono\":\"3333333333\"}},{\"nombre\":\"Sucursal B\",\"direccion\":\"Direccion B\",\"encargado\":{\"nombre\":\"Encargado sucu B\",\"telefono\":\"3333333333\"}}]},{\"nombre\":\"Guantes\",\"categoria\":\"Futbol\",\"precio\":40000,\"enStok\":true,\"sucursal\":[{\"nombre\":\"Sucursal A\",\"direccion\":\"Direccion A\",\"encargado\":{\"nombre\":\"Encargado sucu A\",\"telefono\":\"3333333333\"}},{\"nombre\":\"Sucursal B\",\"direccion\":\"Direccion B\",\"encargado\":{\"nombre\":\"Encargado sucu B\",\"telefono\":\"3333333333\"}}]},{\"nombre\":\"Guantes\",\"categoria\":\"Futbol\",\"precio\":40000,\"enStok\":true,\"sucursal\":[{\"nombre\":\"Sucursal A\",\"direccion\":\"Direccion A\",\"encargado\":{\"nombre\":\"Encargado sucu A\",\"telefono\":\"3333333333\"}},{\"nombre\":\"Sucursal B\",\"direccion\":\"Direccion B\",\"encargado\":{\"nombre\":\"Encargado sucu B\",\"telefono\":\"3333333333\"}}]},{\"nombre\":\"Guantes\",\"categoria\":\"Futbol\",\"precio\":40000,\"enStok\":true,\"sucursal\":[{\"nombre\":\"Sucursal A\",\"direccion\":\"Direccion A\",\"encargado\":{\"nombre\":\"Encargado sucu A\",\"telefono\":\"3333333333\"}},{\"nombre\":\"Sucursal B\",\"direccion\":\"Direccion B\",\"encargado\":{\"nombre\":\"Encargado sucu B\",\"telefono\":\"3333333333\"}}]},{\"nombre\":\"Guantes\",\"categoria\":\"Futbol\",\"precio\":40000,\"enStok\":true,\"sucursal\":[{\"nombre\":\"Sucursal A\",\"direccion\":\"Direccion A\",\"encargado\":{\"nombre\":\"Encargado sucu A\",\"telefono\":\"3333333333\"}},{\"nombre\":\"Sucursal B\",\"direccion\":\"Direccion B\",\"encargado\":{\"nombre\":\"Encargado sucu B\",\"telefono\":\"3333333333\"}}]},{\"nombre\":\"Guantes\",\"categoria\":\"Futbol\",\"precio\":40000,\"enStok\":true,\"sucursal\":[{\"nombre\":\"Sucursal A\",\"direccion\":\"Direccion A\",\"encargado\":{\"nombre\":\"Encargado sucu A\",\"telefono\":\"3333333333\"}},{\"nombre\":\"Sucursal B\",\"direccion\":\"Direccion B\",\"encargado\":{\"nombre\":\"Encargado sucu B\",\"telefono\":\"3333333333\"}}]},{\"nombre\":\"Guantes\",\"categoria\":\"Futbol\",\"precio\":40000,\"enStok\":true,\"sucursal\":[{\"nombre\":\"Sucursal A\",\"direccion\":\"Direccion A\",\"encargado\":{\"nombre\":\"Encargado sucu A\",\"telefono\":\"3333333333\"}},{\"nombre\":\"Sucursal B\",\"direccion\":\"Direccion B\",\"encargado\":{\"nombre\":\"Encargado sucu B\",\"telefono\":\"3333333333\"}}]},{\"nombre\":\"Guantes\",\"categoria\":\"Futbol\",\"precio\":40000,\"enStok\":true,\"sucursal\":[{\"nombre\":\"Sucursal A\",\"direccion\":\"Direccion A\",\"encargado\":{\"nombre\":\"Encargado sucu A\",\"telefono\":\"3333333333\"}},{\"nombre\":\"Sucursal B\",\"direccion\":\"Direccion B\",\"encargado\":{\"nombre\":\"Encargado sucu B\",\"telefono\":\"3333333333\"}}]},{\"nombre\":\"Guantes\",\"categoria\":\"Futbol\",\"precio\":40000,\"enStok\":true,\"sucursal\":[{\"nombre\":\"Sucursal A\",\"direccion\":\"Direccion A\",\"encargado\":{\"nombre\":\"Encargado sucu A\",\"telefono\":\"3333333333\"}},{\"nombre\":\"Sucursal B\",\"direccion\":\"Direccion B\",\"encargado\":{\"nombre\":\"Encargado sucu B\",\"telefono\":\"3333333333\"}}]},{\"nombre\":\"Guantes\",\"categoria\":\"Futbol\",\"precio\":40000,\"enStok\":true,\"sucursal\":[{\"nombre\":\"Sucursal A\",\"direccion\":\"Direccion A\",\"encargado\":{\"nombre\":\"Encargado sucu A\",\"telefono\":\"3333333333\"}},{\"nombre\":\"Sucursal B\",\"direccion\":\"Direccion B\",\"encargado\":{\"nombre\":\"Encargado sucu B\",\"telefono\":\"3333333333\"}}]},{\"nombre\":\"Guantes\",\"categoria\":\"Futbol\",\"precio\":40000,\"enStok\":true,\"sucursal\":[{\"nombre\":\"Sucursal A\",\"direccion\":\"Direccion A\",\"encargado\":{\"nombre\":\"Encargado sucu A\",\"telefono\":\"3333333333\"}},{\"nombre\":\"Sucursal B\",\"direccion\":\"Direccion B\",\"encargado\":{\"nombre\":\"Encargado sucu B\",\"telefono\":\"3333333333\"}}]}]";
    private Spinner spn_categorias;
    private TextView text_galery;
    private RecyclerView rev_productos;

    private RecyclerView.Adapter miAdapter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_gallery, container, false);

        String[] categorias = new String[]{"Beisbol", "atletismo", "carate", "Salto triple"};

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_dropdown_item, categorias);


        spn_categorias = root.findViewById(R.id.spn_categorias);
        spn_categorias.setAdapter(adaptador);
        text_galery = root.findViewById(R.id.text_galery);
        rev_productos = root.findViewById(R.id.rev_productos);
        rev_productos.setLayoutManager(new LinearLayoutManager(getActivity()));
        //tev_item_name = root.findViewById(R.id.tev_item_name);

        try {
            JSONArray jsonProductos = new JSONArray(productos);

            miAdapter = new ProductosAdapter(jsonProductos,getActivity());
            rev_productos.setAdapter(miAdapter);

            JSONObject producto0 = jsonProductos.getJSONObject(0);
            String nombre = producto0.getString("nombre");
            JSONArray sucursal = producto0.getJSONArray("sucursal");
            JSONObject sucursal1 = sucursal.getJSONObject(1);
            String nombreSucursal1 = sucursal1.getString("nombre");


            Toast.makeText(getActivity(), nombre, Toast.LENGTH_SHORT).show();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        //rev_productos.setLayoutManager(new GridLayoutManager(getActivity(),2));


        spn_categorias.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String categoria = spn_categorias.getSelectedItem().toString();
                text_galery.setText(categoria);


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        return root;
    }
}


class ProductosAdapter extends RecyclerView.Adapter<ProductosAdapter.ViewHolder>{
    private JSONArray productos;
    private Activity miActividad;
    private TextView tev_item_name;



    public ProductosAdapter(JSONArray productos, Activity miActividad){
        this.productos = productos;
        this.miActividad = miActividad;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_productos, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        try{
            //Log.e("POSICION", "POS: "+position);
            String nombre = this.productos.getJSONObject(position).getString("nombre");
            String categoria = this.productos .getJSONObject(position).getString("categoria");
            String precio = this.productos.getJSONObject(position).getString("precio");


            holder.tev_item_name.setText(nombre);
            holder.tev_item_precio.setText(precio);
            holder.tev_item_categoria.setText(categoria);
        }catch (JSONException e) {
            e.printStackTrace();
        }

    }

    @Override
    public int getItemCount() {
        //Log.e("CANTIDAD PRODUCTOS","" + this.productos.length());
        return this.productos.length();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tev_item_name;
        private TextView tev_item_categoria;
        private TextView tev_item_precio;

        public ViewHolder(View v){
            super(v);
            tev_item_name = v.findViewById(R.id.tev_item_name);
            tev_item_categoria = v.findViewById(R.id.tev_item_categoria);
            tev_item_precio = v.findViewById(R.id.tev_item_precio);

        }
    }
}


