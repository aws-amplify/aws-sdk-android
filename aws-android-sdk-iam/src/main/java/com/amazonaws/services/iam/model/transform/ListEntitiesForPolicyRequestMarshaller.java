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

package com.amazonaws.services.iam.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.iam.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for ListEntitiesForPolicyRequest
 */
public class ListEntitiesForPolicyRequestMarshaller implements
        Marshaller<Request<ListEntitiesForPolicyRequest>, ListEntitiesForPolicyRequest> {

    public Request<ListEntitiesForPolicyRequest> marshall(
            ListEntitiesForPolicyRequest listEntitiesForPolicyRequest) {
        if (listEntitiesForPolicyRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListEntitiesForPolicyRequest)");
        }

        Request<ListEntitiesForPolicyRequest> request = new DefaultRequest<ListEntitiesForPolicyRequest>(
                listEntitiesForPolicyRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "ListEntitiesForPolicy");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (listEntitiesForPolicyRequest.getPolicyArn() != null) {
            prefix = "PolicyArn";
            String policyArn = listEntitiesForPolicyRequest.getPolicyArn();
            request.addParameter(prefix, StringUtils.fromString(policyArn));
        }
        if (listEntitiesForPolicyRequest.getEntityFilter() != null) {
            prefix = "EntityFilter";
            String entityFilter = listEntitiesForPolicyRequest.getEntityFilter();
            request.addParameter(prefix, StringUtils.fromString(entityFilter));
        }
        if (listEntitiesForPolicyRequest.getPathPrefix() != null) {
            prefix = "PathPrefix";
            String pathPrefix = listEntitiesForPolicyRequest.getPathPrefix();
            request.addParameter(prefix, StringUtils.fromString(pathPrefix));
        }
        if (listEntitiesForPolicyRequest.getPolicyUsageFilter() != null) {
            prefix = "PolicyUsageFilter";
            String policyUsageFilter = listEntitiesForPolicyRequest.getPolicyUsageFilter();
            request.addParameter(prefix, StringUtils.fromString(policyUsageFilter));
        }
        if (listEntitiesForPolicyRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = listEntitiesForPolicyRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (listEntitiesForPolicyRequest.getMaxItems() != null) {
            prefix = "MaxItems";
            Integer maxItems = listEntitiesForPolicyRequest.getMaxItems();
            request.addParameter(prefix, StringUtils.fromInteger(maxItems));
        }

        return request;
    }
}
