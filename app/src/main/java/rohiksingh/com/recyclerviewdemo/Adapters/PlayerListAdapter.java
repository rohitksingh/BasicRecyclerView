package rohiksingh.com.recyclerviewdemo.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import rohiksingh.com.recyclerviewdemo.Callbacks.PlayerListCallback;
import rohiksingh.com.recyclerviewdemo.Models.Player;
import rohiksingh.com.recyclerviewdemo.R;

public class PlayerListAdapter extends RecyclerView.Adapter<PlayerListAdapter.PeopleViewHolder> {

    private Context context;
    private List<Player> people;
    private PlayerListCallback callback;

    public PlayerListAdapter(Context context, List<Player> people){
        this.context =context;
        this.people = people;
        callback = (PlayerListCallback)context;
    }

    @NonNull
    @Override
    public PeopleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(context).inflate(R.layout.list_people_item, viewGroup, false);
        return new PeopleViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull PeopleViewHolder peopleViewHolder, int i) {

        final Player person = people.get(i);
        peopleViewHolder.name.setText(person.getName());
        peopleViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback.click(person);
            }
        });

    }

    @Override
    public int getItemCount() {
        return people.size();
    }


    public class PeopleViewHolder extends RecyclerView.ViewHolder{

        public TextView name;

        public PeopleViewHolder(@NonNull View itemView) {
            super(itemView);
            name = (TextView)itemView.findViewById(R.id.name);
        }
    }
}
