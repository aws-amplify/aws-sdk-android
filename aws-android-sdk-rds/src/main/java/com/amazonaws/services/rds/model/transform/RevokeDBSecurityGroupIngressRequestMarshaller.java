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
 * StAX request marshaller for RevokeDBSecurityGroupIngressRequest
 */
public class RevokeDBSecurityGroupIngressRequestMarshaller
        implements
        Marshaller<Request<RevokeDBSecurityGroupIngressRequest>, RevokeDBSecurityGroupIngressRequest> {

    public Request<RevokeDBSecurityGroupIngressRequest> marshall(
            RevokeDBSecurityGroupIngressRequest revokeDBSecurityGroupIngressRequest) {
        if (revokeDBSecurityGroupIngressRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RevokeDBSecurityGroupIngressRequest)");
        }

        Request<RevokeDBSecurityGroupIngressRequest> request = new DefaultRequest<RevokeDBSecurityGroupIngressRequest>(
                revokeDBSecurityGroupIngressRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "RevokeDBSecurityGroupIngress");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (revokeDBSecurityGroupIngressRequest.getDBSecurityGroupName() != null) {
            prefix = "DBSecurityGroupName";
            String dBSecurityGroupName = revokeDBSecurityGroupIngressRequest
                    .getDBSecurityGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBSecurityGroupName));
        }
        if (revokeDBSecurityGroupIngressRequest.getCIDRIP() != null) {
            prefix = "CIDRIP";
            String cIDRIP = revokeDBSecurityGroupIngressRequest.getCIDRIP();
            request.addParameter(prefix, StringUtils.fromString(cIDRIP));
        }
        if (revokeDBSecurityGroupIngressRequest.getEC2SecurityGroupName() != null) {
            prefix = "EC2SecurityGroupName";
            String eC2SecurityGroupName = revokeDBSecurityGroupIngressRequest
                    .getEC2SecurityGroupName();
            request.addParameter(prefix, StringUtils.fromString(eC2SecurityGroupName));
        }
        if (revokeDBSecurityGroupIngressRequest.getEC2SecurityGroupId() != null) {
            prefix = "EC2SecurityGroupId";
            String eC2SecurityGroupId = revokeDBSecurityGroupIngressRequest.getEC2SecurityGroupId();
            request.addParameter(prefix, StringUtils.fromString(eC2SecurityGroupId));
        }
        if (revokeDBSecurityGroupIngressRequest.getEC2SecurityGroupOwnerId() != null) {
            prefix = "EC2SecurityGroupOwnerId";
            String eC2SecurityGroupOwnerId = revokeDBSecurityGroupIngressRequest
                    .getEC2SecurityGroupOwnerId();
            request.addParameter(prefix, StringUtils.fromString(eC2SecurityGroupOwnerId));
        }

        return request;
    }
}
