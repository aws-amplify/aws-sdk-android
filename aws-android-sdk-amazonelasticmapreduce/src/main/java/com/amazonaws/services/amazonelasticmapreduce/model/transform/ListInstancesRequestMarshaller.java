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

package com.amazonaws.services.amazonelasticmapreduce.model.transform;

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
import com.amazonaws.services.amazonelasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ListInstancesRequest
 */
public class ListInstancesRequestMarshaller implements
        Marshaller<Request<ListInstancesRequest>, ListInstancesRequest> {

    public Request<ListInstancesRequest> marshall(ListInstancesRequest listInstancesRequest) {
        if (listInstancesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListInstancesRequest)");
        }

        Request<ListInstancesRequest> request = new DefaultRequest<ListInstancesRequest>(
                listInstancesRequest, "AmazonElasticMapReduce");
        String target = "ElasticMapReduce.ListInstances";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (listInstancesRequest.getClusterId() != null) {
                String clusterId = listInstancesRequest.getClusterId();
                jsonWriter.name("ClusterId");
                jsonWriter.value(clusterId);
            }
            if (listInstancesRequest.getInstanceGroupId() != null) {
                String instanceGroupId = listInstancesRequest.getInstanceGroupId();
                jsonWriter.name("InstanceGroupId");
                jsonWriter.value(instanceGroupId);
            }
            if (listInstancesRequest.getInstanceGroupTypes() != null) {
                java.util.List<String> instanceGroupTypes = listInstancesRequest
                        .getInstanceGroupTypes();
                jsonWriter.name("InstanceGroupTypes");
                jsonWriter.beginArray();
                for (String instanceGroupTypesItem : instanceGroupTypes) {
                    if (instanceGroupTypesItem != null) {
                        jsonWriter.value(instanceGroupTypesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (listInstancesRequest.getInstanceFleetId() != null) {
                String instanceFleetId = listInstancesRequest.getInstanceFleetId();
                jsonWriter.name("InstanceFleetId");
                jsonWriter.value(instanceFleetId);
            }
            if (listInstancesRequest.getInstanceFleetType() != null) {
                String instanceFleetType = listInstancesRequest.getInstanceFleetType();
                jsonWriter.name("InstanceFleetType");
                jsonWriter.value(instanceFleetType);
            }
            if (listInstancesRequest.getInstanceStates() != null) {
                java.util.List<String> instanceStates = listInstancesRequest.getInstanceStates();
                jsonWriter.name("InstanceStates");
                jsonWriter.beginArray();
                for (String instanceStatesItem : instanceStates) {
                    if (instanceStatesItem != null) {
                        jsonWriter.value(instanceStatesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (listInstancesRequest.getMarker() != null) {
                String marker = listInstancesRequest.getMarker();
                jsonWriter.name("Marker");
                jsonWriter.value(marker);
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
