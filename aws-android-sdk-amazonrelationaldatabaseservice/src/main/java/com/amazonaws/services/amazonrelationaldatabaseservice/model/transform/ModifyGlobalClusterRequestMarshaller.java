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
 * StAX request marshaller for ModifyGlobalClusterRequest
 */
public class ModifyGlobalClusterRequestMarshaller implements
        Marshaller<Request<ModifyGlobalClusterRequest>, ModifyGlobalClusterRequest> {

    public Request<ModifyGlobalClusterRequest> marshall(
            ModifyGlobalClusterRequest modifyGlobalClusterRequest) {
        if (modifyGlobalClusterRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyGlobalClusterRequest)");
        }

        Request<ModifyGlobalClusterRequest> request = new DefaultRequest<ModifyGlobalClusterRequest>(
                modifyGlobalClusterRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "ModifyGlobalCluster");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (modifyGlobalClusterRequest.getGlobalClusterIdentifier() != null) {
            prefix = "GlobalClusterIdentifier";
            String globalClusterIdentifier = modifyGlobalClusterRequest
                    .getGlobalClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(globalClusterIdentifier));
        }
        if (modifyGlobalClusterRequest.getNewGlobalClusterIdentifier() != null) {
            prefix = "NewGlobalClusterIdentifier";
            String newGlobalClusterIdentifier = modifyGlobalClusterRequest
                    .getNewGlobalClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(newGlobalClusterIdentifier));
        }
        if (modifyGlobalClusterRequest.getDeletionProtection() != null) {
            prefix = "DeletionProtection";
            Boolean deletionProtection = modifyGlobalClusterRequest.getDeletionProtection();
            request.addParameter(prefix, StringUtils.fromBoolean(deletionProtection));
        }

        return request;
    }
}
