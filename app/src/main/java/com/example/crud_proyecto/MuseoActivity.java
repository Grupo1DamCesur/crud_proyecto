package com.example.crud_proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.crud_proyecto.model.Museo;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MuseoActivity extends AppCompatActivity {
    private EditText editNombre, editTelefono,
            editWeb, editMail,
            editLatitude, editLongitude,
            editCiudad, editFotoUrl, editDescipcion;
    private Button insertar;

    private String nameIntent;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    public MuseoActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museo);
        nameIntent = getIntent().getStringExtra("nameIntent");
        this.setTitle(nameIntent);

        inicializarFirebase();

        editNombre = (EditText)findViewById(R.id.idEditNombre);
        editTelefono = (EditText)findViewById(R.id.idEditTelefono);
        editWeb = (EditText)findViewById(R.id.idEditWeb);
        editMail = (EditText)findViewById(R.id.idEditMail);
        editCiudad = (EditText)findViewById(R.id.idEditCiudad);
        editFotoUrl = (EditText)findViewById(R.id.idEditFotoUrl);
        editLatitude = (EditText)findViewById(R.id.idEditLatitud);
        editLongitude = (EditText)findViewById(R.id.idEditLongitud);
        editDescipcion = (EditText)findViewById(R.id.idEditDescripcion);

        insertar = (Button)findViewById(R.id.idBtnInsert);

        insertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = editNombre.getText().toString();
                String telefono = editTelefono.getText().toString();
                String web = editWeb.getText().toString();
                String mail = editMail.getText().toString();
                String ciudad = editCiudad.getText().toString();
                String fotoUrl = editFotoUrl.getText().toString();
                String latitude = editLatitude.getText().toString();
                String longitude = editLongitude.getText().toString();
                String descripcion = editDescipcion.getText().toString();

                if(nombre.equals("") || telefono.equals("")
                        || web.equals("") || mail.equals("")
                        || ciudad.equals("") || fotoUrl.equals("") ||
                        latitude.equals("") || longitude.equals("") ||
                        descripcion.equals("")){
                    if(nombre.equals("")){
                        editNombre.setError("Campo requerido");
                    }
                    if(web.equals("")){
                        editWeb.setError("Campo requerido");
                    }
                    if(mail.equals("")){
                        editMail.setError("Campo requerido");
                    }
                    if(ciudad.equals("")){
                        editCiudad.setError("Campo requerido");
                    }
                    if(fotoUrl.equals("")){
                        editFotoUrl.setError("Campo requerido");
                    }
                    if(latitude.equals("")){
                        editLatitude.setError("Campo requerido");
                    }
                    if(longitude.equals("")){
                        editLongitude.setError("Campo requerido");
                    }
                    if(telefono.equals("")){
                        editTelefono.setError("Campo requerido");
                    }
                    if(descripcion.equals("")){
                        editDescipcion.setError("Campo requerido");
                    }

                }else{
                    //Creamos el objeto de clase Museo
                    Museo m = new Museo();
                    m.setUid(UUID.randomUUID().toString());
                    m.setName(nombre);
                    m.setCiudad(ciudad);
                    m.setTelefono(telefono);
                    m.setMail(mail);
                    m.setWeb(web);
                    List<String> listFotos = new ArrayList<>();
                    listFotos.add(fotoUrl);
                    m.setFotoUrl(listFotos);
                    m.setLatitude(Double.parseDouble(latitude));
                    m.setLongitude(Double.parseDouble(longitude));
                    m.setDescripcion(descripcion);

                    databaseReference.child("Museo").child(m.getUid()).setValue(m);


                    //Limpiamos cajas de texto
                    Toast.makeText(v.getContext(), "Agregado", Toast.LENGTH_LONG).show();
                    editNombre.setText("");
                    editTelefono.setText("");
                    editWeb.setText("");
                    editMail.setText("");
                    editCiudad.setText("");
                    editFotoUrl.setText("");
                    editLatitude.setText("");
                    editLongitude.setText("");
                    editDescipcion.setText("");
                }
            }
        });
    }

    private void inicializarFirebase() {

        FirebaseApp.initializeApp(this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();

    }
}
