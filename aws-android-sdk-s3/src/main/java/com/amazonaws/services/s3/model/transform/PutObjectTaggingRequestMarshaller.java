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
 * StAX request marshaller for PutObjectTaggingRequest
 */
public class PutObjectTaggingRequestMarshaller implements
        Marshaller<Request<PutObjectTaggingRequest>, PutObjectTaggingRequest> {

    public Request<PutObjectTaggingRequest> marshall(PutObjectTaggingRequest putObjectTaggingRequest) {
        if (putObjectTaggingRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutObjectTaggingRequest)");
        }

        Request<PutObjectTaggingRequest> request = new DefaultRequest<PutObjectTaggingRequest>(
                putObjectTaggingRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "PutObjectTagging");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (putObjectTaggingRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = putObjectTaggingRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (putObjectTaggingRequest.getKey() != null) {
            prefix = "Key";
            String key = putObjectTaggingRequest.getKey();
            request.addParameter(prefix, StringUtils.fromString(key));
        }
        if (putObjectTaggingRequest.getVersionId() != null) {
            prefix = "versionId";
            String versionId = putObjectTaggingRequest.getVersionId();
            request.addParameter(prefix, StringUtils.fromString(versionId));
        }
        if (putObjectTaggingRequest.getContentMD5() != null) {
            prefix = "Content-MD5";
            String contentMD5 = putObjectTaggingRequest.getContentMD5();
            request.addParameter(prefix, StringUtils.fromString(contentMD5));
        }
        if (putObjectTaggingRequest.getTagging() != null) {
            prefix = "Tagging";
            Tagging tagging = putObjectTaggingRequest.getTagging();
            TaggingStaxMarshaller.getInstance().marshall(tagging, request, prefix + ".");
        }

        return request;
    }
}
