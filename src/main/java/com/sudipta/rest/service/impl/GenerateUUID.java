package com.sudipta.rest.service.impl;

import com.sudipta.rest.service.IGenerateUUID;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class GenerateUUID implements IGenerateUUID {

    private static final Set<String> UUID_POOL = new HashSet<>();

    public void createPool(int initialSize) {
        if (initialSize < 1) {
            throw new IllegalArgumentException("Invalid initial pool size");
        }
        for (int i = 0; i < initialSize; i++) {
            UUID uuid = UUID.randomUUID();
            UUID_POOL.add(uuid.toString());
        }
    }

    public String getUUID() {
        if (UUID_POOL.size() == 0) {
            createPool(100);
        }
        return UUID_POOL.stream()
                        .filter(uuid -> !"".equals(uuid))
                        .findFirst()
                        .get();
    }
}
