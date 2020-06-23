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

package com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper;

import com.amazonaws.dynamodbv2.test.util.DynamoDBIntegrationTestBase;
import com.amazonaws.dynamodbv2.test.util.DynamoDBTestBase;

import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

public abstract class DynamoDBMapperIntegrationTestBase extends DynamoDBIntegrationTestBase {

    public static void setUpMapperTestBase() {
        DynamoDBTestBase.setUpTestBase();
    }

    /*
     * Utility methods
     */
    protected static BinaryAttributeByteBufferClass getUniqueByteBufferObject(int contentLength) {
        BinaryAttributeByteBufferClass obj = new BinaryAttributeByteBufferClass();
        obj.setKey(String.valueOf(startKey++));
        obj.setBinaryAttribute(ByteBuffer.wrap(generateByteArray(contentLength)));
        Set<ByteBuffer> byteBufferSet = new HashSet<ByteBuffer>();
        byteBufferSet.add(ByteBuffer.wrap(generateByteArray(contentLength)));
        obj.setBinarySetAttribute(byteBufferSet);
        return obj;
    }
}
