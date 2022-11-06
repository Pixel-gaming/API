package com.c0d3m4513r.pluginapi.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.concurrent.TimeUnit;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimeUnitValue implements Comparable<TimeUnitValue> {
    @NonNull
    TimeUnit unit;
    @NonNull
    long value;

    void add(TimeUnitValue unitValue){
        value+=unit.convert(unitValue.value,unitValue.unit);
    }

    @Override
    public int compareTo(TimeUnitValue o) {
        if (o.unit == unit)
            return Long.compare(value,o.value);
        TimeEntry te = new TimeEntry();
        te.setTime(o.unit, o.value);
        //o.unit and unit are guaranteed to be different
        te.setTime(unit,value);
        TimeUnitValue tuv = te.getMaxUnit();
        if (tuv.value == 0) return 0;
        else if (tuv.value > 0) return 1;
        else return -1;
    }

    @Override
    public boolean equals(Object obj){
        try {
            TimeUnitValue tuv = (TimeUnitValue) obj;
            return compareTo(tuv)==0;
        }catch (ClassCastException e){
            return false;
        }
    }
}
