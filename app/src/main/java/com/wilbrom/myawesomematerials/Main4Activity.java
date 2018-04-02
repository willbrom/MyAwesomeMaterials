package com.wilbrom.myawesomematerials;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        findViewById(R.id.home).setOnClickListener(this);
        findViewById(R.id.build).setOnClickListener(this);
        findViewById(R.id.work).setOnClickListener(this);
        findViewById(R.id.chat).setOnClickListener(this);
        findViewById(R.id.archive).setOnClickListener(this);

        ValueAnimator fadeAnimation = ObjectAnimator.ofFloat(findViewById(R.id.bot_linear), "alpha", 0f, 1f);
        fadeAnimation.setDuration(1000);
        fadeAnimation.start();

        fadeAnimation.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                setUpRecyclerView();
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
    }

    private void setUpRecyclerView() {
        ((RecyclerView) findViewById(R.id.recycler_shape))
                .setLayoutManager(new GridLayoutManager(this, 2, LinearLayoutManager.VERTICAL, false));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(R.drawable.shape_purple);
        list.add(R.drawable.shape_orange);
        list.add(R.drawable.shape_green);
        list.add(R.drawable.shape_amber);
        list.add(R.drawable.shape_brown);
        list.add(R.drawable.shape_blue);
        list.add(R.drawable.shape_indigo);
        list.add(R.drawable.shape_pink);
        list.add(R.drawable.shape_teal);

        ((RecyclerView) findViewById(R.id.recycler_shape))
                .setAdapter(new Adapter(list));

        ValueAnimator fadeAnimation = ObjectAnimator.ofFloat(findViewById(R.id.recycler_shape), "alpha", 0f, 1f);
        fadeAnimation.setDuration(600);
        fadeAnimation.start();
    }

    @Override
    public void onClick(View view) {
        int itemId = view.getId();

        resetIcons();

        switch (itemId) {
            case R.id.home:
                ((ImageView) findViewById(R.id.home)).setImageResource(R.drawable.ic_home_selected_24dp);

                // TODO: clean
//                ((View) findViewById(R.id.home_bar)).setBackgroundColor(getResources().getColor(R.color.icon_tint));

                // animate bar
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ObjectAnimator animator = ObjectAnimator
                            .ofArgb(((View) findViewById(R.id.home_bar)), "backgroundColor", Color.rgb(15, 165, 198));
                    animator.setInterpolator(new AccelerateInterpolator());
                    animator.setDuration(200);
                    animator.start();
                }

                break;
            case R.id.build:
                ((ImageView) findViewById(R.id.build)).setImageResource(R.drawable.ic_build_selected_24dp);

                // TODO: clean
//                ((View) findViewById(R.id.build_bar)).setBackgroundColor(getResources().getColor(R.color.icon_tint));

                // animate bar
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ObjectAnimator animator = ObjectAnimator
                            .ofArgb(((View) findViewById(R.id.build_bar)), "backgroundColor", Color.rgb(15, 165, 198));
                    animator.setInterpolator(new AccelerateInterpolator());
                    animator.setDuration(200);
                    animator.start();
                }

                break;
            case R.id.work:
                ((ImageView) findViewById(R.id.work)).setImageResource(R.drawable.ic_work_selected_24dp);

                // TODO: clean
//                ((View) findViewById(R.id.work_bar)).setBackgroundColor(getResources().getColor(R.color.icon_tint));

                // animate bar
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ObjectAnimator animator = ObjectAnimator
                            .ofArgb(((View) findViewById(R.id.work_bar)), "backgroundColor", Color.rgb(15, 165, 198));
                    animator.setInterpolator(new AccelerateInterpolator());
                    animator.setDuration(200);
                    animator.start();
                }

                break;
            case R.id.chat:
                ((ImageView) findViewById(R.id.chat)).setImageResource(R.drawable.ic_chat_selected_24dp);

                // TODO: clean
//                ((View) findViewById(R.id.chat_bar)).setBackgroundColor(getResources().getColor(R.color.icon_tint));

                // animate bar
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ObjectAnimator animator = ObjectAnimator
                            .ofArgb(((View) findViewById(R.id.chat_bar)), "backgroundColor", Color.rgb(15, 165, 198));
                    animator.setInterpolator(new AccelerateInterpolator());
                    animator.setDuration(200);
                    animator.start();
                }

                break;
            case R.id.archive:
                ((ImageView) findViewById(R.id.archive)).setImageResource(R.drawable.ic_unarchive_selected_24dp);

                // TODO: clean
//                ((View) findViewById(R.id.archive_bar)).setBackgroundColor(getResources().getColor(R.color.icon_tint));

                // animate bar
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ObjectAnimator animator = ObjectAnimator
                            .ofArgb(((View) findViewById(R.id.archive_bar)), "backgroundColor", Color.rgb(15, 165, 198));
                    animator.setInterpolator(new AccelerateInterpolator());
                    animator.setDuration(200);
                    animator.start();
                }

                break;
        }
    }

    private void resetIcons() {
        ((ImageView) findViewById(R.id.home)).setImageResource(R.drawable.ic_home_24dp);
        ((ImageView) findViewById(R.id.build)).setImageResource(R.drawable.ic_build_24dp);
        ((ImageView) findViewById(R.id.work)).setImageResource(R.drawable.ic_work_24dp);
        ((ImageView) findViewById(R.id.chat)).setImageResource(R.drawable.ic_chat_24dp);
        ((ImageView) findViewById(R.id.archive)).setImageResource(R.drawable.ic_unarchive_24dp);

        ((View) findViewById(R.id.home_bar)).setBackgroundColor(getResources().getColor(R.color.colorDefault));
        ((View) findViewById(R.id.build_bar)).setBackgroundColor(getResources().getColor(R.color.colorDefault));
        ((View) findViewById(R.id.work_bar)).setBackgroundColor(getResources().getColor(R.color.colorDefault));
        ((View) findViewById(R.id.chat_bar)).setBackgroundColor(getResources().getColor(R.color.colorDefault));
        ((View) findViewById(R.id.archive_bar)).setBackgroundColor(getResources().getColor(R.color.colorDefault));
    }

    public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

        private ArrayList<Integer> mList;

        public Adapter(ArrayList<Integer> list) {
            this.mList = list;
            notifyDataSetChanged();
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.shape_item_layout, parent, false));
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.mImageView.setImageResource(mList.get(position));
            holder.mTextView.setText("Food delivery");
        }

        @Override
        public int getItemCount() {
            return mList.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {

            private ImageView mImageView;
            private TextView mTextView;

            public ViewHolder(View itemView) {
                super(itemView);

                mImageView = (ImageView) itemView.findViewById(R.id.imageView3);
                mTextView = (TextView) itemView.findViewById(R.id.textView3);
            }
        }
    }
}
