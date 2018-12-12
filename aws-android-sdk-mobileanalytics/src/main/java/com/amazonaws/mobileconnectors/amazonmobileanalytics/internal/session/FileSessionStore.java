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

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session;

import android.util.Log;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.AnalyticsContext;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.FileManager;
import com.amazonaws.util.StringUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
/**
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public class FileSessionStore implements SessionStore {
    private static final String TAG = "FileSessionStore";

    protected static final String SESSION_DIRECTORY = "sessions";
    protected static final String SESSION_FILE_NAME = "sessionFile";
    static final String KEY_MAX_STORAGE_SIZE = "maxStorageSize";
    static final long MAX_STORAGE_SIZE = 8 * 564 * 5L; // up to 564 ASCII chars
                                                       // 5 timess

    private final AnalyticsContext context;
    private File sessionFile;
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock(true);
    private final ReadLock readSessionLock = lock.readLock();
    private final WriteLock writeSessionLock = lock.writeLock();
    private BufferedReader reader = null;

    public FileSessionStore(final AnalyticsContext context) {
        this.context = context;
        FileManager fileManager = this.context.getSystem().getFileManager();
        File sessionDir = fileManager.createDirectory(SESSION_DIRECTORY);
        try {
            sessionFile = fileManager.createFile(new File(sessionDir, SESSION_FILE_NAME));
        } catch (IOException e) {
            Log.e(TAG, "An error occurred while attempting to create/open the session file", e);
        }
    }

    @Override
    public void storeSession(final Session session) throws SessionStoreException {
        String serializedSession = session.toJSONObject().toString();
        Writer writer = null;
        this.writeSessionLock.lock();
        try {
            try {
                writer = tryInitializeWriter();
                if (writer != null) {
                    final long maxStorageSize = this.context.getConfiguration().optLong(
                            KEY_MAX_STORAGE_SIZE, MAX_STORAGE_SIZE);
                    if (this.sessionFile.length() + serializedSession.length() <= maxStorageSize) {
                        writer.write(serializedSession);
                        writer.flush();
                    } else {
                        Log.e(TAG, "The session file exceeded its allowed size of "
                                + maxStorageSize + " bytes");
                    }
                }
            } catch (IOException e) {
                Log.e(TAG, "Failed to persist the session", e);
                throw new SessionStoreException("Failed to persist the session", e);
            } finally {
                this.tryCloseWriter(writer);
            }
        } finally {
            this.writeSessionLock.unlock();
        }
    }

    private Writer tryInitializeWriter() throws SessionStoreException {
        try {
            createFileDirectories(sessionFile);
            OutputStream stream = context.getSystem().getFileManager()
                    .newOutputStream(sessionFile, false);
            return new OutputStreamWriter(stream, StringUtils.UTF8);
        } catch (FileNotFoundException e) {
            Log.e(TAG, "Unable to save session file", e);
            throw new SessionStoreException("Unable to save session file", e);
        } catch (Exception e) {
            Log.e(TAG, "Unexpected exception", e);
            throw new SessionStoreException("Unable to save session file", e);
        }
    }

    private void tryCloseWriter(final Writer writer) throws SessionStoreException {
        if (writer != null) {
            try {
                writer.close();
            } catch (IOException e) {
                Log.e(TAG, "Unable to close writer for session file", e);
            }
        }
    }

    private boolean tryOpenReader() {
        if (reader != null) {
            return true;
        }

        InputStreamReader streamReader = null;
        try {
            streamReader = new InputStreamReader(context.getSystem()
                    .getFileManager().newInputStream(sessionFile), StringUtils.UTF8);
        } catch (FileNotFoundException e) {
            Log.e(TAG, "Could not open the session file", e);
        }

        if (streamReader != null) {
            this.reader = new BufferedReader(streamReader);
            return true;
        }
        return false;
    }

    private void tryCloseReader() {
        if (this.reader != null) {
            this.readSessionLock.lock();
            try {
                try {
                    this.reader.close();
                } catch (IOException ioe) {
                    Log.e(TAG, "Unable to close reader for session file", ioe);
                } finally {
                    this.reader = null;
                }
            } finally {
                this.readSessionLock.unlock();
            }
        }
    }

    @Override
    public Session getSession() {
        String serializedSession = null;
        this.readSessionLock.lock();
        try {
            try {
                this.tryOpenReader();
                if (this.reader != null) {
                    serializedSession = this.reader.readLine();
                }
            } catch (IOException e) {
                Log.e(TAG, "Failed to read the session", e);
            } finally {
                this.tryCloseReader();
                // Clear out the session file so nothing is persisted after its
                // been loaded into memory
                FileManager fileManager = context.getSystem().getFileManager();
                try {
                    if (fileManager.deleteFile(sessionFile) || !sessionFile.exists()) {
                        sessionFile = fileManager.createFile(sessionFile);
                    }
                } catch (IOException e) {
                    Log.e(TAG, "Unable to clear session file", e);
                }
            }
        } finally {
            this.readSessionLock.unlock();
        }

        return Session.getSessionFromSerializedSession(serializedSession);
    }

    private void createFileDirectories(File file) {
        if(!file.getParentFile().mkdirs() && !file.getParentFile().exists()){ //Ensure all directories are in place before saving session file
            String msg = String.format("Could not create directories for file - %s", file.getAbsolutePath());
            Log.e(TAG, msg);
            throw new SessionStoreException(msg);
        }
    }
}
