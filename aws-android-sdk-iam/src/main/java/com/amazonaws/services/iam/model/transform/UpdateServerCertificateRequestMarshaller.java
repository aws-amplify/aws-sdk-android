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
 * StAX request marshaller for UpdateServerCertificateRequest
 */
public class UpdateServerCertificateRequestMarshaller implements
        Marshaller<Request<UpdateServerCertificateRequest>, UpdateServerCertificateRequest> {

    public Request<UpdateServerCertificateRequest> marshall(
            UpdateServerCertificateRequest updateServerCertificateRequest) {
        if (updateServerCertificateRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateServerCertificateRequest)");
        }

        Request<UpdateServerCertificateRequest> request = new DefaultRequest<UpdateServerCertificateRequest>(
                updateServerCertificateRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "UpdateServerCertificate");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (updateServerCertificateRequest.getServerCertificateName() != null) {
            prefix = "ServerCertificateName";
            String serverCertificateName = updateServerCertificateRequest
                    .getServerCertificateName();
            request.addParameter(prefix, StringUtils.fromString(serverCertificateName));
        }
        if (updateServerCertificateRequest.getNewPath() != null) {
            prefix = "NewPath";
            String newPath = updateServerCertificateRequest.getNewPath();
            request.addParameter(prefix, StringUtils.fromString(newPath));
        }
        if (updateServerCertificateRequest.getNewServerCertificateName() != null) {
            prefix = "NewServerCertificateName";
            String newServerCertificateName = updateServerCertificateRequest
                    .getNewServerCertificateName();
            request.addParameter(prefix, StringUtils.fromString(newServerCertificateName));
        }

        return request;
    }
}
