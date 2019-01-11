/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

public class DescribeEntitiesDetectionJobResult implements Serializable {
    /**
     * <p>
     * An object that contains the properties associated with an entities
     * detection job.
     * </p>
     */
    private EntitiesDetectionJobProperties entitiesDetectionJobProperties;

    /**
     * <p>
     * An object that contains the properties associated with an entities
     * detection job.
     * </p>
     *
     * @return <p>
     *         An object that contains the properties associated with an
     *         entities detection job.
     *         </p>
     */
    public EntitiesDetectionJobProperties getEntitiesDetectionJobProperties() {
        return entitiesDetectionJobProperties;
    }

    /**
     * <p>
     * An object that contains the properties associated with an entities
     * detection job.
     * </p>
     *
     * @param entitiesDetectionJobProperties <p>
     *            An object that contains the properties associated with an
     *            entities detection job.
     *            </p>
     */
    public void setEntitiesDetectionJobProperties(
            EntitiesDetectionJobProperties entitiesDetectionJobProperties) {
        this.entitiesDetectionJobProperties = entitiesDetectionJobProperties;
    }

    /**
     * <p>
     * An object that contains the properties associated with an entities
     * detection job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entitiesDetectionJobProperties <p>
     *            An object that contains the properties associated with an
     *            entities detection job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEntitiesDetectionJobResult withEntitiesDetectionJobProperties(
            EntitiesDetectionJobProperties entitiesDetectionJobProperties) {
        this.entitiesDetectionJobProperties = entitiesDetectionJobProperties;
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
        if (getEntitiesDetectionJobProperties() != null)
            sb.append("EntitiesDetectionJobProperties: " + getEntitiesDetectionJobProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getEntitiesDetectionJobProperties() == null) ? 0
                        : getEntitiesDetectionJobProperties().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEntitiesDetectionJobResult == false)
            return false;
        DescribeEntitiesDetectionJobResult other = (DescribeEntitiesDetectionJobResult) obj;

        if (other.getEntitiesDetectionJobProperties() == null
                ^ this.getEntitiesDetectionJobProperties() == null)
            return false;
        if (other.getEntitiesDetectionJobProperties() != null
                && other.getEntitiesDetectionJobProperties().equals(
                        this.getEntitiesDetectionJobProperties()) == false)
            return false;
        return true;
    }
}
