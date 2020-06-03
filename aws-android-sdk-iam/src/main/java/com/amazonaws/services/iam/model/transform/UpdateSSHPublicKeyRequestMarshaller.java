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
 * StAX request marshaller for UpdateSSHPublicKeyRequest
 */
public class UpdateSSHPublicKeyRequestMarshaller implements
        Marshaller<Request<UpdateSSHPublicKeyRequest>, UpdateSSHPublicKeyRequest> {

    public Request<UpdateSSHPublicKeyRequest> marshall(
            UpdateSSHPublicKeyRequest updateSSHPublicKeyRequest) {
        if (updateSSHPublicKeyRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateSSHPublicKeyRequest)");
        }

        Request<UpdateSSHPublicKeyRequest> request = new DefaultRequest<UpdateSSHPublicKeyRequest>(
                updateSSHPublicKeyRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "UpdateSSHPublicKey");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (updateSSHPublicKeyRequest.getUserName() != null) {
            prefix = "UserName";
            String userName = updateSSHPublicKeyRequest.getUserName();
            request.addParameter(prefix, StringUtils.fromString(userName));
        }
        if (updateSSHPublicKeyRequest.getSSHPublicKeyId() != null) {
            prefix = "SSHPublicKeyId";
            String sSHPublicKeyId = updateSSHPublicKeyRequest.getSSHPublicKeyId();
            request.addParameter(prefix, StringUtils.fromString(sSHPublicKeyId));
        }
        if (updateSSHPublicKeyRequest.getStatus() != null) {
            prefix = "Status";
            String status = updateSSHPublicKeyRequest.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }

        return request;
    }
}
