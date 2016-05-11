
package com.amazonaws.mobileconnectors.iot;

import com.amazonaws.util.StringUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.UUID;

/**
 * Helper class for generating random Client IDs and persisting them on the
 * device.
 */
@Deprecated
final class AWSIotClientIdHelper {
    /** Static member to hold the client ID. */
    private static String clientId = null;
    /** Constant for filename where client ID will be persisted. */
    private static final String PERSISTENCE_FILE = "CLIENT_ID";

    /**
     * Utility class.
     */
    private AWSIotClientIdHelper() {
    }

    /**
     * Generates a random UUID suitable for use as MQTT client ID. MQTT clients
     * in the same AWS account require a unique client ID for each
     * simulataneously connected client. This routine generates UUIDs which can
     * be considered "practically unique". See:
     * https://en.wikipedia.org/wiki/Universally_unique_identifier Each call to
     * this routine will return a different UUID.
     *
     * @return 36 character UUID string.
     */
    static String generateClientId() {
        return UUID.randomUUID().toString();
    }

    /**
     * Generates and persists a random UUID suitable for use as MQTT client ID,
     * then returns this ID. MQTT clients in the same AWS account require a
     * unique client ID for each simulataneously connected client. This routine
     * generates UUIDs which can be considered "practically unique". See:
     * https://en.wikipedia.org/wiki/Universally_unique_identifier This routine
     * generates a UUID to be used as client ID and persists this value for
     * future use. Subsequent calls to this routine will return the same UUID
     * generated on the first call.
     *
     * @param filesDirectory directory to be used when persisting the client ID.
     * @return 36 character UUID string.
     * @throws IOException when error occurs accessing the filesystem.
     */
    static synchronized String getPersistedClientId(String filesDirectory) throws IOException {
        File file = new File(filesDirectory, PERSISTENCE_FILE);
        if (clientId == null) {
            if (!file.exists()) {
                persistId(file, generateClientId());
            }
            clientId = readPersistedId(file);
        }
        return clientId;
    }

    /**
     * Reads client ID from persisted file.
     *
     * @param file file where client ID is persisted.
     * @return client ID retrieved from file.
     * @throws IOException when error occurs reading filesystem.
     */
    private static String readPersistedId(File file) throws IOException {
        RandomAccessFile f = new RandomAccessFile(file, "r");
        byte[] bytes = new byte[(int) f.length()];
        f.readFully(bytes);
        f.close();
        return new String(bytes, StringUtils.UTF8);
    }

    /**
     * Persist the client ID on the filesystem.
     *
     * @param file file for persistence.
     * @param id client ID to be persisted.
     * @throws IOException when error occurs writing to the filesystem.
     */
    private static void persistId(File file, String id) throws IOException {
        FileOutputStream out = new FileOutputStream(file);
        out.write(id.getBytes(StringUtils.UTF8));
        out.close();
    }

    /**
     * Used in unit test when testing the case where the class is loaded and a
     * Client ID file already exists on the filesystem.
     */
    static void reset() {
        clientId = null;
    }
}
