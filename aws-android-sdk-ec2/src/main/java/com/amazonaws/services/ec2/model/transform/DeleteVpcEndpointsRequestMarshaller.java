/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Delete Vpc Endpoints Request Marshaller
 */
public class DeleteVpcEndpointsRequestMarshaller implements Marshaller<Request<DeleteVpcEndpointsRequest>, DeleteVpcEndpointsRequest> {

    public Request<DeleteVpcEndpointsRequest> marshall(DeleteVpcEndpointsRequest deleteVpcEndpointsRequest) {

        if (deleteVpcEndpointsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteVpcEndpointsRequest> request = new DefaultRequest<DeleteVpcEndpointsRequest>(deleteVpcEndpointsRequest, "AmazonEC2");
        request.addParameter("Action", "DeleteVpcEndpoints");
        request.addParameter("Version", "2015-10-01");

        java.util.List<String> vpcEndpointIdsList = deleteVpcEndpointsRequest.getVpcEndpointIds();
        int vpcEndpointIdsListIndex = 1;

        for (String vpcEndpointIdsListValue : vpcEndpointIdsList) {
            if (vpcEndpointIdsListValue != null) {
                request.addParameter("VpcEndpointId." + vpcEndpointIdsListIndex, StringUtils.fromString(vpcEndpointIdsListValue));
            }

            vpcEndpointIdsListIndex++;
        }

        return request;
    }
}
