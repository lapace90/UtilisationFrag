package com.example.utilisationfrag;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BlankFragment extends Fragment {
private EditText login, password;
private Button btn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View monView = inflater.inflate(R.layout.fragment_blank, container, false);

        login = monView.findViewById(R.id.login);
        password = monView.findViewById(R.id.password);
        btn = monView.findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(monView.getContext(), "btn cliqué", Toast.LENGTH_SHORT).show();
            }
        });

        return monView;
    }
}