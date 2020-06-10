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
 * JSON request marshaller for ListRepositoriesInDomainRequest
 */
public class ListRepositoriesInDomainRequestMarshaller implements
        Marshaller<Request<ListRepositoriesInDomainRequest>, ListRepositoriesInDomainRequest> {

    public Request<ListRepositoriesInDomainRequest> marshall(
            ListRepositoriesInDomainRequest listRepositoriesInDomainRequest) {
        if (listRepositoriesInDomainRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListRepositoriesInDomainRequest)");
        }

        Request<ListRepositoriesInDomainRequest> request = new DefaultRequest<ListRepositoriesInDomainRequest>(
                listRepositoriesInDomainRequest, "CodeArtifact");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/v1/domain/repositories";
        if (listRepositoriesInDomainRequest.getDomain() != null) {
            request.addParameter("domain",
                    StringUtils.fromString(listRepositoriesInDomainRequest.getDomain()));
        }
        if (listRepositoriesInDomainRequest.getDomainOwner() != null) {
            request.addParameter("domain-owner",
                    StringUtils.fromString(listRepositoriesInDomainRequest.getDomainOwner()));
        }
        if (listRepositoriesInDomainRequest.getAdministratorAccount() != null) {
            request.addParameter("administrator-account", StringUtils
                    .fromString(listRepositoriesInDomainRequest.getAdministratorAccount()));
        }
        if (listRepositoriesInDomainRequest.getRepositoryPrefix() != null) {
            request.addParameter("repository-prefix",
                    StringUtils.fromString(listRepositoriesInDomainRequest.getRepositoryPrefix()));
        }
        if (listRepositoriesInDomainRequest.getMaxResults() != null) {
            request.addParameter("max-results",
                    StringUtils.fromInteger(listRepositoriesInDomainRequest.getMaxResults()));
        }
        if (listRepositoriesInDomainRequest.getNextToken() != null) {
            request.addParameter("next-token",
                    StringUtils.fromString(listRepositoriesInDomainRequest.getNextToken()));
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
