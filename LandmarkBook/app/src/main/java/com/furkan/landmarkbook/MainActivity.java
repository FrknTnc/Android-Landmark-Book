package com.furkan.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.furkan.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    ArrayList<Landmark> landmarkArrayList;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkArrayList = new ArrayList<>();

        Landmark galata = new Landmark("Galata Tower", "Istanbul, TURKEY", R.drawable.galata, "The Galata Tower, or with the current official name Galata Kulesi Museum, is a tower in the Beyoğlu district of Istanbul, Turkey. It is named after the quarter in which it is located, Galata. Built as a watchtower at the highest point of the Walls of Galata, the tower is now an exhibition space and museum, and one of the symbols of Beyoğlu and Istanbul.");
        Landmark mevlana = new Landmark("Mevlana Museum", "Konya, TURKEY", R.drawable.mevlana, "The Mevlâna Museum, in Konya, Turkey, started life as the dervish lodge of the Mevlevi order, better known as the whirling dervishes. It houses the mausoleum of Jalal ad-Din Muhammad Rumi (Turkish: Celaleddin-i Rumi), a Persian Sufi mystic.");

        landmarkArrayList.add(galata);
        landmarkArrayList.add(mevlana);
        landmarkArrayList.add(galata);
        landmarkArrayList.add(mevlana);
        landmarkArrayList.add(galata);
        landmarkArrayList.add(mevlana);
        landmarkArrayList.add(galata);
        landmarkArrayList.add(mevlana);
        landmarkArrayList.add(galata);
        landmarkArrayList.add(mevlana);
        landmarkArrayList.add(galata);
        landmarkArrayList.add(mevlana);
        landmarkArrayList.add(galata);
        landmarkArrayList.add(mevlana);
        landmarkArrayList.add(galata);
        landmarkArrayList.add(mevlana);
        landmarkArrayList.add(galata);
        landmarkArrayList.add(mevlana);
        landmarkArrayList.add(galata);
        landmarkArrayList.add(mevlana);
        landmarkArrayList.add(galata);
        landmarkArrayList.add(mevlana);
        landmarkArrayList.add(galata);
        landmarkArrayList.add(mevlana);
        landmarkArrayList.add(galata);
        landmarkArrayList.add(mevlana);
        landmarkArrayList.add(galata);
        landmarkArrayList.add(mevlana);
        landmarkArrayList.add(galata);
        landmarkArrayList.add(mevlana);
        landmarkArrayList.add(galata);
        landmarkArrayList.add(mevlana);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdaptor landmarkAdaptor = new LandmarkAdaptor(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdaptor);

        /*

        ArrayAdapter arrayAdapter = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                    landmarkArrayList.stream().map(landmark -> landmark.name).collect(Collectors.toList())
            );
        }
        binding.listView.setAdapter(arrayAdapter);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("landmark", landmarkArrayList.get(i));
                startActivity(intent);
            }
        });

         */

    }
}