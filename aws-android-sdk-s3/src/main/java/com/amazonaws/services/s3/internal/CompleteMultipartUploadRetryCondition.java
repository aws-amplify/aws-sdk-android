/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.services.s3.model.AmazonS3Exception;

/**
 * Retry condition that determines if the multipart upload request should be retried.
 */
public class CompleteMultipartUploadRetryCondition implements RetryPolicy.RetryCondition {

    private static final int MAX_RETRY_ATTEMPTS = 3;

    private static final String ERROR_CODE = "InternalError";
    private static final String RETYABLE_ERROR_MESSAGE = "Please try again.";

    private final int maxCompleteMultipartUploadRetries;

    /**
     * Constructor.
     */
    public CompleteMultipartUploadRetryCondition() {
        this(MAX_RETRY_ATTEMPTS);
    }

    /**
     * For testing purposes.
     */
    CompleteMultipartUploadRetryCondition(
            int maxRetryAttempts) {
        this.maxCompleteMultipartUploadRetries = maxRetryAttempts;
    }

    @Override
    public boolean shouldRetry(AmazonWebServiceRequest originalRequest,
            AmazonClientException exception, int retriesAttempted) {

        if (exception instanceof AmazonS3Exception) {
            return test((AmazonS3Exception) exception)
                    && retriesAttempted < maxCompleteMultipartUploadRetries;
        }
        return false;
    }

    boolean test(AmazonS3Exception exception) {
        if (exception == null || exception.getErrorCode() == null ||
                exception.getErrorMessage() == null) {
            return false;
        }
        return exception.getErrorCode().contains(ERROR_CODE) &&
                exception.getErrorMessage().contains(RETYABLE_ERROR_MESSAGE);
    }
}
