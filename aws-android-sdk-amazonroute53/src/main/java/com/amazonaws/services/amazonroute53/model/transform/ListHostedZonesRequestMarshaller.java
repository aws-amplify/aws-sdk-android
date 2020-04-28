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
 * StAX request marshaller for ListHostedZonesRequest
 */
public class ListHostedZonesRequestMarshaller implements
        Marshaller<Request<ListHostedZonesRequest>, ListHostedZonesRequest> {

    public Request<ListHostedZonesRequest> marshall(ListHostedZonesRequest listHostedZonesRequest) {
        if (listHostedZonesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListHostedZonesRequest)");
        }

        Request<ListHostedZonesRequest> request = new DefaultRequest<ListHostedZonesRequest>(
                listHostedZonesRequest, "AmazonRoute53");
        request.addParameter("Action", "ListHostedZones");
        request.addParameter("Version", "2013-04-01");

        String prefix;
        if (listHostedZonesRequest.getMarker() != null) {
            prefix = "marker";
            String marker = listHostedZonesRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (listHostedZonesRequest.getMaxItems() != null) {
            prefix = "maxitems";
            String maxItems = listHostedZonesRequest.getMaxItems();
            request.addParameter(prefix, StringUtils.fromString(maxItems));
        }
        if (listHostedZonesRequest.getDelegationSetId() != null) {
            prefix = "delegationsetid";
            String delegationSetId = listHostedZonesRequest.getDelegationSetId();
            request.addParameter(prefix, StringUtils.fromString(delegationSetId));
        }

        return request;
    }
}
