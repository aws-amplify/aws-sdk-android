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
 * StAX request marshaller for RevokeClusterSecurityGroupIngressRequest
 */
public class RevokeClusterSecurityGroupIngressRequestMarshaller
        implements
        Marshaller<Request<RevokeClusterSecurityGroupIngressRequest>, RevokeClusterSecurityGroupIngressRequest> {

    public Request<RevokeClusterSecurityGroupIngressRequest> marshall(
            RevokeClusterSecurityGroupIngressRequest revokeClusterSecurityGroupIngressRequest) {
        if (revokeClusterSecurityGroupIngressRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RevokeClusterSecurityGroupIngressRequest)");
        }

        Request<RevokeClusterSecurityGroupIngressRequest> request = new DefaultRequest<RevokeClusterSecurityGroupIngressRequest>(
                revokeClusterSecurityGroupIngressRequest, "AmazonRedshift");
        request.addParameter("Action", "RevokeClusterSecurityGroupIngress");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (revokeClusterSecurityGroupIngressRequest.getClusterSecurityGroupName() != null) {
            prefix = "ClusterSecurityGroupName";
            String clusterSecurityGroupName = revokeClusterSecurityGroupIngressRequest
                    .getClusterSecurityGroupName();
            request.addParameter(prefix, StringUtils.fromString(clusterSecurityGroupName));
        }
        if (revokeClusterSecurityGroupIngressRequest.getCIDRIP() != null) {
            prefix = "CIDRIP";
            String cIDRIP = revokeClusterSecurityGroupIngressRequest.getCIDRIP();
            request.addParameter(prefix, StringUtils.fromString(cIDRIP));
        }
        if (revokeClusterSecurityGroupIngressRequest.getEC2SecurityGroupName() != null) {
            prefix = "EC2SecurityGroupName";
            String eC2SecurityGroupName = revokeClusterSecurityGroupIngressRequest
                    .getEC2SecurityGroupName();
            request.addParameter(prefix, StringUtils.fromString(eC2SecurityGroupName));
        }
        if (revokeClusterSecurityGroupIngressRequest.getEC2SecurityGroupOwnerId() != null) {
            prefix = "EC2SecurityGroupOwnerId";
            String eC2SecurityGroupOwnerId = revokeClusterSecurityGroupIngressRequest
                    .getEC2SecurityGroupOwnerId();
            request.addParameter(prefix, StringUtils.fromString(eC2SecurityGroupOwnerId));
        }

        return request;
    }
}
