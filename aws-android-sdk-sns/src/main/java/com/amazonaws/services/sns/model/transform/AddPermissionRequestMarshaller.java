/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * StAX request marshaller for AddPermissionRequest
 */
public class AddPermissionRequestMarshaller implements
        Marshaller<Request<AddPermissionRequest>, AddPermissionRequest> {

    public Request<AddPermissionRequest> marshall(AddPermissionRequest addPermissionRequest) {
        if (addPermissionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(AddPermissionRequest)");
        }

        Request<AddPermissionRequest> request = new DefaultRequest<AddPermissionRequest>(
                addPermissionRequest, "AmazonSNS");
        request.addParameter("Action", "AddPermission");
        request.addParameter("Version", "2010-03-31");

        String prefix;
        if (addPermissionRequest.getTopicArn() != null) {
            prefix = "TopicArn";
            String topicArn = addPermissionRequest.getTopicArn();
            request.addParameter(prefix, StringUtils.fromString(topicArn));
        }
        if (addPermissionRequest.getLabel() != null) {
            prefix = "Label";
            String label = addPermissionRequest.getLabel();
            request.addParameter(prefix, StringUtils.fromString(label));
        }
        if (addPermissionRequest.getAWSAccountIds() != null) {
            prefix = "AWSAccountId";
            java.util.List<String> aWSAccountIds = addPermissionRequest.getAWSAccountIds();
            int aWSAccountIdsIndex = 1;
            String aWSAccountIdsPrefix = prefix;
            for (String aWSAccountIdsItem : aWSAccountIds) {
                prefix = aWSAccountIdsPrefix + ".member." + aWSAccountIdsIndex;
                if (aWSAccountIdsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(aWSAccountIdsItem));
                }
                aWSAccountIdsIndex++;
            }
            prefix = aWSAccountIdsPrefix;
        }
        if (addPermissionRequest.getActionNames() != null) {
            prefix = "ActionName";
            java.util.List<String> actionNames = addPermissionRequest.getActionNames();
            int actionNamesIndex = 1;
            String actionNamesPrefix = prefix;
            for (String actionNamesItem : actionNames) {
                prefix = actionNamesPrefix + ".member." + actionNamesIndex;
                if (actionNamesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(actionNamesItem));
                }
                actionNamesIndex++;
            }
            prefix = actionNamesPrefix;
        }

        return request;
    }
}
