package com.example.appcrypto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bnb(View view) {
        Toast.makeText(this, "BNB", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,SplashCrypto.class);
        intent.putExtra("name","BNB");
        startActivity(intent);
    }

    public void xml(View view) {
        Toast.makeText(this, "XLM", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,SplashCrypto.class);
        intent.putExtra("name","XLM");
        startActivity(intent);
    }

    public void avax(View view) {
        Toast.makeText(this, "AVAX", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,SplashCrypto.class);
        intent.putExtra("name","AVAX");
        startActivity(intent);
    }

    public void atom(View view) {
        Toast.makeText(this, "ATOM", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,SplashCrypto.class);
        intent.putExtra("name","ATOM");
        startActivity(intent);
    }

    public void ada(View view) {
        Toast.makeText(this, "ADA", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,SplashCrypto.class);
        intent.putExtra("name","ADA");
        startActivity(intent);
    }

    public void xtz(View view) {
        Toast.makeText(this, "XTZ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,SplashCrypto.class);
        intent.putExtra("name","XTZ");
        startActivity(intent);
    }

    public void btc(View view) {
        Toast.makeText(this, "BTC", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,SplashCrypto.class);
        intent.putExtra("name","BTC");
        startActivity(intent);
    }

    public void eth(View view) {
        Toast.makeText(this, "ETH", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,SplashCrypto.class);
        intent.putExtra("name","ETH");
        startActivity(intent);
    }

    public void eos(View view) {
        Toast.makeText(this, "EOS", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,SplashCrypto.class);
        intent.putExtra("name","EOS");
        startActivity(intent);
    }

    public void rune(View view) {
        Toast.makeText(this, "RUNE", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,SplashCrypto.class);
        intent.putExtra("name","RUNE");
        startActivity(intent);
    }

    public void cro(View view) {
        Intent intent = new Intent(this,Web.class);
        intent.putExtra("SitioWeb", "https://crypto.com/exchange");
        startActivity(intent);
    }

    /*
    public void binance(View view) {
        Intent intent = new Intent(this,Web.class);
        intent.putExtra("SitioWeb", "https://www.binance.com/es-LA");
        startActivity(intent);
    }*/

    public void binance(View view) {
        Intent intent = getPackageManager().getLaunchIntentForPackage("com.twitter.android");
        startActivity(intent);
    }
}