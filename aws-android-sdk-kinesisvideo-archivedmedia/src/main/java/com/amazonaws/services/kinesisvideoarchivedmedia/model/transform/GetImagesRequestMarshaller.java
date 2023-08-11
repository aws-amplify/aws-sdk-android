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

package com.amazonaws.services.kinesisvideoarchivedmedia.model.transform;

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
import com.amazonaws.services.kinesisvideoarchivedmedia.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for GetImagesRequest
 */
public class GetImagesRequestMarshaller implements
        Marshaller<Request<GetImagesRequest>, GetImagesRequest> {

    public Request<GetImagesRequest> marshall(GetImagesRequest getImagesRequest) {
        if (getImagesRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(GetImagesRequest)");
        }

        Request<GetImagesRequest> request = new DefaultRequest<GetImagesRequest>(getImagesRequest,
                "AWSKinesisVideoArchivedMedia");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/getImages";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (getImagesRequest.getStreamName() != null) {
                String streamName = getImagesRequest.getStreamName();
                jsonWriter.name("StreamName");
                jsonWriter.value(streamName);
            }
            if (getImagesRequest.getStreamARN() != null) {
                String streamARN = getImagesRequest.getStreamARN();
                jsonWriter.name("StreamARN");
                jsonWriter.value(streamARN);
            }
            if (getImagesRequest.getImageSelectorType() != null) {
                String imageSelectorType = getImagesRequest.getImageSelectorType();
                jsonWriter.name("ImageSelectorType");
                jsonWriter.value(imageSelectorType);
            }
            if (getImagesRequest.getStartTimestamp() != null) {
                java.util.Date startTimestamp = getImagesRequest.getStartTimestamp();
                jsonWriter.name("StartTimestamp");
                jsonWriter.value(startTimestamp);
            }
            if (getImagesRequest.getEndTimestamp() != null) {
                java.util.Date endTimestamp = getImagesRequest.getEndTimestamp();
                jsonWriter.name("EndTimestamp");
                jsonWriter.value(endTimestamp);
            }
            if (getImagesRequest.getSamplingInterval() != null) {
                Integer samplingInterval = getImagesRequest.getSamplingInterval();
                jsonWriter.name("SamplingInterval");
                jsonWriter.value(samplingInterval);
            }
            if (getImagesRequest.getFormat() != null) {
                String format = getImagesRequest.getFormat();
                jsonWriter.name("Format");
                jsonWriter.value(format);
            }
            if (getImagesRequest.getFormatConfig() != null) {
                java.util.Map<String, String> formatConfig = getImagesRequest.getFormatConfig();
                jsonWriter.name("FormatConfig");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> formatConfigEntry : formatConfig
                        .entrySet()) {
                    String formatConfigValue = formatConfigEntry.getValue();
                    if (formatConfigValue != null) {
                        jsonWriter.name(formatConfigEntry.getKey());
                        jsonWriter.value(formatConfigValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (getImagesRequest.getWidthPixels() != null) {
                Integer widthPixels = getImagesRequest.getWidthPixels();
                jsonWriter.name("WidthPixels");
                jsonWriter.value(widthPixels);
            }
            if (getImagesRequest.getHeightPixels() != null) {
                Integer heightPixels = getImagesRequest.getHeightPixels();
                jsonWriter.name("HeightPixels");
                jsonWriter.value(heightPixels);
            }
            if (getImagesRequest.getMaxResults() != null) {
                Long maxResults = getImagesRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (getImagesRequest.getNextToken() != null) {
                String nextToken = getImagesRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
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
