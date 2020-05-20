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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a <code>GetDeploymentInstance</code> operation.
 * </p>
 */
public class GetDeploymentInstanceResult implements Serializable {
    /**
     * <p>
     * Information about the instance.
     * </p>
     */
    private InstanceSummary instanceSummary;

    /**
     * <p>
     * Information about the instance.
     * </p>
     *
     * @return <p>
     *         Information about the instance.
     *         </p>
     */
    public InstanceSummary getInstanceSummary() {
        return instanceSummary;
    }

    /**
     * <p>
     * Information about the instance.
     * </p>
     *
     * @param instanceSummary <p>
     *            Information about the instance.
     *            </p>
     */
    public void setInstanceSummary(InstanceSummary instanceSummary) {
        this.instanceSummary = instanceSummary;
    }

    /**
     * <p>
     * Information about the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceSummary <p>
     *            Information about the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDeploymentInstanceResult withInstanceSummary(InstanceSummary instanceSummary) {
        this.instanceSummary = instanceSummary;
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
        if (getInstanceSummary() != null)
            sb.append("instanceSummary: " + getInstanceSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceSummary() == null) ? 0 : getInstanceSummary().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeploymentInstanceResult == false)
            return false;
        GetDeploymentInstanceResult other = (GetDeploymentInstanceResult) obj;

        if (other.getInstanceSummary() == null ^ this.getInstanceSummary() == null)
            return false;
        if (other.getInstanceSummary() != null
                && other.getInstanceSummary().equals(this.getInstanceSummary()) == false)
            return false;
        return true;
    }
}
