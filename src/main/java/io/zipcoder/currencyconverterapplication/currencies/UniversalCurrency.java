package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class UniversalCurrency implements ConvertableCurrency {
    public UniversalCurrency() {
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.UNIVERSAL_CURRENCY;
    }


}
