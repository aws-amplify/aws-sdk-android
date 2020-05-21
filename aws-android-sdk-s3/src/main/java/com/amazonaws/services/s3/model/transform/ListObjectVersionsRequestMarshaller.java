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
 * StAX request marshaller for ListObjectVersionsRequest
 */
public class ListObjectVersionsRequestMarshaller implements
        Marshaller<Request<ListObjectVersionsRequest>, ListObjectVersionsRequest> {

    public Request<ListObjectVersionsRequest> marshall(
            ListObjectVersionsRequest listObjectVersionsRequest) {
        if (listObjectVersionsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListObjectVersionsRequest)");
        }

        Request<ListObjectVersionsRequest> request = new DefaultRequest<ListObjectVersionsRequest>(
                listObjectVersionsRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "ListObjectVersions");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (listObjectVersionsRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = listObjectVersionsRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (listObjectVersionsRequest.getDelimiter() != null) {
            prefix = "delimiter";
            String delimiter = listObjectVersionsRequest.getDelimiter();
            request.addParameter(prefix, StringUtils.fromString(delimiter));
        }
        if (listObjectVersionsRequest.getEncodingType() != null) {
            prefix = "encoding-type";
            String encodingType = listObjectVersionsRequest.getEncodingType();
            request.addParameter(prefix, StringUtils.fromString(encodingType));
        }
        if (listObjectVersionsRequest.getKeyMarker() != null) {
            prefix = "key-marker";
            String keyMarker = listObjectVersionsRequest.getKeyMarker();
            request.addParameter(prefix, StringUtils.fromString(keyMarker));
        }
        if (listObjectVersionsRequest.getMaxKeys() != null) {
            prefix = "max-keys";
            Integer maxKeys = listObjectVersionsRequest.getMaxKeys();
            request.addParameter(prefix, StringUtils.fromInteger(maxKeys));
        }
        if (listObjectVersionsRequest.getPrefix() != null) {
            prefix = "prefix";
            String prefix = listObjectVersionsRequest.getPrefix();
            request.addParameter(prefix, StringUtils.fromString(prefix));
        }
        if (listObjectVersionsRequest.getVersionIdMarker() != null) {
            prefix = "version-id-marker";
            String versionIdMarker = listObjectVersionsRequest.getVersionIdMarker();
            request.addParameter(prefix, StringUtils.fromString(versionIdMarker));
        }

        return request;
    }
}
