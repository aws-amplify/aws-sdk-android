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

package com.amazonaws.services.s3.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for ListObjectsRequest
 */
public class ListObjectsRequestMarshaller implements
        Marshaller<Request<ListObjectsRequest>, ListObjectsRequest> {

    public Request<ListObjectsRequest> marshall(ListObjectsRequest listObjectsRequest) {
        if (listObjectsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListObjectsRequest)");
        }

        Request<ListObjectsRequest> request = new DefaultRequest<ListObjectsRequest>(
                listObjectsRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "ListObjects");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (listObjectsRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = listObjectsRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (listObjectsRequest.getDelimiter() != null) {
            prefix = "delimiter";
            String delimiter = listObjectsRequest.getDelimiter();
            request.addParameter(prefix, StringUtils.fromString(delimiter));
        }
        if (listObjectsRequest.getEncodingType() != null) {
            prefix = "encoding-type";
            String encodingType = listObjectsRequest.getEncodingType();
            request.addParameter(prefix, StringUtils.fromString(encodingType));
        }
        if (listObjectsRequest.getMarker() != null) {
            prefix = "marker";
            String marker = listObjectsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (listObjectsRequest.getMaxKeys() != null) {
            prefix = "max-keys";
            Integer maxKeys = listObjectsRequest.getMaxKeys();
            request.addParameter(prefix, StringUtils.fromInteger(maxKeys));
        }
        if (listObjectsRequest.getPrefix() != null) {
            prefix = "prefix";
            String prefix = listObjectsRequest.getPrefix();
            request.addParameter(prefix, StringUtils.fromString(prefix));
        }
        if (listObjectsRequest.getRequestPayer() != null) {
            prefix = "x-amz-request-payer";
            String requestPayer = listObjectsRequest.getRequestPayer();
            request.addParameter(prefix, StringUtils.fromString(requestPayer));
        }

        return request;
    }
}
