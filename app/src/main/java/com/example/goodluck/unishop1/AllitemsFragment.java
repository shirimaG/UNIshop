package com.example.goodluck.unishop1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.StringDef;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class AllitemsFragment extends Fragment {

    private RecyclerView recyclerView;
    private AllitemsListAdapter mAdapter;
    private ArrayList<AbstractModel> modelList = new ArrayList<>();



    public AllitemsFragment() {
        // Required empty public constructor
    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_allitems, container, false);

        //private void setAdapter(){
            // Array list of items
            modelList.add(new AbstractModel("One set UNO R3 (CH340G) MEGA328P for Arduino UNO R3 with case USB Cable ATMEGA328P-AU Development board","US $ 17.5",R.drawable.arduino));
            modelList.add(new AbstractModel("One set UNO R3 (CH340G) MEGA328P for Arduino UNO R3 with case USB Cable ATMEGA328P-AU Development board","US $ 17.5",R.drawable.arduinomega));
            modelList.add(new AbstractModel("One set UNO R3 (CH340G) MEGA328P for Arduino UNO R3 with case USB Cable ATMEGA328P-AU Development board","US $ 17.5",R.drawable.arduinonano));
            modelList.add(new AbstractModel("One set UNO R3 (CH340G) MEGA328P for Arduino UNO R3 with case USB Cable ATMEGA328P-AU Development board","US $ 17.5",R.drawable.arduinorth));
            modelList.add(new AbstractModel("One set UNO R3 (CH340G) MEGA328P for Arduino UNO R3 with case USB Cable ATMEGA328P-AU Development board","US $ 17.5",R.drawable.arduinouno));
            modelList.add(new AbstractModel("One set UNO R3 (CH340G) MEGA328P for Arduino UNO R3 with case USB Cable ATMEGA328P-AU Development board","US $ 17.5",R.drawable.bluetoothmodule));
            modelList.add(new AbstractModel("One set UNO R3 (CH340G) MEGA328P for Arduino UNO R3 with case USB Cable ATMEGA328P-AU Development board","US $ 17.5",R.drawable.breadboard));
            modelList.add(new AbstractModel("One set UNO R3 (CH340G) MEGA328P for Arduino UNO R3 with case USB Cable ATMEGA328P-AU Development board","US $ 17.5",R.drawable.gsmmodule));
            modelList.add(new AbstractModel("One set UNO R3 (CH340G) MEGA328P for Arduino UNO R3 with case USB Cable ATMEGA328P-AU Development board","US $ 17.5",R.drawable.ifemalefemale));
            modelList.add(new AbstractModel("One set UNO R3 (CH340G) MEGA328P for Arduino UNO R3 with case USB Cable ATMEGA328P-AU Development board","US $ 17.5",R.drawable.imalefemale));
            modelList.add(new AbstractModel("One set UNO R3 (CH340G) MEGA328P for Arduino UNO R3 with case USB Cable ATMEGA328P-AU Development board","US $ 17.5",R.drawable.lcdfourblue));
            modelList.add(new AbstractModel("One set UNO R3 (CH340G) MEGA328P for Arduino UNO R3 with case USB Cable ATMEGA328P-AU Development board","US $ 17.5",R.drawable.lcdfourgreen));
            modelList.add(new AbstractModel("One set UNO R3 (CH340G) MEGA328P for Arduino UNO R3 with case USB Cable ATMEGA328P-AU Development board","US $ 17.5",R.drawable.rasp));
            modelList.add(new AbstractModel("One set UNO R3 (CH340G) MEGA328P for Arduino UNO R3 with case USB Cable ATMEGA328P-AU Development board","US $ 17.5",R.drawable.raspberry));
            modelList.add(new AbstractModel("One set UNO R3 (CH340G) MEGA328P for Arduino UNO R3 with case USB Cable ATMEGA328P-AU Development board","US $ 17.5",R.drawable.simnine));


            //Using Custom WordAdapter to hold data into the RecyclerView
            mAdapter = new AllitemsListAdapter(getActivity(),modelList);

            recyclerView.setHasFixedSize(true);

             // use a linear layout manager
            LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
             recyclerView.setLayoutManager(layoutManager);
             recyclerView.setAdapter(mAdapter);

            //Call a ListView xmlLayout to handle the Items in ArrayList
             RecyclerView allListItems = rootView.findViewById(R.id.recycler_view);

             // set recyclerview into an adaptor
            allListItems.setAdapter(mAdapter);
            return rootView;


        //setAdapter();
    }




        //Call a ListView xmlLayout to handle the Items in ArrayList


      //  recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        //LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        //recyclerView.setLayoutManager(layoutManager);
//        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), layoutManager.getOrientation());
//        dividerItemDecoration.setDrawable(ContextCompat.getDrawable(getActivity(), R.drawable.divider_recyclerview));
//        recyclerView.addItemDecoration(dividerItemDecoration);
        //recyclerView.setAdapter(mAdapter);
    }


    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
//    public interface OnFragmentInteractionListener {
//        // TODO: Update argument type and name
//        void onFragmentInteraction(Uri uri);
//    }

