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

package com.amazonaws.services.cloudformation.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for ListTypesRequest
 */
public class ListTypesRequestMarshaller implements
        Marshaller<Request<ListTypesRequest>, ListTypesRequest> {

    public Request<ListTypesRequest> marshall(ListTypesRequest listTypesRequest) {
        if (listTypesRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(ListTypesRequest)");
        }

        Request<ListTypesRequest> request = new DefaultRequest<ListTypesRequest>(listTypesRequest,
                "AWSCloudFormation");
        request.addParameter("Action", "ListTypes");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (listTypesRequest.getVisibility() != null) {
            prefix = "Visibility";
            String visibility = listTypesRequest.getVisibility();
            request.addParameter(prefix, StringUtils.fromString(visibility));
        }
        if (listTypesRequest.getProvisioningType() != null) {
            prefix = "ProvisioningType";
            String provisioningType = listTypesRequest.getProvisioningType();
            request.addParameter(prefix, StringUtils.fromString(provisioningType));
        }
        if (listTypesRequest.getDeprecatedStatus() != null) {
            prefix = "DeprecatedStatus";
            String deprecatedStatus = listTypesRequest.getDeprecatedStatus();
            request.addParameter(prefix, StringUtils.fromString(deprecatedStatus));
        }
        if (listTypesRequest.getMaxResults() != null) {
            prefix = "MaxResults";
            Integer maxResults = listTypesRequest.getMaxResults();
            request.addParameter(prefix, StringUtils.fromInteger(maxResults));
        }
        if (listTypesRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = listTypesRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }

        return request;
    }
}
