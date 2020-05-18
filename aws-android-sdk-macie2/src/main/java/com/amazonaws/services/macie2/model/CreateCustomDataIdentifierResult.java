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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

public class CreateCustomDataIdentifierResult implements Serializable {
    /**
     * <p>
     * The unique identifier for the custom data identifier that was created.
     * </p>
     */
    private String customDataIdentifierId;

    /**
     * <p>
     * The unique identifier for the custom data identifier that was created.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the custom data identifier that was
     *         created.
     *         </p>
     */
    public String getCustomDataIdentifierId() {
        return customDataIdentifierId;
    }

    /**
     * <p>
     * The unique identifier for the custom data identifier that was created.
     * </p>
     *
     * @param customDataIdentifierId <p>
     *            The unique identifier for the custom data identifier that was
     *            created.
     *            </p>
     */
    public void setCustomDataIdentifierId(String customDataIdentifierId) {
        this.customDataIdentifierId = customDataIdentifierId;
    }

    /**
     * <p>
     * The unique identifier for the custom data identifier that was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customDataIdentifierId <p>
     *            The unique identifier for the custom data identifier that was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomDataIdentifierResult withCustomDataIdentifierId(String customDataIdentifierId) {
        this.customDataIdentifierId = customDataIdentifierId;
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
        if (getCustomDataIdentifierId() != null)
            sb.append("customDataIdentifierId: " + getCustomDataIdentifierId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCustomDataIdentifierId() == null) ? 0 : getCustomDataIdentifierId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCustomDataIdentifierResult == false)
            return false;
        CreateCustomDataIdentifierResult other = (CreateCustomDataIdentifierResult) obj;

        if (other.getCustomDataIdentifierId() == null ^ this.getCustomDataIdentifierId() == null)
            return false;
        if (other.getCustomDataIdentifierId() != null
                && other.getCustomDataIdentifierId().equals(this.getCustomDataIdentifierId()) == false)
            return false;
        return true;
    }
}
