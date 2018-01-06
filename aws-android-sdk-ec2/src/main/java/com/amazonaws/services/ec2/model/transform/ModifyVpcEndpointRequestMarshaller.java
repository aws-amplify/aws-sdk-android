/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Modify Vpc Endpoint Request Marshaller
 */
public class ModifyVpcEndpointRequestMarshaller implements Marshaller<Request<ModifyVpcEndpointRequest>, ModifyVpcEndpointRequest> {

    public Request<ModifyVpcEndpointRequest> marshall(ModifyVpcEndpointRequest modifyVpcEndpointRequest) {

        if (modifyVpcEndpointRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyVpcEndpointRequest> request = new DefaultRequest<ModifyVpcEndpointRequest>(modifyVpcEndpointRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyVpcEndpoint");
        request.addParameter("Version", "2015-10-01");

        if (modifyVpcEndpointRequest.getVpcEndpointId() != null) {
            request.addParameter("VpcEndpointId", StringUtils.fromString(modifyVpcEndpointRequest.getVpcEndpointId()));
        }
        if (modifyVpcEndpointRequest.isResetPolicy() != null) {
            request.addParameter("ResetPolicy", StringUtils.fromBoolean(modifyVpcEndpointRequest.isResetPolicy()));
        }
        if (modifyVpcEndpointRequest.getPolicyDocument() != null) {
            request.addParameter("PolicyDocument", StringUtils.fromString(modifyVpcEndpointRequest.getPolicyDocument()));
        }

        java.util.List<String> addRouteTableIdsList = modifyVpcEndpointRequest.getAddRouteTableIds();
        int addRouteTableIdsListIndex = 1;

        for (String addRouteTableIdsListValue : addRouteTableIdsList) {
            if (addRouteTableIdsListValue != null) {
                request.addParameter("AddRouteTableId." + addRouteTableIdsListIndex, StringUtils.fromString(addRouteTableIdsListValue));
            }

            addRouteTableIdsListIndex++;
        }

        java.util.List<String> removeRouteTableIdsList = modifyVpcEndpointRequest.getRemoveRouteTableIds();
        int removeRouteTableIdsListIndex = 1;

        for (String removeRouteTableIdsListValue : removeRouteTableIdsList) {
            if (removeRouteTableIdsListValue != null) {
                request.addParameter("RemoveRouteTableId." + removeRouteTableIdsListIndex, StringUtils.fromString(removeRouteTableIdsListValue));
            }

            removeRouteTableIdsListIndex++;
        }

        return request;
    }
}
