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
                //action pending

            }
        });

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
                case 2:
                    webView.loadUrl("file:///android_asset/moduloD.html");
                    break;
                case 3:
                    webView.loadUrl("file:///android_asset/moduloE.html");
                    break;
                case 4:
                    webView.loadUrl("file:///android_asset/moduloF.html");
                    break;
                case 5:
                    webView.loadUrl("file:///android_asset/moduloG.html");
                    break;
                case 6:
                    webView.loadUrl("file:///android_asset/moduloH.html");
                    break;
                case 7:
                    webView.loadUrl("file:///android_asset/moduloI.html");
                    break;
                case 8:
                    webView.loadUrl("file:///android_asset/moduloJ.html");
                    break;
                case 9:
                    webView.loadUrl("file:///android_asset/moduloK.html");
                    break;
                case 10:
                    webView.loadUrl("file:///android_asset/moduloL.html");
                    break;
                case 11:
                    webView.loadUrl("file:///android_asset/moduloM.html");
                    break;
                case 12:
                    webView.loadUrl("file:///android_asset/moduloN.html");
                    break;
                case 13:
                    webView.loadUrl("file:///android_asset/moduloO.html");
                    break;
                case 14:
                    webView.loadUrl("file:///android_asset/moduloOtro.html");
                    break;
                case 15:
                    webView.loadUrl("file:///android_asset/moduloP.html");
                    break;
                case 16:
                    webView.loadUrl("file:///android_asset/moduloQ.html");
                    break;
                case 17:
                    webView.loadUrl("file:///android_asset/moduloR.html");
                    break;
                case 18:
                    webView.loadUrl("file:///android_asset/moduloS.html");
                    break;
                case 19:
                    webView.loadUrl("file:///android_asset/moduloT.html");
                    break;
                case 20:
                    webView.loadUrl("file:///android_asset/moduloU.html");
                    break;
                case 21:
                    webView.loadUrl("file:///android_asset/moduloV.html");
                    break;
                case 22:
                    webView.loadUrl("file:///android_asset/moduloW.html");
                    break;
                case 23:
                    webView.loadUrl("file:///android_asset/moduloX.html");
                    break;
                case 24:
                    webView.loadUrl("file:///android_asset/moduloZ.html");
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
