
package com.amazonaws.mobileconnectors.iot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import com.amazonaws.util.StringUtils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;

public class AWSIotClientIdHelperTest {

    private static final String TEST_DIRECTORY = "./";
    private static final String PERSISTENCE_FILENAME = "CLIENT_ID";

    @Before
    public void setUp() throws Exception {
        // remove any existing file, clear the static class variable
        File persistenceFile = new File(TEST_DIRECTORY, PERSISTENCE_FILENAME);
        if (persistenceFile.exists()) {
            persistenceFile.delete();
        }
        AWSIotClientIdHelper.reset();
    }

    @After
    public void tearDown() throws Exception {
        // remove any existing file
        File persistenceFile = new File(TEST_DIRECTORY, PERSISTENCE_FILENAME);
        if (persistenceFile.exists()) {
            persistenceFile.delete();
        }
    }

    @Test
    public void testGenerateClientId() throws Exception {
        String testId1 = AWSIotClientIdHelper.generateClientId();
        String testId2 = AWSIotClientIdHelper.generateClientId();
        String testId3 = AWSIotClientIdHelper.generateClientId();
        // UUIDs are 36 character strings
        assertEquals(36, testId1.length());
        assertEquals(36, testId2.length());
        assertEquals(36, testId3.length());
        // generate gets a new ID each call
        assertFalse(testId1.equals(testId2));
        assertFalse(testId2.equals(testId3));
        assertFalse(testId1.equals(testId3));
    }

    @Test
    public void testGetPersistedClientId() throws Exception {
        String testId = AWSIotClientIdHelper.getPersistedClientId(TEST_DIRECTORY);
        // UUIDs are 36 character strings
        assertEquals(36, testId.length());
        // ensure same ID is returned 2nd time
        assertEquals(testId, AWSIotClientIdHelper.getPersistedClientId(TEST_DIRECTORY));
    }

    @Test
    public void testGetPersistedClientIdFilePresent() throws Exception {
        File persistenceFile = new File(TEST_DIRECTORY, PERSISTENCE_FILENAME);
        FileOutputStream out = new FileOutputStream(persistenceFile);
        out.write("this-is-a-36-character-string-4-test".getBytes(StringUtils.UTF8));
        out.close();
        String testId = AWSIotClientIdHelper.getPersistedClientId(TEST_DIRECTORY);
        // UUIDs are 36 character strings
        assertEquals(36, testId.length());
        // ensure same ID as create above is returned
        assertEquals("this-is-a-36-character-string-4-test", testId);
    }
}
