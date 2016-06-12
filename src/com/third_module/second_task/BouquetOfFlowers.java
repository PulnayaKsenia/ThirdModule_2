package com.third_module.second_task;

import java.util.List;

/**
 * Created by DVPComp on 12.06.2016.
 */
public class BouquetOfFlowers {
    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public List<Tulip> getTulips() {
        return tulips;
    }

    public void setTulips(List<Tulip> tulips) {
        this.tulips = tulips;
    }

    public List<RoseTree> getRosetrees() {
        return rosetrees;
    }

    public void setRosetrees(List<RoseTree> rosetrees) {
        this.rosetrees = rosetrees;
    }

    private List<Flower> flowers;
    private List<Tulip> tulips;
    private List<RoseTree> rosetrees;
}
