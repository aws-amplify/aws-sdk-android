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
 * StAX request marshaller for CreateDBClusterEndpointRequest
 */
public class CreateDBClusterEndpointRequestMarshaller implements
        Marshaller<Request<CreateDBClusterEndpointRequest>, CreateDBClusterEndpointRequest> {

    public Request<CreateDBClusterEndpointRequest> marshall(
            CreateDBClusterEndpointRequest createDBClusterEndpointRequest) {
        if (createDBClusterEndpointRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateDBClusterEndpointRequest)");
        }

        Request<CreateDBClusterEndpointRequest> request = new DefaultRequest<CreateDBClusterEndpointRequest>(
                createDBClusterEndpointRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "CreateDBClusterEndpoint");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (createDBClusterEndpointRequest.getDBClusterIdentifier() != null) {
            prefix = "DBClusterIdentifier";
            String dBClusterIdentifier = createDBClusterEndpointRequest.getDBClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBClusterIdentifier));
        }
        if (createDBClusterEndpointRequest.getDBClusterEndpointIdentifier() != null) {
            prefix = "DBClusterEndpointIdentifier";
            String dBClusterEndpointIdentifier = createDBClusterEndpointRequest
                    .getDBClusterEndpointIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBClusterEndpointIdentifier));
        }
        if (createDBClusterEndpointRequest.getEndpointType() != null) {
            prefix = "EndpointType";
            String endpointType = createDBClusterEndpointRequest.getEndpointType();
            request.addParameter(prefix, StringUtils.fromString(endpointType));
        }
        if (createDBClusterEndpointRequest.getStaticMembers() != null) {
            prefix = "StaticMembers";
            java.util.List<String> staticMembers = createDBClusterEndpointRequest
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
        if (createDBClusterEndpointRequest.getExcludedMembers() != null) {
            prefix = "ExcludedMembers";
            java.util.List<String> excludedMembers = createDBClusterEndpointRequest
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
        if (createDBClusterEndpointRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = createDBClusterEndpointRequest.getTags();
            int tagsIndex = 1;
            String tagsPrefix = prefix;
            for (Tag tagsItem : tags) {
                prefix = tagsPrefix + "." + tagsIndex;
                if (tagsItem != null) {
                    TagStaxMarshaller.getInstance().marshall(tagsItem, request, prefix + ".");
                }
                tagsIndex++;
            }
            prefix = tagsPrefix;
        }

        return request;
    }
}
