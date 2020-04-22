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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for ModifyClusterDbRevisionRequest
 */
public class ModifyClusterDbRevisionRequestMarshaller implements
        Marshaller<Request<ModifyClusterDbRevisionRequest>, ModifyClusterDbRevisionRequest> {

    public Request<ModifyClusterDbRevisionRequest> marshall(
            ModifyClusterDbRevisionRequest modifyClusterDbRevisionRequest) {
        if (modifyClusterDbRevisionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyClusterDbRevisionRequest)");
        }

        Request<ModifyClusterDbRevisionRequest> request = new DefaultRequest<ModifyClusterDbRevisionRequest>(
                modifyClusterDbRevisionRequest, "AmazonRedshift");
        request.addParameter("Action", "ModifyClusterDbRevision");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (modifyClusterDbRevisionRequest.getClusterIdentifier() != null) {
            prefix = "ClusterIdentifier";
            String clusterIdentifier = modifyClusterDbRevisionRequest.getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }
        if (modifyClusterDbRevisionRequest.getRevisionTarget() != null) {
            prefix = "RevisionTarget";
            String revisionTarget = modifyClusterDbRevisionRequest.getRevisionTarget();
            request.addParameter(prefix, StringUtils.fromString(revisionTarget));
        }

        return request;
    }
}
