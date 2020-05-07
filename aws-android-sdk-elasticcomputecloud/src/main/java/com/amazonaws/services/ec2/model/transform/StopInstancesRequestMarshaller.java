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
 * JSON request marshaller for StopInstancesRequest
 */
public class StopInstancesRequestMarshaller implements
        Marshaller<Request<StopInstancesRequest>, StopInstancesRequest> {

    public Request<StopInstancesRequest> marshall(StopInstancesRequest stopInstancesRequest) {
        if (stopInstancesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StopInstancesRequest)");
        }

        Request<StopInstancesRequest> request = new DefaultRequest<StopInstancesRequest>(
                stopInstancesRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (stopInstancesRequest.getInstanceIds() != null) {
                java.util.List<String> instanceIds = stopInstancesRequest.getInstanceIds();
                jsonWriter.name("InstanceIds");
                jsonWriter.beginArray();
                for (String instanceIdsItem : instanceIds) {
                    if (instanceIdsItem != null) {
                        jsonWriter.value(instanceIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (stopInstancesRequest.getHibernate() != null) {
                Boolean hibernate = stopInstancesRequest.getHibernate();
                jsonWriter.name("Hibernate");
                jsonWriter.value(hibernate);
            }
            if (stopInstancesRequest.getDryRun() != null) {
                Boolean dryRun = stopInstancesRequest.getDryRun();
                jsonWriter.name("DryRun");
                jsonWriter.value(dryRun);
            }
            if (stopInstancesRequest.getForce() != null) {
                Boolean force = stopInstancesRequest.getForce();
                jsonWriter.name("Force");
                jsonWriter.value(force);
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
