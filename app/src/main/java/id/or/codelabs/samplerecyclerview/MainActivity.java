package id.or.codelabs.samplerecyclerview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

import id.or.codelabs.samplerecyclerview.Adapter.AdapterAnggota;
import id.or.codelabs.samplerecyclerview.Model.ModelAnggota;

public class MainActivity extends AppCompatActivity {
    private ArrayList<ModelAnggota> listAnggota = new ArrayList<ModelAnggota>();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerViewAnggota);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        daftarAnggota();
        AdapterAnggota adapterAnggota = new AdapterAnggota(listAnggota);
        recyclerView.setAdapter(adapterAnggota);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    private void daftarAnggota(){
        listAnggota.add(new ModelAnggota(R.drawable.friends_picture,"Bayu Firmawan Paoh","Apa aja"));
        listAnggota.add(new ModelAnggota(R.drawable.friends_picture,"Bayu Firmawan ke-2","Apa aja"));
        listAnggota.add(new ModelAnggota(R.drawable.friends_picture,"Bayu Firmawan ke-3","Apa aja"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
