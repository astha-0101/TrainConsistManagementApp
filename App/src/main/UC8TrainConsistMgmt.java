package main;

import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String type;
    int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }
}

public class UC8TrainConsistMgmt {

    public List<Bogie> filterBogies() {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Sleeper", 80));

        return bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
    }
}