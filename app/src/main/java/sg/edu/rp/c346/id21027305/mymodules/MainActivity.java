package sg.edu.rp.c346.id21027305.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Mobile;
    TextView Web;
    TextView IT;
    TextView UiUx;
    TextView Software;
    //Button HomeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mobile=findViewById(R.id.mobile);
        Web=findViewById(R.id.web);
        IT=findViewById(R.id.IT);
        UiUx=findViewById(R.id.UiUx);
        Software=findViewById(R.id.software);
        //HomeButton=findViewById(R.id.Homebutton);

        Mobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, Details.class);
                intent.putExtra("Code", "Module Code: C346");
                intent.putExtra("Name", "Module Name: Android Programming");
                intent.putExtra("Year", "Academic Year: 2022");
                intent.putExtra("Sem", "Semester: 1");
                intent.putExtra("Credit", "Module Credit: 4");
                intent.putExtra("Venue", "Venue: E62E");
                startActivity(intent);


            }
        });
        Web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(MainActivity.this, Details.class);
                intent2.putExtra("Code", "Module Code: C203");
                intent2.putExtra("Name", "Module Name: Web App in Development in php");
                intent2.putExtra("Year", "Academic Year: 2022");
                intent2.putExtra("Sem", "Semester: 1");
                intent2.putExtra("Credit", "Module Credit: 4");
                intent2.putExtra("Venue", "Venue: W65H");
                startActivity(intent2);
            }
        });
        IT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(MainActivity.this, Details.class);
                intent3.putExtra("Code", "Module Code: C235");
                intent3.putExtra("Name", "Module Name: IT Security and Management");
                intent3.putExtra("Year", "Academic Year: 2022");
                intent3.putExtra("Sem", "Semester: 1");
                intent3.putExtra("Credit", "Module Credit: 4");
                intent3.putExtra("Venue", "Venue: E66A");
                startActivity(intent3);
            }
        });
        UiUx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4=new Intent(MainActivity.this, Details.class);
                intent4.putExtra("Code", "Module Code: C218");
                intent4.putExtra("Name", "Module Name: UI/UX Design for Apps");
                intent4.putExtra("Year", "Academic Year: 2022");
                intent4.putExtra("Sem", "Semester: 1");
                intent4.putExtra("Credit", "Module Credit: 4");
                intent4.putExtra("Venue", "Venue: E66B");
                startActivity(intent4);
            }
        });
        Software.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5=new Intent(MainActivity.this, Details.class);
                intent5.putExtra("Code", "Module Code: C206");
                intent5.putExtra("Name", "Module Name: Software Development Process");
                intent5.putExtra("Year", "Academic Year: 2022");
                intent5.putExtra("Sem", "Semester: 1");
                intent5.putExtra("Credit", "Module Credit: 4");
                intent5.putExtra("Venue", "Venue: E66K");
                startActivity(intent5);
            }
        });
    }
}