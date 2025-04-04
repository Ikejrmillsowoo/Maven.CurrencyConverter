package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    CurrencyType getCurrencyType();
    default Double convert(CurrencyType currencyType) {

        return currencyType.getRate()/getCurrencyType().getRate();
    }

  
}
