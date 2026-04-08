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
 * JSON request marshaller for UntagContactRequest
 */
public class UntagContactRequestMarshaller implements
        Marshaller<Request<UntagContactRequest>, UntagContactRequest> {

    public Request<UntagContactRequest> marshall(UntagContactRequest untagContactRequest) {
        if (untagContactRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UntagContactRequest)");
        }

        Request<UntagContactRequest> request = new DefaultRequest<UntagContactRequest>(
                untagContactRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.DELETE);

        String uriResourcePath = "/contact/tags/{InstanceId}/{ContactId}";
        uriResourcePath = uriResourcePath.replace(
                "{ContactId}",
                (untagContactRequest.getContactId() == null) ? "" : StringUtils
                        .fromString(untagContactRequest.getContactId()));
        uriResourcePath = uriResourcePath.replace(
                "{InstanceId}",
                (untagContactRequest.getInstanceId() == null) ? "" : StringUtils
                        .fromString(untagContactRequest.getInstanceId()));
        if (untagContactRequest.getTagKeys() != null) {
            request.addParameter("TagKeys",
                    TextUtils.join(",", untagContactRequest.getTagKeys().toArray(new String[0])));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
