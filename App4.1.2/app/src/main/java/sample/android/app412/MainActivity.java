package sample.android.app412;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("App511","onCreate");
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

    @Override
    public  void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.d("App511","onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("App511","onRestoreInstanceState");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("App511","onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("App511","onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("App511","onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("App511","onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("App511","onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("App511","onStop");
    }
}
