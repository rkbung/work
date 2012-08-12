package org.rkbung.work;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    private static final Logger LOGGER = LoggerFactory.getLogger(FizzBuzz.class);

    public List<String> getList() {
        List<String> result = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            String value = StringUtils.EMPTY;
            if (i % 3 == 0) {
                value = "Fizz";
            }
            if (i % 5 == 0) {
                value += "Buzz";
            }
            if (StringUtils.isEmpty(value)) {
                value = String.valueOf(i);
            }
            LOGGER.debug("Adding {}", value);
            result.add(value);
        }
        return result;
    }
}
