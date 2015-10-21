package cuceimovile.campuscucei_v2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;

public class ModulosView extends AppCompatActivity {

    WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modulos_view);

        int position=0;

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            position = extras.getInt("IDnumModulo");
        }

        selectModulo(position);
    }



    private void selectModulo(int PositionID) {
        webView = (WebView) findViewById(R.id.webView1);
        //webView.setVisibility(View.VISIBLE);
        String cad = Integer.toString(PositionID);



        Log.e("_", cad);

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
        getMenuInflater().inflate(R.menu.menu_modulos_view, menu);
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