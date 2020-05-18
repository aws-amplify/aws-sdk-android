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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

public class CreateCapacityProviderResult implements Serializable {
    /**
     * <p>
     * The full description of the new capacity provider.
     * </p>
     */
    private CapacityProvider capacityProvider;

    /**
     * <p>
     * The full description of the new capacity provider.
     * </p>
     *
     * @return <p>
     *         The full description of the new capacity provider.
     *         </p>
     */
    public CapacityProvider getCapacityProvider() {
        return capacityProvider;
    }

    /**
     * <p>
     * The full description of the new capacity provider.
     * </p>
     *
     * @param capacityProvider <p>
     *            The full description of the new capacity provider.
     *            </p>
     */
    public void setCapacityProvider(CapacityProvider capacityProvider) {
        this.capacityProvider = capacityProvider;
    }

    /**
     * <p>
     * The full description of the new capacity provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityProvider <p>
     *            The full description of the new capacity provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCapacityProviderResult withCapacityProvider(CapacityProvider capacityProvider) {
        this.capacityProvider = capacityProvider;
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
        if (getCapacityProvider() != null)
            sb.append("capacityProvider: " + getCapacityProvider());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCapacityProvider() == null) ? 0 : getCapacityProvider().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCapacityProviderResult == false)
            return false;
        CreateCapacityProviderResult other = (CreateCapacityProviderResult) obj;

        if (other.getCapacityProvider() == null ^ this.getCapacityProvider() == null)
            return false;
        if (other.getCapacityProvider() != null
                && other.getCapacityProvider().equals(this.getCapacityProvider()) == false)
            return false;
        return true;
    }
}
