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
 * StAX request marshaller for AuthorizeClusterSecurityGroupIngressRequest
 */
public class AuthorizeClusterSecurityGroupIngressRequestMarshaller
        implements
        Marshaller<Request<AuthorizeClusterSecurityGroupIngressRequest>, AuthorizeClusterSecurityGroupIngressRequest> {

    public Request<AuthorizeClusterSecurityGroupIngressRequest> marshall(
            AuthorizeClusterSecurityGroupIngressRequest authorizeClusterSecurityGroupIngressRequest) {
        if (authorizeClusterSecurityGroupIngressRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(AuthorizeClusterSecurityGroupIngressRequest)");
        }

        Request<AuthorizeClusterSecurityGroupIngressRequest> request = new DefaultRequest<AuthorizeClusterSecurityGroupIngressRequest>(
                authorizeClusterSecurityGroupIngressRequest, "AmazonRedshift");
        request.addParameter("Action", "AuthorizeClusterSecurityGroupIngress");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (authorizeClusterSecurityGroupIngressRequest.getClusterSecurityGroupName() != null) {
            prefix = "ClusterSecurityGroupName";
            String clusterSecurityGroupName = authorizeClusterSecurityGroupIngressRequest
                    .getClusterSecurityGroupName();
            request.addParameter(prefix, StringUtils.fromString(clusterSecurityGroupName));
        }
        if (authorizeClusterSecurityGroupIngressRequest.getCIDRIP() != null) {
            prefix = "CIDRIP";
            String cIDRIP = authorizeClusterSecurityGroupIngressRequest.getCIDRIP();
            request.addParameter(prefix, StringUtils.fromString(cIDRIP));
        }
        if (authorizeClusterSecurityGroupIngressRequest.getEC2SecurityGroupName() != null) {
            prefix = "EC2SecurityGroupName";
            String eC2SecurityGroupName = authorizeClusterSecurityGroupIngressRequest
                    .getEC2SecurityGroupName();
            request.addParameter(prefix, StringUtils.fromString(eC2SecurityGroupName));
        }
        if (authorizeClusterSecurityGroupIngressRequest.getEC2SecurityGroupOwnerId() != null) {
            prefix = "EC2SecurityGroupOwnerId";
            String eC2SecurityGroupOwnerId = authorizeClusterSecurityGroupIngressRequest
                    .getEC2SecurityGroupOwnerId();
            request.addParameter(prefix, StringUtils.fromString(eC2SecurityGroupOwnerId));
        }

        return request;
    }
}
