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
 * StAX request marshaller for ListObjectsV2Request
 */
public class ListObjectsV2RequestMarshaller implements
        Marshaller<Request<ListObjectsV2Request>, ListObjectsV2Request> {

    public Request<ListObjectsV2Request> marshall(ListObjectsV2Request listObjectsV2Request) {
        if (listObjectsV2Request == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListObjectsV2Request)");
        }

        Request<ListObjectsV2Request> request = new DefaultRequest<ListObjectsV2Request>(
                listObjectsV2Request, "AmazonSimpleStorageService");
        request.addParameter("Action", "ListObjectsV2");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (listObjectsV2Request.getBucket() != null) {
            prefix = "Bucket";
            String bucket = listObjectsV2Request.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (listObjectsV2Request.getDelimiter() != null) {
            prefix = "delimiter";
            String delimiter = listObjectsV2Request.getDelimiter();
            request.addParameter(prefix, StringUtils.fromString(delimiter));
        }
        if (listObjectsV2Request.getEncodingType() != null) {
            prefix = "encoding-type";
            String encodingType = listObjectsV2Request.getEncodingType();
            request.addParameter(prefix, StringUtils.fromString(encodingType));
        }
        if (listObjectsV2Request.getMaxKeys() != null) {
            prefix = "max-keys";
            Integer maxKeys = listObjectsV2Request.getMaxKeys();
            request.addParameter(prefix, StringUtils.fromInteger(maxKeys));
        }
        if (listObjectsV2Request.getPrefix() != null) {
            prefix = "prefix";
            String prefix = listObjectsV2Request.getPrefix();
            request.addParameter(prefix, StringUtils.fromString(prefix));
        }
        if (listObjectsV2Request.getContinuationToken() != null) {
            prefix = "continuation-token";
            String continuationToken = listObjectsV2Request.getContinuationToken();
            request.addParameter(prefix, StringUtils.fromString(continuationToken));
        }
        if (listObjectsV2Request.getFetchOwner() != null) {
            prefix = "fetch-owner";
            Boolean fetchOwner = listObjectsV2Request.getFetchOwner();
            request.addParameter(prefix, StringUtils.fromBoolean(fetchOwner));
        }
        if (listObjectsV2Request.getStartAfter() != null) {
            prefix = "start-after";
            String startAfter = listObjectsV2Request.getStartAfter();
            request.addParameter(prefix, StringUtils.fromString(startAfter));
        }
        if (listObjectsV2Request.getRequestPayer() != null) {
            prefix = "x-amz-request-payer";
            String requestPayer = listObjectsV2Request.getRequestPayer();
            request.addParameter(prefix, StringUtils.fromString(requestPayer));
        }

        return request;
    }
}
