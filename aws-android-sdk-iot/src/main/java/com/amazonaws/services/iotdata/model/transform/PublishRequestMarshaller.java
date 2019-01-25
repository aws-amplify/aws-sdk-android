/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iotdata.model.transform;

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
import com.amazonaws.services.iotdata.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for PublishRequest
 */
public class PublishRequestMarshaller implements
        Marshaller<Request<PublishRequest>, PublishRequest> {

    public Request<PublishRequest> marshall(PublishRequest publishRequest) {
        if (publishRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(PublishRequest)");
        }

        Request<PublishRequest> request = new DefaultRequest<PublishRequest>(publishRequest,
                "AWSIotData");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/topics/{topic}";
        uriResourcePath = uriResourcePath.replace(
                "{topic}",
                (publishRequest.getTopic() == null) ? "" : StringUtils.fromString(publishRequest
                        .getTopic()));
        if (publishRequest.getQos() != null) {
            request.addParameter("qos", StringUtils.fromInteger(publishRequest.getQos()));
        }
        request.setResourcePath(uriResourcePath);
        request.addHeader("Content-Length",
                Integer.toString(publishRequest.getPayload().remaining()));
        request.setContent(BinaryUtils.toStream(publishRequest.getPayload()));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
