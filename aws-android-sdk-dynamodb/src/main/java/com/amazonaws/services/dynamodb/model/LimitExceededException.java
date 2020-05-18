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

package com.amazonaws.services.dynamodb.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * There is no limit to the number of daily on-demand backups that can be taken.
 * </p>
 * <p>
 * Up to 50 simultaneous table operations are allowed per account. These
 * operations include <code>CreateTable</code>, <code>UpdateTable</code>,
 * <code>DeleteTable</code>,<code>UpdateTimeToLive</code>,
 * <code>RestoreTableFromBackup</code>, and
 * <code>RestoreTableToPointInTime</code>.
 * </p>
 * <p>
 * The only exception is when you are creating a table with one or more
 * secondary indexes. You can have up to 25 such requests running at a time;
 * however, if the table or index specifications are complex, DynamoDB might
 * temporarily reduce the number of concurrent operations.
 * </p>
 * <p>
 * There is a soft account limit of 256 tables.
 * </p>
 */
public class LimitExceededException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new LimitExceededException with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public LimitExceededException(String message) {
        super(message);
    }
}
