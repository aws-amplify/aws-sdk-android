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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

/**
 * <p>
 * The Amazon Chime Business Calling settings for the administrator's AWS
 * account. Includes any Amazon S3 buckets designated for storing call detail
 * records.
 * </p>
 */
public class BusinessCallingSettings implements Serializable {
    /**
     * <p>
     * The Amazon S3 bucket designated for call detail record storage.
     * </p>
     */
    private String cdrBucket;

    /**
     * <p>
     * The Amazon S3 bucket designated for call detail record storage.
     * </p>
     *
     * @return <p>
     *         The Amazon S3 bucket designated for call detail record storage.
     *         </p>
     */
    public String getCdrBucket() {
        return cdrBucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket designated for call detail record storage.
     * </p>
     *
     * @param cdrBucket <p>
     *            The Amazon S3 bucket designated for call detail record
     *            storage.
     *            </p>
     */
    public void setCdrBucket(String cdrBucket) {
        this.cdrBucket = cdrBucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket designated for call detail record storage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cdrBucket <p>
     *            The Amazon S3 bucket designated for call detail record
     *            storage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BusinessCallingSettings withCdrBucket(String cdrBucket) {
        this.cdrBucket = cdrBucket;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCdrBucket() != null)
            sb.append("CdrBucket: " + getCdrBucket());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCdrBucket() == null) ? 0 : getCdrBucket().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BusinessCallingSettings == false)
            return false;
        BusinessCallingSettings other = (BusinessCallingSettings) obj;

        if (other.getCdrBucket() == null ^ this.getCdrBucket() == null)
            return false;
        if (other.getCdrBucket() != null
                && other.getCdrBucket().equals(this.getCdrBucket()) == false)
            return false;
        return true;
    }
}
