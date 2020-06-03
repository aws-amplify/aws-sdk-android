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
 * StAX request marshaller for CreateLoginProfileRequest
 */
public class CreateLoginProfileRequestMarshaller implements
        Marshaller<Request<CreateLoginProfileRequest>, CreateLoginProfileRequest> {

    public Request<CreateLoginProfileRequest> marshall(
            CreateLoginProfileRequest createLoginProfileRequest) {
        if (createLoginProfileRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateLoginProfileRequest)");
        }

        Request<CreateLoginProfileRequest> request = new DefaultRequest<CreateLoginProfileRequest>(
                createLoginProfileRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "CreateLoginProfile");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (createLoginProfileRequest.getUserName() != null) {
            prefix = "UserName";
            String userName = createLoginProfileRequest.getUserName();
            request.addParameter(prefix, StringUtils.fromString(userName));
        }
        if (createLoginProfileRequest.getPassword() != null) {
            prefix = "Password";
            String password = createLoginProfileRequest.getPassword();
            request.addParameter(prefix, StringUtils.fromString(password));
        }
        if (createLoginProfileRequest.getPasswordResetRequired() != null) {
            prefix = "PasswordResetRequired";
            Boolean passwordResetRequired = createLoginProfileRequest.getPasswordResetRequired();
            request.addParameter(prefix, StringUtils.fromBoolean(passwordResetRequired));
        }

        return request;
    }
}
