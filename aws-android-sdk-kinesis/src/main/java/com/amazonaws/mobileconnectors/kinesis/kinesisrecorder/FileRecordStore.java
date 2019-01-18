/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.kinesis.kinesisrecorder;


import com.amazonaws.AmazonClientException;
import com.amazonaws.util.StringUtils;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
class FileRecordStore {
    private static final Log LOGGER = LogFactory.getLog(FileRecordStore.class);
    private final ReentrantLock accessLock = new ReentrantLock(true);

    /** The file the requests are stored in. **/
    private File recordFile;

    /** The FileManager used for interacting with the FS. **/
    private final FileManager fileManager;

    private final String recordFileName;
    private final long maxStorageSize;

    /**
     * Creates the FileRecordStore.
     *
     * @param recorderDirectory The directory (which the FileRecordStore is only
     *            used for the KinesisRecorder) to use to store requests in
     * @param recordFileName Name of the record file
     * @param maxStorageSize Maximum storage size in bytes
     */
    public FileRecordStore(File workDirectory, String recordFileName, long maxStorageSize) {
        this.fileManager = new FileManager(workDirectory);
        this.recordFileName = recordFileName;
        this.maxStorageSize = maxStorageSize;
        try {
            tryCreateRecordsFile();
        } catch (final IOException ioe) {
            throw new AmazonClientException("Failed to create file store", ioe);
        }
    }

    public boolean put(final String record) throws IOException {
        boolean success = false;
        BufferedWriter writer = null;
        accessLock.lock();
        try {
            writer = tryInitializeWriter();
            if (recordFile.length() + record.getBytes(StringUtils.UTF8).length <= maxStorageSize) {
                writer.write(record);
                writer.newLine();
                writer.flush();
                success = true;
            }
        } finally {
            if (writer != null) {
                writer.close();
            }
            accessLock.unlock();
        }

        return success;
    }

    public long getFileSize() {
        return recordFile == null ? 0 : recordFile.length();
    }

    private void tryCreateRecordsFile() throws IOException {
        if (recordFile != null && recordFile.exists()) {
            return;
        }

        synchronized (this) {
            if (recordFile != null && recordFile.exists()) {
                return;
            }

            final File recordDir = fileManager.createDirectory(
                    Constants.RECORDS_DIRECTORY);
            recordFile = fileManager.createFile(new File(
                    recordDir, recordFileName));
        }
    }

    private BufferedWriter tryInitializeWriter() throws IOException {
        BufferedWriter writer = null;
        tryCreateRecordsFile();
        final OutputStream stream = fileManager.newOutputStream(recordFile, true);
        writer = new BufferedWriter(new OutputStreamWriter(stream, StringUtils.UTF8));

        return writer;
    }

    private File deleteAllRecords() throws IOException {
        final File recordsDir = fileManager.createDirectory(
                Constants.RECORDS_DIRECTORY);

        recordFile.delete();

        recordFile = fileManager.createFile(new File(
                recordsDir, recordFileName));
        return recordFile;
    }

    private File deleteReadRecords(final int lineNumber) throws IOException {
        // Write all records after line number to a temporary file
        final File recordsDir = fileManager.createDirectory(
                Constants.RECORDS_DIRECTORY);

        File tempRecordsFile = null;
        final File tempFile = new File(
                recordsDir, recordFileName + ".tmp");
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
                reader = new BufferedReader(new InputStreamReader(new FileInputStream(recordFile),
                        StringUtils.UTF8));
                writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(
                        tempRecordsFile, true), StringUtils.UTF8));

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
                    } catch (final IOException e) {
                        LOGGER.error("failed to close reader", e);
                    }
                }

                if (!recordFile.delete() || !tempRecordsFile.renameTo(recordFile)) {
                    throw new IOException(
                            "Failed to delete read records and persist unread records");
                }
            }

            if (tempFile.exists()) {
                if (!tempFile.delete()) {
                    LOGGER.error("Failed to delete temp file");
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
                streamReader = new InputStreamReader(fileManager.newInputStream(recordFile),
                        StringUtils.UTF8);

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
                        } catch (final IOException e) {
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
            } catch (final FileNotFoundException fnfe) {
                throw new AmazonClientException("Cannot find records file", fnfe);
            } catch (final IOException ioe) {
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
                        } catch (final IOException e) {
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
            } catch (final FileNotFoundException e) {
                throw new AmazonClientException("Cannot find records file", e);
            } catch (final IOException ioe) {
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
            isEndOfFile = false;
        }

        public void close() throws IOException {
            tryCloseReader();
        }
    }
}
