package com.example.myapplication;

import android.media.AudioManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainActivityFragment extends Fragment {
    private CannonView cannonView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MEU TESTE", "onCreate do MainActivityFragment");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("MEU TESTE", "onCreateView do MainActivityFragment");

        super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_main_activity, container, false);
        cannonView = (CannonView) view.findViewById(R.id.cannonView);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        getActivity().setVolumeControlStream(AudioManager.STREAM_MUSIC);
    }

    @Override
    public void onPause() {
        super.onPause();
        cannonView.stopGame();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        cannonView.releaseResources();
    }
}