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
 * StAX marshaller for POJO DBClusterSnapshotAttribute
 */
class DBClusterSnapshotAttributeStaxMarshaller {

    public void marshall(DBClusterSnapshotAttribute _dBClusterSnapshotAttribute,
            Request<?> request, String _prefix) {
        String prefix;
        if (_dBClusterSnapshotAttribute.getAttributeName() != null) {
            prefix = _prefix + "AttributeName";
            String attributeName = _dBClusterSnapshotAttribute.getAttributeName();
            request.addParameter(prefix, StringUtils.fromString(attributeName));
        }
        if (_dBClusterSnapshotAttribute.getAttributeValues() != null) {
            prefix = _prefix + "AttributeValues";
            java.util.List<String> attributeValues = _dBClusterSnapshotAttribute
                    .getAttributeValues();
            int attributeValuesIndex = 1;
            String attributeValuesPrefix = prefix;
            for (String attributeValuesItem : attributeValues) {
                prefix = attributeValuesPrefix + "." + attributeValuesIndex;
                if (attributeValuesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(attributeValuesItem));
                }
                attributeValuesIndex++;
            }
            prefix = attributeValuesPrefix;
        }
    }

    private static DBClusterSnapshotAttributeStaxMarshaller instance;

    public static DBClusterSnapshotAttributeStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DBClusterSnapshotAttributeStaxMarshaller();
        return instance;
    }
}
