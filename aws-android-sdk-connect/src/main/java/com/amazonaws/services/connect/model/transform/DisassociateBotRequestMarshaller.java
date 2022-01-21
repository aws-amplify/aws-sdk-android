/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON request marshaller for DisassociateBotRequest
 */
public class DisassociateBotRequestMarshaller implements
        Marshaller<Request<DisassociateBotRequest>, DisassociateBotRequest> {

    public Request<DisassociateBotRequest> marshall(DisassociateBotRequest disassociateBotRequest) {
        if (disassociateBotRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DisassociateBotRequest)");
        }

        Request<DisassociateBotRequest> request = new DefaultRequest<DisassociateBotRequest>(
                disassociateBotRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/instance/{InstanceId}/bot";
        uriResourcePath = uriResourcePath.replace(
                "{InstanceId}",
                (disassociateBotRequest.getInstanceId() == null) ? "" : StringUtils
                        .fromString(disassociateBotRequest.getInstanceId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (disassociateBotRequest.getLexBot() != null) {
                LexBot lexBot = disassociateBotRequest.getLexBot();
                jsonWriter.name("LexBot");
                LexBotJsonMarshaller.getInstance().marshall(lexBot, jsonWriter);
            }
            if (disassociateBotRequest.getLexV2Bot() != null) {
                LexV2Bot lexV2Bot = disassociateBotRequest.getLexV2Bot();
                jsonWriter.name("LexV2Bot");
                LexV2BotJsonMarshaller.getInstance().marshall(lexV2Bot, jsonWriter);
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
