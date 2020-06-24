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
 * StAX request marshaller for CreateSAMLProviderRequest
 */
public class CreateSAMLProviderRequestMarshaller implements
        Marshaller<Request<CreateSAMLProviderRequest>, CreateSAMLProviderRequest> {

    public Request<CreateSAMLProviderRequest> marshall(
            CreateSAMLProviderRequest createSAMLProviderRequest) {
        if (createSAMLProviderRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateSAMLProviderRequest)");
        }

        Request<CreateSAMLProviderRequest> request = new DefaultRequest<CreateSAMLProviderRequest>(
                createSAMLProviderRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "CreateSAMLProvider");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (createSAMLProviderRequest.getSAMLMetadataDocument() != null) {
            prefix = "SAMLMetadataDocument";
            String sAMLMetadataDocument = createSAMLProviderRequest.getSAMLMetadataDocument();
            request.addParameter(prefix, StringUtils.fromString(sAMLMetadataDocument));
        }
        if (createSAMLProviderRequest.getName() != null) {
            prefix = "Name";
            String name = createSAMLProviderRequest.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }

        return request;
    }
}
