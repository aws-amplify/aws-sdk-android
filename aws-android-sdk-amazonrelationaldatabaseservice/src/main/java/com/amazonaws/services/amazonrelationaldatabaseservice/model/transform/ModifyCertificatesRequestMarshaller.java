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

package com.amazonaws.services.amazonrelationaldatabaseservice.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for ModifyCertificatesRequest
 */
public class ModifyCertificatesRequestMarshaller implements
        Marshaller<Request<ModifyCertificatesRequest>, ModifyCertificatesRequest> {

    public Request<ModifyCertificatesRequest> marshall(
            ModifyCertificatesRequest modifyCertificatesRequest) {
        if (modifyCertificatesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyCertificatesRequest)");
        }

        Request<ModifyCertificatesRequest> request = new DefaultRequest<ModifyCertificatesRequest>(
                modifyCertificatesRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "ModifyCertificates");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (modifyCertificatesRequest.getCertificateIdentifier() != null) {
            prefix = "CertificateIdentifier";
            String certificateIdentifier = modifyCertificatesRequest.getCertificateIdentifier();
            request.addParameter(prefix, StringUtils.fromString(certificateIdentifier));
        }
        if (modifyCertificatesRequest.getRemoveCustomerOverride() != null) {
            prefix = "RemoveCustomerOverride";
            Boolean removeCustomerOverride = modifyCertificatesRequest.getRemoveCustomerOverride();
            request.addParameter(prefix, StringUtils.fromBoolean(removeCustomerOverride));
        }

        return request;
    }
}
