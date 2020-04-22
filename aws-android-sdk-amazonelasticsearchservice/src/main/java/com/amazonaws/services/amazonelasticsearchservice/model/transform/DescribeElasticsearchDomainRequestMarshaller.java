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

package com.amazonaws.services.amazonelasticsearchservice.model.transform;

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
import com.amazonaws.services.amazonelasticsearchservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for DescribeElasticsearchDomainRequest
 */
public class DescribeElasticsearchDomainRequestMarshaller implements
        Marshaller<Request<DescribeElasticsearchDomainRequest>, DescribeElasticsearchDomainRequest> {

    public Request<DescribeElasticsearchDomainRequest> marshall(
            DescribeElasticsearchDomainRequest describeElasticsearchDomainRequest) {
        if (describeElasticsearchDomainRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeElasticsearchDomainRequest)");
        }

        Request<DescribeElasticsearchDomainRequest> request = new DefaultRequest<DescribeElasticsearchDomainRequest>(
                describeElasticsearchDomainRequest, "AmazonElasticsearchService");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2015-01-01/es/domain/{DomainName}";
        uriResourcePath = uriResourcePath.replace(
                "{DomainName}",
                (describeElasticsearchDomainRequest.getDomainName() == null) ? "" : StringUtils
                        .fromString(describeElasticsearchDomainRequest.getDomainName()));
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
