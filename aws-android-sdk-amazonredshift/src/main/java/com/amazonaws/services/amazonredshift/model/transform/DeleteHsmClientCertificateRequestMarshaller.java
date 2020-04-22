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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DeleteHsmClientCertificateRequest
 */
public class DeleteHsmClientCertificateRequestMarshaller implements
        Marshaller<Request<DeleteHsmClientCertificateRequest>, DeleteHsmClientCertificateRequest> {

    public Request<DeleteHsmClientCertificateRequest> marshall(
            DeleteHsmClientCertificateRequest deleteHsmClientCertificateRequest) {
        if (deleteHsmClientCertificateRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeleteHsmClientCertificateRequest)");
        }

        Request<DeleteHsmClientCertificateRequest> request = new DefaultRequest<DeleteHsmClientCertificateRequest>(
                deleteHsmClientCertificateRequest, "AmazonRedshift");
        request.addParameter("Action", "DeleteHsmClientCertificate");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (deleteHsmClientCertificateRequest.getHsmClientCertificateIdentifier() != null) {
            prefix = "HsmClientCertificateIdentifier";
            String hsmClientCertificateIdentifier = deleteHsmClientCertificateRequest
                    .getHsmClientCertificateIdentifier();
            request.addParameter(prefix, StringUtils.fromString(hsmClientCertificateIdentifier));
        }

        return request;
    }
}
