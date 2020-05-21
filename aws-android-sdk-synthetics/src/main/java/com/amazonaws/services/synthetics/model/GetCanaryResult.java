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

package com.amazonaws.services.synthetics.model;

import java.io.Serializable;

public class GetCanaryResult implements Serializable {
    /**
     * <p>
     * A strucure that contains the full information about the canary.
     * </p>
     */
    private Canary canary;

    /**
     * <p>
     * A strucure that contains the full information about the canary.
     * </p>
     *
     * @return <p>
     *         A strucure that contains the full information about the canary.
     *         </p>
     */
    public Canary getCanary() {
        return canary;
    }

    /**
     * <p>
     * A strucure that contains the full information about the canary.
     * </p>
     *
     * @param canary <p>
     *            A strucure that contains the full information about the
     *            canary.
     *            </p>
     */
    public void setCanary(Canary canary) {
        this.canary = canary;
    }

    /**
     * <p>
     * A strucure that contains the full information about the canary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param canary <p>
     *            A strucure that contains the full information about the
     *            canary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCanaryResult withCanary(Canary canary) {
        this.canary = canary;
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
        if (getCanary() != null)
            sb.append("Canary: " + getCanary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCanary() == null) ? 0 : getCanary().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCanaryResult == false)
            return false;
        GetCanaryResult other = (GetCanaryResult) obj;

        if (other.getCanary() == null ^ this.getCanary() == null)
            return false;
        if (other.getCanary() != null && other.getCanary().equals(this.getCanary()) == false)
            return false;
        return true;
    }
}
