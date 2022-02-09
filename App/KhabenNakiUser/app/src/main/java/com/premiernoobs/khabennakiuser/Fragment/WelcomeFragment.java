package com.premiernoobs.khabennakiuser.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.premiernoobs.khabennakiuser.Adapter.WelcomeSliderAdapter;
import com.premiernoobs.khabennakiuser.R;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class WelcomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    // image slider
    private int [] images = {R.drawable.slide_1,R.drawable.slide_2,R.drawable.slide_3};
    private String [] title = {"Find foods you love", "Fast Rider", "Live Tracking"};
    private String [] firstLine = {"Discover the best foods from ", "fast delivery to your home, office",
            "Real time tracking of your food"};
    private String [] secondLine = {"over 1,000 restaurents ", "and whenever you are", "on the app after order"};

    // button
    private Button continueButton;

    // slider
    SliderView sliderView;

    public WelcomeFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static WelcomeFragment newInstance(String param1, String param2) {
        WelcomeFragment fragment = new WelcomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_welcome, container, false);

        // buttons
        continueButton = view.findViewById(R.id.buttonId_continue);

        // slider
        sliderView = view.findViewById(R.id.sliderId_welcome);

        // initialize
        initializeImageSlider();

        return view;
    }

    private void initializeImageSlider() {

        sliderView.setSliderAdapter(new WelcomeSliderAdapter(getActivity(), images,title,firstLine,secondLine));

        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM); //set indicator animation by using IndicatorAnimationType. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        //sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setScrollTimeInSec(2); //set scroll delay in seconds :
        sliderView.startAutoCycle();

    }

}