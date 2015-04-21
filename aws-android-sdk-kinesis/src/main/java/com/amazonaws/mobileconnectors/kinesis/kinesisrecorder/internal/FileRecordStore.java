/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.internal;

import android.util.Log;

import com.amazonaws.AmazonClientException;
import com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.KinesisRecorderConfig;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.concurrent.locks.ReentrantLock;

/**
 * The FileRecordStore is responsible for recording Kinesis PutRecordRequests to
 * the Android disk. Currently it stores each request as a JSON object
 * representing it's properties. One request per line.
 */
public class FileRecordStore {
    private static final String TAG = "FileRecordStore";
    private final ReentrantLock accessLock = new ReentrantLock(true);

    /** The file the requests are stored in **/
    private File recordFile;

    /** The FileManager used for interacting with the FS **/
    private FileManager fileManager;

    /** The configuration used for different values such as max file size ect... **/
    private KinesisRecorderConfig config;

    /**
     * Creates the FileRecordStore
     *
     * @param recorderDirectory The directory (which the FileRecordStore is only
     *            used for the KinesisRecorder) to use to store requests in
     * @param config
     * @throws IOException
     */
    public FileRecordStore(final File recorderDirectory, KinesisRecorderConfig config)
            throws IOException {
        this.fileManager = new FileManager(recorderDirectory);
        this.config = config;
        tryCreateRecordsFile();
    }

    public boolean put(final String record) throws IOException {
        boolean success = false;
        BufferedWriter writer = null;
        accessLock.lock();
        try {
            writer = tryInitializeWriter();
            if (writer != null) {
                if (recordFile.length() + record.getBytes().length <= config.getMaxStorageSize()) {
                    writer.write(record);
                    writer.newLine();
                    writer.flush();
                    success = true;
                }
            }
        } finally {
            if (writer != null) {
                writer.close();
            }
            accessLock.unlock();
        }

        return success;
    }

    private void tryCreateRecordsFile() throws IOException {
        if (recordFile != null && recordFile.exists()) {
            return;
        }

        synchronized (this) {
            if (recordFile != null && recordFile.exists()) {
                return;
            }

            File recordDir = fileManager.createDirectory(
                    Constants.RECORDS_DIRECTORY);
            recordFile = fileManager.createFile(new File(
                    recordDir, Constants.RECORDS_FILE_NAME));
        }
    }

    private BufferedWriter tryInitializeWriter() throws IOException {
        BufferedWriter writer = null;
        tryCreateRecordsFile();
        OutputStream stream = fileManager.newOutputStream(recordFile, true);
        writer = new BufferedWriter(new OutputStreamWriter(stream));

        return writer;
    }

    private File deleteAllRecords() throws IOException {
        File recordsDir = fileManager.createDirectory(
                Constants.RECORDS_DIRECTORY);

        recordFile.delete();

        recordFile = fileManager.createFile(new File(
                recordsDir, Constants.RECORDS_FILE_NAME));
        return recordFile;
    }

    private File deleteReadRecords(final int lineNumber) throws IOException {
        // Write all records after line number to a temporary file
        File recordsDir = fileManager.createDirectory(
                Constants.RECORDS_DIRECTORY);

        File tempRecordsFile = null;
        File tempFile = new File(
                recordsDir, Constants.RECORDS_FILE_NAME + ".tmp");
        if (tempFile.exists()) {
            if (!tempFile.delete()) {
                throw new IOException("Failed to delete previous temp file");
            }
        }
        tempRecordsFile = fileManager.createFile(tempFile);

        if (tempRecordsFile != null && recordFile.exists() && tempRecordsFile.exists()) {
            BufferedReader reader = null;
            PrintWriter writer = null;
            try {
                reader = new BufferedReader(new FileReader(recordFile));
                writer = new PrintWriter(new FileWriter(tempRecordsFile, true));

                String line = null;
                int currentLineNumber = 0;
                while ((line = reader.readLine()) != null) {
                    currentLineNumber++;
                    if (currentLineNumber > lineNumber) {
                        writer.println(line);
                        writer.flush();
                    }
                }
            } finally {
                if (writer != null) {
                    writer.close();
                }
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException e) {

                    }
                }

                if (!recordFile.delete() || !tempRecordsFile.renameTo(recordFile)) {
                    throw new IOException(
                            "Failed to delete read records and persist unread records");
                }
            }

