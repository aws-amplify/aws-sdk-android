/*
 * Copyright 2014-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.marshallers;

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.ArgumentMarshaller.StringAttributeMarshaller;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.S3Link;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

/**
 * A marshaller that marshals {@code S3Link} objects to DynamoDB Strings, using
 * a JSON encoding. For example: {"s3":{"region":"us-west-2",
 * "bucket":"my-bucket-name", "key": "foo/bar/baz.txt"}}.
 */
public final class S3LinkToStringMarshaller implements StringAttributeMarshaller {

    private static final S3LinkToStringMarshaller INSTANCE =
            new S3LinkToStringMarshaller();

    /**
     * returns a singleton instance.
     *
     * @return instance of {@link S3LinkToStringMarshaller}
     */
    public static S3LinkToStringMarshaller instance() {
        return INSTANCE;
    }

    private S3LinkToStringMarshaller() {
    }

    @Override
    public AttributeValue marshall(Object obj) {
        final S3Link s3link = (S3Link) obj;

        if (s3link.getBucketName() == null || s3link.getKey() == null) {
            // insufficient S3 resource specification
            return null;
        }

        return new AttributeValue().withS(s3link.toJson());
    }
}
