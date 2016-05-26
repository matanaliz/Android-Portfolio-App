package com.udacity.matanaliz.portfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private Toast createCustomToast(String text) {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout,
                (ViewGroup) findViewById(R.id.toast_layout_root));

        TextView textView = (TextView) layout.findViewById(R.id.text);
        textView.setText(text);

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.setView(layout);

        return toast;
    }

    public void runPopularMoviesApp(View view) {
        Toast toast = createCustomToast("Popular Movies app should start!");
        toast.show();
    }

    public void runStockHawkApp(View view) {
        Toast toast = createCustomToast("Stock Hawk app should start!");
        toast.show();
    }

    public void runBuildItBiggerApp(View view) {
        Toast toast = createCustomToast("Build It Bigger app should start!");
        toast.show();
    }

    public void runMakeYourAppMaterialApp(View view) {
        Toast toast = createCustomToast("Make Your App Material app should start!");
        toast.show();
    }

    public void runGoUbiquitousApp(View view) {
        Toast toast = createCustomToast("Go Ubiquitous app should start!");
        toast.show();
    }

    public void runCapstoneApp(View view) {
        Toast toast = createCustomToast("Capstone app should start!");
        toast.show();
    }
}
