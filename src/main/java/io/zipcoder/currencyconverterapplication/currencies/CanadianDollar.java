package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class CanadianDollar implements ConvertableCurrency {
    public CanadianDollar() {
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.CANADIAN_DOLLAR;
    }

}
