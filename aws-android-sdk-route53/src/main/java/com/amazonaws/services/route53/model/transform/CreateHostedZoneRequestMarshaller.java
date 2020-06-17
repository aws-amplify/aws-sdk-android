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

package com.amazonaws.services.route53.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for CreateHostedZoneRequest
 */
public class CreateHostedZoneRequestMarshaller implements
        Marshaller<Request<CreateHostedZoneRequest>, CreateHostedZoneRequest> {

    public Request<CreateHostedZoneRequest> marshall(CreateHostedZoneRequest createHostedZoneRequest) {
        if (createHostedZoneRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateHostedZoneRequest)");
        }

        Request<CreateHostedZoneRequest> request = new DefaultRequest<CreateHostedZoneRequest>(
                createHostedZoneRequest, "AmazonRoute53");
        request.addParameter("Action", "CreateHostedZone");
        request.addParameter("Version", "2013-04-01");

        String prefix;
        if (createHostedZoneRequest.getName() != null) {
            prefix = "Name";
            String name = createHostedZoneRequest.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (createHostedZoneRequest.getVPC() != null) {
            prefix = "VPC";
            VPC vPC = createHostedZoneRequest.getVPC();
            VPCStaxMarshaller.getInstance().marshall(vPC, request, prefix + ".");
        }
        if (createHostedZoneRequest.getCallerReference() != null) {
            prefix = "CallerReference";
            String callerReference = createHostedZoneRequest.getCallerReference();
            request.addParameter(prefix, StringUtils.fromString(callerReference));
        }
        if (createHostedZoneRequest.getHostedZoneConfig() != null) {
            prefix = "HostedZoneConfig";
            HostedZoneConfig hostedZoneConfig = createHostedZoneRequest.getHostedZoneConfig();
            HostedZoneConfigStaxMarshaller.getInstance().marshall(hostedZoneConfig, request,
                    prefix + ".");
        }
        if (createHostedZoneRequest.getDelegationSetId() != null) {
            prefix = "DelegationSetId";
            String delegationSetId = createHostedZoneRequest.getDelegationSetId();
            request.addParameter(prefix, StringUtils.fromString(delegationSetId));
        }

        return request;
    }
}
