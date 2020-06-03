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
 * StAX request marshaller for ListPoliciesGrantingServiceAccessRequest
 */
public class ListPoliciesGrantingServiceAccessRequestMarshaller
        implements
        Marshaller<Request<ListPoliciesGrantingServiceAccessRequest>, ListPoliciesGrantingServiceAccessRequest> {

    public Request<ListPoliciesGrantingServiceAccessRequest> marshall(
            ListPoliciesGrantingServiceAccessRequest listPoliciesGrantingServiceAccessRequest) {
        if (listPoliciesGrantingServiceAccessRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListPoliciesGrantingServiceAccessRequest)");
        }

        Request<ListPoliciesGrantingServiceAccessRequest> request = new DefaultRequest<ListPoliciesGrantingServiceAccessRequest>(
                listPoliciesGrantingServiceAccessRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "ListPoliciesGrantingServiceAccess");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (listPoliciesGrantingServiceAccessRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = listPoliciesGrantingServiceAccessRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (listPoliciesGrantingServiceAccessRequest.getArn() != null) {
            prefix = "Arn";
            String arn = listPoliciesGrantingServiceAccessRequest.getArn();
            request.addParameter(prefix, StringUtils.fromString(arn));
        }
        if (listPoliciesGrantingServiceAccessRequest.getServiceNamespaces() != null) {
            prefix = "ServiceNamespaces";
            java.util.List<String> serviceNamespaces = listPoliciesGrantingServiceAccessRequest
                    .getServiceNamespaces();
            int serviceNamespacesIndex = 1;
            String serviceNamespacesPrefix = prefix;
            for (String serviceNamespacesItem : serviceNamespaces) {
                prefix = serviceNamespacesPrefix + ".member." + serviceNamespacesIndex;
                if (serviceNamespacesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(serviceNamespacesItem));
                }
                serviceNamespacesIndex++;
            }
            prefix = serviceNamespacesPrefix;
        }

        return request;
    }
}
