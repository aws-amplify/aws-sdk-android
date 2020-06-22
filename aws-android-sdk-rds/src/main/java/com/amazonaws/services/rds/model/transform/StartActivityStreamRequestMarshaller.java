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

package com.amazonaws.services.rds.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for StartActivityStreamRequest
 */
public class StartActivityStreamRequestMarshaller implements
        Marshaller<Request<StartActivityStreamRequest>, StartActivityStreamRequest> {

    public Request<StartActivityStreamRequest> marshall(
            StartActivityStreamRequest startActivityStreamRequest) {
        if (startActivityStreamRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StartActivityStreamRequest)");
        }

        Request<StartActivityStreamRequest> request = new DefaultRequest<StartActivityStreamRequest>(
                startActivityStreamRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "StartActivityStream");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (startActivityStreamRequest.getResourceArn() != null) {
            prefix = "ResourceArn";
            String resourceArn = startActivityStreamRequest.getResourceArn();
            request.addParameter(prefix, StringUtils.fromString(resourceArn));
        }
        if (startActivityStreamRequest.getMode() != null) {
            prefix = "Mode";
            String mode = startActivityStreamRequest.getMode();
            request.addParameter(prefix, StringUtils.fromString(mode));
        }
        if (startActivityStreamRequest.getKmsKeyId() != null) {
            prefix = "KmsKeyId";
            String kmsKeyId = startActivityStreamRequest.getKmsKeyId();
            request.addParameter(prefix, StringUtils.fromString(kmsKeyId));
        }
        if (startActivityStreamRequest.getApplyImmediately() != null) {
            prefix = "ApplyImmediately";
            Boolean applyImmediately = startActivityStreamRequest.getApplyImmediately();
            request.addParameter(prefix, StringUtils.fromBoolean(applyImmediately));
        }

        return request;
    }
}
