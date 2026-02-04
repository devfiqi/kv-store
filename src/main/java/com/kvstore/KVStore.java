package com.kvstore;

import java.util.concurrent.ConcurrentHashMap;

public class KVStore {
    private ConcurrentHashMap<String, String> store = new ConcurrentHashMap<>();

    public void put(String key, String value) {
        store.put(key, value);
    }

    public String get(String key) {
       return store.get(key);
    }

    public void delete(String key) {
        store.remove(key);
    }
    
}
