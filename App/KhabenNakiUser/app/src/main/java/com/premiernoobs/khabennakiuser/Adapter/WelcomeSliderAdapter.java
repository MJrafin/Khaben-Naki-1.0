package com.premiernoobs.khabennakiuser.Adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.premiernoobs.khabennakiuser.R;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class WelcomeSliderAdapter extends SliderViewAdapter<WelcomeSliderAdapter.Holder> {

    private Context context;
    private int [] images;
    private String [] title;
    private String [] firstLine;
    private String [] secondLine;

    public WelcomeSliderAdapter(Context context, int[] images, String [] title, String [] firstLine, String [] secondLine) {
        this.context = context;
        this.images = images;
        this.title = title;
        this.firstLine = firstLine;
        this.secondLine = secondLine;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_welcome, null);
        return new Holder(inflate);
    }

    @Override
    public void onBindViewHolder(Holder viewHolder, int position) {
        viewHolder.imageView.setImageResource(images[position]);
        viewHolder.titleText.setText(title[position]);
        viewHolder.first_line.setText(firstLine[position]);
        viewHolder.second_line.setText(secondLine[position]);
    }

    @Override
    public int getCount() {
        return images.length;
    }

    public class Holder extends ViewHolder {

        private ImageView imageView;
        private TextView titleText, first_line, second_line;

        public Holder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewId_slider);
            titleText = itemView.findViewById(R.id.textViewId_title);
            first_line = itemView.findViewById(R.id.textViewId_line1);
            second_line = itemView.findViewById(R.id.textViewId_line2);
        }
    }

}
