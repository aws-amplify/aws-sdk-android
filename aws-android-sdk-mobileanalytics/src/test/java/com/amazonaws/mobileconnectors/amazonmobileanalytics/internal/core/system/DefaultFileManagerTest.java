/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.MobileAnalyticsTestBase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.io.File;
import java.io.IOException;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class DefaultFileManagerTest extends MobileAnalyticsTestBase {
    private static String ROOT_TEST_PATH = "/tmp/AmazonMobileAnalyticsSDK/tests/BEEFBEEFBEEFBEEF";
    private static String TEST_FILE_NAME = "testFile";
    private static String TEST_DIR_NAME = "testDir";
    private File rootTestDirectory;
    private DefaultFileManager target;

    @Before
    public void setup(){
        rootTestDirectory = new File(ROOT_TEST_PATH);
        rootTestDirectory.mkdirs();
        target = new DefaultFileManager(rootTestDirectory);
    }

    @After
    public void tearDown(){
        rootTestDirectory.delete();
        target = null;
        rootTestDirectory = null;
    }

    @Test
    public void test_WhenFileNotExists_createFile_FileReturnedExists() throws IOException {
        File testFileSetup = new File(rootTestDirectory, TEST_FILE_NAME);
        testFileSetup.delete();
        Assert.assertFalse(testFileSetup.exists());

        File testFile = target.createFile(TEST_FILE_NAME);
        Assert.assertTrue(testFile.isFile());
    }

    @Test
    public void test_WhenFileExists_createFile_ReturnsFile() throws IOException {
        File testFileSetup = new File(rootTestDirectory, TEST_FILE_NAME);
        testFileSetup.delete();
        testFileSetup.createNewFile();
        Assert.assertTrue(testFileSetup.isFile());

        File testFile = target.createFile(TEST_FILE_NAME);
        Assert.assertTrue(testFile.isFile());
    }

    @Test public void test_WhenDirectoryExistsWithSameName_createFile_ReturnsNull() throws IOException{
        File testDirectorySetup = new File(rootTestDirectory, TEST_FILE_NAME);
        testDirectorySetup.delete();
        testDirectorySetup.mkdirs();
        Assert.assertTrue(testDirectorySetup.isDirectory());

        File testFile = target.createFile(TEST_FILE_NAME);
        Assert.assertNull(testFile);
    }

    @Test
    public void test_WhenDirectoryNotExists_createDirectory_DirectoryReturnedExists() throws IOException {
        File testDirectorySetup = new File(rootTestDirectory, TEST_DIR_NAME);
        testDirectorySetup.delete();
        Assert.assertFalse(testDirectorySetup.exists());

        File testDirectory = target.createDirectory(TEST_DIR_NAME);
        Assert.assertTrue(testDirectory.isDirectory());
    }

    @Test
    public void test_WhenDirectoryExists_createDirectory_ReturnsDirectory() throws IOException {
        File testDirectorySetup = new File(rootTestDirectory, TEST_DIR_NAME);
        testDirectorySetup.delete();
        testDirectorySetup.mkdirs();
        Assert.assertTrue(testDirectorySetup.isDirectory());

        File testDirectory = target.createDirectory(TEST_DIR_NAME);
        Assert.assertTrue(testDirectory.isDirectory());
    }

    @Test public void test_WhenFileExistsWithSameName_createDirectory_ReturnsNull() throws IOException{
        File testFileSetup = new File(rootTestDirectory, TEST_DIR_NAME);
        testFileSetup.delete();
        testFileSetup.createNewFile();
        Assert.assertTrue(testFileSetup.isFile());

        File testDirectory = target.createDirectory(TEST_DIR_NAME);
        Assert.assertNull(testDirectory);
    }

    @Test
    public void test_deleteFile_FileNotExists() throws IOException {
        File testFileSetup = new File(rootTestDirectory, TEST_FILE_NAME);
        testFileSetup.delete();
        testFileSetup.createNewFile();
        Assert.assertTrue(testFileSetup.isFile());

        File testFile = new File(rootTestDirectory, TEST_FILE_NAME);
        Assert.assertTrue(testFile.isFile());
        Assert.assertTrue(target.deleteFile(testFile));
        Assert.assertFalse(testFile.exists());
    }

    @Test
    public void test_WhenFileNotExists_deleteFile_ReturnsTrue(){
        File testFileSetup = new File(rootTestDirectory, TEST_FILE_NAME);
        testFileSetup.delete();
        Assert.assertFalse(testFileSetup.exists());

        File testFile = new File(rootTestDirectory, TEST_FILE_NAME);
        Assert.assertFalse(testFile.exists());
        Assert.assertTrue(target.deleteFile(testFile));
        Assert.assertFalse(testFile.exists());
    }

    @Test(expected = IOException.class)
    public void test_WhenFileSystemReadOnlyAndFileNotExists_createFile_ThrowsIOException() throws IOException{
        File testFileSetup = new File(rootTestDirectory, TEST_FILE_NAME);
        testFileSetup.delete();
        Assert.assertFalse(testFileSetup.exists());

        rootTestDirectory.setReadOnly();

        try {
            File testFile = target.createFile(TEST_FILE_NAME);
        } catch (IOException e) {
            throw e;
        }
        finally {
            rootTestDirectory.setWritable(true);
        }
    }

    @Test
    public void test_WhenFileSystemReadOnlyAndFileExists_deleteFile_ReturnsFalseNoException() throws IOException{
        File testFileSetup = new File(rootTestDirectory, TEST_FILE_NAME);
        testFileSetup.delete();
        testFileSetup.createNewFile();
        Assert.assertTrue(testFileSetup.isFile());

        File testFile = new File(rootTestDirectory, TEST_FILE_NAME);
        Assert.assertTrue(testFile.exists());

        rootTestDirectory.setReadOnly();

        Assert.assertFalse(target.deleteFile(testFile));
        Assert.assertTrue(testFile.exists());
        rootTestDirectory.setWritable(true);
    }
}
