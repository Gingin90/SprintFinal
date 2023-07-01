package com.example.sprintfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.sprintfinal.databinding.ActivitySecondBinding;


public class SecondActivity extends AppCompatActivity {
    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        initListener();

    }

    private void initListener() {

        binding.buttonLinkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String linkedInUrl = "https://www.linkedin.com/in/ginger-cea-zamora/";
                Uri uri = Uri.parse(linkedInUrl);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        binding.buttonWhatsApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View buttonLinkedin) {
                String numeroTelefono = "+56989147834";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + numeroTelefono));
                startActivity(intent);

            }
        });
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "enviar sus preguntas al correo", Toast.LENGTH_SHORT).show();

            }
        });

         //Creacion del llamado con metodo intent explicito
        binding.buttonMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = binding.editTextMensaje.getText().toString();
                String[]correos={"gingercea@gmail.com"};
                // crear metodo de envio de correo

                composeEmail("gingercea@gmail.com","Contacto al mail",message);


               // Intent implicitInter = new Intent(Intent., Uri.parse("gingercea@gmail"));

            }


        });

    }

    // Creación de método con intent implícito para enviar correo electrónico.
    public void composeEmail(String address, String subject,String message) {
        Intent implicitIntentEmail = new Intent(Intent.ACTION_SENDTO); // se utilizo send no me dio opcion me llevo a outlock y con sendTO me da las diferentes opciones para correo
        implicitIntentEmail.setType("text/plain");
        implicitIntentEmail.setData(Uri.parse("mailto:"));
        implicitIntentEmail.putExtra(Intent.EXTRA_EMAIL, address);
        implicitIntentEmail.putExtra(Intent.EXTRA_SUBJECT, subject);
        implicitIntentEmail.putExtra(Intent.EXTRA_TEXT, message);
        startActivity(Intent.createChooser(implicitIntentEmail, "Enviando..."));
        finish();


    }
}