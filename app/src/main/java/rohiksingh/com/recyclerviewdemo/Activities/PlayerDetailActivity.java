package rohiksingh.com.recyclerviewdemo.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import rohiksingh.com.recyclerviewdemo.Models.Player;
import rohiksingh.com.recyclerviewdemo.R;
import rohiksingh.com.recyclerviewdemo.Utilities.AppUtility;

public class PlayerDetailActivity extends AppCompatActivity{

    private TextView name;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        name = (TextView)findViewById(R.id.name);
        Player person = (Player) getIntent().getSerializableExtra(AppUtility.NAME);
        name.setText(person.getName());

    }




}
