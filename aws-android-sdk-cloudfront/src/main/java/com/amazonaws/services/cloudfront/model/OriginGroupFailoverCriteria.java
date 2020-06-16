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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * <p>
 * A complex data type that includes information about the failover criteria for
 * an origin group, including the status codes for which CloudFront will
 * failover from the primary origin to the second origin.
 * </p>
 */
public class OriginGroupFailoverCriteria implements Serializable {
    /**
     * <p>
     * The status codes that, when returned from the primary origin, will
     * trigger CloudFront to failover to the second origin.
     * </p>
     */
    private StatusCodes statusCodes;

    /**
     * <p>
     * The status codes that, when returned from the primary origin, will
     * trigger CloudFront to failover to the second origin.
     * </p>
     *
     * @return <p>
     *         The status codes that, when returned from the primary origin,
     *         will trigger CloudFront to failover to the second origin.
     *         </p>
     */
    public StatusCodes getStatusCodes() {
        return statusCodes;
    }

    /**
     * <p>
     * The status codes that, when returned from the primary origin, will
     * trigger CloudFront to failover to the second origin.
     * </p>
     *
     * @param statusCodes <p>
     *            The status codes that, when returned from the primary origin,
     *            will trigger CloudFront to failover to the second origin.
     *            </p>
     */
    public void setStatusCodes(StatusCodes statusCodes) {
        this.statusCodes = statusCodes;
    }

    /**
     * <p>
     * The status codes that, when returned from the primary origin, will
     * trigger CloudFront to failover to the second origin.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusCodes <p>
     *            The status codes that, when returned from the primary origin,
     *            will trigger CloudFront to failover to the second origin.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OriginGroupFailoverCriteria withStatusCodes(StatusCodes statusCodes) {
        this.statusCodes = statusCodes;
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
        if (getStatusCodes() != null)
            sb.append("StatusCodes: " + getStatusCodes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStatusCodes() == null) ? 0 : getStatusCodes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OriginGroupFailoverCriteria == false)
            return false;
        OriginGroupFailoverCriteria other = (OriginGroupFailoverCriteria) obj;

        if (other.getStatusCodes() == null ^ this.getStatusCodes() == null)
            return false;
        if (other.getStatusCodes() != null
                && other.getStatusCodes().equals(this.getStatusCodes()) == false)
            return false;
        return true;
    }
}
