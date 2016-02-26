/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.services.kinesis.model.transform;

import static org.junit.Assert.assertEquals;

import com.amazonaws.Request;
import com.amazonaws.services.kinesis.model.PutRecordRequest;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.JsonUtils;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Test;
import org.junit.Ignore;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.zip.GZIPInputStream;

public class PutRecordRequestMarshallerTest {

    @Ignore
    @Test
    public void test() throws Exception {
        PutRecordRequest putRecordRequest = new PutRecordRequest();
        putRecordRequest.setStreamName("stream name");
        putRecordRequest.setSequenceNumberForOrdering("sequence number for ordering");
        putRecordRequest.setPartitionKey("partition key");
        String randomStr = RandomStringUtils.random(128 * 1024);
        putRecordRequest.setData(ByteBuffer.wrap(randomStr.getBytes(StringUtils.UTF8)));
        PutRecordRequestMarshaller marshaller = new PutRecordRequestMarshaller();
        Request<PutRecordRequest> request = marshaller.marshall(putRecordRequest);

        assertEquals("content encoding", "gzip", request.getHeaders().get("Content-Encoding"));
        byte[] content = IOUtils.toByteArray(request.getContent());
        assertEquals("content length", request.getHeaders().get("Content-Length"),
                String.valueOf(content.length));
        GZIPInputStream gis = new GZIPInputStream(new ByteArrayInputStream(content));
        String str = IOUtils.toString(gis);
        Map<String, String> map = JsonUtils.jsonToMap(str);
        assertEquals("StreamName", "stream name", map.get("StreamName"));
        String data = new String(BinaryUtils.fromBase64(map.get("Data")), StringUtils.UTF8);
        assertEquals("same data", randomStr, data);
    }
}
