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
 * StAX request marshaller for UpdateServiceSpecificCredentialRequest
 */
public class UpdateServiceSpecificCredentialRequestMarshaller
        implements
        Marshaller<Request<UpdateServiceSpecificCredentialRequest>, UpdateServiceSpecificCredentialRequest> {

    public Request<UpdateServiceSpecificCredentialRequest> marshall(
            UpdateServiceSpecificCredentialRequest updateServiceSpecificCredentialRequest) {
        if (updateServiceSpecificCredentialRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateServiceSpecificCredentialRequest)");
        }

        Request<UpdateServiceSpecificCredentialRequest> request = new DefaultRequest<UpdateServiceSpecificCredentialRequest>(
                updateServiceSpecificCredentialRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "UpdateServiceSpecificCredential");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (updateServiceSpecificCredentialRequest.getUserName() != null) {
            prefix = "UserName";
            String userName = updateServiceSpecificCredentialRequest.getUserName();
            request.addParameter(prefix, StringUtils.fromString(userName));
        }
        if (updateServiceSpecificCredentialRequest.getServiceSpecificCredentialId() != null) {
            prefix = "ServiceSpecificCredentialId";
            String serviceSpecificCredentialId = updateServiceSpecificCredentialRequest
                    .getServiceSpecificCredentialId();
            request.addParameter(prefix, StringUtils.fromString(serviceSpecificCredentialId));
        }
        if (updateServiceSpecificCredentialRequest.getStatus() != null) {
            prefix = "Status";
            String status = updateServiceSpecificCredentialRequest.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }

        return request;
    }
}
