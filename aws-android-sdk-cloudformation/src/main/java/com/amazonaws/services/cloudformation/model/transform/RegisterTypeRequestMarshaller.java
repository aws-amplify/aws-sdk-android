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
 * StAX request marshaller for RegisterTypeRequest
 */
public class RegisterTypeRequestMarshaller implements
        Marshaller<Request<RegisterTypeRequest>, RegisterTypeRequest> {

    public Request<RegisterTypeRequest> marshall(RegisterTypeRequest registerTypeRequest) {
        if (registerTypeRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RegisterTypeRequest)");
        }

        Request<RegisterTypeRequest> request = new DefaultRequest<RegisterTypeRequest>(
                registerTypeRequest, "AWSCloudFormation");
        request.addParameter("Action", "RegisterType");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (registerTypeRequest.getType() != null) {
            prefix = "Type";
            String type = registerTypeRequest.getType();
            request.addParameter(prefix, StringUtils.fromString(type));
        }
        if (registerTypeRequest.getTypeName() != null) {
            prefix = "TypeName";
            String typeName = registerTypeRequest.getTypeName();
            request.addParameter(prefix, StringUtils.fromString(typeName));
        }
        if (registerTypeRequest.getSchemaHandlerPackage() != null) {
            prefix = "SchemaHandlerPackage";
            String schemaHandlerPackage = registerTypeRequest.getSchemaHandlerPackage();
            request.addParameter(prefix, StringUtils.fromString(schemaHandlerPackage));
        }
        if (registerTypeRequest.getLoggingConfig() != null) {
            prefix = "LoggingConfig";
            LoggingConfig loggingConfig = registerTypeRequest.getLoggingConfig();
            LoggingConfigStaxMarshaller.getInstance()
                    .marshall(loggingConfig, request, prefix + ".");
        }
        if (registerTypeRequest.getExecutionRoleArn() != null) {
            prefix = "ExecutionRoleArn";
            String executionRoleArn = registerTypeRequest.getExecutionRoleArn();
            request.addParameter(prefix, StringUtils.fromString(executionRoleArn));
        }
        if (registerTypeRequest.getClientRequestToken() != null) {
            prefix = "ClientRequestToken";
            String clientRequestToken = registerTypeRequest.getClientRequestToken();
            request.addParameter(prefix, StringUtils.fromString(clientRequestToken));
        }

        return request;
    }
}
