package com.feng.ai.base.util;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Data
public class ControllerResult <T> {

    List<T> data = new ArrayList<>();

    Map<String, String > metadata = new HashMap<>();

    public void addItem(T item) {
        this.data.add(item);
    }

    public void addMetaData(String key, String value) {
        this.metadata.put(key, value);
    }
}
