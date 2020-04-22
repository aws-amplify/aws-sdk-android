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
 * InstanceLimits represents the list of instance related attributes that are
 * available for given InstanceType.
 * </p>
 */
public class InstanceLimits implements Serializable {
    /**
     * <p>
     * InstanceCountLimits represents the limits on number of instances that be
     * created in Amazon Elasticsearch for given InstanceType.
     * </p>
     */
    private InstanceCountLimits instanceCountLimits;

    /**
     * <p>
     * InstanceCountLimits represents the limits on number of instances that be
     * created in Amazon Elasticsearch for given InstanceType.
     * </p>
     *
     * @return <p>
     *         InstanceCountLimits represents the limits on number of instances
     *         that be created in Amazon Elasticsearch for given InstanceType.
     *         </p>
     */
    public InstanceCountLimits getInstanceCountLimits() {
        return instanceCountLimits;
    }

    /**
     * <p>
     * InstanceCountLimits represents the limits on number of instances that be
     * created in Amazon Elasticsearch for given InstanceType.
     * </p>
     *
     * @param instanceCountLimits <p>
     *            InstanceCountLimits represents the limits on number of
     *            instances that be created in Amazon Elasticsearch for given
     *            InstanceType.
     *            </p>
     */
    public void setInstanceCountLimits(InstanceCountLimits instanceCountLimits) {
        this.instanceCountLimits = instanceCountLimits;
    }

    /**
     * <p>
     * InstanceCountLimits represents the limits on number of instances that be
     * created in Amazon Elasticsearch for given InstanceType.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceCountLimits <p>
     *            InstanceCountLimits represents the limits on number of
     *            instances that be created in Amazon Elasticsearch for given
     *            InstanceType.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceLimits withInstanceCountLimits(InstanceCountLimits instanceCountLimits) {
        this.instanceCountLimits = instanceCountLimits;
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
        if (getInstanceCountLimits() != null)
            sb.append("InstanceCountLimits: " + getInstanceCountLimits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceCountLimits() == null) ? 0 : getInstanceCountLimits().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceLimits == false)
            return false;
        InstanceLimits other = (InstanceLimits) obj;

        if (other.getInstanceCountLimits() == null ^ this.getInstanceCountLimits() == null)
            return false;
        if (other.getInstanceCountLimits() != null
                && other.getInstanceCountLimits().equals(this.getInstanceCountLimits()) == false)
            return false;
        return true;
    }
}
