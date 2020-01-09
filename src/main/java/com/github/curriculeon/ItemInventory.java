package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by leon on 12/16/2019.
 */
public class ItemInventory implements InventoryInterface<Item>, Iterable <Item> {
    List<Item> inventory=new ArrayList<>();
    @Override
    public void add(Item someObject) {
    inventory.add(someObject);
    }

    @Override
    public Boolean contains(Item someObject) {
        return inventory.contains(someObject);
    }

    @Override
    public Item get(int indexOfElement) {
        return inventory.get(indexOfElement);
    }

    @Override
    public Item remove(int indexOfElement) {
        return inventory.remove(indexOfElement);
    }

    @Override
    public Item[] toArray(Item[] objectsToBeAdded) {
        return inventory.toArray(objectsToBeAdded);
    }

    @Override
    public Iterator<Item> iterator() {
        return inventory.iterator();
    }
}
