package hu.webler.service;

import hu.webler.bootstrap.DataInitializer;

import java.text.DecimalFormat;
import java.util.Collection;
import java.util.stream.Collectors;

import static hu.webler.util.DecimalFormatHelper.createDecimalFormat;

public class StreamExample02 {

    DataInitializer dataInitializer;

    public StreamExample02(DataInitializer dataInitializer) {
        this.dataInitializer = dataInitializer;
    }

    public Collection<? extends Number> squareNumbers(Collection<? extends Number> nums) {
        boolean isFloatingPoint = false;

        for(Number num : nums) {
            if (num instanceof Double || num instanceof Float) {
                isFloatingPoint = true;
                break;
            }
        }

        if (isFloatingPoint) {
            DecimalFormat df = createDecimalFormat();
            return nums.stream()
                    .map(num -> Double.parseDouble(df.format(Math.pow(num.doubleValue(), 2))))
                    .collect(Collectors.toList());
        } else {
            return nums.stream()
                    .map(num -> num.intValue() * num.intValue())
                    .collect(Collectors.toList());
        }
    }
}
