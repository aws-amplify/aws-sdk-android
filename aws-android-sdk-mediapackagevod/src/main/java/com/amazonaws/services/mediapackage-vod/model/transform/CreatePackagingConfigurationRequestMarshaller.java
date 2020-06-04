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
package com.amazonaws.services.mediapackage-vod.model.transform;

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
import com.amazonaws.services.mediapackage-vod.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;


/**
 * JSON request marshaller for CreatePackagingConfigurationRequest
 */
public class CreatePackagingConfigurationRequestMarshaller implements Marshaller<Request<CreatePackagingConfigurationRequest>, CreatePackagingConfigurationRequest> {

    public Request<CreatePackagingConfigurationRequest> marshall(CreatePackagingConfigurationRequest createPackagingConfigurationRequest) {
        if (createPackagingConfigurationRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(CreatePackagingConfigurationRequest)");
        }

        Request<CreatePackagingConfigurationRequest> request = new DefaultRequest<CreatePackagingConfigurationRequest>(createPackagingConfigurationRequest, "AWSElementalMediaPackageVOD");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/packaging_configurations";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createPackagingConfigurationRequest.getCmafPackage() != null) {
                CmafPackage cmafPackage = createPackagingConfigurationRequest.getCmafPackage();
                jsonWriter.name("CmafPackage");
            CmafPackageJsonMarshaller.getInstance().marshall(cmafPackage, jsonWriter);
            }
            if (createPackagingConfigurationRequest.getDashPackage() != null) {
                DashPackage dashPackage = createPackagingConfigurationRequest.getDashPackage();
                jsonWriter.name("DashPackage");
            DashPackageJsonMarshaller.getInstance().marshall(dashPackage, jsonWriter);
            }
            if (createPackagingConfigurationRequest.getHlsPackage() != null) {
                HlsPackage hlsPackage = createPackagingConfigurationRequest.getHlsPackage();
                jsonWriter.name("HlsPackage");
            HlsPackageJsonMarshaller.getInstance().marshall(hlsPackage, jsonWriter);
            }
            if (createPackagingConfigurationRequest.getId() != null) {
                String id = createPackagingConfigurationRequest.getId();
                jsonWriter.name("Id");
            jsonWriter.value(id);
            }
            if (createPackagingConfigurationRequest.getMssPackage() != null) {
                MssPackage mssPackage = createPackagingConfigurationRequest.getMssPackage();
                jsonWriter.name("MssPackage");
            MssPackageJsonMarshaller.getInstance().marshall(mssPackage, jsonWriter);
            }
            if (createPackagingConfigurationRequest.getPackagingGroupId() != null) {
                String packagingGroupId = createPackagingConfigurationRequest.getPackagingGroupId();
                jsonWriter.name("PackagingGroupId");
            jsonWriter.value(packagingGroupId);
            }
            if (createPackagingConfigurationRequest.getTags() != null) {
                java.util.Map<String, String> tags = createPackagingConfigurationRequest.getTags();
                jsonWriter.name("Tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
            jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
            }

            jsonWriter.endObject();
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch(Throwable t) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
