package rohiksingh.com.recyclerviewdemo.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import rohiksingh.com.recyclerviewdemo.Adapters.PlayerListAdapter;
import rohiksingh.com.recyclerviewdemo.Callbacks.PlayerListCallback;
import rohiksingh.com.recyclerviewdemo.Models.Player;
import rohiksingh.com.recyclerviewdemo.R;
import rohiksingh.com.recyclerviewdemo.Utilities.AppUtility;

public class PlayerListActivity extends AppCompatActivity implements PlayerListCallback {

    private RecyclerView rv;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        rv = (RecyclerView)findViewById(R.id.rv);
        adapter = new PlayerListAdapter(this, getDummyList());
        layoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);
    }


    private void openDetail(Player people){
        Intent intent = new Intent(this, PlayerDetailActivity.class);
        intent.putExtra(AppUtility.NAME, people);
        startActivity(intent);
    }

    @Override
    public void click(Player people) {
        openDetail(people);
    }


    private List<Player> getDummyList(){

        List<Player> players = new ArrayList<Player>();

        Player rohit = new Player();
        rohit.setName("Rohit Sharma");
        Player rahul = new Player();
        rahul.setName("KL Rahul");
        Player dhawan = new Player();
        dhawan.setName("Shikhar Dhawan");
        Player kohli = new Player();
        kohli.setName("Virat Kohli");
        Player dhoni = new Player();
        dhoni.setName("M.S Dhoni");
        Player pant = new Player();
        pant.setName("Rishabh Pant");
        Player jadhav = new Player();
        jadhav.setName("Kedar Jadhav");
        Player vijay = new Player();
        vijay.setName("VijayShankar");
        Player pandya = new Player();
        pandya.setName("Hardik Pandya");
        Player jadeja = new Player();
        jadeja.setName("Sir Ravindra Jadeja");
        Player bhuvi = new Player();
        bhuvi.setName("Bhuvaneshwar Kumar");


        players.add(rohit);
        players.add(rahul);
        players.add(dhawan);
        players.add(kohli);
        players.add(dhoni);
        players.add(pant);
        players.add(jadhav);
        players.add(vijay);
        players.add(pandya);
        players.add(jadeja);
        players.add(bhuvi);

        return players;
    }


}
