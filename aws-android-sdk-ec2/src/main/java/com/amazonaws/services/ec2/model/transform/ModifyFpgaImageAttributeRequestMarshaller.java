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

package com.amazonaws.services.ec2.model.transform;

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
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ModifyFpgaImageAttributeRequest
 */
public class ModifyFpgaImageAttributeRequestMarshaller implements
        Marshaller<Request<ModifyFpgaImageAttributeRequest>, ModifyFpgaImageAttributeRequest> {

    public Request<ModifyFpgaImageAttributeRequest> marshall(
            ModifyFpgaImageAttributeRequest modifyFpgaImageAttributeRequest) {
        if (modifyFpgaImageAttributeRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyFpgaImageAttributeRequest)");
        }

        Request<ModifyFpgaImageAttributeRequest> request = new DefaultRequest<ModifyFpgaImageAttributeRequest>(
                modifyFpgaImageAttributeRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (modifyFpgaImageAttributeRequest.getDryRun() != null) {
                Boolean dryRun = modifyFpgaImageAttributeRequest.getDryRun();
                jsonWriter.name("DryRun");
                jsonWriter.value(dryRun);
            }
            if (modifyFpgaImageAttributeRequest.getFpgaImageId() != null) {
                String fpgaImageId = modifyFpgaImageAttributeRequest.getFpgaImageId();
                jsonWriter.name("FpgaImageId");
                jsonWriter.value(fpgaImageId);
            }
            if (modifyFpgaImageAttributeRequest.getAttribute() != null) {
                String attribute = modifyFpgaImageAttributeRequest.getAttribute();
                jsonWriter.name("Attribute");
                jsonWriter.value(attribute);
            }
            if (modifyFpgaImageAttributeRequest.getOperationType() != null) {
                String operationType = modifyFpgaImageAttributeRequest.getOperationType();
                jsonWriter.name("OperationType");
                jsonWriter.value(operationType);
            }
            if (modifyFpgaImageAttributeRequest.getUserIds() != null) {
                java.util.List<String> userIds = modifyFpgaImageAttributeRequest.getUserIds();
                jsonWriter.name("UserIds");
                jsonWriter.beginArray();
                for (String userIdsItem : userIds) {
                    if (userIdsItem != null) {
                        jsonWriter.value(userIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (modifyFpgaImageAttributeRequest.getUserGroups() != null) {
                java.util.List<String> userGroups = modifyFpgaImageAttributeRequest.getUserGroups();
                jsonWriter.name("UserGroups");
                jsonWriter.beginArray();
                for (String userGroupsItem : userGroups) {
                    if (userGroupsItem != null) {
                        jsonWriter.value(userGroupsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (modifyFpgaImageAttributeRequest.getProductCodes() != null) {
                java.util.List<String> productCodes = modifyFpgaImageAttributeRequest
                        .getProductCodes();
                jsonWriter.name("ProductCodes");
                jsonWriter.beginArray();
                for (String productCodesItem : productCodes) {
                    if (productCodesItem != null) {
                        jsonWriter.value(productCodesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (modifyFpgaImageAttributeRequest.getLoadPermission() != null) {
                LoadPermissionModifications loadPermission = modifyFpgaImageAttributeRequest
                        .getLoadPermission();
                jsonWriter.name("LoadPermission");
                LoadPermissionModificationsJsonMarshaller.getInstance().marshall(loadPermission,
                        jsonWriter);
            }
            if (modifyFpgaImageAttributeRequest.getDescription() != null) {
                String description = modifyFpgaImageAttributeRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (modifyFpgaImageAttributeRequest.getName() != null) {
                String name = modifyFpgaImageAttributeRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
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
