package com.firebaseapp.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements IView{
    @BindView(R.id.edt_1)
    EditText edt1;
    @BindView(R.id.edt_2)
    EditText edt2;
    @BindView(R.id.result)
    TextView result;

    CalculatorPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        presenter = new CalculatorPresenter(this);
    }

    @OnClick({R.id.btn_plus, R.id.btn_minus, R.id.btn_multiplication, R.id.btn_division})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                presenter.plus(edt1.getText().toString(), edt2.getText().toString());
                break;
            case R.id.btn_minus:
                break;
            case R.id.btn_multiplication:
                break;
            case R.id.btn_division:
                break;
        }
    }

    @Override
    public int result(int result) {
        this.result.setText("Hasil : "+result);
        return result;
    }
}
