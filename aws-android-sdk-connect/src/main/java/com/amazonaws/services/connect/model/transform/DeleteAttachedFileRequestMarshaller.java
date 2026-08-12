/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

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
import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for DeleteAttachedFileRequest
 */
public class DeleteAttachedFileRequestMarshaller implements
        Marshaller<Request<DeleteAttachedFileRequest>, DeleteAttachedFileRequest> {

    public Request<DeleteAttachedFileRequest> marshall(
            DeleteAttachedFileRequest deleteAttachedFileRequest) {
        if (deleteAttachedFileRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeleteAttachedFileRequest)");
        }

        Request<DeleteAttachedFileRequest> request = new DefaultRequest<DeleteAttachedFileRequest>(
                deleteAttachedFileRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.DELETE);

        String uriResourcePath = "/attached-files/{InstanceId}/{FileId}";
        uriResourcePath = uriResourcePath.replace(
                "{InstanceId}",
                (deleteAttachedFileRequest.getInstanceId() == null) ? "" : StringUtils
                        .fromString(deleteAttachedFileRequest.getInstanceId()));
        uriResourcePath = uriResourcePath.replace(
                "{FileId}",
                (deleteAttachedFileRequest.getFileId() == null) ? "" : StringUtils
                        .fromString(deleteAttachedFileRequest.getFileId()));
        if (deleteAttachedFileRequest.getAssociatedResourceArn() != null) {
            request.addParameter("associatedResourceArn",
                    StringUtils.fromString(deleteAttachedFileRequest.getAssociatedResourceArn()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
