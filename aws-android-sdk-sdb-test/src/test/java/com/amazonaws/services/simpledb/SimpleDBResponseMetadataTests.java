/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpledb;

import com.amazonaws.ResponseMetadata;

import junit.framework.Assert;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class SimpleDBResponseMetadataTests {

    @Test
    public void metadataTests(){
        final Map<String, String> metadata = new HashMap<String, String>();
        metadata.put(SimpleDBResponseMetadata.BOX_USAGE, "1.0");

        SimpleDBResponseMetadata simpleDBMetadata = new SimpleDBResponseMetadata(metadata);
        Assert.assertEquals(simpleDBMetadata.getBoxUsage(), 1.0f, 0f);

        metadata.remove(SimpleDBResponseMetadata.BOX_USAGE);

        ResponseMetadata responseMetadata = new ResponseMetadata(metadata);
        simpleDBMetadata = new SimpleDBResponseMetadata(responseMetadata);
        Assert.assertEquals(simpleDBMetadata.getBoxUsage(), 0f, 0f);

        metadata.put(SimpleDBResponseMetadata.BOX_USAGE, "");
        responseMetadata = new ResponseMetadata(metadata);
        simpleDBMetadata = new SimpleDBResponseMetadata(responseMetadata);
        Assert.assertEquals(simpleDBMetadata.getBoxUsage(), 0f, 0f);
    }
}
