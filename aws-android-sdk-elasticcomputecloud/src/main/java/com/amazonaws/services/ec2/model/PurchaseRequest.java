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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a request to purchase Scheduled Instances.
 * </p>
 */
public class PurchaseRequest implements Serializable {
    /**
     * <p>
     * The number of instances.
     * </p>
     */
    private Integer instanceCount;

    /**
     * <p>
     * The purchase token.
     * </p>
     */
    private String purchaseToken;

    /**
     * <p>
     * The number of instances.
     * </p>
     *
     * @return <p>
     *         The number of instances.
     *         </p>
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }

    /**
     * <p>
     * The number of instances.
     * </p>
     *
     * @param instanceCount <p>
     *            The number of instances.
     *            </p>
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceCount <p>
     *            The number of instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseRequest withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * <p>
     * The purchase token.
     * </p>
     *
     * @return <p>
     *         The purchase token.
     *         </p>
     */
    public String getPurchaseToken() {
        return purchaseToken;
    }

    /**
     * <p>
     * The purchase token.
     * </p>
     *
     * @param purchaseToken <p>
     *            The purchase token.
     *            </p>
     */
    public void setPurchaseToken(String purchaseToken) {
        this.purchaseToken = purchaseToken;
    }

    /**
     * <p>
     * The purchase token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param purchaseToken <p>
     *            The purchase token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseRequest withPurchaseToken(String purchaseToken) {
        this.purchaseToken = purchaseToken;
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
        if (getInstanceCount() != null)
            sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getPurchaseToken() != null)
            sb.append("PurchaseToken: " + getPurchaseToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode
                + ((getPurchaseToken() == null) ? 0 : getPurchaseToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseRequest == false)
            return false;
        PurchaseRequest other = (PurchaseRequest) obj;

        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null
                && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getPurchaseToken() == null ^ this.getPurchaseToken() == null)
            return false;
        if (other.getPurchaseToken() != null
                && other.getPurchaseToken().equals(this.getPurchaseToken()) == false)
            return false;
        return true;
    }
}
