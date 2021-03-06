package com.avans.easypaykassa.InputFilter;

import android.text.InputFilter;
import android.text.Spanned;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Bart on 8-5-2017.
 */

public class DecimalDigitsInputFilter implements InputFilter {
    Pattern mPattern;
    public DecimalDigitsInputFilter(int digitsAfterZero) {
        mPattern=Pattern.compile("[0-9]+((\\.[0-9]{0," + (digitsAfterZero-1) + "})?)||(\\.)?");
    }
    @Override
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {

        Matcher matcher=mPattern.matcher(dest);
        if(!matcher.matches())
            return "";
        return null;
    }
}