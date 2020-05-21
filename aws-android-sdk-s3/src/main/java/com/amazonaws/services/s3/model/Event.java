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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * The bucket event for which to send notifications.
 * </p>
 */
public enum Event {

    S3ReducedRedundancyLostObject("s3:ReducedRedundancyLostObject"),
    S3ObjectCreated("s3:ObjectCreated:*"),
    S3ObjectCreatedPut("s3:ObjectCreated:Put"),
    S3ObjectCreatedPost("s3:ObjectCreated:Post"),
    S3ObjectCreatedCopy("s3:ObjectCreated:Copy"),
    S3ObjectCreatedCompleteMultipartUpload("s3:ObjectCreated:CompleteMultipartUpload"),
    S3ObjectRemoved("s3:ObjectRemoved:*"),
    S3ObjectRemovedDelete("s3:ObjectRemoved:Delete"),
    S3ObjectRemovedDeleteMarkerCreated("s3:ObjectRemoved:DeleteMarkerCreated"),
    S3ObjectRestore("s3:ObjectRestore:*"),
    S3ObjectRestorePost("s3:ObjectRestore:Post"),
    S3ObjectRestoreCompleted("s3:ObjectRestore:Completed"),
    S3Replication("s3:Replication:*"),
    S3ReplicationOperationFailedReplication("s3:Replication:OperationFailedReplication"),
    S3ReplicationOperationNotTracked("s3:Replication:OperationNotTracked"),
    S3ReplicationOperationMissedThreshold("s3:Replication:OperationMissedThreshold"),
    S3ReplicationOperationReplicatedAfterThreshold(
            "s3:Replication:OperationReplicatedAfterThreshold");

    private String value;

    private Event(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, Event> enumMap;
    static {
        enumMap = new HashMap<String, Event>();
        enumMap.put("s3:ReducedRedundancyLostObject", S3ReducedRedundancyLostObject);
        enumMap.put("s3:ObjectCreated:*", S3ObjectCreated);
        enumMap.put("s3:ObjectCreated:Put", S3ObjectCreatedPut);
        enumMap.put("s3:ObjectCreated:Post", S3ObjectCreatedPost);
        enumMap.put("s3:ObjectCreated:Copy", S3ObjectCreatedCopy);
        enumMap.put("s3:ObjectCreated:CompleteMultipartUpload",
                S3ObjectCreatedCompleteMultipartUpload);
        enumMap.put("s3:ObjectRemoved:*", S3ObjectRemoved);
        enumMap.put("s3:ObjectRemoved:Delete", S3ObjectRemovedDelete);
        enumMap.put("s3:ObjectRemoved:DeleteMarkerCreated", S3ObjectRemovedDeleteMarkerCreated);
        enumMap.put("s3:ObjectRestore:*", S3ObjectRestore);
        enumMap.put("s3:ObjectRestore:Post", S3ObjectRestorePost);
        enumMap.put("s3:ObjectRestore:Completed", S3ObjectRestoreCompleted);
        enumMap.put("s3:Replication:*", S3Replication);
        enumMap.put("s3:Replication:OperationFailedReplication",
                S3ReplicationOperationFailedReplication);
        enumMap.put("s3:Replication:OperationNotTracked", S3ReplicationOperationNotTracked);
        enumMap.put("s3:Replication:OperationMissedThreshold",
                S3ReplicationOperationMissedThreshold);
        enumMap.put("s3:Replication:OperationReplicatedAfterThreshold",
                S3ReplicationOperationReplicatedAfterThreshold);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return Event corresponding to the value
     */
    public static Event fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
