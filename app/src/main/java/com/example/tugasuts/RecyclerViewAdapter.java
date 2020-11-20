package com.example.tugasuts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> fotoFilm = new ArrayList<>();
    private ArrayList<String> namaFilm = new ArrayList<>();
    private ArrayList<String> infoFilm = new ArrayList<>();
    private Context context;
    private Object Intent;


    public RecyclerViewAdapter(ArrayList<String> fotoFilm, ArrayList<String> namaFilm, ArrayList<String> infoFilm, Context context) {
        this.fotoFilm = fotoFilm;
        this.namaFilm = namaFilm;
        this.infoFilm = infoFilm;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_adapter, parent, false);
        ViewHolder holder  = new ViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Glide.with(context).asBitmap().load(fotoFilm.get(position)).into(holder.imageViewFotoFilm);

        holder.textViewNamaFilm.setText(namaFilm.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(context, namaFilm.get(position), Toast.LENGTH_LONG).show();

                Intent intent = new Intent(context, DetailActivity.class);

                intent.putExtra("foto_film", fotoFilm.get(position));
                intent.putExtra("nama_film", namaFilm.get(position));
                intent.putExtra("info_film", infoFilm.get(position));

                context.startActivity((android.content.Intent) Intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return namaFilm.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        CircleImageView imageViewFotoFilm;
        TextView textViewNamaFilm;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewFotoFilm = itemView.findViewById(R.id.imageViewFotoFilm);
            textViewNamaFilm = itemView.findViewById(R.id.textViewNamaFilm);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }
}
