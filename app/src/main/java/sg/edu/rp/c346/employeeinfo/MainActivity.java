package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmploy;
    ArrayList<EmployItem> alEmploy;
    CustomAdapter caEmploy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmploy = findViewById(R.id.listViewEmployee);

        alEmploy = new ArrayList<>();

        EmployItem item1 = new EmployItem("John", "Software Technical Leader", 3400.0f);
        EmployItem item2 = new EmployItem("May", "Programmer", 2200.0f);

        alEmploy.add(item1);
        alEmploy.add(item2);
        alEmploy.add(item1);
        alEmploy.add(item2);
        alEmploy.add(item1);
        alEmploy.add(item2);
        alEmploy.add(item1);
        alEmploy.add(item2);
        alEmploy.add(item1);
        alEmploy.add(item2);
        alEmploy.add(item1);
        alEmploy.add(item2);
        alEmploy.add(item1);
        alEmploy.add(item2);
        alEmploy.add(item1);
        alEmploy.add(item2);
        alEmploy.add(item1);
        alEmploy.add(item2);
        alEmploy.add(item1);
        alEmploy.add(item2);
        alEmploy.add(item1);
        alEmploy.add(item2);
        alEmploy.add(item1);
        alEmploy.add(item2);



        caEmploy = new CustomAdapter(this, R.layout.employ_item, alEmploy);

        lvEmploy.setAdapter(caEmploy);

    }
}
