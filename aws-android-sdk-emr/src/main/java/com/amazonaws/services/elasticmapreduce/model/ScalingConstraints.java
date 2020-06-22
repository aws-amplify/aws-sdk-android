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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * The upper and lower EC2 instance limits for an automatic scaling policy.
 * Automatic scaling activities triggered by automatic scaling rules will not
 * cause an instance group to grow above or below these limits.
 * </p>
 */
public class ScalingConstraints implements Serializable {
    /**
     * <p>
     * The lower boundary of EC2 instances in an instance group below which
     * scaling activities are not allowed to shrink. Scale-in activities will
     * not terminate instances below this boundary.
     * </p>
     */
    private Integer minCapacity;

    /**
     * <p>
     * The upper boundary of EC2 instances in an instance group beyond which
     * scaling activities are not allowed to grow. Scale-out activities will not
     * add instances beyond this boundary.
     * </p>
     */
    private Integer maxCapacity;

    /**
     * <p>
     * The lower boundary of EC2 instances in an instance group below which
     * scaling activities are not allowed to shrink. Scale-in activities will
     * not terminate instances below this boundary.
     * </p>
     *
     * @return <p>
     *         The lower boundary of EC2 instances in an instance group below
     *         which scaling activities are not allowed to shrink. Scale-in
     *         activities will not terminate instances below this boundary.
     *         </p>
     */
    public Integer getMinCapacity() {
        return minCapacity;
    }

    /**
     * <p>
     * The lower boundary of EC2 instances in an instance group below which
     * scaling activities are not allowed to shrink. Scale-in activities will
     * not terminate instances below this boundary.
     * </p>
     *
     * @param minCapacity <p>
     *            The lower boundary of EC2 instances in an instance group below
     *            which scaling activities are not allowed to shrink. Scale-in
     *            activities will not terminate instances below this boundary.
     *            </p>
     */
    public void setMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
    }

    /**
     * <p>
     * The lower boundary of EC2 instances in an instance group below which
     * scaling activities are not allowed to shrink. Scale-in activities will
     * not terminate instances below this boundary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minCapacity <p>
     *            The lower boundary of EC2 instances in an instance group below
     *            which scaling activities are not allowed to shrink. Scale-in
     *            activities will not terminate instances below this boundary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingConstraints withMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
        return this;
    }

    /**
     * <p>
     * The upper boundary of EC2 instances in an instance group beyond which
     * scaling activities are not allowed to grow. Scale-out activities will not
     * add instances beyond this boundary.
     * </p>
     *
     * @return <p>
     *         The upper boundary of EC2 instances in an instance group beyond
     *         which scaling activities are not allowed to grow. Scale-out
     *         activities will not add instances beyond this boundary.
     *         </p>
     */
    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * <p>
     * The upper boundary of EC2 instances in an instance group beyond which
     * scaling activities are not allowed to grow. Scale-out activities will not
     * add instances beyond this boundary.
     * </p>
     *
     * @param maxCapacity <p>
     *            The upper boundary of EC2 instances in an instance group
     *            beyond which scaling activities are not allowed to grow.
     *            Scale-out activities will not add instances beyond this
     *            boundary.
     *            </p>
     */
    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * <p>
     * The upper boundary of EC2 instances in an instance group beyond which
     * scaling activities are not allowed to grow. Scale-out activities will not
     * add instances beyond this boundary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxCapacity <p>
     *            The upper boundary of EC2 instances in an instance group
     *            beyond which scaling activities are not allowed to grow.
     *            Scale-out activities will not add instances beyond this
     *            boundary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingConstraints withMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
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
        if (getMinCapacity() != null)
            sb.append("MinCapacity: " + getMinCapacity() + ",");
        if (getMaxCapacity() != null)
            sb.append("MaxCapacity: " + getMaxCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMinCapacity() == null) ? 0 : getMinCapacity().hashCode());
        hashCode = prime * hashCode
                + ((getMaxCapacity() == null) ? 0 : getMaxCapacity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalingConstraints == false)
            return false;
        ScalingConstraints other = (ScalingConstraints) obj;

        if (other.getMinCapacity() == null ^ this.getMinCapacity() == null)
            return false;
        if (other.getMinCapacity() != null
                && other.getMinCapacity().equals(this.getMinCapacity()) == false)
            return false;
        if (other.getMaxCapacity() == null ^ this.getMaxCapacity() == null)
            return false;
        if (other.getMaxCapacity() != null
                && other.getMaxCapacity().equals(this.getMaxCapacity()) == false)
            return false;
        return true;
    }
}
