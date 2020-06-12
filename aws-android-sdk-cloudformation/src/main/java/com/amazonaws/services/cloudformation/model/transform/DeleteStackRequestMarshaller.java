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
 * StAX request marshaller for DeleteStackRequest
 */
public class DeleteStackRequestMarshaller implements
        Marshaller<Request<DeleteStackRequest>, DeleteStackRequest> {

    public Request<DeleteStackRequest> marshall(DeleteStackRequest deleteStackRequest) {
        if (deleteStackRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeleteStackRequest)");
        }

        Request<DeleteStackRequest> request = new DefaultRequest<DeleteStackRequest>(
                deleteStackRequest, "AWSCloudFormation");
        request.addParameter("Action", "DeleteStack");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (deleteStackRequest.getStackName() != null) {
            prefix = "StackName";
            String stackName = deleteStackRequest.getStackName();
            request.addParameter(prefix, StringUtils.fromString(stackName));
        }
        if (deleteStackRequest.getRetainResources() != null) {
            prefix = "RetainResources";
            java.util.List<String> retainResources = deleteStackRequest.getRetainResources();
            int retainResourcesIndex = 1;
            String retainResourcesPrefix = prefix;
            for (String retainResourcesItem : retainResources) {
                prefix = retainResourcesPrefix + ".member." + retainResourcesIndex;
                if (retainResourcesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(retainResourcesItem));
                }
                retainResourcesIndex++;
            }
            prefix = retainResourcesPrefix;
        }
        if (deleteStackRequest.getRoleARN() != null) {
            prefix = "RoleARN";
            String roleARN = deleteStackRequest.getRoleARN();
            request.addParameter(prefix, StringUtils.fromString(roleARN));
        }
        if (deleteStackRequest.getClientRequestToken() != null) {
            prefix = "ClientRequestToken";
            String clientRequestToken = deleteStackRequest.getClientRequestToken();
            request.addParameter(prefix, StringUtils.fromString(clientRequestToken));
        }

        return request;
    }
}
