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

package com.amazonaws.services.amazonelasticsearchservice.model;

import java.io.Serializable;

/**
 * <p>
 * InstanceCountLimits represents the limits on number of instances that be
 * created in Amazon Elasticsearch for given InstanceType.
 * </p>
 */
public class InstanceCountLimits implements Serializable {
    /**
     * <p>
     * Minimum number of Instances that can be instantiated for given
     * InstanceType.
     * </p>
     */
    private Integer minimumInstanceCount;

    /**
     * <p>
     * Maximum number of Instances that can be instantiated for given
     * InstanceType.
     * </p>
     */
    private Integer maximumInstanceCount;

    /**
     * <p>
     * Minimum number of Instances that can be instantiated for given
     * InstanceType.
     * </p>
     *
     * @return <p>
     *         Minimum number of Instances that can be instantiated for given
     *         InstanceType.
     *         </p>
     */
    public Integer getMinimumInstanceCount() {
        return minimumInstanceCount;
    }

    /**
     * <p>
     * Minimum number of Instances that can be instantiated for given
     * InstanceType.
     * </p>
     *
     * @param minimumInstanceCount <p>
     *            Minimum number of Instances that can be instantiated for given
     *            InstanceType.
     *            </p>
     */
    public void setMinimumInstanceCount(Integer minimumInstanceCount) {
        this.minimumInstanceCount = minimumInstanceCount;
    }

    /**
     * <p>
     * Minimum number of Instances that can be instantiated for given
     * InstanceType.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minimumInstanceCount <p>
     *            Minimum number of Instances that can be instantiated for given
     *            InstanceType.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceCountLimits withMinimumInstanceCount(Integer minimumInstanceCount) {
        this.minimumInstanceCount = minimumInstanceCount;
        return this;
    }

    /**
     * <p>
     * Maximum number of Instances that can be instantiated for given
     * InstanceType.
     * </p>
     *
     * @return <p>
     *         Maximum number of Instances that can be instantiated for given
     *         InstanceType.
     *         </p>
     */
    public Integer getMaximumInstanceCount() {
        return maximumInstanceCount;
    }

    /**
     * <p>
     * Maximum number of Instances that can be instantiated for given
     * InstanceType.
     * </p>
     *
     * @param maximumInstanceCount <p>
     *            Maximum number of Instances that can be instantiated for given
     *            InstanceType.
     *            </p>
     */
    public void setMaximumInstanceCount(Integer maximumInstanceCount) {
        this.maximumInstanceCount = maximumInstanceCount;
    }

    /**
     * <p>
     * Maximum number of Instances that can be instantiated for given
     * InstanceType.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maximumInstanceCount <p>
     *            Maximum number of Instances that can be instantiated for given
     *            InstanceType.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceCountLimits withMaximumInstanceCount(Integer maximumInstanceCount) {
        this.maximumInstanceCount = maximumInstanceCount;
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
        if (getMinimumInstanceCount() != null)
            sb.append("MinimumInstanceCount: " + getMinimumInstanceCount() + ",");
        if (getMaximumInstanceCount() != null)
            sb.append("MaximumInstanceCount: " + getMaximumInstanceCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMinimumInstanceCount() == null) ? 0 : getMinimumInstanceCount().hashCode());
        hashCode = prime * hashCode
                + ((getMaximumInstanceCount() == null) ? 0 : getMaximumInstanceCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceCountLimits == false)
            return false;
        InstanceCountLimits other = (InstanceCountLimits) obj;

        if (other.getMinimumInstanceCount() == null ^ this.getMinimumInstanceCount() == null)
            return false;
        if (other.getMinimumInstanceCount() != null
                && other.getMinimumInstanceCount().equals(this.getMinimumInstanceCount()) == false)
            return false;
        if (other.getMaximumInstanceCount() == null ^ this.getMaximumInstanceCount() == null)
            return false;
        if (other.getMaximumInstanceCount() != null
                && other.getMaximumInstanceCount().equals(this.getMaximumInstanceCount()) == false)
            return false;
        return true;
    }
}
