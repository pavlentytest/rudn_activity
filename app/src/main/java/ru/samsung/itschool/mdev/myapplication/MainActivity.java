package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    // Инициализация активности
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("DDD","onCreate()");
    }

    // Вызывается, когда сама активность стала видимой
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("DDD","onStart()");
    }

    // Возобновление обновления UI
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("DDD","onResume()");
    }

    // Освобождение ресурсов, потоки, соединения с БД
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("DDD","onDestroy()");
    }
    // Приостановка обновления UI (активность не на переднем плане)
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("DDD","onStop()");
    }
    // Перезапуск активности
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("DDD","onRestart()");
    }

    // Вызывается перед выходом из активного состояния
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("DDD","onPause()");
    }


}