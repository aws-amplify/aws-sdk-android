/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

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
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for DeleteCertificateRequest
 */
public class DeleteCertificateRequestMarshaller implements
        Marshaller<Request<DeleteCertificateRequest>, DeleteCertificateRequest> {

    public Request<DeleteCertificateRequest> marshall(
            DeleteCertificateRequest deleteCertificateRequest) {
        if (deleteCertificateRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeleteCertificateRequest)");
        }

        Request<DeleteCertificateRequest> request = new DefaultRequest<DeleteCertificateRequest>(
                deleteCertificateRequest, "AWSIot");
        request.setHttpMethod(HttpMethodName.DELETE);

        String uriResourcePath = "/certificates/{certificateId}";
        uriResourcePath = uriResourcePath.replace(
                "{certificateId}",
                (deleteCertificateRequest.getCertificateId() == null) ? "" : StringUtils
                        .fromString(deleteCertificateRequest.getCertificateId()));
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
