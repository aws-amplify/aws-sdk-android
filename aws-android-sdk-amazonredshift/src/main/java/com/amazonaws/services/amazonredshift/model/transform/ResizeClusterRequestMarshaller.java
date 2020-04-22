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
 * StAX request marshaller for ResizeClusterRequest
 */
public class ResizeClusterRequestMarshaller implements
        Marshaller<Request<ResizeClusterRequest>, ResizeClusterRequest> {

    public Request<ResizeClusterRequest> marshall(ResizeClusterRequest resizeClusterRequest) {
        if (resizeClusterRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ResizeClusterRequest)");
        }

        Request<ResizeClusterRequest> request = new DefaultRequest<ResizeClusterRequest>(
                resizeClusterRequest, "AmazonRedshift");
        request.addParameter("Action", "ResizeCluster");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (resizeClusterRequest.getClusterIdentifier() != null) {
            prefix = "ClusterIdentifier";
            String clusterIdentifier = resizeClusterRequest.getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }
        if (resizeClusterRequest.getClusterType() != null) {
            prefix = "ClusterType";
            String clusterType = resizeClusterRequest.getClusterType();
            request.addParameter(prefix, StringUtils.fromString(clusterType));
        }
        if (resizeClusterRequest.getNodeType() != null) {
            prefix = "NodeType";
            String nodeType = resizeClusterRequest.getNodeType();
            request.addParameter(prefix, StringUtils.fromString(nodeType));
        }
        if (resizeClusterRequest.getNumberOfNodes() != null) {
            prefix = "NumberOfNodes";
            Integer numberOfNodes = resizeClusterRequest.getNumberOfNodes();
            request.addParameter(prefix, StringUtils.fromInteger(numberOfNodes));
        }
        if (resizeClusterRequest.getClassic() != null) {
            prefix = "Classic";
            Boolean classic = resizeClusterRequest.getClassic();
            request.addParameter(prefix, StringUtils.fromBoolean(classic));
        }

        return request;
    }
}
