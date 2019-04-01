package com.example.tabbar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterRecycler extends RecyclerView.Adapter<AdapterRecycler.ViewHolder> {


    private List<ModalClass> modalClassList;

    public AdapterRecycler(List<ModalClass> modalClassList) {
        this.modalClassList = modalClassList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int resource = modalClassList.get(position).getImageRecourse();
        String title = modalClassList.get(position).getTitle();
        String body = modalClassList.get(position).getBody();

        holder.setData(resource, title, body);

    }

    @Override
    public int getItemCount() {
        return modalClassList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

       private ImageView imageView;
       private TextView title;
       private TextView body;
       public ViewHolder(@NonNull View itemView) {
           super(itemView);

           imageView = itemView.findViewById(R.id.imageView);
           title = itemView.findViewById(R.id.textView);
           body = itemView.findViewById(R.id.textView2);



       }
       private void setData(int resourse,String titleText,String bodyText){
           imageView.setImageResource(resourse);
           title.setText(titleText);
           body.setText(bodyText);
       }
   }
}


