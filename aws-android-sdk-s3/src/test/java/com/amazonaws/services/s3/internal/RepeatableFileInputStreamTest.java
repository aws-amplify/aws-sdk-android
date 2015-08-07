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

package com.amazonaws.services.s3.internal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class RepeatableFileInputStreamTest {

    @Test
    public void testRead() throws IOException {
        File tmp = File.createTempFile("test" + new Date(), null);
        try {
            FileWriter writer = new FileWriter(tmp);
            writer.write("content");
            writer.close();

            RepeatableFileInputStream rfis = new RepeatableFileInputStream(tmp);
            try {
                ByteArrayOutputStream read = new ByteArrayOutputStream();
                int curr = -1;
                while ((curr = rfis.read()) != -1) {
                    read.write(curr);
                }
                read.flush();

                assertEquals(rfis.getWrappedInputStream().read(), -1);
                assertEquals(read.toString(), "content");
                assertSame(rfis.getFile(), tmp);
            } finally {
                rfis.close();
            }
        } finally {
            tmp.delete();
        }
    }

}
