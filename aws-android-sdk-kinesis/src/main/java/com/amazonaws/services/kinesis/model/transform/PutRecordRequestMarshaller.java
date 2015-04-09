/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesis.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.kinesis.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * Put Record Request Marshaller
 */
public class PutRecordRequestMarshaller implements Marshaller<Request<PutRecordRequest>, PutRecordRequest> {

    public Request<PutRecordRequest> marshall(PutRecordRequest putRecordRequest) {
    if (putRecordRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<PutRecordRequest> request = new DefaultRequest<PutRecordRequest>(putRecordRequest, "AmazonKinesis");
        String target = "Kinesis_20131202.PutRecord";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);

            jsonWriter.beginObject();
            
            if (putRecordRequest.getStreamName() != null) {
                jsonWriter.name("StreamName").value(putRecordRequest.getStreamName());
            }
            if (putRecordRequest.getData() != null) {
                jsonWriter.name("Data").value(putRecordRequest.getData());
            }
            if (putRecordRequest.getPartitionKey() != null) {
                jsonWriter.name("PartitionKey").value(putRecordRequest.getPartitionKey());
            }
            if (putRecordRequest.getExplicitHashKey() != null) {
                jsonWriter.name("ExplicitHashKey").value(putRecordRequest.getExplicitHashKey());
            }
            if (putRecordRequest.getSequenceNumberForOrdering() != null) {
                jsonWriter.name("SequenceNumberForOrdering").value(putRecordRequest.getSequenceNumberForOrdering());
            }

            jsonWriter.endObject();

            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch(Throwable t) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }
}
