package com.example.newsapp.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.newsapp.R;


public class CNNFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_c_n_n, container, false);

        WebView webView=view.findViewById(R.id.cnnWebView);
        webView.loadUrl("https://edition.cnn.com/");
        webView.setWebViewClient(new WebViewClient());

        webView.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction()==KeyEvent.ACTION_DOWN)
                {
                    if (keyCode==KeyEvent.KEYCODE_BACK)
                    {
                            if (webView.canGoBack())
                            {
                                webView.goBack();
                            }else {
                                getActivity().onBackPressed();
                            }
                        }
                }
                return true;
            }
        });

        return view;
    }
}