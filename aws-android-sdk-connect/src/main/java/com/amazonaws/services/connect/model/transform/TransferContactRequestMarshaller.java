/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON request marshaller for TransferContactRequest
 */
public class TransferContactRequestMarshaller implements
        Marshaller<Request<TransferContactRequest>, TransferContactRequest> {

    public Request<TransferContactRequest> marshall(TransferContactRequest transferContactRequest) {
        if (transferContactRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(TransferContactRequest)");
        }

        Request<TransferContactRequest> request = new DefaultRequest<TransferContactRequest>(
                transferContactRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/contact/transfer";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (transferContactRequest.getInstanceId() != null) {
                String instanceId = transferContactRequest.getInstanceId();
                jsonWriter.name("InstanceId");
                jsonWriter.value(instanceId);
            }
            if (transferContactRequest.getContactId() != null) {
                String contactId = transferContactRequest.getContactId();
                jsonWriter.name("ContactId");
                jsonWriter.value(contactId);
            }
            if (transferContactRequest.getQueueId() != null) {
                String queueId = transferContactRequest.getQueueId();
                jsonWriter.name("QueueId");
                jsonWriter.value(queueId);
            }
            if (transferContactRequest.getUserId() != null) {
                String userId = transferContactRequest.getUserId();
                jsonWriter.name("UserId");
                jsonWriter.value(userId);
            }
            if (transferContactRequest.getContactFlowId() != null) {
                String contactFlowId = transferContactRequest.getContactFlowId();
                jsonWriter.name("ContactFlowId");
                jsonWriter.value(contactFlowId);
            }
            if (transferContactRequest.getClientToken() != null) {
                String clientToken = transferContactRequest.getClientToken();
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
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
