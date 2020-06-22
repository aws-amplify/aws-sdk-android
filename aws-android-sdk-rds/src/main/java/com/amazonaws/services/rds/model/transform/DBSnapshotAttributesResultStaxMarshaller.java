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

package com.amazonaws.services.rds.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO DBSnapshotAttributesResult
 */
class DBSnapshotAttributesResultStaxMarshaller {

    public void marshall(DBSnapshotAttributesResult _dBSnapshotAttributesResult,
            Request<?> request, String _prefix) {
        String prefix;
        if (_dBSnapshotAttributesResult.getDBSnapshotIdentifier() != null) {
            prefix = _prefix + "DBSnapshotIdentifier";
            String dBSnapshotIdentifier = _dBSnapshotAttributesResult.getDBSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBSnapshotIdentifier));
        }
        if (_dBSnapshotAttributesResult.getDBSnapshotAttributes() != null) {
            prefix = _prefix + "DBSnapshotAttributes";
            java.util.List<DBSnapshotAttribute> dBSnapshotAttributes = _dBSnapshotAttributesResult
                    .getDBSnapshotAttributes();
            int dBSnapshotAttributesIndex = 1;
            String dBSnapshotAttributesPrefix = prefix;
            for (DBSnapshotAttribute dBSnapshotAttributesItem : dBSnapshotAttributes) {
                prefix = dBSnapshotAttributesPrefix + "." + dBSnapshotAttributesIndex;
                if (dBSnapshotAttributesItem != null) {
                    DBSnapshotAttributeStaxMarshaller.getInstance().marshall(
                            dBSnapshotAttributesItem, request, prefix + ".");
                }
                dBSnapshotAttributesIndex++;
            }
            prefix = dBSnapshotAttributesPrefix;
        }
    }

    private static DBSnapshotAttributesResultStaxMarshaller instance;

    public static DBSnapshotAttributesResultStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DBSnapshotAttributesResultStaxMarshaller();
        return instance;
    }
}
