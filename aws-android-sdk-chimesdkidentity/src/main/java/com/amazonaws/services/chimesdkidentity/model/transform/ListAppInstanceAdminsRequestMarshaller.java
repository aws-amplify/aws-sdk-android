/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkidentity.model.transform;

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
import com.amazonaws.services.chimesdkidentity.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

import android.net.Uri;

/**
 * JSON request marshaller for ListAppInstanceAdminsRequest
 */
public class ListAppInstanceAdminsRequestMarshaller implements
        Marshaller<Request<ListAppInstanceAdminsRequest>, ListAppInstanceAdminsRequest> {

    public Request<ListAppInstanceAdminsRequest> marshall(
            ListAppInstanceAdminsRequest listAppInstanceAdminsRequest) {
        if (listAppInstanceAdminsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListAppInstanceAdminsRequest)");
        }

        Request<ListAppInstanceAdminsRequest> request = new DefaultRequest<ListAppInstanceAdminsRequest>(
                listAppInstanceAdminsRequest, "AmazonChimeSDKIdentity");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/app-instances/{appInstanceArn}/admins";
        uriResourcePath = uriResourcePath.replace(
                "{appInstanceArn}",
                (listAppInstanceAdminsRequest.getAppInstanceArn() == null) ? "" : StringUtils
                        .fromString(listAppInstanceAdminsRequest.getAppInstanceArn()));
        if (listAppInstanceAdminsRequest.getMaxResults() != null) {
            request.addParameter("max-results",
                    StringUtils.fromInteger(listAppInstanceAdminsRequest.getMaxResults()));
        }
        if (listAppInstanceAdminsRequest.getNextToken() != null) {
            request.addParameter("next-token",
                    StringUtils.fromString(listAppInstanceAdminsRequest.getNextToken()));
        }
        request.setResourcePath(uriResourcePath);
        String encodedUriResourcePath = "/app-instances/{appInstanceArn}/admins";
        encodedUriResourcePath = encodedUriResourcePath.replace(
                "{appInstanceArn}",
                (listAppInstanceAdminsRequest.getAppInstanceArn() == null) ? "" : Uri
                        .encode(StringUtils.fromString(listAppInstanceAdminsRequest
                                .getAppInstanceArn())));
        request.setEncodedResourcePath(encodedUriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
