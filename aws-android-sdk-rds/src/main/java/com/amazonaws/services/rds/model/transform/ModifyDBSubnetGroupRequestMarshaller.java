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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for ModifyDBSubnetGroupRequest
 */
public class ModifyDBSubnetGroupRequestMarshaller implements
        Marshaller<Request<ModifyDBSubnetGroupRequest>, ModifyDBSubnetGroupRequest> {

    public Request<ModifyDBSubnetGroupRequest> marshall(
            ModifyDBSubnetGroupRequest modifyDBSubnetGroupRequest) {
        if (modifyDBSubnetGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyDBSubnetGroupRequest)");
        }

        Request<ModifyDBSubnetGroupRequest> request = new DefaultRequest<ModifyDBSubnetGroupRequest>(
                modifyDBSubnetGroupRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "ModifyDBSubnetGroup");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (modifyDBSubnetGroupRequest.getDBSubnetGroupName() != null) {
            prefix = "DBSubnetGroupName";
            String dBSubnetGroupName = modifyDBSubnetGroupRequest.getDBSubnetGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBSubnetGroupName));
        }
        if (modifyDBSubnetGroupRequest.getDBSubnetGroupDescription() != null) {
            prefix = "DBSubnetGroupDescription";
            String dBSubnetGroupDescription = modifyDBSubnetGroupRequest
                    .getDBSubnetGroupDescription();
            request.addParameter(prefix, StringUtils.fromString(dBSubnetGroupDescription));
        }
        if (modifyDBSubnetGroupRequest.getSubnetIds() != null) {
            prefix = "SubnetIds";
            java.util.List<String> subnetIds = modifyDBSubnetGroupRequest.getSubnetIds();
            int subnetIdsIndex = 1;
            String subnetIdsPrefix = prefix;
            for (String subnetIdsItem : subnetIds) {
                prefix = subnetIdsPrefix + "." + subnetIdsIndex;
                if (subnetIdsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(subnetIdsItem));
                }
                subnetIdsIndex++;
            }
            prefix = subnetIdsPrefix;
        }

        return request;
    }
}
