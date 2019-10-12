package com.kodilla.patterns.strategy.makler.predictors;

public class AggressivePredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Aggressive predictor] Buy stock of XYZ";
    }
}