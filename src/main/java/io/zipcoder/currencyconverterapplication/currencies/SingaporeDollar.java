package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class SingaporeDollar implements ConvertableCurrency {
    public SingaporeDollar() {
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.SINGAPORE_DOLLAR;
    }

}
