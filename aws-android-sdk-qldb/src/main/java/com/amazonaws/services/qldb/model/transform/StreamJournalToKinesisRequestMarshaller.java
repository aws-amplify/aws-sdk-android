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

package com.amazonaws.services.qldb.model.transform;

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
import com.amazonaws.services.qldb.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for StreamJournalToKinesisRequest
 */
public class StreamJournalToKinesisRequestMarshaller implements
        Marshaller<Request<StreamJournalToKinesisRequest>, StreamJournalToKinesisRequest> {

    public Request<StreamJournalToKinesisRequest> marshall(
            StreamJournalToKinesisRequest streamJournalToKinesisRequest) {
        if (streamJournalToKinesisRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StreamJournalToKinesisRequest)");
        }

        Request<StreamJournalToKinesisRequest> request = new DefaultRequest<StreamJournalToKinesisRequest>(
                streamJournalToKinesisRequest, "AmazonQLDB");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/ledgers/{name}/journal-kinesis-streams";
        uriResourcePath = uriResourcePath.replace(
                "{name}",
                (streamJournalToKinesisRequest.getLedgerName() == null) ? "" : StringUtils
                        .fromString(streamJournalToKinesisRequest.getLedgerName()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (streamJournalToKinesisRequest.getRoleArn() != null) {
                String roleArn = streamJournalToKinesisRequest.getRoleArn();
                jsonWriter.name("RoleArn");
                jsonWriter.value(roleArn);
            }
            if (streamJournalToKinesisRequest.getTags() != null) {
                java.util.Map<String, String> tags = streamJournalToKinesisRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                    String tagsValue = tagsEntry.getValue();
                    if (tagsValue != null) {
                        jsonWriter.name(tagsEntry.getKey());
                        jsonWriter.value(tagsValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (streamJournalToKinesisRequest.getInclusiveStartTime() != null) {
                java.util.Date inclusiveStartTime = streamJournalToKinesisRequest
                        .getInclusiveStartTime();
                jsonWriter.name("InclusiveStartTime");
                jsonWriter.value(inclusiveStartTime);
            }
            if (streamJournalToKinesisRequest.getExclusiveEndTime() != null) {
                java.util.Date exclusiveEndTime = streamJournalToKinesisRequest
                        .getExclusiveEndTime();
                jsonWriter.name("ExclusiveEndTime");
                jsonWriter.value(exclusiveEndTime);
            }
            if (streamJournalToKinesisRequest.getKinesisConfiguration() != null) {
                KinesisConfiguration kinesisConfiguration = streamJournalToKinesisRequest
                        .getKinesisConfiguration();
                jsonWriter.name("KinesisConfiguration");
                KinesisConfigurationJsonMarshaller.getInstance().marshall(kinesisConfiguration,
                        jsonWriter);
            }
            if (streamJournalToKinesisRequest.getStreamName() != null) {
                String streamName = streamJournalToKinesisRequest.getStreamName();
                jsonWriter.name("StreamName");
                jsonWriter.value(streamName);
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
