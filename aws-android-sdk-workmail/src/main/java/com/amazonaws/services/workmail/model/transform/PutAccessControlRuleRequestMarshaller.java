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

package com.amazonaws.services.workmail.model.transform;

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
import com.amazonaws.services.workmail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for PutAccessControlRuleRequest
 */
public class PutAccessControlRuleRequestMarshaller implements
        Marshaller<Request<PutAccessControlRuleRequest>, PutAccessControlRuleRequest> {

    public Request<PutAccessControlRuleRequest> marshall(
            PutAccessControlRuleRequest putAccessControlRuleRequest) {
        if (putAccessControlRuleRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutAccessControlRuleRequest)");
        }

        Request<PutAccessControlRuleRequest> request = new DefaultRequest<PutAccessControlRuleRequest>(
                putAccessControlRuleRequest, "AmazonWorkMail");
        String target = "WorkMailService.PutAccessControlRule";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (putAccessControlRuleRequest.getName() != null) {
                String name = putAccessControlRuleRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (putAccessControlRuleRequest.getEffect() != null) {
                String effect = putAccessControlRuleRequest.getEffect();
                jsonWriter.name("Effect");
                jsonWriter.value(effect);
            }
            if (putAccessControlRuleRequest.getDescription() != null) {
                String description = putAccessControlRuleRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (putAccessControlRuleRequest.getIpRanges() != null) {
                java.util.List<String> ipRanges = putAccessControlRuleRequest.getIpRanges();
                jsonWriter.name("IpRanges");
                jsonWriter.beginArray();
                for (String ipRangesItem : ipRanges) {
                    if (ipRangesItem != null) {
                        jsonWriter.value(ipRangesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (putAccessControlRuleRequest.getNotIpRanges() != null) {
                java.util.List<String> notIpRanges = putAccessControlRuleRequest.getNotIpRanges();
                jsonWriter.name("NotIpRanges");
                jsonWriter.beginArray();
                for (String notIpRangesItem : notIpRanges) {
                    if (notIpRangesItem != null) {
                        jsonWriter.value(notIpRangesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (putAccessControlRuleRequest.getActions() != null) {
                java.util.List<String> actions = putAccessControlRuleRequest.getActions();
                jsonWriter.name("Actions");
                jsonWriter.beginArray();
                for (String actionsItem : actions) {
                    if (actionsItem != null) {
                        jsonWriter.value(actionsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (putAccessControlRuleRequest.getNotActions() != null) {
                java.util.List<String> notActions = putAccessControlRuleRequest.getNotActions();
                jsonWriter.name("NotActions");
                jsonWriter.beginArray();
                for (String notActionsItem : notActions) {
                    if (notActionsItem != null) {
                        jsonWriter.value(notActionsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (putAccessControlRuleRequest.getUserIds() != null) {
                java.util.List<String> userIds = putAccessControlRuleRequest.getUserIds();
                jsonWriter.name("UserIds");
                jsonWriter.beginArray();
                for (String userIdsItem : userIds) {
                    if (userIdsItem != null) {
                        jsonWriter.value(userIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (putAccessControlRuleRequest.getNotUserIds() != null) {
                java.util.List<String> notUserIds = putAccessControlRuleRequest.getNotUserIds();
                jsonWriter.name("NotUserIds");
                jsonWriter.beginArray();
                for (String notUserIdsItem : notUserIds) {
                    if (notUserIdsItem != null) {
                        jsonWriter.value(notUserIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (putAccessControlRuleRequest.getOrganizationId() != null) {
                String organizationId = putAccessControlRuleRequest.getOrganizationId();
                jsonWriter.name("OrganizationId");
                jsonWriter.value(organizationId);
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
