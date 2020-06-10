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
 * JSON request marshaller for ListPackageVersionDependenciesRequest
 */
public class ListPackageVersionDependenciesRequestMarshaller
        implements
        Marshaller<Request<ListPackageVersionDependenciesRequest>, ListPackageVersionDependenciesRequest> {

    public Request<ListPackageVersionDependenciesRequest> marshall(
            ListPackageVersionDependenciesRequest listPackageVersionDependenciesRequest) {
        if (listPackageVersionDependenciesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListPackageVersionDependenciesRequest)");
        }

        Request<ListPackageVersionDependenciesRequest> request = new DefaultRequest<ListPackageVersionDependenciesRequest>(
                listPackageVersionDependenciesRequest, "CodeArtifact");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/v1/package/version/dependencies";
        if (listPackageVersionDependenciesRequest.getDomain() != null) {
            request.addParameter("domain",
                    StringUtils.fromString(listPackageVersionDependenciesRequest.getDomain()));
        }
        if (listPackageVersionDependenciesRequest.getDomainOwner() != null) {
            request.addParameter("domain-owner",
                    StringUtils.fromString(listPackageVersionDependenciesRequest.getDomainOwner()));
        }
        if (listPackageVersionDependenciesRequest.getRepository() != null) {
            request.addParameter("repository",
                    StringUtils.fromString(listPackageVersionDependenciesRequest.getRepository()));
        }
        if (listPackageVersionDependenciesRequest.getFormat() != null) {
            request.addParameter("format",
                    StringUtils.fromString(listPackageVersionDependenciesRequest.getFormat()));
        }
        if (listPackageVersionDependenciesRequest.getNamespace() != null) {
            request.addParameter("namespace",
                    StringUtils.fromString(listPackageVersionDependenciesRequest.getNamespace()));
        }
        if (listPackageVersionDependenciesRequest.getPackage() != null) {
            request.addParameter("package",
                    StringUtils.fromString(listPackageVersionDependenciesRequest.getPackage()));
        }
        if (listPackageVersionDependenciesRequest.getPackageVersion() != null) {
            request.addParameter("version", StringUtils
                    .fromString(listPackageVersionDependenciesRequest.getPackageVersion()));
        }
        if (listPackageVersionDependenciesRequest.getNextToken() != null) {
            request.addParameter("next-token",
                    StringUtils.fromString(listPackageVersionDependenciesRequest.getNextToken()));
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
