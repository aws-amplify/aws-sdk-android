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
 * StAX request marshaller for ListPoliciesRequest
 */
public class ListPoliciesRequestMarshaller implements
        Marshaller<Request<ListPoliciesRequest>, ListPoliciesRequest> {

    public Request<ListPoliciesRequest> marshall(ListPoliciesRequest listPoliciesRequest) {
        if (listPoliciesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListPoliciesRequest)");
        }

        Request<ListPoliciesRequest> request = new DefaultRequest<ListPoliciesRequest>(
                listPoliciesRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "ListPolicies");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (listPoliciesRequest.getScope() != null) {
            prefix = "Scope";
            String scope = listPoliciesRequest.getScope();
            request.addParameter(prefix, StringUtils.fromString(scope));
        }
        if (listPoliciesRequest.getOnlyAttached() != null) {
            prefix = "OnlyAttached";
            Boolean onlyAttached = listPoliciesRequest.getOnlyAttached();
            request.addParameter(prefix, StringUtils.fromBoolean(onlyAttached));
        }
        if (listPoliciesRequest.getPathPrefix() != null) {
            prefix = "PathPrefix";
            String pathPrefix = listPoliciesRequest.getPathPrefix();
            request.addParameter(prefix, StringUtils.fromString(pathPrefix));
        }
        if (listPoliciesRequest.getPolicyUsageFilter() != null) {
            prefix = "PolicyUsageFilter";
            String policyUsageFilter = listPoliciesRequest.getPolicyUsageFilter();
            request.addParameter(prefix, StringUtils.fromString(policyUsageFilter));
        }
        if (listPoliciesRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = listPoliciesRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (listPoliciesRequest.getMaxItems() != null) {
            prefix = "MaxItems";
            Integer maxItems = listPoliciesRequest.getMaxItems();
            request.addParameter(prefix, StringUtils.fromInteger(maxItems));
        }

        return request;
    }
}
