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

package com.amazonaws.services.amazonelasticsearchservice.model.transform;

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
import com.amazonaws.services.amazonelasticsearchservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for RemoveTagsRequest
 */
public class RemoveTagsRequestMarshaller implements
        Marshaller<Request<RemoveTagsRequest>, RemoveTagsRequest> {

    public Request<RemoveTagsRequest> marshall(RemoveTagsRequest removeTagsRequest) {
        if (removeTagsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RemoveTagsRequest)");
        }

        Request<RemoveTagsRequest> request = new DefaultRequest<RemoveTagsRequest>(
                removeTagsRequest, "AmazonElasticsearchService");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2015-01-01/tags-removal";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (removeTagsRequest.getARN() != null) {
                String aRN = removeTagsRequest.getARN();
                jsonWriter.name("ARN");
                jsonWriter.value(aRN);
            }
            if (removeTagsRequest.getTagKeys() != null) {
                java.util.List<String> tagKeys = removeTagsRequest.getTagKeys();
                jsonWriter.name("TagKeys");
                jsonWriter.beginArray();
                for (String tagKeysItem : tagKeys) {
                    if (tagKeysItem != null) {
                        jsonWriter.value(tagKeysItem);
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
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
