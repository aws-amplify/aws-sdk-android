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

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery;

import android.util.Log;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.configuration.Configuration;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.FileManager;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.DeliveryClient;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.InternalEvent;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.adapter.JSONEventAdapter;
import com.amazonaws.util.StringUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Set;
import java.util.UUID;

public class MockDeliveryClient implements DeliveryClient {

    private static final String TAG = "MockDeliveryClient";
    public static final String EVENTS_DIRECTORY = "events";

    private final FileManager fileManager;
    private final File eventDirectory;
    private File eventsFile;
    private String lastSubmittedBatch;
    private final JSONEventAdapter adapter;

    public MockDeliveryClient(final Configuration configuration, final FileManager fileManager) {
        this.fileManager = fileManager;
        adapter = new JSONEventAdapter();
        eventDirectory = this.fileManager.createDirectory(EVENTS_DIRECTORY);
        eventsFile = new File(eventDirectory, "events-" + UUID.randomUUID());
        Set<File> files = this.fileManager.listFilesInDirectory(eventDirectory);
        for (File file : files) {
            this.fileManager.deleteFile(file);
        }
        try {
            eventsFile = this.fileManager.createFile(eventsFile);
        } catch (IOException e) {
            eventsFile = null;
        }
    }

    @Override
    public void notify(InternalEvent event) {
        enqueueEventForDelivery(event);
    }

    @Override
    public void enqueueEventForDelivery(InternalEvent event) {
        if (eventsFile != null) {
            OutputStream output = null;
            try {
                output = fileManager.newOutputStream(eventsFile, true);
            } catch (FileNotFoundException e) {
                Log.e(TAG, "Could create output stream to events file");
            }

            if (output != null) {
                OutputStreamWriter writer = null;
                try {
                    writer = new OutputStreamWriter(output);
                    String json = adapter.translateFromEvent(event).toString();
                    if (json != null) {
                        try {
                            writer.write(json);
                            writer.write("\n");
                            writer.flush();
                        } catch (IOException e) {
                            Log.e(TAG, "Could not write the event json to file", e);
                        }
                    }
                } finally {
                    if (writer != null) {
                        try {
                            writer.close();
                        } catch (IOException e) {
                        }
                    }
                }
            }
        } else {
            Log.e(TAG, "Could not write events to file since the file could not be created");
        }
    }

    @Override
    public void attemptDelivery() {
        Log.i(TAG, "Attempting to deliver events to server");
        String currentBatchToSend = getCurrentBatch();

        // Clean up the events file and recreate it
        eventsFile.delete();
        eventsFile = new File(eventDirectory, "events-" + UUID.randomUUID());
        try {
            eventsFile = this.fileManager.createFile(eventsFile);
        } catch (IOException e) {
            eventsFile = null;
        }

        lastSubmittedBatch = currentBatchToSend;
        Log.i(TAG, lastSubmittedBatch);
    }

    private String getCurrentBatch() {
        String currentBatch = null;
        try {
            InputStream input = fileManager.newInputStream(eventsFile);
            final InputStreamReader inReader = new InputStreamReader(input, StringUtils.UTF8);
            final BufferedReader reader = new BufferedReader(inReader);
            try {
                String in = "";
                StringBuilder builder = new StringBuilder();
                try {
                    while ((in = reader.readLine()) != null) {
                        builder.append(in);
                        builder.append(System.getProperty("line.separator"));
                    }
                } catch (IOException e) {
                    Log.e(TAG, "Could not reader the event json in the file", e);
                }
                currentBatch = builder.toString();
            } finally {
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException e) {
                    }
                }
            }
        } catch (FileNotFoundException e) {
            Log.e(TAG, "The events file could not be found", e);
        }

        return currentBatch;
    }

    public String getCurrentEvents() {
        return getCurrentBatch();
    }

    public String getLastSubmittedBatch() {
        return lastSubmittedBatch;
    }

}
