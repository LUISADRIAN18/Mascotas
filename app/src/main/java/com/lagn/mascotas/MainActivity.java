package com.lagn.mascotas;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int pml=0;

    private Toolbar toolbar;
    private TabLayout tablita;
    private ViewPager viewPager;


    private Button likebt;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar tolbar=findViewById(R.id.miappbar);
        //setSupportActionBar(tolbar);
        toolbar=findViewById(R.id.tooolbarid);
        tablita=findViewById(R.id.tablyouId);
        viewPager=findViewById(R.id.viepaperID);
        setupviewpager();


     if (toolbar!=null){
         setSupportActionBar(toolbar);
     }

    }

    private ArrayList<Fragment> agregarFragmenst(){
        ArrayList<Fragment>fragments=new ArrayList<>();
        fragments.add(new Fragment1());
        fragments.add(new Fragment2());
        return fragments;

    }

    private void setupviewpager(){
    viewPager.setAdapter(new Pageadapterrclas(getSupportFragmentManager(),agregarFragmenst()));
    tablita.setupWithViewPager(viewPager);
    tablita.getTabAt(0).setIcon(R.drawable.home144);
    tablita.getTabAt(1).setIcon(R.drawable.dog96);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
      return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id= item.getItemId();

        if(id==R.id.estrella5){
            startActivity(new Intent(this,CardView.class));


        }else if(id==R.id.acercade){
            startActivity(new Intent(this,Acercade.class));

        }else if (id==R.id.contacto){
            startActivity(new Intent(this,pamtalla2.class));


        }
        return super.onOptionsItemSelected(item);
    }
}