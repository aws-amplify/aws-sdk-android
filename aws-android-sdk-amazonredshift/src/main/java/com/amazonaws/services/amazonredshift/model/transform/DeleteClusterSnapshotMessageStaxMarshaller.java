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
 * StAX marshaller for POJO DeleteClusterSnapshotMessage
 */
class DeleteClusterSnapshotMessageStaxMarshaller {

    public void marshall(DeleteClusterSnapshotMessage _deleteClusterSnapshotMessage,
            Request<?> request, String _prefix) {
        String prefix;
        if (_deleteClusterSnapshotMessage.getSnapshotIdentifier() != null) {
            prefix = _prefix + "SnapshotIdentifier";
            String snapshotIdentifier = _deleteClusterSnapshotMessage.getSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(snapshotIdentifier));
        }
        if (_deleteClusterSnapshotMessage.getSnapshotClusterIdentifier() != null) {
            prefix = _prefix + "SnapshotClusterIdentifier";
            String snapshotClusterIdentifier = _deleteClusterSnapshotMessage
                    .getSnapshotClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(snapshotClusterIdentifier));
        }
    }

    private static DeleteClusterSnapshotMessageStaxMarshaller instance;

    public static DeleteClusterSnapshotMessageStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DeleteClusterSnapshotMessageStaxMarshaller();
        return instance;
    }
}
