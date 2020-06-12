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
 * StAX request marshaller for ListTypeRegistrationsRequest
 */
public class ListTypeRegistrationsRequestMarshaller implements
        Marshaller<Request<ListTypeRegistrationsRequest>, ListTypeRegistrationsRequest> {

    public Request<ListTypeRegistrationsRequest> marshall(
            ListTypeRegistrationsRequest listTypeRegistrationsRequest) {
        if (listTypeRegistrationsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListTypeRegistrationsRequest)");
        }

        Request<ListTypeRegistrationsRequest> request = new DefaultRequest<ListTypeRegistrationsRequest>(
                listTypeRegistrationsRequest, "AWSCloudFormation");
        request.addParameter("Action", "ListTypeRegistrations");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (listTypeRegistrationsRequest.getType() != null) {
            prefix = "Type";
            String type = listTypeRegistrationsRequest.getType();
            request.addParameter(prefix, StringUtils.fromString(type));
        }
        if (listTypeRegistrationsRequest.getTypeName() != null) {
            prefix = "TypeName";
            String typeName = listTypeRegistrationsRequest.getTypeName();
            request.addParameter(prefix, StringUtils.fromString(typeName));
        }
        if (listTypeRegistrationsRequest.getTypeArn() != null) {
            prefix = "TypeArn";
            String typeArn = listTypeRegistrationsRequest.getTypeArn();
            request.addParameter(prefix, StringUtils.fromString(typeArn));
        }
        if (listTypeRegistrationsRequest.getRegistrationStatusFilter() != null) {
            prefix = "RegistrationStatusFilter";
            String registrationStatusFilter = listTypeRegistrationsRequest
                    .getRegistrationStatusFilter();
            request.addParameter(prefix, StringUtils.fromString(registrationStatusFilter));
        }
        if (listTypeRegistrationsRequest.getMaxResults() != null) {
            prefix = "MaxResults";
            Integer maxResults = listTypeRegistrationsRequest.getMaxResults();
            request.addParameter(prefix, StringUtils.fromInteger(maxResults));
        }
        if (listTypeRegistrationsRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = listTypeRegistrationsRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }

        return request;
    }
}
