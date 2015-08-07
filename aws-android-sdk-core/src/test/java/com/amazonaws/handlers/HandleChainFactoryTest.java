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

package com.amazonaws.handlers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.amazonaws.AmazonClientException;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class HandleChainFactoryTest {

    @Test
    public void testNewRequestHandler2Chain() throws IOException {

        HandlerChainFactory factory = new HandlerChainFactory();
        List<RequestHandler2> chain = factory
                .newRequestHandler2Chain("/com/amazonaws/handlers/request.handler2s");

        assertEquals(chain.size(), 1);
        assertTrue(chain.get(0) instanceof MockRequestHandler2);
    }

    @Test
    public void testNewRequestHandler1Chain() throws IOException {

        HandlerChainFactory factory = new HandlerChainFactory();
        List<RequestHandler2> chain = factory
                .newRequestHandlerChain("/com/amazonaws/handlers/request.handlers");

        assertEquals(chain.size(), 1);
        assertTrue(chain.get(0) instanceof RequestHandler2Adaptor);
        assertEquals(chain.get(0).hashCode(), 1);
    }

    @Test(expected = AmazonClientException.class)
    public void testNewRequestHandlerChainFailsWhenRequest1AndRequest2HandlersMixed()
            throws IOException {

        HandlerChainFactory factory = new HandlerChainFactory();
        List<RequestHandler2> chain = factory
                .newRequestHandlerChain("/com/amazonaws/handlers/mixed.handlers");
    }
}
