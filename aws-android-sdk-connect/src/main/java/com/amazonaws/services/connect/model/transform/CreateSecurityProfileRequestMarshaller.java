/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import android.text.TextUtils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateSecurityProfileRequest
 */
public class CreateSecurityProfileRequestMarshaller implements
        Marshaller<Request<CreateSecurityProfileRequest>, CreateSecurityProfileRequest> {

    public Request<CreateSecurityProfileRequest> marshall(
            CreateSecurityProfileRequest createSecurityProfileRequest) {
        if (createSecurityProfileRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateSecurityProfileRequest)");
        }

        Request<CreateSecurityProfileRequest> request = new DefaultRequest<CreateSecurityProfileRequest>(
                createSecurityProfileRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/security-profiles/{InstanceId}";
        uriResourcePath = uriResourcePath.replace(
                "{InstanceId}",
                (createSecurityProfileRequest.getInstanceId() == null) ? "" : StringUtils
                        .fromString(createSecurityProfileRequest.getInstanceId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createSecurityProfileRequest.getSecurityProfileName() != null) {
                String securityProfileName = createSecurityProfileRequest.getSecurityProfileName();
                jsonWriter.name("SecurityProfileName");
                jsonWriter.value(securityProfileName);
            }
            if (createSecurityProfileRequest.getDescription() != null) {
                String description = createSecurityProfileRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (createSecurityProfileRequest.getPermissions() != null) {
                java.util.List<String> permissions = createSecurityProfileRequest.getPermissions();
                jsonWriter.name("Permissions");
                jsonWriter.beginArray();
                for (String permissionsItem : permissions) {
                    if (permissionsItem != null) {
                        jsonWriter.value(permissionsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createSecurityProfileRequest.getTags() != null) {
                java.util.Map<String, String> tags = createSecurityProfileRequest.getTags();
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
            if (createSecurityProfileRequest.getAllowedAccessControlTags() != null) {
                java.util.Map<String, String> allowedAccessControlTags = createSecurityProfileRequest
                        .getAllowedAccessControlTags();
                jsonWriter.name("AllowedAccessControlTags");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> allowedAccessControlTagsEntry : allowedAccessControlTags
                        .entrySet()) {
                    String allowedAccessControlTagsValue = allowedAccessControlTagsEntry.getValue();
                    if (allowedAccessControlTagsValue != null) {
                        jsonWriter.name(allowedAccessControlTagsEntry.getKey());
                        jsonWriter.value(allowedAccessControlTagsValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (createSecurityProfileRequest.getTagRestrictedResources() != null) {
                java.util.List<String> tagRestrictedResources = createSecurityProfileRequest
                        .getTagRestrictedResources();
                jsonWriter.name("TagRestrictedResources");
                jsonWriter.beginArray();
                for (String tagRestrictedResourcesItem : tagRestrictedResources) {
                    if (tagRestrictedResourcesItem != null) {
                        jsonWriter.value(tagRestrictedResourcesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createSecurityProfileRequest.getApplications() != null) {
                java.util.List<Application> applications = createSecurityProfileRequest
                        .getApplications();
                jsonWriter.name("Applications");
                jsonWriter.beginArray();
                for (Application applicationsItem : applications) {
                    if (applicationsItem != null) {
                        ApplicationJsonMarshaller.getInstance().marshall(applicationsItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createSecurityProfileRequest.getHierarchyRestrictedResources() != null) {
                java.util.List<String> hierarchyRestrictedResources = createSecurityProfileRequest
                        .getHierarchyRestrictedResources();
                jsonWriter.name("HierarchyRestrictedResources");
                jsonWriter.beginArray();
                for (String hierarchyRestrictedResourcesItem : hierarchyRestrictedResources) {
                    if (hierarchyRestrictedResourcesItem != null) {
                        jsonWriter.value(hierarchyRestrictedResourcesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createSecurityProfileRequest.getAllowedAccessControlHierarchyGroupId() != null) {
                String allowedAccessControlHierarchyGroupId = createSecurityProfileRequest
                        .getAllowedAccessControlHierarchyGroupId();
                jsonWriter.name("AllowedAccessControlHierarchyGroupId");
                jsonWriter.value(allowedAccessControlHierarchyGroupId);
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
