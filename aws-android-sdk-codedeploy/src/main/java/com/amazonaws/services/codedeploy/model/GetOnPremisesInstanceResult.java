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
 * Represents the output of a <code>GetOnPremisesInstance</code> operation.
 * </p>
 */
public class GetOnPremisesInstanceResult implements Serializable {
    /**
     * <p>
     * Information about the on-premises instance.
     * </p>
     */
    private InstanceInfo instanceInfo;

    /**
     * <p>
     * Information about the on-premises instance.
     * </p>
     *
     * @return <p>
     *         Information about the on-premises instance.
     *         </p>
     */
    public InstanceInfo getInstanceInfo() {
        return instanceInfo;
    }

    /**
     * <p>
     * Information about the on-premises instance.
     * </p>
     *
     * @param instanceInfo <p>
     *            Information about the on-premises instance.
     *            </p>
     */
    public void setInstanceInfo(InstanceInfo instanceInfo) {
        this.instanceInfo = instanceInfo;
    }

    /**
     * <p>
     * Information about the on-premises instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceInfo <p>
     *            Information about the on-premises instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOnPremisesInstanceResult withInstanceInfo(InstanceInfo instanceInfo) {
        this.instanceInfo = instanceInfo;
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
        if (getInstanceInfo() != null)
            sb.append("instanceInfo: " + getInstanceInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceInfo() == null) ? 0 : getInstanceInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOnPremisesInstanceResult == false)
            return false;
        GetOnPremisesInstanceResult other = (GetOnPremisesInstanceResult) obj;

        if (other.getInstanceInfo() == null ^ this.getInstanceInfo() == null)
            return false;
        if (other.getInstanceInfo() != null
                && other.getInstanceInfo().equals(this.getInstanceInfo()) == false)
            return false;
        return true;
    }
}
