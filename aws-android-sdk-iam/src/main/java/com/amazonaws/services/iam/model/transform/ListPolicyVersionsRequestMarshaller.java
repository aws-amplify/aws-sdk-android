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
 * StAX request marshaller for ListPolicyVersionsRequest
 */
public class ListPolicyVersionsRequestMarshaller implements
        Marshaller<Request<ListPolicyVersionsRequest>, ListPolicyVersionsRequest> {

    public Request<ListPolicyVersionsRequest> marshall(
            ListPolicyVersionsRequest listPolicyVersionsRequest) {
        if (listPolicyVersionsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListPolicyVersionsRequest)");
        }

        Request<ListPolicyVersionsRequest> request = new DefaultRequest<ListPolicyVersionsRequest>(
                listPolicyVersionsRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "ListPolicyVersions");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (listPolicyVersionsRequest.getPolicyArn() != null) {
            prefix = "PolicyArn";
            String policyArn = listPolicyVersionsRequest.getPolicyArn();
            request.addParameter(prefix, StringUtils.fromString(policyArn));
        }
        if (listPolicyVersionsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = listPolicyVersionsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (listPolicyVersionsRequest.getMaxItems() != null) {
            prefix = "MaxItems";
            Integer maxItems = listPolicyVersionsRequest.getMaxItems();
            request.addParameter(prefix, StringUtils.fromInteger(maxItems));
        }

        return request;
    }
}
