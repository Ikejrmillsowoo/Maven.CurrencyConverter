package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Yen implements ConvertableCurrency {

    public Yen() {
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.YEN;
    }

}
