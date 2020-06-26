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
 * JSON request marshaller for CreateDataSetRequest
 */
public class CreateDataSetRequestMarshaller implements
        Marshaller<Request<CreateDataSetRequest>, CreateDataSetRequest> {

    public Request<CreateDataSetRequest> marshall(CreateDataSetRequest createDataSetRequest) {
        if (createDataSetRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateDataSetRequest)");
        }

        Request<CreateDataSetRequest> request = new DefaultRequest<CreateDataSetRequest>(
                createDataSetRequest, "AmazonQuickSight");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/accounts/{AwsAccountId}/data-sets";
        uriResourcePath = uriResourcePath.replace(
                "{AwsAccountId}",
                (createDataSetRequest.getAwsAccountId() == null) ? "" : StringUtils
                        .fromString(createDataSetRequest.getAwsAccountId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createDataSetRequest.getDataSetId() != null) {
                String dataSetId = createDataSetRequest.getDataSetId();
                jsonWriter.name("DataSetId");
                jsonWriter.value(dataSetId);
            }
            if (createDataSetRequest.getName() != null) {
                String name = createDataSetRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (createDataSetRequest.getPhysicalTableMap() != null) {
                java.util.Map<String, PhysicalTable> physicalTableMap = createDataSetRequest
                        .getPhysicalTableMap();
                jsonWriter.name("PhysicalTableMap");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, PhysicalTable> physicalTableMapEntry : physicalTableMap
                        .entrySet()) {
                    PhysicalTable physicalTableMapValue = physicalTableMapEntry.getValue();
                    if (physicalTableMapValue != null) {
                        jsonWriter.name(physicalTableMapEntry.getKey());
                        PhysicalTableJsonMarshaller.getInstance().marshall(physicalTableMapValue,
                                jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (createDataSetRequest.getLogicalTableMap() != null) {
                java.util.Map<String, LogicalTable> logicalTableMap = createDataSetRequest
                        .getLogicalTableMap();
                jsonWriter.name("LogicalTableMap");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, LogicalTable> logicalTableMapEntry : logicalTableMap
                        .entrySet()) {
                    LogicalTable logicalTableMapValue = logicalTableMapEntry.getValue();
                    if (logicalTableMapValue != null) {
                        jsonWriter.name(logicalTableMapEntry.getKey());
                        LogicalTableJsonMarshaller.getInstance().marshall(logicalTableMapValue,
                                jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (createDataSetRequest.getImportMode() != null) {
                String importMode = createDataSetRequest.getImportMode();
                jsonWriter.name("ImportMode");
                jsonWriter.value(importMode);
            }
            if (createDataSetRequest.getColumnGroups() != null) {
                java.util.List<ColumnGroup> columnGroups = createDataSetRequest.getColumnGroups();
                jsonWriter.name("ColumnGroups");
                jsonWriter.beginArray();
                for (ColumnGroup columnGroupsItem : columnGroups) {
                    if (columnGroupsItem != null) {
                        ColumnGroupJsonMarshaller.getInstance().marshall(columnGroupsItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createDataSetRequest.getPermissions() != null) {
                java.util.List<ResourcePermission> permissions = createDataSetRequest
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
            if (createDataSetRequest.getRowLevelPermissionDataSet() != null) {
                RowLevelPermissionDataSet rowLevelPermissionDataSet = createDataSetRequest
                        .getRowLevelPermissionDataSet();
                jsonWriter.name("RowLevelPermissionDataSet");
                RowLevelPermissionDataSetJsonMarshaller.getInstance().marshall(
                        rowLevelPermissionDataSet, jsonWriter);
            }
            if (createDataSetRequest.getTags() != null) {
                java.util.List<Tag> tags = createDataSetRequest.getTags();
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
