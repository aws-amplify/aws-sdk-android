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
 * JSON request marshaller for CreateFlowLogsRequest
 */
public class CreateFlowLogsRequestMarshaller implements
        Marshaller<Request<CreateFlowLogsRequest>, CreateFlowLogsRequest> {

    public Request<CreateFlowLogsRequest> marshall(CreateFlowLogsRequest createFlowLogsRequest) {
        if (createFlowLogsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateFlowLogsRequest)");
        }

        Request<CreateFlowLogsRequest> request = new DefaultRequest<CreateFlowLogsRequest>(
                createFlowLogsRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createFlowLogsRequest.getDryRun() != null) {
                Boolean dryRun = createFlowLogsRequest.getDryRun();
                jsonWriter.name("DryRun");
                jsonWriter.value(dryRun);
            }
            if (createFlowLogsRequest.getClientToken() != null) {
                String clientToken = createFlowLogsRequest.getClientToken();
                jsonWriter.name("ClientToken");
                jsonWriter.value(clientToken);
            }
            if (createFlowLogsRequest.getDeliverLogsPermissionArn() != null) {
                String deliverLogsPermissionArn = createFlowLogsRequest
                        .getDeliverLogsPermissionArn();
                jsonWriter.name("DeliverLogsPermissionArn");
                jsonWriter.value(deliverLogsPermissionArn);
            }
            if (createFlowLogsRequest.getLogGroupName() != null) {
                String logGroupName = createFlowLogsRequest.getLogGroupName();
                jsonWriter.name("LogGroupName");
                jsonWriter.value(logGroupName);
            }
            if (createFlowLogsRequest.getResourceIds() != null) {
                java.util.List<String> resourceIds = createFlowLogsRequest.getResourceIds();
                jsonWriter.name("ResourceIds");
                jsonWriter.beginArray();
                for (String resourceIdsItem : resourceIds) {
                    if (resourceIdsItem != null) {
                        jsonWriter.value(resourceIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createFlowLogsRequest.getResourceType() != null) {
                String resourceType = createFlowLogsRequest.getResourceType();
                jsonWriter.name("ResourceType");
                jsonWriter.value(resourceType);
            }
            if (createFlowLogsRequest.getTrafficType() != null) {
                String trafficType = createFlowLogsRequest.getTrafficType();
                jsonWriter.name("TrafficType");
                jsonWriter.value(trafficType);
            }
            if (createFlowLogsRequest.getLogDestinationType() != null) {
                String logDestinationType = createFlowLogsRequest.getLogDestinationType();
                jsonWriter.name("LogDestinationType");
                jsonWriter.value(logDestinationType);
            }
            if (createFlowLogsRequest.getLogDestination() != null) {
                String logDestination = createFlowLogsRequest.getLogDestination();
                jsonWriter.name("LogDestination");
                jsonWriter.value(logDestination);
            }
            if (createFlowLogsRequest.getLogFormat() != null) {
                String logFormat = createFlowLogsRequest.getLogFormat();
                jsonWriter.name("LogFormat");
                jsonWriter.value(logFormat);
            }
            if (createFlowLogsRequest.getTagSpecifications() != null) {
                java.util.List<TagSpecification> tagSpecifications = createFlowLogsRequest
                        .getTagSpecifications();
                jsonWriter.name("TagSpecifications");
                jsonWriter.beginArray();
                for (TagSpecification tagSpecificationsItem : tagSpecifications) {
                    if (tagSpecificationsItem != null) {
                        TagSpecificationJsonMarshaller.getInstance().marshall(
                                tagSpecificationsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createFlowLogsRequest.getMaxAggregationInterval() != null) {
                Integer maxAggregationInterval = createFlowLogsRequest.getMaxAggregationInterval();
                jsonWriter.name("MaxAggregationInterval");
                jsonWriter.value(maxAggregationInterval);
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
