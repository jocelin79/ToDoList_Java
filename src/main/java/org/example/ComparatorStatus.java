package org.example;

import java.util.Comparator;

class ComparatorStatus implements Comparator<Task> {

    @Override
    public int compare(Task o1, Task o2) {
        return o1.getStatus().compareToIgnoreCase(o2.getStatus());
    }
}
