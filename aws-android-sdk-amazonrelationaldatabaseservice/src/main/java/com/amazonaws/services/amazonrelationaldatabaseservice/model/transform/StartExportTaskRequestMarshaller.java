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

package com.amazonaws.services.amazonrelationaldatabaseservice.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for StartExportTaskRequest
 */
public class StartExportTaskRequestMarshaller implements
        Marshaller<Request<StartExportTaskRequest>, StartExportTaskRequest> {

    public Request<StartExportTaskRequest> marshall(StartExportTaskRequest startExportTaskRequest) {
        if (startExportTaskRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StartExportTaskRequest)");
        }

        Request<StartExportTaskRequest> request = new DefaultRequest<StartExportTaskRequest>(
                startExportTaskRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "StartExportTask");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (startExportTaskRequest.getExportTaskIdentifier() != null) {
            prefix = "ExportTaskIdentifier";
            String exportTaskIdentifier = startExportTaskRequest.getExportTaskIdentifier();
            request.addParameter(prefix, StringUtils.fromString(exportTaskIdentifier));
        }
        if (startExportTaskRequest.getSourceArn() != null) {
            prefix = "SourceArn";
            String sourceArn = startExportTaskRequest.getSourceArn();
            request.addParameter(prefix, StringUtils.fromString(sourceArn));
        }
        if (startExportTaskRequest.getS3BucketName() != null) {
            prefix = "S3BucketName";
            String s3BucketName = startExportTaskRequest.getS3BucketName();
            request.addParameter(prefix, StringUtils.fromString(s3BucketName));
        }
        if (startExportTaskRequest.getIamRoleArn() != null) {
            prefix = "IamRoleArn";
            String iamRoleArn = startExportTaskRequest.getIamRoleArn();
            request.addParameter(prefix, StringUtils.fromString(iamRoleArn));
        }
        if (startExportTaskRequest.getKmsKeyId() != null) {
            prefix = "KmsKeyId";
            String kmsKeyId = startExportTaskRequest.getKmsKeyId();
            request.addParameter(prefix, StringUtils.fromString(kmsKeyId));
        }
        if (startExportTaskRequest.getS3Prefix() != null) {
            prefix = "S3Prefix";
            String s3Prefix = startExportTaskRequest.getS3Prefix();
            request.addParameter(prefix, StringUtils.fromString(s3Prefix));
        }
        if (startExportTaskRequest.getExportOnly() != null) {
            prefix = "ExportOnly";
            java.util.List<String> exportOnly = startExportTaskRequest.getExportOnly();
            int exportOnlyIndex = 1;
            String exportOnlyPrefix = prefix;
            for (String exportOnlyItem : exportOnly) {
                prefix = exportOnlyPrefix + ".member." + exportOnlyIndex;
                if (exportOnlyItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(exportOnlyItem));
                }
                exportOnlyIndex++;
            }
            prefix = exportOnlyPrefix;
        }

        return request;
    }
}
