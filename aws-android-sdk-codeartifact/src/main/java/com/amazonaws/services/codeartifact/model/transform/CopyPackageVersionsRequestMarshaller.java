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
 * JSON request marshaller for CopyPackageVersionsRequest
 */
public class CopyPackageVersionsRequestMarshaller implements
        Marshaller<Request<CopyPackageVersionsRequest>, CopyPackageVersionsRequest> {

    public Request<CopyPackageVersionsRequest> marshall(
            CopyPackageVersionsRequest copyPackageVersionsRequest) {
        if (copyPackageVersionsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CopyPackageVersionsRequest)");
        }

        Request<CopyPackageVersionsRequest> request = new DefaultRequest<CopyPackageVersionsRequest>(
                copyPackageVersionsRequest, "CodeArtifact");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/v1/package/versions/copy";
        if (copyPackageVersionsRequest.getDomain() != null) {
            request.addParameter("domain",
                    StringUtils.fromString(copyPackageVersionsRequest.getDomain()));
        }
        if (copyPackageVersionsRequest.getDomainOwner() != null) {
            request.addParameter("domain-owner",
                    StringUtils.fromString(copyPackageVersionsRequest.getDomainOwner()));
        }
        if (copyPackageVersionsRequest.getSourceRepository() != null) {
            request.addParameter("source-repository",
                    StringUtils.fromString(copyPackageVersionsRequest.getSourceRepository()));
        }
        if (copyPackageVersionsRequest.getDestinationRepository() != null) {
            request.addParameter("destination-repository",
                    StringUtils.fromString(copyPackageVersionsRequest.getDestinationRepository()));
        }
        if (copyPackageVersionsRequest.getFormat() != null) {
            request.addParameter("format",
                    StringUtils.fromString(copyPackageVersionsRequest.getFormat()));
        }
        if (copyPackageVersionsRequest.getNamespace() != null) {
            request.addParameter("namespace",
                    StringUtils.fromString(copyPackageVersionsRequest.getNamespace()));
        }
        if (copyPackageVersionsRequest.getPackage() != null) {
            request.addParameter("package",
                    StringUtils.fromString(copyPackageVersionsRequest.getPackage()));
        }
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (copyPackageVersionsRequest.getVersions() != null) {
                java.util.List<String> versions = copyPackageVersionsRequest.getVersions();
                jsonWriter.name("versions");
                jsonWriter.beginArray();
                for (String versionsItem : versions) {
                    if (versionsItem != null) {
                        jsonWriter.value(versionsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (copyPackageVersionsRequest.getVersionRevisions() != null) {
                java.util.Map<String, String> versionRevisions = copyPackageVersionsRequest
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
            if (copyPackageVersionsRequest.getAllowOverwrite() != null) {
                Boolean allowOverwrite = copyPackageVersionsRequest.getAllowOverwrite();
                jsonWriter.name("allowOverwrite");
                jsonWriter.value(allowOverwrite);
            }
            if (copyPackageVersionsRequest.getIncludeFromUpstream() != null) {
                Boolean includeFromUpstream = copyPackageVersionsRequest.getIncludeFromUpstream();
                jsonWriter.name("includeFromUpstream");
                jsonWriter.value(includeFromUpstream);
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
