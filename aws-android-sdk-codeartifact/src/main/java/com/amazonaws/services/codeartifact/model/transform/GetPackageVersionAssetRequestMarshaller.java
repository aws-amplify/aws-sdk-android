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
 * JSON request marshaller for GetPackageVersionAssetRequest
 */
public class GetPackageVersionAssetRequestMarshaller implements
        Marshaller<Request<GetPackageVersionAssetRequest>, GetPackageVersionAssetRequest> {

    public Request<GetPackageVersionAssetRequest> marshall(
            GetPackageVersionAssetRequest getPackageVersionAssetRequest) {
        if (getPackageVersionAssetRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetPackageVersionAssetRequest)");
        }

        Request<GetPackageVersionAssetRequest> request = new DefaultRequest<GetPackageVersionAssetRequest>(
                getPackageVersionAssetRequest, "CodeArtifact");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/v1/package/version/asset";
        if (getPackageVersionAssetRequest.getDomain() != null) {
            request.addParameter("domain",
                    StringUtils.fromString(getPackageVersionAssetRequest.getDomain()));
        }
        if (getPackageVersionAssetRequest.getDomainOwner() != null) {
            request.addParameter("domain-owner",
                    StringUtils.fromString(getPackageVersionAssetRequest.getDomainOwner()));
        }
        if (getPackageVersionAssetRequest.getRepository() != null) {
            request.addParameter("repository",
                    StringUtils.fromString(getPackageVersionAssetRequest.getRepository()));
        }
        if (getPackageVersionAssetRequest.getFormat() != null) {
            request.addParameter("format",
                    StringUtils.fromString(getPackageVersionAssetRequest.getFormat()));
        }
        if (getPackageVersionAssetRequest.getNamespace() != null) {
            request.addParameter("namespace",
                    StringUtils.fromString(getPackageVersionAssetRequest.getNamespace()));
        }
        if (getPackageVersionAssetRequest.getPackage() != null) {
            request.addParameter("package",
                    StringUtils.fromString(getPackageVersionAssetRequest.getPackage()));
        }
        if (getPackageVersionAssetRequest.getPackageVersion() != null) {
            request.addParameter("version",
                    StringUtils.fromString(getPackageVersionAssetRequest.getPackageVersion()));
        }
        if (getPackageVersionAssetRequest.getAsset() != null) {
            request.addParameter("asset",
                    StringUtils.fromString(getPackageVersionAssetRequest.getAsset()));
        }
        if (getPackageVersionAssetRequest.getPackageVersionRevision() != null) {
            request.addParameter("revision", StringUtils.fromString(getPackageVersionAssetRequest
                    .getPackageVersionRevision()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
