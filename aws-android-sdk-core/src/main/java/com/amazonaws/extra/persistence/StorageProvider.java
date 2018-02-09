package com.amazonaws.extra.persistence;

import java.util.HashMap;
import java.util.Map;

public class StorageProvider {

    public interface StorageFactory {
        /**
         * Create a new Storage object.
         *
         * The name is the value used by the external system to reference this storage.  It may be
         * useful for the storage to know of this value should it need to persist the data.
         * For example, the name might identify the URL, disk or remote memory location.
         *
         * @param name that can be used to identity persistence data
         * @return new storage instance
         */
        Storage create(String name);
    }

    private static StorageFactory storageFactory = new StorageFactory() {
        @Override
        public Storage create(String key) {
            return new StorageMemory();
        }
    };
    private static Map<String, Storage> storageMap = new HashMap<>();
    
    public static void setDefaultStorageFactory(StorageFactory storageFactory) {
        StorageProvider.storageFactory = storageFactory;
    }

    /**
     *
     * @param key name of the storage
     * @return the existing or new storage
     */
    public static Storage get(String key) {
        Storage storage = storageMap.get(key);

        boolean isStorage = storage != null;
        if (isStorage) {
            return storage;
        } else {
            Storage newStorage = storageFactory.create(key);
            storageMap.put(key, newStorage);
            return newStorage;
        }
    }
}
