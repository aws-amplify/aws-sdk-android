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

package com.amazonaws.services.mediaconvert.model.transform;

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
import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for DeleteQueueRequest
 */
public class DeleteQueueRequestMarshaller implements
        Marshaller<Request<DeleteQueueRequest>, DeleteQueueRequest> {

    public Request<DeleteQueueRequest> marshall(DeleteQueueRequest deleteQueueRequest) {
        if (deleteQueueRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeleteQueueRequest)");
        }

        Request<DeleteQueueRequest> request = new DefaultRequest<DeleteQueueRequest>(
                deleteQueueRequest, "AWSElementalMediaConvert");
        request.setHttpMethod(HttpMethodName.DELETE);

        String uriResourcePath = "/2017-08-29/queues/{name}";
        uriResourcePath = uriResourcePath.replace(
                "{name}",
                (deleteQueueRequest.getName() == null) ? "" : StringUtils
                        .fromString(deleteQueueRequest.getName()));
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
