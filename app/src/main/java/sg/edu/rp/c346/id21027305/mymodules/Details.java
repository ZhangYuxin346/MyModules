package sg.edu.rp.c346.id21027305.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    TextView ModuleCode;
    TextView ModuleName;
    TextView Year;
    TextView Sem;
    TextView Credit;
    TextView Venue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ModuleCode=findViewById(R.id.ModuleCode);
        ModuleName=findViewById(R.id.ModuleName);
        Year=findViewById((R.id.Year));
        Sem=findViewById(R.id.Sem);
        Credit=findViewById(R.id.Credit);
        Venue=findViewById(R.id.Venue);

        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("Code");
        String name = intentReceived.getStringExtra("Name");
        String year = intentReceived.getStringExtra("Year");
        String sem = intentReceived.getStringExtra("Sem");
        String credit = intentReceived.getStringExtra("Credit");
        String venue = intentReceived.getStringExtra("Venue");

        ModuleCode.setText(code);
        ModuleName.setText(name);
        Year.setText(year);
        Sem.setText(sem);
        Credit.setText(credit);
        Venue.setText(venue);

    }
}