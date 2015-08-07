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
import static org.junit.Assert.assertTrue;

import com.amazonaws.Request;
import com.amazonaws.services.kinesis.model.PutRecordsRequest;
import com.amazonaws.services.kinesis.model.PutRecordsRequestEntry;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.JsonUtils;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

public class PutRecordsRequestMarshallerTest {

    @Test
    public void test() throws Exception {
        PutRecordsRequest putRecordsRequest = new PutRecordsRequest();
        putRecordsRequest.setStreamName("stream name");
        List<PutRecordsRequestEntry> records = new ArrayList<PutRecordsRequestEntry>();
        for (int i = 0; i < 10; i++) {
            PutRecordsRequestEntry record = new PutRecordsRequestEntry();
            String randomStr = RandomStringUtils.random(8 * 1024);
            record.setData(ByteBuffer.wrap(randomStr.getBytes(StringUtils.UTF8)));
            record.setPartitionKey("partition key");
            records.add(record);
        }
        putRecordsRequest.setRecords(records);
        PutRecordsRequestMarshaller marshaller = new PutRecordsRequestMarshaller();
        Request<PutRecordsRequest> request = marshaller.marshall(putRecordsRequest);

        assertEquals("content encoding", "gzip", request.getHeaders().get("Content-Encoding"));
        byte[] content = IOUtils.toByteArray(request.getContent());
        assertEquals("content length", request.getHeaders().get("Content-Length"),
                String.valueOf(content.length));
        GZIPInputStream gis = new GZIPInputStream(new ByteArrayInputStream(content));
        String str = IOUtils.toString(gis);
        assertTrue("content is compressed", content.length < str.length());
        Map<String, String> map = JsonUtils.jsonToMap(str);
        assertEquals("StreamName", "stream name", map.get("StreamName"));
    }
}
