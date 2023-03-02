package com.example.newsapp.Fragments;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.Fragment;

import com.example.newsapp.R;

public class AryFragment extends Fragment {

    WebView webView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_ary, container, false);

        webView=view.findViewById(R.id.aryWebView);
        webView.loadUrl("https://arynews.tv/");
        webView.setWebViewClient(new WebViewClient());

        webView.setOnKeyListener(new OnKeyListener() {
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