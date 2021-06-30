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

import org.junit.Test;

public class DefaultRequestTest {

    @Test
    public void testWithParameter() {
        DefaultRequest r = new DefaultRequest("test");
        r.withParameter("test", "value");
        assertEquals(r.getParameters().get("test"), "value");
    }

    @Test
    public void testWithTimeOffset() {
        DefaultRequest r = new DefaultRequest("test");
        r.withTimeOffset(1000L);
        assertEquals(r.getTimeOffset(), 1000L);
    }

}
