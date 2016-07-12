package com.third_module.second_task;

import java.util.List;

public class RoseTree extends Flower {
    private Rose rose;

    public RoseTree(String nameOfFlower, BouquetOfFlowers bouquet) {
        super(nameOfFlower, bouquet);
    }

    public Rose getRose() {
        return rose;
    }

    public void setRose(Rose rose) {
        this.rose = rose;
    }
}
