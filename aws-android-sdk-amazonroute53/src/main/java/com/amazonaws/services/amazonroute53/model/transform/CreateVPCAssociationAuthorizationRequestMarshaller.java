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
 * StAX request marshaller for CreateVPCAssociationAuthorizationRequest
 */
public class CreateVPCAssociationAuthorizationRequestMarshaller
        implements
        Marshaller<Request<CreateVPCAssociationAuthorizationRequest>, CreateVPCAssociationAuthorizationRequest> {

    public Request<CreateVPCAssociationAuthorizationRequest> marshall(
            CreateVPCAssociationAuthorizationRequest createVPCAssociationAuthorizationRequest) {
        if (createVPCAssociationAuthorizationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateVPCAssociationAuthorizationRequest)");
        }

        Request<CreateVPCAssociationAuthorizationRequest> request = new DefaultRequest<CreateVPCAssociationAuthorizationRequest>(
                createVPCAssociationAuthorizationRequest, "AmazonRoute53");
        request.addParameter("Action", "CreateVPCAssociationAuthorization");
        request.addParameter("Version", "2013-04-01");

        String prefix;
        if (createVPCAssociationAuthorizationRequest.getHostedZoneId() != null) {
            prefix = "Id";
            String hostedZoneId = createVPCAssociationAuthorizationRequest.getHostedZoneId();
            request.addParameter(prefix, StringUtils.fromString(hostedZoneId));
        }
        if (createVPCAssociationAuthorizationRequest.getVPC() != null) {
            prefix = "VPC";
            VPC vPC = createVPCAssociationAuthorizationRequest.getVPC();
            VPCStaxMarshaller.getInstance().marshall(vPC, request, prefix + ".");
        }

        return request;
    }
}
