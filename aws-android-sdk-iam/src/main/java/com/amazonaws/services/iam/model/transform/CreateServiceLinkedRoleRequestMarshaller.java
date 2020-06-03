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
 * StAX request marshaller for CreateServiceLinkedRoleRequest
 */
public class CreateServiceLinkedRoleRequestMarshaller implements
        Marshaller<Request<CreateServiceLinkedRoleRequest>, CreateServiceLinkedRoleRequest> {

    public Request<CreateServiceLinkedRoleRequest> marshall(
            CreateServiceLinkedRoleRequest createServiceLinkedRoleRequest) {
        if (createServiceLinkedRoleRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateServiceLinkedRoleRequest)");
        }

        Request<CreateServiceLinkedRoleRequest> request = new DefaultRequest<CreateServiceLinkedRoleRequest>(
                createServiceLinkedRoleRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "CreateServiceLinkedRole");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (createServiceLinkedRoleRequest.getAWSServiceName() != null) {
            prefix = "AWSServiceName";
            String aWSServiceName = createServiceLinkedRoleRequest.getAWSServiceName();
            request.addParameter(prefix, StringUtils.fromString(aWSServiceName));
        }
        if (createServiceLinkedRoleRequest.getDescription() != null) {
            prefix = "Description";
            String description = createServiceLinkedRoleRequest.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (createServiceLinkedRoleRequest.getCustomSuffix() != null) {
            prefix = "CustomSuffix";
            String customSuffix = createServiceLinkedRoleRequest.getCustomSuffix();
            request.addParameter(prefix, StringUtils.fromString(customSuffix));
        }

        return request;
    }
}
