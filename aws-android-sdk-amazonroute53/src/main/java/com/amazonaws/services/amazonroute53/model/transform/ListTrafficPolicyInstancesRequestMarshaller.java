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

package com.amazonaws.services.amazonroute53.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonroute53.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for ListTrafficPolicyInstancesRequest
 */
public class ListTrafficPolicyInstancesRequestMarshaller implements
        Marshaller<Request<ListTrafficPolicyInstancesRequest>, ListTrafficPolicyInstancesRequest> {

    public Request<ListTrafficPolicyInstancesRequest> marshall(
            ListTrafficPolicyInstancesRequest listTrafficPolicyInstancesRequest) {
        if (listTrafficPolicyInstancesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListTrafficPolicyInstancesRequest)");
        }

        Request<ListTrafficPolicyInstancesRequest> request = new DefaultRequest<ListTrafficPolicyInstancesRequest>(
                listTrafficPolicyInstancesRequest, "AmazonRoute53");
        request.addParameter("Action", "ListTrafficPolicyInstances");
        request.addParameter("Version", "2013-04-01");

        String prefix;
        if (listTrafficPolicyInstancesRequest.getHostedZoneIdMarker() != null) {
            prefix = "hostedzoneid";
            String hostedZoneIdMarker = listTrafficPolicyInstancesRequest.getHostedZoneIdMarker();
            request.addParameter(prefix, StringUtils.fromString(hostedZoneIdMarker));
        }
        if (listTrafficPolicyInstancesRequest.getTrafficPolicyInstanceNameMarker() != null) {
            prefix = "trafficpolicyinstancename";
            String trafficPolicyInstanceNameMarker = listTrafficPolicyInstancesRequest
                    .getTrafficPolicyInstanceNameMarker();
            request.addParameter(prefix, StringUtils.fromString(trafficPolicyInstanceNameMarker));
        }
        if (listTrafficPolicyInstancesRequest.getTrafficPolicyInstanceTypeMarker() != null) {
            prefix = "trafficpolicyinstancetype";
            String trafficPolicyInstanceTypeMarker = listTrafficPolicyInstancesRequest
                    .getTrafficPolicyInstanceTypeMarker();
            request.addParameter(prefix, StringUtils.fromString(trafficPolicyInstanceTypeMarker));
        }
        if (listTrafficPolicyInstancesRequest.getMaxItems() != null) {
            prefix = "maxitems";
            String maxItems = listTrafficPolicyInstancesRequest.getMaxItems();
            request.addParameter(prefix, StringUtils.fromString(maxItems));
        }

        return request;
    }
}
