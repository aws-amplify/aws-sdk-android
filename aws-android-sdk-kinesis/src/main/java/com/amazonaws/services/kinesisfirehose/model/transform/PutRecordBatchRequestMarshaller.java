/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisfirehose.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.zip.GZIPOutputStream;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.kinesisfirehose.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for PutRecordBatchRequest
 */
public class PutRecordBatchRequestMarshaller implements
        Marshaller<Request<PutRecordBatchRequest>, PutRecordBatchRequest> {

    public Request<PutRecordBatchRequest> marshall(PutRecordBatchRequest putRecordBatchRequest) {
        if (putRecordBatchRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutRecordBatchRequest)");
        }

        Request<PutRecordBatchRequest> request = new DefaultRequest<PutRecordBatchRequest>(
                putRecordBatchRequest, "AmazonKinesisFirehose");
        String target = "Firehose_20150804.PutRecordBatch";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            GZIPOutputStream gos = new GZIPOutputStream(baos, 8192);
            Writer writer = new OutputStreamWriter(gos, StringUtils.UTF8);
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(writer);
            jsonWriter.beginObject();

            if (putRecordBatchRequest.getDeliveryStreamName() != null) {
                String deliveryStreamName = putRecordBatchRequest.getDeliveryStreamName();
                jsonWriter.name("DeliveryStreamName");
                jsonWriter.value(deliveryStreamName);
            }
            if (putRecordBatchRequest.getRecords() != null) {
                java.util.List<Record> records = putRecordBatchRequest.getRecords();
                jsonWriter.name("Records");
                jsonWriter.beginArray();
                for (Record recordsItem : records) {
                    if (recordsItem != null) {
                        RecordJsonMarshaller.getInstance().marshall(recordsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();
            jsonWriter.flush();
            gos.finish();
            writer.close();

            byte[] content = baos.toByteArray();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Encoding", "gzip");
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
