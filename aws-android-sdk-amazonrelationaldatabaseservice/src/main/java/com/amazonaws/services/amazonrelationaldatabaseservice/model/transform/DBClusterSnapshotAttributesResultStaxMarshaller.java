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

package com.amazonaws.services.amazonrelationaldatabaseservice.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO DBClusterSnapshotAttributesResult
 */
class DBClusterSnapshotAttributesResultStaxMarshaller {

    public void marshall(DBClusterSnapshotAttributesResult _dBClusterSnapshotAttributesResult,
            Request<?> request, String _prefix) {
        String prefix;
        if (_dBClusterSnapshotAttributesResult.getDBClusterSnapshotIdentifier() != null) {
            prefix = _prefix + "DBClusterSnapshotIdentifier";
            String dBClusterSnapshotIdentifier = _dBClusterSnapshotAttributesResult
                    .getDBClusterSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBClusterSnapshotIdentifier));
        }
        if (_dBClusterSnapshotAttributesResult.getDBClusterSnapshotAttributes() != null) {
            prefix = _prefix + "DBClusterSnapshotAttributes";
            java.util.List<DBClusterSnapshotAttribute> dBClusterSnapshotAttributes = _dBClusterSnapshotAttributesResult
                    .getDBClusterSnapshotAttributes();
            int dBClusterSnapshotAttributesIndex = 1;
            String dBClusterSnapshotAttributesPrefix = prefix;
            for (DBClusterSnapshotAttribute dBClusterSnapshotAttributesItem : dBClusterSnapshotAttributes) {
                prefix = dBClusterSnapshotAttributesPrefix + "." + dBClusterSnapshotAttributesIndex;
                if (dBClusterSnapshotAttributesItem != null) {
                    DBClusterSnapshotAttributeStaxMarshaller.getInstance().marshall(
                            dBClusterSnapshotAttributesItem, request, prefix + ".");
                }
                dBClusterSnapshotAttributesIndex++;
            }
            prefix = dBClusterSnapshotAttributesPrefix;
        }
    }

    private static DBClusterSnapshotAttributesResultStaxMarshaller instance;

    public static DBClusterSnapshotAttributesResultStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DBClusterSnapshotAttributesResultStaxMarshaller();
        return instance;
    }
}