            if (tempFile.exists()) {
                if (!tempFile.delete()) {
                    Log.e(TAG, "Failed to delete temp file");
                }
            }
        }
        return recordFile;
    }

    public RecordIterator iterator() {
        return new RecordIterator();

    }

    public class RecordIterator implements java.util.Iterator<String> {
        int linesRead = 0;
        String nextBuffer = null;
        BufferedReader reader = null;
        boolean isEndOfFile = false;

        private boolean tryOpenReader() throws FileNotFoundException {
            if (reader != null) {
                return true;
            }

            if (!isEndOfFile) {
                InputStreamReader streamReader = null;
                streamReader = new InputStreamReader(fileManager.newInputStream(recordFile));

                if (streamReader != null) {
                    reader = new BufferedReader(streamReader);
                    return true;
                }
            }
            return false;
        }

        private void tryCloseReader() throws IOException {
            if (reader != null) {
                reader.close();
                reader = null;
            }
        }

        @Override
        public boolean hasNext() {
            boolean hasNext = false;
            accessLock.lock();
            try {
                // If there is something already buffered then there is a
                // next
                if (nextBuffer != null) {
                    hasNext = true;
                } else {
                    if (!tryOpenReader()) {
                        return hasNext;
                    }
                    // Nothing was previously buffered so try to read one
                    // more line
                    boolean found = false;
                    while (!found) {
                        try {
                            nextBuffer = reader.readLine();
                            found = true;
                        } catch (IOException e) {
                            nextBuffer = null;
                            found = true;
                        }
                    }
                    if (nextBuffer != null) {
                        // There was at least one more line so there is a
                        // next
                        hasNext = true;
                    } else {
                        // The next line was null so it should be the end of
                        // the file. Try to close the reader
                        isEndOfFile = true;
                        tryCloseReader();
                    }
                }
                return hasNext;
            } catch (FileNotFoundException fnfe) {
                throw new AmazonClientException("Cannot find records file", fnfe);
            } catch (IOException ioe) {
                throw new AmazonClientException("IO Error", ioe);
            } finally {
                accessLock.unlock();
            }
        }

        @Override
        public String next() {
            String next = null;
            accessLock.lock();
            try {
                if (nextBuffer != null) {
                    next = nextBuffer;
                    linesRead++;
                    nextBuffer = null;
                } else {
                    if (!tryOpenReader()) {
                        return next;
                    }
                    boolean found = false;
                    while (!found) {
                        try {
                            next = reader.readLine();
                            found = true;
                        } catch (IOException e) {
                            next = null;
                            found = true;
                        }
                    }
                    if (next != null) {
                        linesRead++;
                    } else {
                        isEndOfFile = true;
                        tryCloseReader();
                    }
                }
                return next;
            } catch (FileNotFoundException e) {
                throw new AmazonClientException("Cannot find records file", e);
            } catch (IOException ioe) {
                throw new AmazonClientException("IO Error", ioe);
            } finally {
                accessLock.unlock();
            }
        }

        public String peek() {
            accessLock.lock();
            try {
                hasNext();
                return nextBuffer;
            } finally {
                accessLock.unlock();
            }
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException(
                    "The remove() operation is not supported for this iterator");
        }

        public void removeReadRecords() throws IOException {
            accessLock.lock();
            try {
                deleteReadRecords(linesRead);
                resetReader();
            } finally {
                accessLock.unlock();
            }
        }

        public void removeAllRecords() throws IOException {
            accessLock.lock();
            try {
                deleteAllRecords();
                resetReader();
            } finally {
                accessLock.unlock();
            }
        }

        private void resetReader() throws IOException {
            tryCloseReader();
            linesRead = 0;
            nextBuffer = null;
        }
    }

}
