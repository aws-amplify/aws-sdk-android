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
 * StAX request marshaller for UpdateOpenIDConnectProviderThumbprintRequest
 */
public class UpdateOpenIDConnectProviderThumbprintRequestMarshaller
        implements
        Marshaller<Request<UpdateOpenIDConnectProviderThumbprintRequest>, UpdateOpenIDConnectProviderThumbprintRequest> {

    public Request<UpdateOpenIDConnectProviderThumbprintRequest> marshall(
            UpdateOpenIDConnectProviderThumbprintRequest updateOpenIDConnectProviderThumbprintRequest) {
        if (updateOpenIDConnectProviderThumbprintRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateOpenIDConnectProviderThumbprintRequest)");
        }

        Request<UpdateOpenIDConnectProviderThumbprintRequest> request = new DefaultRequest<UpdateOpenIDConnectProviderThumbprintRequest>(
                updateOpenIDConnectProviderThumbprintRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "UpdateOpenIDConnectProviderThumbprint");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (updateOpenIDConnectProviderThumbprintRequest.getOpenIDConnectProviderArn() != null) {
            prefix = "OpenIDConnectProviderArn";
            String openIDConnectProviderArn = updateOpenIDConnectProviderThumbprintRequest
                    .getOpenIDConnectProviderArn();
            request.addParameter(prefix, StringUtils.fromString(openIDConnectProviderArn));
        }
        if (updateOpenIDConnectProviderThumbprintRequest.getThumbprintList() != null) {
            prefix = "ThumbprintList";
            java.util.List<String> thumbprintList = updateOpenIDConnectProviderThumbprintRequest
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
