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

package com.amazonaws.services.codeartifact.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.codeartifact.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for AssociateExternalConnectionRequest
 */
public class AssociateExternalConnectionRequestMarshaller implements
        Marshaller<Request<AssociateExternalConnectionRequest>, AssociateExternalConnectionRequest> {

    public Request<AssociateExternalConnectionRequest> marshall(
            AssociateExternalConnectionRequest associateExternalConnectionRequest) {
        if (associateExternalConnectionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(AssociateExternalConnectionRequest)");
        }

        Request<AssociateExternalConnectionRequest> request = new DefaultRequest<AssociateExternalConnectionRequest>(
                associateExternalConnectionRequest, "CodeArtifact");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/v1/repository/external-connection";
        if (associateExternalConnectionRequest.getDomain() != null) {
            request.addParameter("domain",
                    StringUtils.fromString(associateExternalConnectionRequest.getDomain()));
        }
        if (associateExternalConnectionRequest.getDomainOwner() != null) {
            request.addParameter("domain-owner",
                    StringUtils.fromString(associateExternalConnectionRequest.getDomainOwner()));
        }
        if (associateExternalConnectionRequest.getRepository() != null) {
            request.addParameter("repository",
                    StringUtils.fromString(associateExternalConnectionRequest.getRepository()));
        }
        if (associateExternalConnectionRequest.getExternalConnection() != null) {
            request.addParameter("external-connection", StringUtils
                    .fromString(associateExternalConnectionRequest.getExternalConnection()));
        }
        request.setResourcePath(uriResourcePath);
        request.addHeader("Content-Length", "0");
        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
