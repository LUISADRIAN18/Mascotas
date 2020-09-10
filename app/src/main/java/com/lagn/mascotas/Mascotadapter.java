package com.lagn.mascotas;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lagn.mascotas.db.ConstructorMascotas;

import java.util.ArrayList;

public class Mascotadapter extends RecyclerView.Adapter<Mascotadapter.razasholder> {

    ArrayList<Razas> razas;
    Activity activity;


    public Mascotadapter(ArrayList<Razas> recibirazas,Activity activity) {
        this.razas = recibirazas;
        this.activity=activity;
    }

    @NonNull
    @Override
    public razasholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate
                (R.layout.activity_card_view,parent,false);
        return new razasholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final razasholder holder, int position) {
        final Razas rass = razas.get(position);
        holder.imgprro.setImageResource(rass.getFotoperro());
        holder.nombprrro.setText(rass.getRazaprro());
        holder.numerolikes.setText(String.valueOf(rass.getLikesdados()));


        holder.btlikes.setOnClickListener(new View.OnClickListener() {
            //int suma=0;

            @Override
            public void onClick(View view) {
                //suma=suma+1;
                //holder.numerolikes.setText(suma+"");

                ConstructorMascotas constructorMascotas = new ConstructorMascotas(activity);
                constructorMascotas.darLike(rass);
                holder.numerolikes.setText(constructorMascotas.obternerLike(rass));

            }
        });
    }

    @Override
    public int getItemCount() {
        return razas.size();
    }

    public static class razasholder extends RecyclerView.ViewHolder {
        private ImageView imgprro;
        private TextView nombprrro;
        private Button btlikes;
        private TextView numerolikes;



        public razasholder(@NonNull View itemView) {
            super(itemView);

            imgprro= (ImageView) itemView.findViewById(R.id.fotoraza);
            nombprrro= (TextView) itemView.findViewById(R.id.Nombremascotaid);
            btlikes= (Button) itemView.findViewById(R.id.botonlike);
            numerolikes= (TextView) itemView.findViewById(R.id.likestxt);



        }
    }


}
