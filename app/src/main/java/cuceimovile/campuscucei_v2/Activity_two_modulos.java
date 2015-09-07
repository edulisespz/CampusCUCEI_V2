package cuceimovile.campuscucei_v2;

import android.app.ProgressDialog;
import android.content.Context;
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

public class Activity_two_modulos extends AppCompatActivity {

    Button boton1;

    WebView webView;
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_modulos);


        boton1 = (Button) findViewById(R.id.button1 );

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        loadListView();
        RegisterClic();


    }



    public void loadListView(){
        String[] listaMod = {"Modulo A","Modulo B"};

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

                selectModulo( position );// Position starts in 0
            }
        });
    }

    private void selectModulo(int PositionID) {
        webView = (WebView) findViewById(R.id.webView1);
        //webView.setVisibility(View.VISIBLE);
        String cad = Integer.toString(PositionID);

        Log.e("_",cad);

            switch (PositionID){
                case 0:

                    webView.loadUrl("file:///android_asset/moduloA.html");

                    break;
                case 1:
                    webView.loadUrl("file:///android_asset/moduloAB.html");
                    break;

            }





    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity_principal, menu);


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
