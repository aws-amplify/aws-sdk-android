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

package com.amazonaws.services.route53.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for UpdateHostedZoneCommentRequest
 */
public class UpdateHostedZoneCommentRequestMarshaller implements
        Marshaller<Request<UpdateHostedZoneCommentRequest>, UpdateHostedZoneCommentRequest> {

    public Request<UpdateHostedZoneCommentRequest> marshall(
            UpdateHostedZoneCommentRequest updateHostedZoneCommentRequest) {
        if (updateHostedZoneCommentRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateHostedZoneCommentRequest)");
        }

        Request<UpdateHostedZoneCommentRequest> request = new DefaultRequest<UpdateHostedZoneCommentRequest>(
                updateHostedZoneCommentRequest, "AmazonRoute53");
        request.addParameter("Action", "UpdateHostedZoneComment");
        request.addParameter("Version", "2013-04-01");

        String prefix;
        if (updateHostedZoneCommentRequest.getId() != null) {
            prefix = "Id";
            String id = updateHostedZoneCommentRequest.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (updateHostedZoneCommentRequest.getComment() != null) {
            prefix = "Comment";
            String comment = updateHostedZoneCommentRequest.getComment();
            request.addParameter(prefix, StringUtils.fromString(comment));
        }

        return request;
    }
}
