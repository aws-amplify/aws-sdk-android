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
import static org.junit.Assert.assertNull;

import com.amazonaws.RequestClientOptions.Marker;

import org.junit.Test;

public class RequestClientOptionsTest {
    @Test
    public void test() {
        RequestClientOptions opts = new RequestClientOptions();
        for (Marker m : Marker.values()) {
            assertNull(opts.getClientMarker(m));
        }
        for (Marker m : Marker.values()) {
            opts.putClientMarker(m, m.name());
        }
        for (Marker m : Marker.values()) {
            assertEquals(m.name(), opts.getClientMarker(m));
        }
        assertEquals(Marker.USER_AGENT.name(), opts.getClientMarker());
        opts.addClientMarker("2nd-agent");
        String ua = opts.getClientMarker();
        assertEquals(ua, Marker.USER_AGENT.name() + " 2nd-agent", ua);
        opts.appendUserAgent("3rd-agent");
        ua = opts.getClientMarker();
        assertEquals(ua, Marker.USER_AGENT.name() + " 2nd-agent 3rd-agent", ua);
        assertEquals(ua, opts.getClientMarker(Marker.USER_AGENT));
    }
}
