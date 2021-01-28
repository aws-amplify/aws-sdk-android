/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Configuration information for pre-signed URLs. Valid when
 * <code>protocols</code> contains HTTP.
 * </p>
 */
public class AwsJobPresignedUrlConfig implements Serializable {
    /**
     * <p>
     * How long (in seconds) pre-signed URLs are valid. Valid values are 60 -
     * 3600, the default value is 1800 seconds. Pre-signed URLs are generated
     * when a request for the job document is received.
     * </p>
     */
    private Long expiresInSec;

    /**
     * <p>
     * How long (in seconds) pre-signed URLs are valid. Valid values are 60 -
     * 3600, the default value is 1800 seconds. Pre-signed URLs are generated
     * when a request for the job document is received.
     * </p>
     *
     * @return <p>
     *         How long (in seconds) pre-signed URLs are valid. Valid values are
     *         60 - 3600, the default value is 1800 seconds. Pre-signed URLs are
     *         generated when a request for the job document is received.
     *         </p>
     */
    public Long getExpiresInSec() {
        return expiresInSec;
    }

    /**
     * <p>
     * How long (in seconds) pre-signed URLs are valid. Valid values are 60 -
     * 3600, the default value is 1800 seconds. Pre-signed URLs are generated
     * when a request for the job document is received.
     * </p>
     *
     * @param expiresInSec <p>
     *            How long (in seconds) pre-signed URLs are valid. Valid values
     *            are 60 - 3600, the default value is 1800 seconds. Pre-signed
     *            URLs are generated when a request for the job document is
     *            received.
     *            </p>
     */
    public void setExpiresInSec(Long expiresInSec) {
        this.expiresInSec = expiresInSec;
    }

    /**
     * <p>
     * How long (in seconds) pre-signed URLs are valid. Valid values are 60 -
     * 3600, the default value is 1800 seconds. Pre-signed URLs are generated
     * when a request for the job document is received.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expiresInSec <p>
     *            How long (in seconds) pre-signed URLs are valid. Valid values
     *            are 60 - 3600, the default value is 1800 seconds. Pre-signed
     *            URLs are generated when a request for the job document is
     *            received.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsJobPresignedUrlConfig withExpiresInSec(Long expiresInSec) {
        this.expiresInSec = expiresInSec;
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
        if (getExpiresInSec() != null)
            sb.append("expiresInSec: " + getExpiresInSec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getExpiresInSec() == null) ? 0 : getExpiresInSec().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsJobPresignedUrlConfig == false)
            return false;
        AwsJobPresignedUrlConfig other = (AwsJobPresignedUrlConfig) obj;

        if (other.getExpiresInSec() == null ^ this.getExpiresInSec() == null)
            return false;
        if (other.getExpiresInSec() != null
                && other.getExpiresInSec().equals(this.getExpiresInSec()) == false)
            return false;
        return true;
    }
}
