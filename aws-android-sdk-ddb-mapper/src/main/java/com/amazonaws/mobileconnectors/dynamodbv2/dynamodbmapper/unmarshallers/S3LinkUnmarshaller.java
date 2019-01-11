/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.unmarshallers;

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.S3ClientCache;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.S3Link;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

/**
 * An unmarshaller that unmarshals DynamoDB S3Links.
 */
public class S3LinkUnmarshaller extends SUnmarshaller {

    private static final S3LinkUnmarshaller INSTANCE = new S3LinkUnmarshaller();

    /**
     * returns a singleton instance.
     *
     * @return instance of {@link S3LinkUnmarshaller}
     */
    public static S3LinkUnmarshaller instance() {
        return INSTANCE;
    }

    private final S3ClientCache clientCache;

    private S3LinkUnmarshaller() {
        this(null);
    }

    /**
     * Constructor.
     * 
     * @param clientCache a {@link S3ClientCache}
     */
    public S3LinkUnmarshaller(S3ClientCache clientCache) {
        this.clientCache = clientCache;
    }

    @Override
    public Object unmarshall(AttributeValue value) {
        if (clientCache == null) {
            throw new IllegalStateException(
                    "Mapper must be constructed with S3 AWS Credentials to "
                            + "load S3Link");
        }

        return S3Link.fromJson(clientCache, value.getS());
    }
}
