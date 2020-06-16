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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Create a new invalidation.
 * </p>
 */
public class CreateInvalidation2019_03_26Request extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The distribution's id.
     * </p>
     */
    private String distributionId;

    /**
     * <p>
     * The batch information for the invalidation.
     * </p>
     */
    private InvalidationBatch invalidationBatch;

    /**
     * <p>
     * The distribution's id.
     * </p>
     *
     * @return <p>
     *         The distribution's id.
     *         </p>
     */
    public String getDistributionId() {
        return distributionId;
    }

    /**
     * <p>
     * The distribution's id.
     * </p>
     *
     * @param distributionId <p>
     *            The distribution's id.
     *            </p>
     */
    public void setDistributionId(String distributionId) {
        this.distributionId = distributionId;
    }

    /**
     * <p>
     * The distribution's id.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param distributionId <p>
     *            The distribution's id.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInvalidation2019_03_26Request withDistributionId(String distributionId) {
        this.distributionId = distributionId;
        return this;
    }

    /**
     * <p>
     * The batch information for the invalidation.
     * </p>
     *
     * @return <p>
     *         The batch information for the invalidation.
     *         </p>
     */
    public InvalidationBatch getInvalidationBatch() {
        return invalidationBatch;
    }

    /**
     * <p>
     * The batch information for the invalidation.
     * </p>
     *
     * @param invalidationBatch <p>
     *            The batch information for the invalidation.
     *            </p>
     */
    public void setInvalidationBatch(InvalidationBatch invalidationBatch) {
        this.invalidationBatch = invalidationBatch;
    }

    /**
     * <p>
     * The batch information for the invalidation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invalidationBatch <p>
     *            The batch information for the invalidation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInvalidation2019_03_26Request withInvalidationBatch(
            InvalidationBatch invalidationBatch) {
        this.invalidationBatch = invalidationBatch;
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
        if (getDistributionId() != null)
            sb.append("DistributionId: " + getDistributionId() + ",");
        if (getInvalidationBatch() != null)
            sb.append("InvalidationBatch: " + getInvalidationBatch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDistributionId() == null) ? 0 : getDistributionId().hashCode());
        hashCode = prime * hashCode
                + ((getInvalidationBatch() == null) ? 0 : getInvalidationBatch().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInvalidation2019_03_26Request == false)
            return false;
        CreateInvalidation2019_03_26Request other = (CreateInvalidation2019_03_26Request) obj;

        if (other.getDistributionId() == null ^ this.getDistributionId() == null)
            return false;
        if (other.getDistributionId() != null
                && other.getDistributionId().equals(this.getDistributionId()) == false)
            return false;
        if (other.getInvalidationBatch() == null ^ this.getInvalidationBatch() == null)
            return false;
        if (other.getInvalidationBatch() != null
                && other.getInvalidationBatch().equals(this.getInvalidationBatch()) == false)
            return false;
        return true;
    }
}
