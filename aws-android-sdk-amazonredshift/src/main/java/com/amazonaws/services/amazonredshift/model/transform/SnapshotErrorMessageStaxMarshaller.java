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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO SnapshotErrorMessage
 */
class SnapshotErrorMessageStaxMarshaller {

    public void marshall(SnapshotErrorMessage _snapshotErrorMessage, Request<?> request,
            String _prefix) {
        String prefix;
        if (_snapshotErrorMessage.getSnapshotIdentifier() != null) {
            prefix = _prefix + "SnapshotIdentifier";
            String snapshotIdentifier = _snapshotErrorMessage.getSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(snapshotIdentifier));
        }
        if (_snapshotErrorMessage.getSnapshotClusterIdentifier() != null) {
            prefix = _prefix + "SnapshotClusterIdentifier";
            String snapshotClusterIdentifier = _snapshotErrorMessage.getSnapshotClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(snapshotClusterIdentifier));
        }
        if (_snapshotErrorMessage.getFailureCode() != null) {
            prefix = _prefix + "FailureCode";
            String failureCode = _snapshotErrorMessage.getFailureCode();
            request.addParameter(prefix, StringUtils.fromString(failureCode));
        }
        if (_snapshotErrorMessage.getFailureReason() != null) {
            prefix = _prefix + "FailureReason";
            String failureReason = _snapshotErrorMessage.getFailureReason();
            request.addParameter(prefix, StringUtils.fromString(failureReason));
        }
    }

    private static SnapshotErrorMessageStaxMarshaller instance;

    public static SnapshotErrorMessageStaxMarshaller getInstance() {
        if (instance == null)
            instance = new SnapshotErrorMessageStaxMarshaller();
        return instance;
    }
}
