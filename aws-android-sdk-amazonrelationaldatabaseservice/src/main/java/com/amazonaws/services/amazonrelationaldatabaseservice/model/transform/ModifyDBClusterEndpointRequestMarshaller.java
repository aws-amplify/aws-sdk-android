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
 * StAX request marshaller for ModifyDBClusterEndpointRequest
 */
public class ModifyDBClusterEndpointRequestMarshaller implements
        Marshaller<Request<ModifyDBClusterEndpointRequest>, ModifyDBClusterEndpointRequest> {

    public Request<ModifyDBClusterEndpointRequest> marshall(
            ModifyDBClusterEndpointRequest modifyDBClusterEndpointRequest) {
        if (modifyDBClusterEndpointRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyDBClusterEndpointRequest)");
        }

        Request<ModifyDBClusterEndpointRequest> request = new DefaultRequest<ModifyDBClusterEndpointRequest>(
                modifyDBClusterEndpointRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "ModifyDBClusterEndpoint");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (modifyDBClusterEndpointRequest.getDBClusterEndpointIdentifier() != null) {
            prefix = "DBClusterEndpointIdentifier";
            String dBClusterEndpointIdentifier = modifyDBClusterEndpointRequest
                    .getDBClusterEndpointIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBClusterEndpointIdentifier));
        }
        if (modifyDBClusterEndpointRequest.getEndpointType() != null) {
            prefix = "EndpointType";
            String endpointType = modifyDBClusterEndpointRequest.getEndpointType();
            request.addParameter(prefix, StringUtils.fromString(endpointType));
        }
        if (modifyDBClusterEndpointRequest.getStaticMembers() != null) {
            prefix = "StaticMembers";
            java.util.List<String> staticMembers = modifyDBClusterEndpointRequest
                    .getStaticMembers();
            int staticMembersIndex = 1;
            String staticMembersPrefix = prefix;
            for (String staticMembersItem : staticMembers) {
                prefix = staticMembersPrefix + ".member." + staticMembersIndex;
                if (staticMembersItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(staticMembersItem));
                }
                staticMembersIndex++;
            }
            prefix = staticMembersPrefix;
        }
        if (modifyDBClusterEndpointRequest.getExcludedMembers() != null) {
            prefix = "ExcludedMembers";
            java.util.List<String> excludedMembers = modifyDBClusterEndpointRequest
                    .getExcludedMembers();
            int excludedMembersIndex = 1;
            String excludedMembersPrefix = prefix;
            for (String excludedMembersItem : excludedMembers) {
                prefix = excludedMembersPrefix + ".member." + excludedMembersIndex;
                if (excludedMembersItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(excludedMembersItem));
                }
                excludedMembersIndex++;
            }
            prefix = excludedMembersPrefix;
        }

        return request;
    }
}
