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

package com.amazonaws.services.shield.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Removes the DDoS Response Team's (DRT) access to the specified Amazon S3
 * bucket containing your AWS WAF logs.
 * </p>
 * <p>
 * To make a <code>DisassociateDRTLogBucket</code> request, you must be
 * subscribed to the <a
 * href="https://aws.amazon.com/premiumsupport/business-support/">Business
 * Support plan</a> or the <a
 * href="https://aws.amazon.com/premiumsupport/enterprise-support/">Enterprise
 * Support plan</a>. However, if you are not subscribed to one of these support
 * plans, but had been previously and had granted the DRT access to your
 * account, you can submit a <code>DisassociateDRTLogBucket</code> request to
 * remove this access.
 * </p>
 */
public class DisassociateDRTLogBucketRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The Amazon S3 bucket that contains your AWS WAF logs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern:
     * </b>^([a-z]|(\d(?!\d{0,2}\.\d{1,3}\.\d{1,3}\.\d{1,3})))([a-z\d
     * ]|(\.(?!(\.|-)))|(-(?!\.))){1,61}[a-z\d]$<br/>
     */
    private String logBucket;

    /**
     * <p>
     * The Amazon S3 bucket that contains your AWS WAF logs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern:
     * </b>^([a-z]|(\d(?!\d{0,2}\.\d{1,3}\.\d{1,3}\.\d{1,3})))([a-z\d
     * ]|(\.(?!(\.|-)))|(-(?!\.))){1,61}[a-z\d]$<br/>
     *
     * @return <p>
     *         The Amazon S3 bucket that contains your AWS WAF logs.
     *         </p>
     */
    public String getLogBucket() {
        return logBucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket that contains your AWS WAF logs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern:
     * </b>^([a-z]|(\d(?!\d{0,2}\.\d{1,3}\.\d{1,3}\.\d{1,3})))([a-z\d
     * ]|(\.(?!(\.|-)))|(-(?!\.))){1,61}[a-z\d]$<br/>
     *
     * @param logBucket <p>
     *            The Amazon S3 bucket that contains your AWS WAF logs.
     *            </p>
     */
    public void setLogBucket(String logBucket) {
        this.logBucket = logBucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket that contains your AWS WAF logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern:
     * </b>^([a-z]|(\d(?!\d{0,2}\.\d{1,3}\.\d{1,3}\.\d{1,3})))([a-z\d
     * ]|(\.(?!(\.|-)))|(-(?!\.))){1,61}[a-z\d]$<br/>
     *
     * @param logBucket <p>
     *            The Amazon S3 bucket that contains your AWS WAF logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateDRTLogBucketRequest withLogBucket(String logBucket) {
        this.logBucket = logBucket;
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
        if (getLogBucket() != null)
            sb.append("LogBucket: " + getLogBucket());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogBucket() == null) ? 0 : getLogBucket().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateDRTLogBucketRequest == false)
            return false;
        DisassociateDRTLogBucketRequest other = (DisassociateDRTLogBucketRequest) obj;

        if (other.getLogBucket() == null ^ this.getLogBucket() == null)
            return false;
        if (other.getLogBucket() != null
                && other.getLogBucket().equals(this.getLogBucket()) == false)
            return false;
        return true;
    }
}
