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

package com.amazonaws.services.api.ecr.model;

import java.io.Serializable;

/**
 * <p>
 * The summary of the lifecycle policy preview request.
 * </p>
 */
public class LifecyclePolicyPreviewSummary implements Serializable {
    /**
     * <p>
     * The number of expiring images.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer expiringImageTotalCount;

    /**
     * <p>
     * The number of expiring images.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of expiring images.
     *         </p>
     */
    public Integer getExpiringImageTotalCount() {
        return expiringImageTotalCount;
    }

    /**
     * <p>
     * The number of expiring images.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param expiringImageTotalCount <p>
     *            The number of expiring images.
     *            </p>
     */
    public void setExpiringImageTotalCount(Integer expiringImageTotalCount) {
        this.expiringImageTotalCount = expiringImageTotalCount;
    }

    /**
     * <p>
     * The number of expiring images.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param expiringImageTotalCount <p>
     *            The number of expiring images.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecyclePolicyPreviewSummary withExpiringImageTotalCount(Integer expiringImageTotalCount) {
        this.expiringImageTotalCount = expiringImageTotalCount;
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
        if (getExpiringImageTotalCount() != null)
            sb.append("expiringImageTotalCount: " + getExpiringImageTotalCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getExpiringImageTotalCount() == null) ? 0 : getExpiringImageTotalCount()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecyclePolicyPreviewSummary == false)
            return false;
        LifecyclePolicyPreviewSummary other = (LifecyclePolicyPreviewSummary) obj;

        if (other.getExpiringImageTotalCount() == null ^ this.getExpiringImageTotalCount() == null)
            return false;
        if (other.getExpiringImageTotalCount() != null
                && other.getExpiringImageTotalCount().equals(this.getExpiringImageTotalCount()) == false)
            return false;
        return true;
    }
}
