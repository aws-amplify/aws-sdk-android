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

package com.amazonaws.services.sns.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for RemovePermissionRequest
 */
public class RemovePermissionRequestMarshaller implements
        Marshaller<Request<RemovePermissionRequest>, RemovePermissionRequest> {

    public Request<RemovePermissionRequest> marshall(RemovePermissionRequest removePermissionRequest) {
        if (removePermissionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RemovePermissionRequest)");
        }

        Request<RemovePermissionRequest> request = new DefaultRequest<RemovePermissionRequest>(
                removePermissionRequest, "AmazonSNS");
        request.addParameter("Action", "RemovePermission");
        request.addParameter("Version", "2010-03-31");

        String prefix;
        if (removePermissionRequest.getTopicArn() != null) {
            prefix = "TopicArn";
            String topicArn = removePermissionRequest.getTopicArn();
            request.addParameter(prefix, StringUtils.fromString(topicArn));
        }
        if (removePermissionRequest.getLabel() != null) {
            prefix = "Label";
            String label = removePermissionRequest.getLabel();
            request.addParameter(prefix, StringUtils.fromString(label));
        }

        return request;
    }
}
