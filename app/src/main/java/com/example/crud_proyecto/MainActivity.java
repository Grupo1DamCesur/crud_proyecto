package com.example.crud_proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button btnAlojamiento;
    private Button btnInformacion;
    private Button btnLuxury;
    private Button btnMonumento;
    private Button btnMuseo;
    private Button btnNaturaleza;
    private Button btnOtros;
    private Button btnPlaya;
    private Button btnRestaurante;
    private Button btnShopping;
    private Button btnTransporte;
    private Button btnExtra;

    private List<Button> buttonList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;
        float doubleBtnWidth = (float) (width/3.0);
        float doubleBtnHeight = (float) (height/4.65);
        int buttonHeight = (Integer)Math.round(doubleBtnHeight);
        int buttonWidth = (Integer)Math.round(doubleBtnWidth);

        btnAlojamiento = (Button)findViewById(R.id.idBtnAlojamiento);
        btnInformacion = (Button)findViewById(R.id.idBtnInfo);
        btnLuxury = (Button)findViewById(R.id.idBtnLuxury);
        btnMonumento = (Button) findViewById(R.id.idBtnMonumento);
        btnMuseo = (Button)findViewById(R.id.idBtnMuseo);
        btnNaturaleza = (Button)findViewById(R.id.idBtnnaturaleza);
        btnOtros = (Button)findViewById(R.id.idBtnOtros);
        btnPlaya = (Button)findViewById(R.id.idBtnPlaya);
        btnRestaurante = (Button)findViewById(R.id.idBtnRestaurante);
        btnShopping = (Button)findViewById(R.id.idBtnShopping);
        btnTransporte = (Button)findViewById(R.id.idBtnTransporte);
        btnExtra = (Button)findViewById(R.id.idBtnExtra);

        buttonList.add(btnAlojamiento);
        buttonList.add(btnInformacion);
        buttonList.add(btnLuxury);
        buttonList.add(btnMonumento);
        buttonList.add(btnMuseo);
        buttonList.add(btnNaturaleza);
        buttonList.add(btnOtros);
        buttonList.add(btnPlaya);
        buttonList.add(btnRestaurante);
        buttonList.add(btnShopping);
        buttonList.add(btnTransporte);
        buttonList.add(btnExtra);

        for(Button btn: buttonList){
            btn.setHeight(buttonHeight);
            btn.setWidth(buttonWidth);
        }




    }
}
