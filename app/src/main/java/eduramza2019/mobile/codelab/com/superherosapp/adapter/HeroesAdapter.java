package eduramza2019.mobile.codelab.com.superherosapp.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import eduramza2019.mobile.codelab.com.superherosapp.R;

import java.util.List;

import eduramza2019.mobile.codelab.com.superherosapp.model.Hero;

public class HeroesAdapter extends RecyclerView.Adapter<HeroesAdapter.HeroViewHolder> {

    private List<Hero> heroList;
    private int rowLayout;
    private Context context;

    public static class HeroViewHolder extends RecyclerView.ViewHolder {
        LinearLayout linearLayout;
        ImageView imageView;
        TextView tvName, tvFullName, tvAlignment;

        public HeroViewHolder(View view){
            super(view);
            linearLayout = view.findViewById(R.id.heroes_layout);
            imageView = view.findViewById(R.id.im_hero);
            tvName = view.findViewById(R.id.tv_name);
            tvFullName = view.findViewById(R.id.tv_full_name);
            tvAlignment = view.findViewById(R.id.tv_alignment);
        }
    }

    public HeroesAdapter(List<Hero> heroList, int rowLayout, Context context){
        this.heroList = heroList;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @NonNull
    @Override
    public HeroesAdapter.HeroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new HeroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HeroesAdapter.HeroViewHolder holder, int pos) {
        Picasso.get().load(heroList.get(pos).getImage().getUrlImage()).resize(80, 80).centerCrop().into(holder.imageView);
        holder.tvName.setText(heroList.get(pos).getName());
        holder.tvFullName.setText(heroList.get(pos).getBiographies().getFullName());
        holder.tvAlignment.setText(heroList.get(pos).getBiographies().getAlignment());
    }

    @Override
    public int getItemCount() {
        if (!heroList.isEmpty()){
            return heroList.size();
        }
        return 0;
    }
}
