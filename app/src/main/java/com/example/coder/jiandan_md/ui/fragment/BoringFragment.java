package com.example.coder.jiandan_md.ui.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import com.example.coder.jiandan_md.PictureFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class BoringFragment extends PictureFragment {



    public BoringFragment() {

    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        super.pictureType = PictureType.PictureTypeBoring;
    }
}
