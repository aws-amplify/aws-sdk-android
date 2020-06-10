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
 * JSON request marshaller for DisposePackageVersionsRequest
 */
public class DisposePackageVersionsRequestMarshaller implements
        Marshaller<Request<DisposePackageVersionsRequest>, DisposePackageVersionsRequest> {

    public Request<DisposePackageVersionsRequest> marshall(
            DisposePackageVersionsRequest disposePackageVersionsRequest) {
        if (disposePackageVersionsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DisposePackageVersionsRequest)");
        }

        Request<DisposePackageVersionsRequest> request = new DefaultRequest<DisposePackageVersionsRequest>(
                disposePackageVersionsRequest, "CodeArtifact");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/v1/package/versions/dispose";
        if (disposePackageVersionsRequest.getDomain() != null) {
            request.addParameter("domain",
                    StringUtils.fromString(disposePackageVersionsRequest.getDomain()));
        }
        if (disposePackageVersionsRequest.getDomainOwner() != null) {
            request.addParameter("domain-owner",
                    StringUtils.fromString(disposePackageVersionsRequest.getDomainOwner()));
        }
        if (disposePackageVersionsRequest.getRepository() != null) {
            request.addParameter("repository",
                    StringUtils.fromString(disposePackageVersionsRequest.getRepository()));
        }
        if (disposePackageVersionsRequest.getFormat() != null) {
            request.addParameter("format",
                    StringUtils.fromString(disposePackageVersionsRequest.getFormat()));
        }
        if (disposePackageVersionsRequest.getNamespace() != null) {
            request.addParameter("namespace",
                    StringUtils.fromString(disposePackageVersionsRequest.getNamespace()));
        }
        if (disposePackageVersionsRequest.getPackage() != null) {
            request.addParameter("package",
                    StringUtils.fromString(disposePackageVersionsRequest.getPackage()));
        }
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (disposePackageVersionsRequest.getVersions() != null) {
                java.util.List<String> versions = disposePackageVersionsRequest.getVersions();
                jsonWriter.name("versions");
                jsonWriter.beginArray();
                for (String versionsItem : versions) {
                    if (versionsItem != null) {
                        jsonWriter.value(versionsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (disposePackageVersionsRequest.getVersionRevisions() != null) {
                java.util.Map<String, String> versionRevisions = disposePackageVersionsRequest
                        .getVersionRevisions();
                jsonWriter.name("versionRevisions");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> versionRevisionsEntry : versionRevisions
                        .entrySet()) {
                    String versionRevisionsValue = versionRevisionsEntry.getValue();
                    if (versionRevisionsValue != null) {
                        jsonWriter.name(versionRevisionsEntry.getKey());
                        jsonWriter.value(versionRevisionsValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (disposePackageVersionsRequest.getExpectedStatus() != null) {
                String expectedStatus = disposePackageVersionsRequest.getExpectedStatus();
                jsonWriter.name("expectedStatus");
                jsonWriter.value(expectedStatus);
            }

            jsonWriter.endObject();
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
