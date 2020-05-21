/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The bucket you tried to create already exists, and you own it. Amazon S3
 * returns this error in all AWS Regions except in the North Virginia Region.
 * For legacy compatibility, if you re-create an existing bucket that you
 * already own in the North Virginia Region, Amazon S3 returns 200 OK and resets
 * the bucket access control lists (ACLs).
 * </p>
 */
public class BucketAlreadyOwnedByYouException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new BucketAlreadyOwnedByYouException with the specified
     * error message.
     *
     * @param message Describes the error encountered.
     */
    public BucketAlreadyOwnedByYouException(String message) {
        super(message);
    }
}
