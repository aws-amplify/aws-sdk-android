/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3.model;

import com.amazonaws.internal.MetricAware;
import com.amazonaws.internal.SdkFilterInputStream;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.MetricFilterInputStream;
import com.amazonaws.services.s3.metrics.S3ServiceMetric;

import com.amazonaws.logging.LogFactory;

import java.io.IOException;
import java.io.InputStream;

/**
 * Input stream representing the content of an {@link S3Object}. In addition to
 * the methods supplied by the {@link InputStream} class,
 * {@link S3ObjectInputStream} supplies the abort() method, which will terminate
 * an HTTP connection to the S3 object.
 */
public class S3ObjectInputStream extends SdkFilterInputStream {
    private boolean eof;

    public S3ObjectInputStream(InputStream in) {
        super(wrapWithByteCounting(in)
                ? new MetricFilterInputStream(S3ServiceMetric.S3_DOWLOAD_THROUGHPUT, in)
                : in);
    }

    /**
     * Returns true if we should wrap the given input stream with a byte
     * counting wrapper; false otherwise.
     */
    private static boolean wrapWithByteCounting(InputStream in) {
        if (!AwsSdkMetrics.isMetricsEnabled())
         {
            return false; // metrics is disabled
        }
        if (in instanceof MetricAware) {
            final MetricAware aware = (MetricAware) in;
            // wrap only if not already wrapped in one of it's inner chain of
            // input stream
            return !aware.isMetricActivated();
        }
        return true; // this is a raw input stream so metric wrapping is
                     // necessary
    }

    /**
     * {@inheritDoc} Aborts the underlying http request without reading any more
     * data and closes the stream.
     */
    @Override
    public void abort() {
        doAbort();
    }

    /**
     * To allow customers to override abort to just close. We can think about exposing this method
     * as protected to allow customers to completely prevent the abort behavior if there is a need
     */
    private void doAbort() {
        try {
            close();
        } catch (final IOException e) {
            // expected from some implementations because the stream is closed
            LogFactory.getLog(getClass()).debug("FYI", e);
        }
    }

    /**
     * Returns the value of super.available() if the result is nonzero, or 1
     * otherwise.
     * <p>
     * This is necessary to work around a known bug in
     * GZIPInputStream.available(), which returns zero in some edge cases,
     * causing file truncation.
     * <p>
     * Ref: http://bugs.java.com/bugdatabase/view_bug.do?bug_id=7036144
     */
    @Override
    public int available() throws IOException {
        final int estimate = super.available();
        return estimate == 0 ? 1 : estimate;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int read() throws IOException {
        final int value = super.read();
        if (value == -1) {
            eof = true;
        }
        return value;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int read(byte[] b) throws IOException {
        return read(b, 0, b.length);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        final int value = super.read(b, off, len);
        if (value == -1) {
            eof = true;
        }
        return value;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void reset() throws IOException {
        super.reset();
        eof = false;
    }
}
