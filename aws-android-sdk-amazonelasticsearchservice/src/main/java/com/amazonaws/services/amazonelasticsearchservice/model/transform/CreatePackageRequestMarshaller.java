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

package com.amazonaws.services.amazonelasticsearchservice.model.transform;

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
import com.amazonaws.services.amazonelasticsearchservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreatePackageRequest
 */
public class CreatePackageRequestMarshaller implements
        Marshaller<Request<CreatePackageRequest>, CreatePackageRequest> {

    public Request<CreatePackageRequest> marshall(CreatePackageRequest createPackageRequest) {
        if (createPackageRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreatePackageRequest)");
        }

        Request<CreatePackageRequest> request = new DefaultRequest<CreatePackageRequest>(
                createPackageRequest, "AmazonElasticsearchService");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2015-01-01/packages";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createPackageRequest.getPackageName() != null) {
                String packageName = createPackageRequest.getPackageName();
                jsonWriter.name("PackageName");
                jsonWriter.value(packageName);
            }
            if (createPackageRequest.getPackageType() != null) {
                String packageType = createPackageRequest.getPackageType();
                jsonWriter.name("PackageType");
                jsonWriter.value(packageType);
            }
            if (createPackageRequest.getPackageDescription() != null) {
                String packageDescription = createPackageRequest.getPackageDescription();
                jsonWriter.name("PackageDescription");
                jsonWriter.value(packageDescription);
            }
            if (createPackageRequest.getPackageSource() != null) {
                PackageSource packageSource = createPackageRequest.getPackageSource();
                jsonWriter.name("PackageSource");
                PackageSourceJsonMarshaller.getInstance().marshall(packageSource, jsonWriter);
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
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
