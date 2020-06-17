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

package com.amazonaws.services.macie2.model.transform;

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
import com.amazonaws.services.macie2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateFindingsFilterRequest
 */
public class UpdateFindingsFilterRequestMarshaller implements
        Marshaller<Request<UpdateFindingsFilterRequest>, UpdateFindingsFilterRequest> {

    public Request<UpdateFindingsFilterRequest> marshall(
            UpdateFindingsFilterRequest updateFindingsFilterRequest) {
        if (updateFindingsFilterRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateFindingsFilterRequest)");
        }

        Request<UpdateFindingsFilterRequest> request = new DefaultRequest<UpdateFindingsFilterRequest>(
                updateFindingsFilterRequest, "AmazonMacie2");
        request.setHttpMethod(HttpMethodName.PATCH);

        String uriResourcePath = "/findingsfilters/{id}";
        uriResourcePath = uriResourcePath.replace(
                "{id}",
                (updateFindingsFilterRequest.getId() == null) ? "" : StringUtils
                        .fromString(updateFindingsFilterRequest.getId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateFindingsFilterRequest.getAction() != null) {
                String action = updateFindingsFilterRequest.getAction();
                jsonWriter.name("action");
                jsonWriter.value(action);
            }
            if (updateFindingsFilterRequest.getDescription() != null) {
                String description = updateFindingsFilterRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
            }
            if (updateFindingsFilterRequest.getFindingCriteria() != null) {
                FindingCriteria findingCriteria = updateFindingsFilterRequest.getFindingCriteria();
                jsonWriter.name("findingCriteria");
                FindingCriteriaJsonMarshaller.getInstance().marshall(findingCriteria, jsonWriter);
            }
            if (updateFindingsFilterRequest.getName() != null) {
                String name = updateFindingsFilterRequest.getName();
                jsonWriter.name("name");
                jsonWriter.value(name);
            }
            if (updateFindingsFilterRequest.getPosition() != null) {
                Integer position = updateFindingsFilterRequest.getPosition();
                jsonWriter.name("position");
                jsonWriter.value(position);
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
