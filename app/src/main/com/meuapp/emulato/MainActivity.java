package com.meuapp.emulato;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Define o layout
        setContentView(R.layout.activity_main);
        
        // Configura para tela cheia (modo TV)
        hideSystemUI();
    }
    
    private void hideSystemUI() {
        // Habilita o modo "immersive" de tela cheia
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        WindowInsetsControllerCompat controller = 
            WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        
        if (controller != null) {
            controller.hide(WindowInsetsCompat.Type.systemBars());
            controller.setSystemBarsBehavior(
                WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
            );
        }
    }
}
