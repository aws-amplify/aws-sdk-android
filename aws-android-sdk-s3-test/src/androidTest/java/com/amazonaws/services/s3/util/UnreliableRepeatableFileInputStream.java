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

package com.amazonaws.services.s3.util;

import com.amazonaws.services.s3.internal.RepeatableFileInputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Subclass of RepeatableFileInputStream that throws an error during the first
 * read through the data, but allows RepeatableFileInputStream to reset the file
 * back to the beginning to read all the data successfully the next time. Used
 * for triggering retry functionality in tests to verify that different types of
 * requests can be successfully retried after errors.
 */
public class UnreliableRepeatableFileInputStream extends RepeatableFileInputStream {

    /** True if this stream has already triggered an exception */
    private boolean hasTriggeredAnException = false;
    private int position;

    public UnreliableRepeatableFileInputStream(File file) throws FileNotFoundException {
        super(file);
    }

    @Override
    public int read() throws IOException {
        int read = super.read();
        if (read != -1)
            position++;
        triggerError();
        return read;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int read = super.read(b, off, len);
        position += read;
        triggerError();
        return read;
    }

    private void triggerError() throws IOException {
        if (hasTriggeredAnException)
            return;

        if (position >= 100) {
            hasTriggeredAnException = true;
            throw new IOException("Simulated error on UnreliableFileInputStream");
        }
    }
}
