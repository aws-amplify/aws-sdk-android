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
 * StAX request marshaller for AuthorizeDBSecurityGroupIngressRequest
 */
public class AuthorizeDBSecurityGroupIngressRequestMarshaller
        implements
        Marshaller<Request<AuthorizeDBSecurityGroupIngressRequest>, AuthorizeDBSecurityGroupIngressRequest> {

    public Request<AuthorizeDBSecurityGroupIngressRequest> marshall(
            AuthorizeDBSecurityGroupIngressRequest authorizeDBSecurityGroupIngressRequest) {
        if (authorizeDBSecurityGroupIngressRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(AuthorizeDBSecurityGroupIngressRequest)");
        }

        Request<AuthorizeDBSecurityGroupIngressRequest> request = new DefaultRequest<AuthorizeDBSecurityGroupIngressRequest>(
                authorizeDBSecurityGroupIngressRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "AuthorizeDBSecurityGroupIngress");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (authorizeDBSecurityGroupIngressRequest.getDBSecurityGroupName() != null) {
            prefix = "DBSecurityGroupName";
            String dBSecurityGroupName = authorizeDBSecurityGroupIngressRequest
                    .getDBSecurityGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBSecurityGroupName));
        }
        if (authorizeDBSecurityGroupIngressRequest.getCIDRIP() != null) {
            prefix = "CIDRIP";
            String cIDRIP = authorizeDBSecurityGroupIngressRequest.getCIDRIP();
            request.addParameter(prefix, StringUtils.fromString(cIDRIP));
        }
        if (authorizeDBSecurityGroupIngressRequest.getEC2SecurityGroupName() != null) {
            prefix = "EC2SecurityGroupName";
            String eC2SecurityGroupName = authorizeDBSecurityGroupIngressRequest
                    .getEC2SecurityGroupName();
            request.addParameter(prefix, StringUtils.fromString(eC2SecurityGroupName));
        }
        if (authorizeDBSecurityGroupIngressRequest.getEC2SecurityGroupId() != null) {
            prefix = "EC2SecurityGroupId";
            String eC2SecurityGroupId = authorizeDBSecurityGroupIngressRequest
                    .getEC2SecurityGroupId();
            request.addParameter(prefix, StringUtils.fromString(eC2SecurityGroupId));
        }
        if (authorizeDBSecurityGroupIngressRequest.getEC2SecurityGroupOwnerId() != null) {
            prefix = "EC2SecurityGroupOwnerId";
            String eC2SecurityGroupOwnerId = authorizeDBSecurityGroupIngressRequest
                    .getEC2SecurityGroupOwnerId();
            request.addParameter(prefix, StringUtils.fromString(eC2SecurityGroupOwnerId));
        }

        return request;
    }
}
