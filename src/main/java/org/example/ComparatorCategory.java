package org.example;

import java.util.Comparator;

class ComparatorCategory implements Comparator<Task> {

    @Override
    public int compare(Task o1, Task o2) {
        return o1.getCategory().compareToIgnoreCase(o2.getCategory());
    }
}
