package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Euro implements ConvertableCurrency {
    public Euro() {
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.EURO;
    }


}
