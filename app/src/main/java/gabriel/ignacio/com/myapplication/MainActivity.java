package gabriel.ignacio.com.myapplication;

import android.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    TextView Message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("message", "onCreate() has executed...");
        Message = findViewById(R.id.tv);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("message", "onStart() has executed...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("message", "onResume() has executed...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("message", "onPause() has executed...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("message", "onStop() has executed...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("message", "onDestroy() has executed...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("message", "onRestart() has executed...");
    }

    public void showMessage(View button){
        Message.setText("...");
    }

    public void showMessagee(View button2){
        Toast toast = Toast.makeText(this, "...", Toast.LENGTH_LONG);
        toast.show();
    }
}
