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

package com.amazonaws.services.guardduty.model.transform;

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
import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateIPSetRequest
 */
public class UpdateIPSetRequestMarshaller implements
        Marshaller<Request<UpdateIPSetRequest>, UpdateIPSetRequest> {

    public Request<UpdateIPSetRequest> marshall(UpdateIPSetRequest updateIPSetRequest) {
        if (updateIPSetRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateIPSetRequest)");
        }

        Request<UpdateIPSetRequest> request = new DefaultRequest<UpdateIPSetRequest>(
                updateIPSetRequest, "AmazonGuardDuty");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/detector/{detectorId}/ipset/{ipSetId}";
        uriResourcePath = uriResourcePath.replace(
                "{detectorId}",
                (updateIPSetRequest.getDetectorId() == null) ? "" : StringUtils
                        .fromString(updateIPSetRequest.getDetectorId()));
        uriResourcePath = uriResourcePath.replace(
                "{ipSetId}",
                (updateIPSetRequest.getIpSetId() == null) ? "" : StringUtils
                        .fromString(updateIPSetRequest.getIpSetId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateIPSetRequest.getName() != null) {
                String name = updateIPSetRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (updateIPSetRequest.getLocation() != null) {
                String location = updateIPSetRequest.getLocation();
                jsonWriter.name("Location");
                jsonWriter.value(location);
            }
            if (updateIPSetRequest.getActivate() != null) {
                Boolean activate = updateIPSetRequest.getActivate();
                jsonWriter.name("Activate");
                jsonWriter.value(activate);
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
