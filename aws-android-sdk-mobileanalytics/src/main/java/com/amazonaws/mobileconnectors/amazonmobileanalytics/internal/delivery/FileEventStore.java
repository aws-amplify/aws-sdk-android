/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery;

import android.util.Log;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.AnalyticsContext;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.FileManager;
import com.amazonaws.util.StringUtils;

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
import java.io.Writer;
import java.util.concurrent.locks.ReentrantLock;
/**
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public class FileEventStore implements EventStore {
    private static final String TAG = "FileEventStore";
    static final String EVENTS_DIRECTORY = "events";
    static final String EVENT_FILE_NAME = "eventsFile";
    static final String KEY_MAX_STORAGE_SIZE = "maxStorageSize";
    static final double ERROR_LENGTH_THRESHOLD_PERCENTAGE = 1.1;
    private final ReentrantLock accessLock = new ReentrantLock(true);

    static long MAX_STORAGE_SIZE = 1024 * 1024 * 5L;

    private final AnalyticsContext context;
    private File eventsFile;

    public static FileEventStore newInstance(final AnalyticsContext context) {
        return new FileEventStore(context);
    }

    public FileEventStore(final AnalyticsContext context) {
        this.context = context;
        tryCreateEventsFile();
    }

    @Override
    public boolean put(final String event) throws EventStoreException {
        boolean success = false;
        BufferedWriter writer = null;

        accessLock.lock();
        try {
            writer = tryInitializeWriter();
            if (writer != null) {
                final long maxStorageSize = context.getConfiguration().optLong(
                        KEY_MAX_STORAGE_SIZE, MAX_STORAGE_SIZE);
                if (eventsFile.length() + event.length() <= maxStorageSize) {
                    writer.write(event);
                    writer.newLine();
                    writer.flush();
                    success = true;
                }
            }
        } catch (IOException e) {
            Log.e(TAG, "Failed to persist the event", e);
        } finally {
            tryCloseWriter(writer);
            accessLock.unlock();
        }

        return success;
    }

    private boolean tryCreateEventsFile() {
        if (eventsFile != null && eventsFile.exists()) {
            return true;
        }

        synchronized (this) {
            if (eventsFile != null && eventsFile.exists()) {
                return true;
            }

            try {
                FileManager fileManager = context.getSystem().getFileManager();
                File eventsDir = fileManager.createDirectory(EVENTS_DIRECTORY);
                eventsFile = fileManager.createFile(new File(eventsDir, EVENT_FILE_NAME));
                return true;
            } catch (IOException e) {
                Log.e(TAG, "Unable to open events file");
                Log.e(TAG, "An error occurred while attempting to create/open the events file", e);
            }
            return false;
        }
    }

    private BufferedWriter tryInitializeWriter() throws EventStoreException {
        BufferedWriter writer = null;
        try {
            if (tryCreateEventsFile()) {
                OutputStream stream = context.getSystem().getFileManager()
                        .newOutputStream(eventsFile, true);
                writer = new BufferedWriter(new OutputStreamWriter(stream, StringUtils.UTF8));
            } else {
                throw new EventStoreException("Unable to create eventsFile");
            }
        } catch (EventStoreException e) {
            throw e;
        } catch (FileNotFoundException e) {
            Log.e(TAG, "Events file not found to persist event to", e);
            throw new EventStoreException("Unable to open events file writer", e);
        } catch (Exception e) {
            Log.e(TAG, "Unexpected exception", e);
            throw new EventStoreException("Unexpected error while creating eventsFile writer", e);
        }
        return writer;
    }

    private void tryCloseWriter(final Writer writer) throws EventStoreException {
        if (writer != null) {
            try {
                writer.close();
            } catch (IOException e) {
                Log.e(TAG, "Unable to close writer for events file", e);
            }
        }
    }

    private File deleteReadEvents(final int lineNumber) {
        // Write all events after line number to a temporary file
        FileManager fileManager = context.getSystem().getFileManager();
        File eventsDir = fileManager.createDirectory(EVENTS_DIRECTORY);

        File tempEventsFile = null;
        try {
            File tempFile = new File(eventsDir, EVENT_FILE_NAME + ".tmp");
            if (tempFile.exists()) {
                if (!tempFile.delete()) {
                    Log.e(TAG, "Failed to delete previous temp file");
                }
            }
            tempEventsFile = fileManager.createFile(tempFile);
        } catch (IOException e) {
            Log.e(TAG,
                    "An error occurred while attempting to create/open the temporary events file",
                    e);
            return eventsFile;
        }

        boolean errorsOccurred = false;
        if (tempEventsFile != null && eventsFile.exists() && tempEventsFile.exists()) {
            BufferedReader reader = null;
            PrintWriter writer = null;
            try {
                reader = new BufferedReader(new FileReader(eventsFile));
                writer = new PrintWriter(new FileWriter(tempEventsFile, true));

                String line = null;
                int currentLineNumber = 0;
                while ((line = reader.readLine()) != null) {
                    currentLineNumber++;
                    if (currentLineNumber > lineNumber) {
                        writer.println(line);
                        writer.flush();
                    }
                }
            } catch (FileNotFoundException e) {
                errorsOccurred = true;
                Log.e(TAG, "The events file count not be found", e);
            } catch (IOException e) {
                Log.e(TAG, "An error occurred while attempting to delete the read events", e);
                errorsOccurred = true;
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

                if (!errorsOccurred) {
                    if (eventsFile.delete()) {
                        if (!tempEventsFile.renameTo(eventsFile)) {
                            Log.e(TAG, "Failed to rename temp file to events file");
                        }
                        try {
                            eventsFile = fileManager
                                    .createFile(new File(eventsDir, EVENT_FILE_NAME));
                        } catch (IOException e) {
                            Log.e(TAG,
                                    "An error occurred while attempting to create the eventsFile",
                                    e);
                        }
                    } else {
                        Log.e(TAG, "Failed to delete previous events file");
                    }
                }
            }

            File tempFile = new File(eventsDir, EVENT_FILE_NAME + ".tmp");
            if (tempFile.exists()) {
                if (!tempFile.delete()) {
                    Log.e(TAG, "Failed to delete temp file");
                }
            }
        }
        return eventsFile;
    }

    @Override
    public EventIterator iterator() {
        return new EventIterator() {
            int linesRead = 0;
            String nextBuffer = null;
            BufferedReader reader = null;
            boolean isEndOfFile = false;

            private boolean tryOpenReader() {
                if (reader != null) {
                    return true;
                }

                if (!isEndOfFile) {
                    InputStreamReader streamReader = null;
                    try {
                        streamReader = new InputStreamReader(context.getSystem().getFileManager()
                                .newInputStream(eventsFile), StringUtils.UTF8);
                    } catch (FileNotFoundException e) {
                        Log.e(TAG, "Could not open the events file", e);
                    }

                    if (streamReader != null) {
                        reader = new BufferedReader(streamReader);
                        return true;
                    }
                }
                return false;
            }

            private void tryCloseReader() {
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException ioe) {
                        Log.e(TAG, "Unable to close reader for events file", ioe);
                    } finally {
                        reader = null;
                    }
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
                } finally {
                    accessLock.unlock();
                }
            }

            @Override
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

            @Override
            public void removeReadEvents() {
                accessLock.lock();
                try {
                    deleteReadEvents(linesRead);
                    resetReader();
                } finally {
                    accessLock.unlock();
                }
            }

            private void resetReader() {
                tryCloseReader();
                linesRead = 0;
                nextBuffer = null;
            }
        };
    }
}
