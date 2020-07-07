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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MimetypesTest {

    /** Tests that file names with mixed case are detected correctly. */
    @Test
    public void testExtensionsWithCaps() throws Exception {
        Mimetypes mt = Mimetypes.getInstance();
        assertEquals(mt.getMimetype("image.JPeG"), "image/jpeg");
    }

    @Test
    public void testRegisterMimetype() {
        Mimetypes mt = new Mimetypes();
        String mimetype = "text/foo";
        mt.registerMimetype("foo", mimetype);
        assertEquals("new mimetype", mimetype, mt.getMimetype("file.foo"));
    }

    @Test
    public void testRegisterMimetypeCap() {
        Mimetypes mt = new Mimetypes();
        String mimetype = "text/foo";
        mt.registerMimetype("FOO", mimetype);
        assertEquals("new mimetype", mimetype, mt.getMimetype("file.foo"));
    }

    @Test
    public void testRegisterMimetypeOverwrite() {
        Mimetypes mt = new Mimetypes();
        assertEquals(mt.getMimetype("image.jpeg"), "image/jpeg");
        String mimetype = "text/plain";
        mt.registerMimetype("jpeg", mimetype);
        assertEquals("new mimetype", mimetype, mt.getMimetype("image.jpeg"));
    }
}

