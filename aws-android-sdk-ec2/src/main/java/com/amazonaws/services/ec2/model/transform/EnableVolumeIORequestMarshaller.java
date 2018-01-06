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
 * Enable Volume I O Request Marshaller
 */
public class EnableVolumeIORequestMarshaller implements Marshaller<Request<EnableVolumeIORequest>, EnableVolumeIORequest> {

    public Request<EnableVolumeIORequest> marshall(EnableVolumeIORequest enableVolumeIORequest) {

        if (enableVolumeIORequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<EnableVolumeIORequest> request = new DefaultRequest<EnableVolumeIORequest>(enableVolumeIORequest, "AmazonEC2");
        request.addParameter("Action", "EnableVolumeIO");
        request.addParameter("Version", "2015-10-01");

        if (enableVolumeIORequest.getVolumeId() != null) {
            request.addParameter("VolumeId", StringUtils.fromString(enableVolumeIORequest.getVolumeId()));
        }

        return request;
    }
}
