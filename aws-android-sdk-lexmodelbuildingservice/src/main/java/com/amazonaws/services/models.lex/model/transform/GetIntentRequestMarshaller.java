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

package com.amazonaws.services.models.lex.model.transform;

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
import com.amazonaws.services.models.lex.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for GetIntentRequest
 */
public class GetIntentRequestMarshaller implements
        Marshaller<Request<GetIntentRequest>, GetIntentRequest> {

    public Request<GetIntentRequest> marshall(GetIntentRequest getIntentRequest) {
        if (getIntentRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(GetIntentRequest)");
        }

        Request<GetIntentRequest> request = new DefaultRequest<GetIntentRequest>(getIntentRequest,
                "AmazonLexModelBuildingService");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/intents/{name}/versions/{version}";
        uriResourcePath = uriResourcePath.replace(
                "{name}",
                (getIntentRequest.getName() == null) ? "" : StringUtils.fromString(getIntentRequest
                        .getName()));
        uriResourcePath = uriResourcePath.replace(
                "{version}",
                (getIntentRequest.getVersion() == null) ? "" : StringUtils
                        .fromString(getIntentRequest.getVersion()));
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
