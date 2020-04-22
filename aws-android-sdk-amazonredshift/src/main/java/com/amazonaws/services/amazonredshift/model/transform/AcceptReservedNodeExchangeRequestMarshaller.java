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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for AcceptReservedNodeExchangeRequest
 */
public class AcceptReservedNodeExchangeRequestMarshaller implements
        Marshaller<Request<AcceptReservedNodeExchangeRequest>, AcceptReservedNodeExchangeRequest> {

    public Request<AcceptReservedNodeExchangeRequest> marshall(
            AcceptReservedNodeExchangeRequest acceptReservedNodeExchangeRequest) {
        if (acceptReservedNodeExchangeRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(AcceptReservedNodeExchangeRequest)");
        }

        Request<AcceptReservedNodeExchangeRequest> request = new DefaultRequest<AcceptReservedNodeExchangeRequest>(
                acceptReservedNodeExchangeRequest, "AmazonRedshift");
        request.addParameter("Action", "AcceptReservedNodeExchange");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (acceptReservedNodeExchangeRequest.getReservedNodeId() != null) {
            prefix = "ReservedNodeId";
            String reservedNodeId = acceptReservedNodeExchangeRequest.getReservedNodeId();
            request.addParameter(prefix, StringUtils.fromString(reservedNodeId));
        }
        if (acceptReservedNodeExchangeRequest.getTargetReservedNodeOfferingId() != null) {
            prefix = "TargetReservedNodeOfferingId";
            String targetReservedNodeOfferingId = acceptReservedNodeExchangeRequest
                    .getTargetReservedNodeOfferingId();
            request.addParameter(prefix, StringUtils.fromString(targetReservedNodeOfferingId));
        }

        return request;
    }
}
