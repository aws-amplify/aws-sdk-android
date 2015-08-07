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

package com.amazonaws.mobileconnectors.s3.transfermanager;

import com.amazonaws.internal.SdkFilterInputStream;

import java.io.IOException;
import java.io.InputStream;

/**
 * Simple InputStream wrapper for tests that throws an IOException after a
 * certain amount of data has been read.
 */
class CorruptionInputStream extends SdkFilterInputStream {

    /** Flag indicating whether this InputStream has thrown an exception yet. */
    private boolean thrownException = false;

    /** Tracks the current position in the InputStream's data. */
    private long bytesRead;

    /** The point in the data at which an IOException is to be thrown. */
    private long corruptedDataMark;

    public CorruptionInputStream(InputStream in) {
        super(in);
    }

    public void setCorruptedDataMark(long corruptedDataMark) {
        this.corruptedDataMark = corruptedDataMark;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        if (!thrownException && bytesRead >= corruptedDataMark) {
            thrownException = true;
            throw new IOException("Data Corruption from CorruptionInputStream");
        }

        bytesRead += len;
        return super.read(b, off, len);
    }
}
