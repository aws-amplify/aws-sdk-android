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
 * StAX request marshaller for CreateOpenIDConnectProviderRequest
 */
public class CreateOpenIDConnectProviderRequestMarshaller implements
        Marshaller<Request<CreateOpenIDConnectProviderRequest>, CreateOpenIDConnectProviderRequest> {

    public Request<CreateOpenIDConnectProviderRequest> marshall(
            CreateOpenIDConnectProviderRequest createOpenIDConnectProviderRequest) {
        if (createOpenIDConnectProviderRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateOpenIDConnectProviderRequest)");
        }

        Request<CreateOpenIDConnectProviderRequest> request = new DefaultRequest<CreateOpenIDConnectProviderRequest>(
                createOpenIDConnectProviderRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "CreateOpenIDConnectProvider");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (createOpenIDConnectProviderRequest.getUrl() != null) {
            prefix = "Url";
            String url = createOpenIDConnectProviderRequest.getUrl();
            request.addParameter(prefix, StringUtils.fromString(url));
        }
        if (createOpenIDConnectProviderRequest.getClientIDList() != null) {
            prefix = "ClientIDList";
            java.util.List<String> clientIDList = createOpenIDConnectProviderRequest
                    .getClientIDList();
            int clientIDListIndex = 1;
            String clientIDListPrefix = prefix;
            for (String clientIDListItem : clientIDList) {
                prefix = clientIDListPrefix + ".member." + clientIDListIndex;
                if (clientIDListItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(clientIDListItem));
                }
                clientIDListIndex++;
            }
            prefix = clientIDListPrefix;
        }
        if (createOpenIDConnectProviderRequest.getThumbprintList() != null) {
            prefix = "ThumbprintList";
            java.util.List<String> thumbprintList = createOpenIDConnectProviderRequest
                    .getThumbprintList();
            int thumbprintListIndex = 1;
            String thumbprintListPrefix = prefix;
            for (String thumbprintListItem : thumbprintList) {
                prefix = thumbprintListPrefix + ".member." + thumbprintListIndex;
                if (thumbprintListItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(thumbprintListItem));
                }
                thumbprintListIndex++;
            }
            prefix = thumbprintListPrefix;
        }

        return request;
    }
}
