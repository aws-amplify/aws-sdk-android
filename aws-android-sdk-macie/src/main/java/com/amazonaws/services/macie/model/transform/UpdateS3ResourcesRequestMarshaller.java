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

package com.amazonaws.services.macie.model.transform;

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
import com.amazonaws.services.macie.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateS3ResourcesRequest
 */
public class UpdateS3ResourcesRequestMarshaller implements
        Marshaller<Request<UpdateS3ResourcesRequest>, UpdateS3ResourcesRequest> {

    public Request<UpdateS3ResourcesRequest> marshall(
            UpdateS3ResourcesRequest updateS3ResourcesRequest) {
        if (updateS3ResourcesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateS3ResourcesRequest)");
        }

        Request<UpdateS3ResourcesRequest> request = new DefaultRequest<UpdateS3ResourcesRequest>(
                updateS3ResourcesRequest, "AmazonMacie");
        String target = "MacieService.UpdateS3Resources";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateS3ResourcesRequest.getMemberAccountId() != null) {
                String memberAccountId = updateS3ResourcesRequest.getMemberAccountId();
                jsonWriter.name("memberAccountId");
                jsonWriter.value(memberAccountId);
            }
            if (updateS3ResourcesRequest.getS3ResourcesUpdate() != null) {
                java.util.List<S3ResourceClassificationUpdate> s3ResourcesUpdate = updateS3ResourcesRequest
                        .getS3ResourcesUpdate();
                jsonWriter.name("s3ResourcesUpdate");
                jsonWriter.beginArray();
                for (S3ResourceClassificationUpdate s3ResourcesUpdateItem : s3ResourcesUpdate) {
                    if (s3ResourcesUpdateItem != null) {
                        S3ResourceClassificationUpdateJsonMarshaller.getInstance().marshall(
                                s3ResourcesUpdateItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
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
