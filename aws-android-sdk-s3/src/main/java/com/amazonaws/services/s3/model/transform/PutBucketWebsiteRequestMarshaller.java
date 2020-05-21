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
 * StAX request marshaller for PutBucketWebsiteRequest
 */
public class PutBucketWebsiteRequestMarshaller implements
        Marshaller<Request<PutBucketWebsiteRequest>, PutBucketWebsiteRequest> {

    public Request<PutBucketWebsiteRequest> marshall(PutBucketWebsiteRequest putBucketWebsiteRequest) {
        if (putBucketWebsiteRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutBucketWebsiteRequest)");
        }

        Request<PutBucketWebsiteRequest> request = new DefaultRequest<PutBucketWebsiteRequest>(
                putBucketWebsiteRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "PutBucketWebsite");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (putBucketWebsiteRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = putBucketWebsiteRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (putBucketWebsiteRequest.getContentMD5() != null) {
            prefix = "Content-MD5";
            String contentMD5 = putBucketWebsiteRequest.getContentMD5();
            request.addParameter(prefix, StringUtils.fromString(contentMD5));
        }
        if (putBucketWebsiteRequest.getWebsiteConfiguration() != null) {
            prefix = "WebsiteConfiguration";
            WebsiteConfiguration websiteConfiguration = putBucketWebsiteRequest
                    .getWebsiteConfiguration();
            WebsiteConfigurationStaxMarshaller.getInstance().marshall(websiteConfiguration,
                    request, prefix + ".");
        }

        return request;
    }
}
