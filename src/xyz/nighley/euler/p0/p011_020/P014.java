package xyz.nighley.euler.p0.p011_020;

import xyz.nighley.euler.utils.Problem;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class P014 extends Problem {
    @Override
    public Object getResult() {
        Map<Long, Long> map = new HashMap<>();
        Function<Long, Long> even = (i)-> i / 2;
        Function<Long, Long> odd = (i)-> i * 3 + 1;
        map.put(2L, 1L);

        Map<Long, Long> tempSteps = new HashMap<>();
        for (long q = 3; q < 999999L; q++) {
            if (map.containsKey(q)) {
                continue;
            }
            tempSteps.clear();
            long count = 0;
            long at = q;

            tempSteps.put(q, 0L);
            while (!map.containsKey(at)) {
                if (at%2 == 0) {
                    count++;
                    at = even.apply(at);
                    tempSteps.put(at, count);
                }else {
                    count++;
                    at = odd.apply(at);
                    tempSteps.put(at, count);
                }
            }
            long atCount = map.get(at);
            for (Map.Entry<Long, Long> entry : tempSteps.entrySet()) {
                if (!map.containsKey(entry.getKey())) {
                    map.put(entry.getKey(), count - entry.getValue() + atCount);
                }
            }
        }
        map.entrySet().removeIf(d->d.getKey() > 999999);
        return map.entrySet().stream().sorted((e2, e1) ->Long.compare(e1.getValue(), e2.getValue())).limit(1).findAny().get().getKey();
    }

}
