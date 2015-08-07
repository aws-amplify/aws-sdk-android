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

package com.amazonaws;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class AbortedExceptionTest {

    @Test
    public void testConstructors() {
        AbortedException ae1 = new AbortedException();
        assertNull(ae1.getCause());
        assertEquals(ae1.getMessage(), "");

        AbortedException ae2 = new AbortedException("cause");
        assertEquals(ae2.getLocalizedMessage(), "cause");
        assertNull(ae2.getCause());

        Throwable throwable = new Throwable();
        AbortedException ae3 = new AbortedException(throwable);
        assertSame(ae3.getCause(), throwable);
        assertEquals(ae3.getMessage(), "");

        AbortedException ae4 = new AbortedException("test", throwable);
        assertSame(ae4.getCause(), throwable);
        assertEquals(ae4.getMessage(), "test");
    }

    @Test
    public void testRetryable() {

        AbortedException ae1 = new AbortedException();
        assertFalse(ae1.isRetryable());
    }

}
