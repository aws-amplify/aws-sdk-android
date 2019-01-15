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

package com.amazonaws.services.kinesisvideoarchivedmedia.model.transform;

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
import com.amazonaws.services.kinesisvideoarchivedmedia.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for GetMediaForFragmentListRequest
 */
public class GetMediaForFragmentListRequestMarshaller implements
        Marshaller<Request<GetMediaForFragmentListRequest>, GetMediaForFragmentListRequest> {

    public Request<GetMediaForFragmentListRequest> marshall(
            GetMediaForFragmentListRequest getMediaForFragmentListRequest) {
        if (getMediaForFragmentListRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetMediaForFragmentListRequest)");
        }

        Request<GetMediaForFragmentListRequest> request = new DefaultRequest<GetMediaForFragmentListRequest>(
                getMediaForFragmentListRequest, "AWSKinesisVideoArchivedMedia");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/getMediaForFragmentList";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (getMediaForFragmentListRequest.getStreamName() != null) {
                String streamName = getMediaForFragmentListRequest.getStreamName();
                jsonWriter.name("StreamName");
                jsonWriter.value(streamName);
            }
            if (getMediaForFragmentListRequest.getFragments() != null) {
                java.util.List<String> fragments = getMediaForFragmentListRequest.getFragments();
                jsonWriter.name("Fragments");
                jsonWriter.beginArray();
                for (String fragmentsItem : fragments) {
                    if (fragmentsItem != null) {
                        jsonWriter.value(fragmentsItem);
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
