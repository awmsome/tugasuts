package com.example.tugasuts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView imageViewFotoFilm;
    TextView textViewNamaFilm, textViewInfoFilm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageViewFotoFilm = findViewById(R.id.imageViewFotoFilm);
        textViewNamaFilm = findViewById(R.id.textViewNamaFilm);
        textViewInfoFilm = findViewById(R.id.textViewInfoFilm);

        getIncomingExtra();

}

    private void getIncomingExtra() {

        if(getIntent().hasExtra("foto_film") && getIntent().hasExtra("nama_film") && getIntent().hasExtra("info_film")){

            String fotoFilm = getIntent().getStringExtra("foto_film");
            String namaFilm = getIntent().getStringExtra("nama_film");
            String infoFilm = getIntent().getStringExtra("info_film");

            setDataActivity(fotoFilm, namaFilm, infoFilm);
        }
    }

    private void setDataActivity(String fotoFilm, String namaFilm, String infoFilm) {

        Glide.with(this).asBitmap().load(fotoFilm).into(imageViewFotoFilm);

        textViewNamaFilm.setText(namaFilm);
        textViewInfoFilm.setText(infoFilm);
    }
}