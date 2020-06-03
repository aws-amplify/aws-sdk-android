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
 * StAX request marshaller for UploadSSHPublicKeyRequest
 */
public class UploadSSHPublicKeyRequestMarshaller implements
        Marshaller<Request<UploadSSHPublicKeyRequest>, UploadSSHPublicKeyRequest> {

    public Request<UploadSSHPublicKeyRequest> marshall(
            UploadSSHPublicKeyRequest uploadSSHPublicKeyRequest) {
        if (uploadSSHPublicKeyRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UploadSSHPublicKeyRequest)");
        }

        Request<UploadSSHPublicKeyRequest> request = new DefaultRequest<UploadSSHPublicKeyRequest>(
                uploadSSHPublicKeyRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "UploadSSHPublicKey");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (uploadSSHPublicKeyRequest.getUserName() != null) {
            prefix = "UserName";
            String userName = uploadSSHPublicKeyRequest.getUserName();
            request.addParameter(prefix, StringUtils.fromString(userName));
        }
        if (uploadSSHPublicKeyRequest.getSSHPublicKeyBody() != null) {
            prefix = "SSHPublicKeyBody";
            String sSHPublicKeyBody = uploadSSHPublicKeyRequest.getSSHPublicKeyBody();
            request.addParameter(prefix, StringUtils.fromString(sSHPublicKeyBody));
        }

        return request;
    }
}
