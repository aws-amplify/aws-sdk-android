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

package com.amazonaws.services.awsdataexchange.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The request has exceeded the quotas imposed by the service.
 * </p>
 */
public class ServiceLimitExceededException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The name of the quota that was exceeded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Products per account, Data sets per account, Data
     * sets per product, Revisions per data set, Assets per revision, Assets per
     * import job from Amazon S3, Asset per export job from Amazon S3, Asset
     * size in GB, Concurrent in progress jobs to import assets from Amazon S3,
     * Concurrent in progress jobs to import assets from a signed URL,
     * Concurrent in progress jobs to export assets to Amazon S3, Concurrent in
     * progress jobs to export assets to a signed URL
     */
    private String limitName;

    /**
     * <p>
     * The maximum value for the service-specific limit.
     * </p>
     */
    private Double limitValue;

    /**
     * Constructs a new ServiceLimitExceededException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public ServiceLimitExceededException(String message) {
        super(message);
    }

    /**
     * <p>
     * The name of the quota that was exceeded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Products per account, Data sets per account, Data
     * sets per product, Revisions per data set, Assets per revision, Assets per
     * import job from Amazon S3, Asset per export job from Amazon S3, Asset
     * size in GB, Concurrent in progress jobs to import assets from Amazon S3,
     * Concurrent in progress jobs to import assets from a signed URL,
     * Concurrent in progress jobs to export assets to Amazon S3, Concurrent in
     * progress jobs to export assets to a signed URL
     *
     * @return <p>
     *         The name of the quota that was exceeded.
     *         </p>
     * @see LimitName
     */
    public String getLimitName() {
        return limitName;
    }

    /**
     * <p>
     * The name of the quota that was exceeded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Products per account, Data sets per account, Data
     * sets per product, Revisions per data set, Assets per revision, Assets per
     * import job from Amazon S3, Asset per export job from Amazon S3, Asset
     * size in GB, Concurrent in progress jobs to import assets from Amazon S3,
     * Concurrent in progress jobs to import assets from a signed URL,
     * Concurrent in progress jobs to export assets to Amazon S3, Concurrent in
     * progress jobs to export assets to a signed URL
     *
     * @param limitName <p>
     *            The name of the quota that was exceeded.
     *            </p>
     * @see LimitName
     */
    public void setLimitName(String limitName) {
        this.limitName = limitName;
    }

    /**
     * <p>
     * The maximum value for the service-specific limit.
     * </p>
     *
     * @return <p>
     *         The maximum value for the service-specific limit.
     *         </p>
     */
    public Double getLimitValue() {
        return limitValue;
    }

    /**
     * <p>
     * The maximum value for the service-specific limit.
     * </p>
     *
     * @param limitValue <p>
     *            The maximum value for the service-specific limit.
     *            </p>
     */
    public void setLimitValue(Double limitValue) {
        this.limitValue = limitValue;
    }
}
