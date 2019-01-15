/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.services.s3.internal;

import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration.Rule;

import java.util.Date;

/**
 * Interface for service responses that receive the x-amz-expiration header.
 *
 * @see Headers#EXPIRATION
 */
public interface ObjectExpirationResult {

    /**
     * Returns the expiration date of the object, or null if the object is not
     * configured to expire.
     * @return Date the expiration time.
     */
    public Date getExpirationTime();

    /**
     * Sets the expiration date of the object.
     *
     * @param expiration The date the object will expire.
     */
    public void setExpirationTime(Date expiration);

    /**
     * Returns the bucket lifecycle configuration rule ID for the expiration of
     * this object.
     *
     * @see Rule#getId()
     * @return String the expiration time rule ID.
     */
    public String getExpirationTimeRuleId();

    /**
     * Sets the bucket lifecycle configuration rule ID for the expiration of
     * this object.
     *
     * @param ruleId The rule ID of this object's expiration configuration
     */
    public void setExpirationTimeRuleId(String ruleId);

}
