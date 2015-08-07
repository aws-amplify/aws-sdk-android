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

package com.amazonaws.internal;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;

public class ListWithAutoConstructFlagTest {

    @Test
    public void testListWithAutoConstructFlag() {
        ListWithAutoConstructFlag<String> noArgs = new ListWithAutoConstructFlag<String>();
        ListWithAutoConstructFlag<String> collect = new ListWithAutoConstructFlag<String>(
                new ArrayList<String>());
        ListWithAutoConstructFlag<String> capacity = new ListWithAutoConstructFlag<String>(5);

        assertFalse(noArgs.isAutoConstruct());
        assertFalse(collect.isAutoConstruct());
        assertFalse(capacity.isAutoConstruct());

        noArgs.setAutoConstruct(true);
        collect.setAutoConstruct(true);
        capacity.setAutoConstruct(true);

        assertTrue(noArgs.isAutoConstruct());
        assertTrue(collect.isAutoConstruct());
        assertTrue(capacity.isAutoConstruct());
    }

}
