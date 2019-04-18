package com.hungth.fresco;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.facebook.drawee.view.SimpleDraweeView;

public class DemoFrescoFragment extends Fragment {

    private Button buttonShowImage;
    private SimpleDraweeView draweeView;

    public static DemoFrescoFragment getInstance() {
        return new DemoFrescoFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_demo_fresco, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        draweeView = getActivity().findViewById(R.id.view_fresco);
        buttonShowImage = getActivity().findViewById(R.id.button);
        buttonShowImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage();
            }
        });
    }

    private void showImage() {
        Uri uri = Uri.parse("http://thuthuatphanmem.vn/uploads/2018/09/11/hinh-anh-dep-2_044126655.jpg");
        draweeView.setImageURI(uri);
    }
}
