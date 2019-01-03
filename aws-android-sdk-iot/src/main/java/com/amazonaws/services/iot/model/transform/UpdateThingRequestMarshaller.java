/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

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
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateThingRequest
 */
public class UpdateThingRequestMarshaller implements
        Marshaller<Request<UpdateThingRequest>, UpdateThingRequest> {

    public Request<UpdateThingRequest> marshall(UpdateThingRequest updateThingRequest) {
        if (updateThingRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateThingRequest)");
        }

        Request<UpdateThingRequest> request = new DefaultRequest<UpdateThingRequest>(
                updateThingRequest, "AWSIot");
        request.setHttpMethod(HttpMethodName.PATCH);

        String uriResourcePath = "/things/{thingName}";
        uriResourcePath = uriResourcePath.replace(
                "{thingName}",
                (updateThingRequest.getThingName() == null) ? "" : StringUtils
                        .fromString(updateThingRequest.getThingName()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateThingRequest.getThingTypeName() != null) {
                String thingTypeName = updateThingRequest.getThingTypeName();
                jsonWriter.name("thingTypeName");
                jsonWriter.value(thingTypeName);
            }
            if (updateThingRequest.getAttributePayload() != null) {
                AttributePayload attributePayload = updateThingRequest.getAttributePayload();
                jsonWriter.name("attributePayload");
                AttributePayloadJsonMarshaller.getInstance().marshall(attributePayload, jsonWriter);
            }
            if (updateThingRequest.getExpectedVersion() != null) {
                Long expectedVersion = updateThingRequest.getExpectedVersion();
                jsonWriter.name("expectedVersion");
                jsonWriter.value(expectedVersion);
            }
            if (updateThingRequest.getRemoveThingType() != null) {
                Boolean removeThingType = updateThingRequest.getRemoveThingType();
                jsonWriter.name("removeThingType");
                jsonWriter.value(removeThingType);
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
