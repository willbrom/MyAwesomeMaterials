package com.wilbrom.myawesomematerials;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    private static final int SELECTED_COLOR = R.color.colorSelected;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ((ImageView) findViewById(R.id.icn_1)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.icn_2)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.icn_3)).setOnClickListener(this);
        ((ImageView) findViewById(R.id.icn_4)).setOnClickListener(this);

        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        ArrayList<Integer> imgs = new ArrayList<>();
        imgs.add(R.drawable.ghostbuster);
        imgs.add(R.drawable.scorpion_boss);
        imgs.add(R.drawable.farm_boss);

        Adapter adapter = new Adapter(imgs);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View view) {
        int itemId = view.getId();
        switch (itemId) {
            case R.id.icn_1:
                clearSelection();
                ((ImageView) findViewById(R.id.icn_1)).setBackgroundColor(getResources().getColor(SELECTED_COLOR));
                break;
            case R.id.icn_2:
                clearSelection();
                ((ImageView) findViewById(R.id.icn_2)).setBackgroundColor(getResources().getColor(SELECTED_COLOR));
                break;
            case R.id.icn_3:
                clearSelection();
                ((ImageView) findViewById(R.id.icn_3)).setBackgroundColor(getResources().getColor(SELECTED_COLOR));
                break;
            case R.id.icn_4:
                clearSelection();
                ((ImageView) findViewById(R.id.icn_4)).setBackgroundColor(getResources().getColor(SELECTED_COLOR));
                break;
        }
    }

    private void clearSelection() {
        ((ImageView) findViewById(R.id.icn_1)).setBackgroundColor(getResources().getColor(R.color.colorDefault));
        ((ImageView) findViewById(R.id.icn_2)).setBackgroundColor(getResources().getColor(R.color.colorDefault));
        ((ImageView) findViewById(R.id.icn_3)).setBackgroundColor(getResources().getColor(R.color.colorDefault));
        ((ImageView) findViewById(R.id.icn_4)).setBackgroundColor(getResources().getColor(R.color.colorDefault));
    }

    public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

        private ArrayList<Integer> imgs;

        public Adapter(ArrayList<Integer> imgs) {
            this.imgs = imgs;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            View view = inflater.inflate(R.layout.item_layout, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.imageView.setImageResource(imgs.get(position));
        }

        @Override
        public int getItemCount() {
            return imgs.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {

            private ImageView imageView;

            public ViewHolder(View itemView) {
                super(itemView);

                imageView = (ImageView) itemView.findViewById(R.id.imageView2);
            }
        }
    }
}
