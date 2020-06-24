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
 * StAX request marshaller for GetAccountAuthorizationDetailsRequest
 */
public class GetAccountAuthorizationDetailsRequestMarshaller
        implements
        Marshaller<Request<GetAccountAuthorizationDetailsRequest>, GetAccountAuthorizationDetailsRequest> {

    public Request<GetAccountAuthorizationDetailsRequest> marshall(
            GetAccountAuthorizationDetailsRequest getAccountAuthorizationDetailsRequest) {
        if (getAccountAuthorizationDetailsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetAccountAuthorizationDetailsRequest)");
        }

        Request<GetAccountAuthorizationDetailsRequest> request = new DefaultRequest<GetAccountAuthorizationDetailsRequest>(
                getAccountAuthorizationDetailsRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "GetAccountAuthorizationDetails");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (getAccountAuthorizationDetailsRequest.getFilter() != null) {
            prefix = "Filter";
            java.util.List<String> filter = getAccountAuthorizationDetailsRequest.getFilter();
            int filterIndex = 1;
            String filterPrefix = prefix;
            for (String filterItem : filter) {
                prefix = filterPrefix + ".member." + filterIndex;
                if (filterItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(filterItem));
                }
                filterIndex++;
            }
            prefix = filterPrefix;
        }
        if (getAccountAuthorizationDetailsRequest.getMaxItems() != null) {
            prefix = "MaxItems";
            Integer maxItems = getAccountAuthorizationDetailsRequest.getMaxItems();
            request.addParameter(prefix, StringUtils.fromInteger(maxItems));
        }
        if (getAccountAuthorizationDetailsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = getAccountAuthorizationDetailsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }

        return request;
    }
}
