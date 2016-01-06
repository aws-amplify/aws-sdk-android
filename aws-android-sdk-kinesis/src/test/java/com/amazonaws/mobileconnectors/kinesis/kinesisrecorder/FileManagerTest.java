/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.kinesis.kinesisrecorder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileManagerTest {

    private static final File ROOT_DIRECTORY = new File("testDirectory");
    private static final String SUB_DIRECTORY_PATH = "subDirectory";
    private static final String FILE_PATH = "testFile";

    private FileManager fileManager;

    @Before
    public void setup() {

        if (!ROOT_DIRECTORY.exists()) {
            assertTrue(ROOT_DIRECTORY.mkdir());
        }

        fileManager = new FileManager(ROOT_DIRECTORY);
    }

    @After
    public void tearDown() {

        File subDirectory = new File(ROOT_DIRECTORY, SUB_DIRECTORY_PATH);

        if (subDirectory.exists()) {
            assertTrue(subDirectory.delete());
        }

        if (ROOT_DIRECTORY.exists()) {
            for (File file : ROOT_DIRECTORY.listFiles()) {
                assertTrue(file.delete());
            }
            assertTrue(ROOT_DIRECTORY.delete());
        }
    }

    @Test
    public void testCreateAndDeleteDirectory() {
        File subDirectory = new File(ROOT_DIRECTORY, SUB_DIRECTORY_PATH);
        assertFalse(subDirectory.exists());

        String originalPath = subDirectory.getAbsolutePath();

        subDirectory = fileManager.createDirectory(SUB_DIRECTORY_PATH);
        assertTrue(subDirectory.exists());
        assertTrue(subDirectory.isDirectory());
        assertEquals(subDirectory.listFiles().length, 0);
        assertTrue(originalPath.equalsIgnoreCase(subDirectory.getAbsolutePath()));

        fileManager.deleteFile(subDirectory);
        assertFalse(subDirectory.exists());
    }

    @Test
    public void testCreateAndDeleteFileFromPath() throws IOException {
        File file = new File(ROOT_DIRECTORY, FILE_PATH);
        assertFalse(file.exists());

        String originalPath = file.getAbsolutePath();

        file = fileManager.createFile(FILE_PATH);
        assertTrue(file.exists());
        assertEquals(file.length(), 0);
        assertTrue(originalPath.equalsIgnoreCase(file.getAbsolutePath()));

        assertTrue(fileManager.deleteFile(FILE_PATH));
        assertFalse(file.exists());
    }

    @Test
    public void testCreateAndDeleteFileFromFile() throws IOException {
        File subDirectory = new File(ROOT_DIRECTORY, SUB_DIRECTORY_PATH);
        subDirectory.mkdir();

        File file = new File(subDirectory, FILE_PATH);
        assertFalse(file.exists());

        String originalPath = file.getAbsolutePath();

        file = fileManager.createFile(file);
        assertTrue(file.exists());
        assertEquals(file.length(), 0);
        assertTrue(originalPath.equalsIgnoreCase(file.getAbsolutePath()));

        assertTrue(fileManager.deleteFile(file));
        assertFalse(file.exists());
    }

    @Test
    public void testListFilesInDirectoryFromPath() throws IOException {
        File subDirectory = new File(ROOT_DIRECTORY, SUB_DIRECTORY_PATH);
        assertFalse(subDirectory.exists());
        subDirectory.mkdir();

        File file1 = new File(subDirectory, FILE_PATH + "_1");
        file1.createNewFile();
        File file2 = new File(subDirectory, FILE_PATH + "_2");
        file2.createNewFile();
        File file3 = new File(subDirectory, FILE_PATH + "_3");
        file3.createNewFile();

        assertEquals(fileManager.listFilesInDirectory(SUB_DIRECTORY_PATH).size(), 3);

        assertTrue(file1.delete());
        assertTrue(file2.delete());
        assertTrue(file3.delete());
    }

    @Test
    public void testListFilesInDirectoryFromFile() throws IOException {
        File subDirectory = new File(ROOT_DIRECTORY, SUB_DIRECTORY_PATH);
        assertFalse(subDirectory.exists());
        subDirectory.mkdir();

        File file1 = new File(subDirectory, FILE_PATH + "_1");
        file1.createNewFile();
        File file2 = new File(subDirectory, FILE_PATH + "_2");
        file2.createNewFile();
        File file3 = new File(subDirectory, FILE_PATH + "_3");
        file3.createNewFile();

        assertEquals(fileManager.listFilesInDirectory(subDirectory).size(), 3);

        assertTrue(file1.delete());
        assertTrue(file2.delete());
        assertTrue(file3.delete());
    }

    @Test
    public void testNewInputStreamFromFile() throws IOException {
        File file = new File(ROOT_DIRECTORY, FILE_PATH);
        assertFalse(file.exists());
        file.createNewFile();

        FileOutputStream fos = new FileOutputStream(file);
        fos.write(5);
        fos.flush();
        fos.close();

        InputStream is = fileManager.newInputStream(file);

        assertEquals(is.read(), 5);
        assertEquals(is.read(), -1);
        is.close();

    }

    @Test
    public void testNewInputStreamFromPath() throws IOException {
        File file = new File(ROOT_DIRECTORY, FILE_PATH);
        assertFalse(file.exists());
        file.createNewFile();

        FileOutputStream fos = new FileOutputStream(file);
        fos.write(5);
        fos.flush();
        fos.close();

        InputStream is = fileManager.newInputStream(FILE_PATH);

        assertEquals(is.read(), 5);
        assertEquals(is.read(), -1);
        is.close();
    }

    @Test
    public void testNewOutputStreamFromPath() throws IOException {
        File file = new File(ROOT_DIRECTORY, FILE_PATH);
        assertFalse(file.exists());
        file.createNewFile();

        OutputStream os = fileManager.newOutputStream(FILE_PATH, true);
        os.write(5);
        os.flush();
        os.close();

        InputStream is = new FileInputStream(file);
        assertEquals(is.read(), 5);
        assertEquals(is.read(), -1);
        is.close();
    }

    @Test
    public void testNewOutputStreamFromFile() throws IOException {

        File file = new File(ROOT_DIRECTORY, FILE_PATH);
        assertFalse(file.exists());
        file.createNewFile();

        OutputStream os = fileManager.newOutputStream(file, true);
        os.write(5);
        os.flush();
        os.close();

        InputStream is = new FileInputStream(file);
        assertEquals(is.read(), 5);
        assertEquals(is.read(), -1);
        is.close();
    }
}
