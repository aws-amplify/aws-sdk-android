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

package com.amazonaws.services.amplify.model.transform;

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
import com.amazonaws.services.amplify.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateDomainAssociationRequest
 */
public class UpdateDomainAssociationRequestMarshaller implements
        Marshaller<Request<UpdateDomainAssociationRequest>, UpdateDomainAssociationRequest> {

    public Request<UpdateDomainAssociationRequest> marshall(
            UpdateDomainAssociationRequest updateDomainAssociationRequest) {
        if (updateDomainAssociationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateDomainAssociationRequest)");
        }

        Request<UpdateDomainAssociationRequest> request = new DefaultRequest<UpdateDomainAssociationRequest>(
                updateDomainAssociationRequest, "AWSAmplify");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/apps/{appId}/domains/{domainName}";
        uriResourcePath = uriResourcePath.replace(
                "{appId}",
                (updateDomainAssociationRequest.getAppId() == null) ? "" : StringUtils
                        .fromString(updateDomainAssociationRequest.getAppId()));
        uriResourcePath = uriResourcePath.replace(
                "{domainName}",
                (updateDomainAssociationRequest.getDomainName() == null) ? "" : StringUtils
                        .fromString(updateDomainAssociationRequest.getDomainName()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateDomainAssociationRequest.getEnableAutoSubDomain() != null) {
                Boolean enableAutoSubDomain = updateDomainAssociationRequest
                        .getEnableAutoSubDomain();
                jsonWriter.name("enableAutoSubDomain");
                jsonWriter.value(enableAutoSubDomain);
            }
            if (updateDomainAssociationRequest.getSubDomainSettings() != null) {
                java.util.List<SubDomainSetting> subDomainSettings = updateDomainAssociationRequest
                        .getSubDomainSettings();
                jsonWriter.name("subDomainSettings");
                jsonWriter.beginArray();
                for (SubDomainSetting subDomainSettingsItem : subDomainSettings) {
                    if (subDomainSettingsItem != null) {
                        SubDomainSettingJsonMarshaller.getInstance().marshall(
                                subDomainSettingsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateDomainAssociationRequest.getAutoSubDomainCreationPatterns() != null) {
                java.util.List<String> autoSubDomainCreationPatterns = updateDomainAssociationRequest
                        .getAutoSubDomainCreationPatterns();
                jsonWriter.name("autoSubDomainCreationPatterns");
                jsonWriter.beginArray();
                for (String autoSubDomainCreationPatternsItem : autoSubDomainCreationPatterns) {
                    if (autoSubDomainCreationPatternsItem != null) {
                        jsonWriter.value(autoSubDomainCreationPatternsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateDomainAssociationRequest.getAutoSubDomainIAMRole() != null) {
                String autoSubDomainIAMRole = updateDomainAssociationRequest
                        .getAutoSubDomainIAMRole();
                jsonWriter.name("autoSubDomainIAMRole");
                jsonWriter.value(autoSubDomainIAMRole);
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
