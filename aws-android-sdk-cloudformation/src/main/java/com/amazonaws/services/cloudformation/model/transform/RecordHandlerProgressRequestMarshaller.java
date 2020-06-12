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
 * StAX request marshaller for RecordHandlerProgressRequest
 */
public class RecordHandlerProgressRequestMarshaller implements
        Marshaller<Request<RecordHandlerProgressRequest>, RecordHandlerProgressRequest> {

    public Request<RecordHandlerProgressRequest> marshall(
            RecordHandlerProgressRequest recordHandlerProgressRequest) {
        if (recordHandlerProgressRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RecordHandlerProgressRequest)");
        }

        Request<RecordHandlerProgressRequest> request = new DefaultRequest<RecordHandlerProgressRequest>(
                recordHandlerProgressRequest, "AWSCloudFormation");
        request.addParameter("Action", "RecordHandlerProgress");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (recordHandlerProgressRequest.getBearerToken() != null) {
            prefix = "BearerToken";
            String bearerToken = recordHandlerProgressRequest.getBearerToken();
            request.addParameter(prefix, StringUtils.fromString(bearerToken));
        }
        if (recordHandlerProgressRequest.getOperationStatus() != null) {
            prefix = "OperationStatus";
            String operationStatus = recordHandlerProgressRequest.getOperationStatus();
            request.addParameter(prefix, StringUtils.fromString(operationStatus));
        }
        if (recordHandlerProgressRequest.getCurrentOperationStatus() != null) {
            prefix = "CurrentOperationStatus";
            String currentOperationStatus = recordHandlerProgressRequest
                    .getCurrentOperationStatus();
            request.addParameter(prefix, StringUtils.fromString(currentOperationStatus));
        }
        if (recordHandlerProgressRequest.getStatusMessage() != null) {
            prefix = "StatusMessage";
            String statusMessage = recordHandlerProgressRequest.getStatusMessage();
            request.addParameter(prefix, StringUtils.fromString(statusMessage));
        }
        if (recordHandlerProgressRequest.getErrorCode() != null) {
            prefix = "ErrorCode";
            String errorCode = recordHandlerProgressRequest.getErrorCode();
            request.addParameter(prefix, StringUtils.fromString(errorCode));
        }
        if (recordHandlerProgressRequest.getResourceModel() != null) {
            prefix = "ResourceModel";
            String resourceModel = recordHandlerProgressRequest.getResourceModel();
            request.addParameter(prefix, StringUtils.fromString(resourceModel));
        }
        if (recordHandlerProgressRequest.getClientRequestToken() != null) {
            prefix = "ClientRequestToken";
            String clientRequestToken = recordHandlerProgressRequest.getClientRequestToken();
            request.addParameter(prefix, StringUtils.fromString(clientRequestToken));
        }

        return request;
    }
}
