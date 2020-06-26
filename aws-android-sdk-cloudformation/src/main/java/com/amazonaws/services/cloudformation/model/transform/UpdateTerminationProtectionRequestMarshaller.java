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
 * StAX request marshaller for UpdateTerminationProtectionRequest
 */
public class UpdateTerminationProtectionRequestMarshaller implements
        Marshaller<Request<UpdateTerminationProtectionRequest>, UpdateTerminationProtectionRequest> {

    public Request<UpdateTerminationProtectionRequest> marshall(
            UpdateTerminationProtectionRequest updateTerminationProtectionRequest) {
        if (updateTerminationProtectionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateTerminationProtectionRequest)");
        }

        Request<UpdateTerminationProtectionRequest> request = new DefaultRequest<UpdateTerminationProtectionRequest>(
                updateTerminationProtectionRequest, "AWSCloudFormation");
        request.addParameter("Action", "UpdateTerminationProtection");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (updateTerminationProtectionRequest.getEnableTerminationProtection() != null) {
            prefix = "EnableTerminationProtection";
            Boolean enableTerminationProtection = updateTerminationProtectionRequest
                    .getEnableTerminationProtection();
            request.addParameter(prefix, StringUtils.fromBoolean(enableTerminationProtection));
        }
        if (updateTerminationProtectionRequest.getStackName() != null) {
            prefix = "StackName";
            String stackName = updateTerminationProtectionRequest.getStackName();
            request.addParameter(prefix, StringUtils.fromString(stackName));
        }

        return request;
    }
}
