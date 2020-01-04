package com.firebaseapp.calculator;

public class CalculatorPresenter implements IPresenter {
    private IView iView;

    public CalculatorPresenter(IView iView) {
        this.iView = iView;
    }

    @Override
    public void plus(String value1, String Value2) {
        int nilai1 = Integer.parseInt(value1);
        int nilai2 = Integer.parseInt(Value2);
        int result = nilai1 + nilai2;
        iView.result(result);
    }

    @Override
    public void minus(String value1, String Value2) {
        int nilai1 = Integer.parseInt(value1);
        int nilai2 = Integer.parseInt(Value2);
        int result = nilai1 - nilai2;
        iView.result(result);
    }

    @Override
    public void division(String value1, String Value2) {
        int nilai1 = Integer.parseInt(value1);
        int nilai2 = Integer.parseInt(Value2);
        int result = nilai1 / nilai2;
        iView.result(result);
    }

    @Override
    public void multiplication(String value1, String Value2) {
        int nilai1 = Integer.parseInt(value1);
        int nilai2 = Integer.parseInt(Value2);
        int result = nilai1 * nilai2;
        iView.result(result);
    }
}
