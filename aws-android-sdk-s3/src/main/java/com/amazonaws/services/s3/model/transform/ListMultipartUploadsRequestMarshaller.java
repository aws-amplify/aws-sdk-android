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
 * StAX request marshaller for ListMultipartUploadsRequest
 */
public class ListMultipartUploadsRequestMarshaller implements
        Marshaller<Request<ListMultipartUploadsRequest>, ListMultipartUploadsRequest> {

    public Request<ListMultipartUploadsRequest> marshall(
            ListMultipartUploadsRequest listMultipartUploadsRequest) {
        if (listMultipartUploadsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListMultipartUploadsRequest)");
        }

        Request<ListMultipartUploadsRequest> request = new DefaultRequest<ListMultipartUploadsRequest>(
                listMultipartUploadsRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "ListMultipartUploads");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (listMultipartUploadsRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = listMultipartUploadsRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (listMultipartUploadsRequest.getDelimiter() != null) {
            prefix = "delimiter";
            String delimiter = listMultipartUploadsRequest.getDelimiter();
            request.addParameter(prefix, StringUtils.fromString(delimiter));
        }
        if (listMultipartUploadsRequest.getEncodingType() != null) {
            prefix = "encoding-type";
            String encodingType = listMultipartUploadsRequest.getEncodingType();
            request.addParameter(prefix, StringUtils.fromString(encodingType));
        }
        if (listMultipartUploadsRequest.getKeyMarker() != null) {
            prefix = "key-marker";
            String keyMarker = listMultipartUploadsRequest.getKeyMarker();
            request.addParameter(prefix, StringUtils.fromString(keyMarker));
        }
        if (listMultipartUploadsRequest.getMaxUploads() != null) {
            prefix = "max-uploads";
            Integer maxUploads = listMultipartUploadsRequest.getMaxUploads();
            request.addParameter(prefix, StringUtils.fromInteger(maxUploads));
        }
        if (listMultipartUploadsRequest.getPrefix() != null) {
            prefix = "prefix";
            String prefix = listMultipartUploadsRequest.getPrefix();
            request.addParameter(prefix, StringUtils.fromString(prefix));
        }
        if (listMultipartUploadsRequest.getUploadIdMarker() != null) {
            prefix = "upload-id-marker";
            String uploadIdMarker = listMultipartUploadsRequest.getUploadIdMarker();
            request.addParameter(prefix, StringUtils.fromString(uploadIdMarker));
        }

        return request;
    }
}
