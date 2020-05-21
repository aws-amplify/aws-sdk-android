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
 * StAX request marshaller for ListPartsRequest
 */
public class ListPartsRequestMarshaller implements
        Marshaller<Request<ListPartsRequest>, ListPartsRequest> {

    public Request<ListPartsRequest> marshall(ListPartsRequest listPartsRequest) {
        if (listPartsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(ListPartsRequest)");
        }

        Request<ListPartsRequest> request = new DefaultRequest<ListPartsRequest>(listPartsRequest,
                "AmazonSimpleStorageService");
        request.addParameter("Action", "ListParts");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (listPartsRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = listPartsRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (listPartsRequest.getKey() != null) {
            prefix = "Key";
            String key = listPartsRequest.getKey();
            request.addParameter(prefix, StringUtils.fromString(key));
        }
        if (listPartsRequest.getMaxParts() != null) {
            prefix = "max-parts";
            Integer maxParts = listPartsRequest.getMaxParts();
            request.addParameter(prefix, StringUtils.fromInteger(maxParts));
        }
        if (listPartsRequest.getPartNumberMarker() != null) {
            prefix = "part-number-marker";
            Integer partNumberMarker = listPartsRequest.getPartNumberMarker();
            request.addParameter(prefix, StringUtils.fromInteger(partNumberMarker));
        }
        if (listPartsRequest.getUploadId() != null) {
            prefix = "uploadId";
            String uploadId = listPartsRequest.getUploadId();
            request.addParameter(prefix, StringUtils.fromString(uploadId));
        }
        if (listPartsRequest.getRequestPayer() != null) {
            prefix = "x-amz-request-payer";
            String requestPayer = listPartsRequest.getRequestPayer();
            request.addParameter(prefix, StringUtils.fromString(requestPayer));
        }

        return request;
    }
}
