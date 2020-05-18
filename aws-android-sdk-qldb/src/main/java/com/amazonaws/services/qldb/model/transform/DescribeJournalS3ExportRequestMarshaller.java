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
 * JSON request marshaller for DescribeJournalS3ExportRequest
 */
public class DescribeJournalS3ExportRequestMarshaller implements
        Marshaller<Request<DescribeJournalS3ExportRequest>, DescribeJournalS3ExportRequest> {

    public Request<DescribeJournalS3ExportRequest> marshall(
            DescribeJournalS3ExportRequest describeJournalS3ExportRequest) {
        if (describeJournalS3ExportRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeJournalS3ExportRequest)");
        }

        Request<DescribeJournalS3ExportRequest> request = new DefaultRequest<DescribeJournalS3ExportRequest>(
                describeJournalS3ExportRequest, "AmazonQLDB");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/ledgers/{name}/journal-s3-exports/{exportId}";
        uriResourcePath = uriResourcePath.replace(
                "{name}",
                (describeJournalS3ExportRequest.getName() == null) ? "" : StringUtils
                        .fromString(describeJournalS3ExportRequest.getName()));
        uriResourcePath = uriResourcePath.replace(
                "{exportId}",
                (describeJournalS3ExportRequest.getExportId() == null) ? "" : StringUtils
                        .fromString(describeJournalS3ExportRequest.getExportId()));
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
