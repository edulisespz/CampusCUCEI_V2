package cuceimovile.campuscucei_v2;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import java.io.IOException;
import java.io.InputStream;

import cuceimovile.campuscucei_v2.AndroidAR.activity.Demo;

public class Activity_two_modulos extends AppCompatActivity {




    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_modulos);

        setTitle("Modulos");


        loadListView();
        RegisterClic();


    }



    public void loadListView(){
        String[] listaMod = {"Modulo A","Modulo AB","Modulo D","Modulo E","Modulo F","Modulo G","Modulo H","Modulo I","Modulo J"
                ,"Modulo K","Modulo L","Modulo M","Modulo N","Modulo O","Modulo Otro","Modulo P"
                ,"Modulo Q","Modulo R","Modulo S","Modulo T","Modulo U","Modulo V","Modulo W","Modulo X","Modulo Z"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.modulos_list_item,listaMod);

        ListView lista= (ListView) findViewById(R.id.listViewModulos);

        lista.setAdapter(adapter);
    }

    private void RegisterClic() {
        ListView lista = (ListView) findViewById(R.id.listViewModulos);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView text = (TextView) view;

                //selectModulo( position );// Position starts in 0

                Intent intent = new Intent(getApplicationContext(), ModulosView.class);
                intent.putExtra("IDnumModulo",position);
                startActivity(intent);
            }
        });
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
