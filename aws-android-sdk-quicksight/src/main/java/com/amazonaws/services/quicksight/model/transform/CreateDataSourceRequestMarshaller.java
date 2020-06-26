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

package com.amazonaws.services.quicksight.model.transform;

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
import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateDataSourceRequest
 */
public class CreateDataSourceRequestMarshaller implements
        Marshaller<Request<CreateDataSourceRequest>, CreateDataSourceRequest> {

    public Request<CreateDataSourceRequest> marshall(CreateDataSourceRequest createDataSourceRequest) {
        if (createDataSourceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateDataSourceRequest)");
        }

        Request<CreateDataSourceRequest> request = new DefaultRequest<CreateDataSourceRequest>(
                createDataSourceRequest, "AmazonQuickSight");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/accounts/{AwsAccountId}/data-sources";
        uriResourcePath = uriResourcePath.replace(
                "{AwsAccountId}",
                (createDataSourceRequest.getAwsAccountId() == null) ? "" : StringUtils
                        .fromString(createDataSourceRequest.getAwsAccountId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createDataSourceRequest.getDataSourceId() != null) {
                String dataSourceId = createDataSourceRequest.getDataSourceId();
                jsonWriter.name("DataSourceId");
                jsonWriter.value(dataSourceId);
            }
            if (createDataSourceRequest.getName() != null) {
                String name = createDataSourceRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (createDataSourceRequest.getType() != null) {
                String type = createDataSourceRequest.getType();
                jsonWriter.name("Type");
                jsonWriter.value(type);
            }
            if (createDataSourceRequest.getDataSourceParameters() != null) {
                DataSourceParameters dataSourceParameters = createDataSourceRequest
                        .getDataSourceParameters();
                jsonWriter.name("DataSourceParameters");
                DataSourceParametersJsonMarshaller.getInstance().marshall(dataSourceParameters,
                        jsonWriter);
            }
            if (createDataSourceRequest.getCredentials() != null) {
                DataSourceCredentials credentials = createDataSourceRequest.getCredentials();
                jsonWriter.name("Credentials");
                DataSourceCredentialsJsonMarshaller.getInstance().marshall(credentials, jsonWriter);
            }
            if (createDataSourceRequest.getPermissions() != null) {
                java.util.List<ResourcePermission> permissions = createDataSourceRequest
                        .getPermissions();
                jsonWriter.name("Permissions");
                jsonWriter.beginArray();
                for (ResourcePermission permissionsItem : permissions) {
                    if (permissionsItem != null) {
                        ResourcePermissionJsonMarshaller.getInstance().marshall(permissionsItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createDataSourceRequest.getVpcConnectionProperties() != null) {
                VpcConnectionProperties vpcConnectionProperties = createDataSourceRequest
                        .getVpcConnectionProperties();
                jsonWriter.name("VpcConnectionProperties");
                VpcConnectionPropertiesJsonMarshaller.getInstance().marshall(
                        vpcConnectionProperties, jsonWriter);
            }
            if (createDataSourceRequest.getSslProperties() != null) {
                SslProperties sslProperties = createDataSourceRequest.getSslProperties();
                jsonWriter.name("SslProperties");
                SslPropertiesJsonMarshaller.getInstance().marshall(sslProperties, jsonWriter);
            }
            if (createDataSourceRequest.getTags() != null) {
                java.util.List<Tag> tags = createDataSourceRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
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
