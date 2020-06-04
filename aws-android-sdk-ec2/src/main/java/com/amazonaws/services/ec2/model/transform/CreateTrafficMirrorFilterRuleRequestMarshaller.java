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
 * JSON request marshaller for CreateTrafficMirrorFilterRuleRequest
 */
public class CreateTrafficMirrorFilterRuleRequestMarshaller
        implements
        Marshaller<Request<CreateTrafficMirrorFilterRuleRequest>, CreateTrafficMirrorFilterRuleRequest> {

    public Request<CreateTrafficMirrorFilterRuleRequest> marshall(
            CreateTrafficMirrorFilterRuleRequest createTrafficMirrorFilterRuleRequest) {
        if (createTrafficMirrorFilterRuleRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateTrafficMirrorFilterRuleRequest)");
        }

        Request<CreateTrafficMirrorFilterRuleRequest> request = new DefaultRequest<CreateTrafficMirrorFilterRuleRequest>(
                createTrafficMirrorFilterRuleRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createTrafficMirrorFilterRuleRequest.getTrafficMirrorFilterId() != null) {
                String trafficMirrorFilterId = createTrafficMirrorFilterRuleRequest
                        .getTrafficMirrorFilterId();
                jsonWriter.name("TrafficMirrorFilterId");
                jsonWriter.value(trafficMirrorFilterId);
            }
            if (createTrafficMirrorFilterRuleRequest.getTrafficDirection() != null) {
                String trafficDirection = createTrafficMirrorFilterRuleRequest
                        .getTrafficDirection();
                jsonWriter.name("TrafficDirection");
                jsonWriter.value(trafficDirection);
            }
            if (createTrafficMirrorFilterRuleRequest.getRuleNumber() != null) {
                Integer ruleNumber = createTrafficMirrorFilterRuleRequest.getRuleNumber();
                jsonWriter.name("RuleNumber");
                jsonWriter.value(ruleNumber);
            }
            if (createTrafficMirrorFilterRuleRequest.getRuleAction() != null) {
                String ruleAction = createTrafficMirrorFilterRuleRequest.getRuleAction();
                jsonWriter.name("RuleAction");
                jsonWriter.value(ruleAction);
            }
            if (createTrafficMirrorFilterRuleRequest.getDestinationPortRange() != null) {
                TrafficMirrorPortRangeRequest destinationPortRange = createTrafficMirrorFilterRuleRequest
                        .getDestinationPortRange();
                jsonWriter.name("DestinationPortRange");
                TrafficMirrorPortRangeRequestJsonMarshaller.getInstance().marshall(
                        destinationPortRange, jsonWriter);
            }
            if (createTrafficMirrorFilterRuleRequest.getSourcePortRange() != null) {
                TrafficMirrorPortRangeRequest sourcePortRange = createTrafficMirrorFilterRuleRequest
                        .getSourcePortRange();
                jsonWriter.name("SourcePortRange");
                TrafficMirrorPortRangeRequestJsonMarshaller.getInstance().marshall(sourcePortRange,
                        jsonWriter);
            }
            if (createTrafficMirrorFilterRuleRequest.getProtocol() != null) {
                Integer protocol = createTrafficMirrorFilterRuleRequest.getProtocol();
                jsonWriter.name("Protocol");
                jsonWriter.value(protocol);
            }
            if (createTrafficMirrorFilterRuleRequest.getDestinationCidrBlock() != null) {
                String destinationCidrBlock = createTrafficMirrorFilterRuleRequest
                        .getDestinationCidrBlock();
                jsonWriter.name("DestinationCidrBlock");
                jsonWriter.value(destinationCidrBlock);
            }
            if (createTrafficMirrorFilterRuleRequest.getSourceCidrBlock() != null) {
                String sourceCidrBlock = createTrafficMirrorFilterRuleRequest.getSourceCidrBlock();
                jsonWriter.name("SourceCidrBlock");
                jsonWriter.value(sourceCidrBlock);
            }
            if (createTrafficMirrorFilterRuleRequest.getDescription() != null) {
                String description = createTrafficMirrorFilterRuleRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (createTrafficMirrorFilterRuleRequest.getDryRun() != null) {
                Boolean dryRun = createTrafficMirrorFilterRuleRequest.getDryRun();
                jsonWriter.name("DryRun");
                jsonWriter.value(dryRun);
            }
            if (createTrafficMirrorFilterRuleRequest.getClientToken() != null) {
                String clientToken = createTrafficMirrorFilterRuleRequest.getClientToken();
                jsonWriter.name("ClientToken");
                jsonWriter.value(clientToken);
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
