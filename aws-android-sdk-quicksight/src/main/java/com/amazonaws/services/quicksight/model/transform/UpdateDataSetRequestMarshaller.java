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
 * JSON request marshaller for UpdateDataSetRequest
 */
public class UpdateDataSetRequestMarshaller implements
        Marshaller<Request<UpdateDataSetRequest>, UpdateDataSetRequest> {

    public Request<UpdateDataSetRequest> marshall(UpdateDataSetRequest updateDataSetRequest) {
        if (updateDataSetRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateDataSetRequest)");
        }

        Request<UpdateDataSetRequest> request = new DefaultRequest<UpdateDataSetRequest>(
                updateDataSetRequest, "AmazonQuickSight");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/accounts/{AwsAccountId}/data-sets/{DataSetId}";
        uriResourcePath = uriResourcePath.replace(
                "{AwsAccountId}",
                (updateDataSetRequest.getAwsAccountId() == null) ? "" : StringUtils
                        .fromString(updateDataSetRequest.getAwsAccountId()));
        uriResourcePath = uriResourcePath.replace(
                "{DataSetId}",
                (updateDataSetRequest.getDataSetId() == null) ? "" : StringUtils
                        .fromString(updateDataSetRequest.getDataSetId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateDataSetRequest.getName() != null) {
                String name = updateDataSetRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (updateDataSetRequest.getPhysicalTableMap() != null) {
                java.util.Map<String, PhysicalTable> physicalTableMap = updateDataSetRequest
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
            if (updateDataSetRequest.getLogicalTableMap() != null) {
                java.util.Map<String, LogicalTable> logicalTableMap = updateDataSetRequest
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
            if (updateDataSetRequest.getImportMode() != null) {
                String importMode = updateDataSetRequest.getImportMode();
                jsonWriter.name("ImportMode");
                jsonWriter.value(importMode);
            }
            if (updateDataSetRequest.getColumnGroups() != null) {
                java.util.List<ColumnGroup> columnGroups = updateDataSetRequest.getColumnGroups();
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
            if (updateDataSetRequest.getRowLevelPermissionDataSet() != null) {
                RowLevelPermissionDataSet rowLevelPermissionDataSet = updateDataSetRequest
                        .getRowLevelPermissionDataSet();
                jsonWriter.name("RowLevelPermissionDataSet");
                RowLevelPermissionDataSetJsonMarshaller.getInstance().marshall(
                        rowLevelPermissionDataSet, jsonWriter);
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
