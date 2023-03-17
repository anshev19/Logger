package com.company;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    private final int threshold;
    private Logger logger;
    public Filter(int threshold) {
        this.threshold = threshold;
        logger = Logger.getLogger();
    }

    public List<Integer> filterOut(List<Integer> list) {
        logger.log("Запускаем фильтрацию");
        List<Integer> filteredList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer elem = list.get(i);
            if (elem >= threshold) {
                filteredList.add(elem);
                logger.log("Элемент \"" + elem + "\" проходит");
            }
            else {
                logger.log("Элемент \"" + elem + "\" не проходит");
            }
        }
        logger.log("Прошло фильтр " + filteredList.size() + " элемента из " + list.size());
        return filteredList;
    }
}
