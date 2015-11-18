package com.diegobanol.exposicionweb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;


public class PostAdapter extends ArrayAdapter {

    // Atributos
    private static final String URL_BASE = "http://'ip_de_banol'/socialmedia";
    private static final String URL_JSON = "/social_media.json";
    private static final String TAG = "PostAdapter";

    List<Post> items;

    public PostAdapter(Context context) {
        super(context, 0);
        // Gestionar petición del archivo JSON
    }
    @Override
    //operador ternario
    public int getCount() {
        return items != null ? items.size() : 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        //Salvando la referencia del View de la fila
        View listItemView = convertView;

        //Comprobando si el View no existe
        if (null == convertView) {
            //Si no existe, entonces inflarlo
            listItemView = layoutInflater.inflate(
                    R.layout.post,
                    parent,
                    false);
            // Procesar item
        }
        return listItemView;
    }
}