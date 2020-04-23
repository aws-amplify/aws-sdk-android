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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for ModifyDBSnapshotAttributeRequest
 */
public class ModifyDBSnapshotAttributeRequestMarshaller implements
        Marshaller<Request<ModifyDBSnapshotAttributeRequest>, ModifyDBSnapshotAttributeRequest> {

    public Request<ModifyDBSnapshotAttributeRequest> marshall(
            ModifyDBSnapshotAttributeRequest modifyDBSnapshotAttributeRequest) {
        if (modifyDBSnapshotAttributeRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyDBSnapshotAttributeRequest)");
        }

        Request<ModifyDBSnapshotAttributeRequest> request = new DefaultRequest<ModifyDBSnapshotAttributeRequest>(
                modifyDBSnapshotAttributeRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "ModifyDBSnapshotAttribute");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (modifyDBSnapshotAttributeRequest.getDBSnapshotIdentifier() != null) {
            prefix = "DBSnapshotIdentifier";
            String dBSnapshotIdentifier = modifyDBSnapshotAttributeRequest
                    .getDBSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBSnapshotIdentifier));
        }
        if (modifyDBSnapshotAttributeRequest.getAttributeName() != null) {
            prefix = "AttributeName";
            String attributeName = modifyDBSnapshotAttributeRequest.getAttributeName();
            request.addParameter(prefix, StringUtils.fromString(attributeName));
        }
        if (modifyDBSnapshotAttributeRequest.getValuesToAdd() != null) {
            prefix = "ValuesToAdd";
            java.util.List<String> valuesToAdd = modifyDBSnapshotAttributeRequest.getValuesToAdd();
            int valuesToAddIndex = 1;
            String valuesToAddPrefix = prefix;
            for (String valuesToAddItem : valuesToAdd) {
                prefix = valuesToAddPrefix + "." + valuesToAddIndex;
                if (valuesToAddItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(valuesToAddItem));
                }
                valuesToAddIndex++;
            }
            prefix = valuesToAddPrefix;
        }
        if (modifyDBSnapshotAttributeRequest.getValuesToRemove() != null) {
            prefix = "ValuesToRemove";
            java.util.List<String> valuesToRemove = modifyDBSnapshotAttributeRequest
                    .getValuesToRemove();
            int valuesToRemoveIndex = 1;
            String valuesToRemovePrefix = prefix;
            for (String valuesToRemoveItem : valuesToRemove) {
                prefix = valuesToRemovePrefix + "." + valuesToRemoveIndex;
                if (valuesToRemoveItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(valuesToRemoveItem));
                }
                valuesToRemoveIndex++;
            }
            prefix = valuesToRemovePrefix;
        }

        return request;
    }
}
