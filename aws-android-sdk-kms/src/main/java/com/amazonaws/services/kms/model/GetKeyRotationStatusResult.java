/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

public class GetKeyRotationStatusResult implements Serializable {
    /**
     * <p>
     * A Boolean value that specifies whether key rotation is enabled.
     * </p>
     */
    private Boolean keyRotationEnabled;

    /**
     * <p>
     * A Boolean value that specifies whether key rotation is enabled.
     * </p>
     *
     * @return <p>
     *         A Boolean value that specifies whether key rotation is enabled.
     *         </p>
     */
    public Boolean isKeyRotationEnabled() {
        return keyRotationEnabled;
    }

    /**
     * <p>
     * A Boolean value that specifies whether key rotation is enabled.
     * </p>
     *
     * @return <p>
     *         A Boolean value that specifies whether key rotation is enabled.
     *         </p>
     */
    public Boolean getKeyRotationEnabled() {
        return keyRotationEnabled;
    }

    /**
     * <p>
     * A Boolean value that specifies whether key rotation is enabled.
     * </p>
     *
     * @param keyRotationEnabled <p>
     *            A Boolean value that specifies whether key rotation is
     *            enabled.
     *            </p>
     */
    public void setKeyRotationEnabled(Boolean keyRotationEnabled) {
        this.keyRotationEnabled = keyRotationEnabled;
    }

    /**
     * <p>
     * A Boolean value that specifies whether key rotation is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyRotationEnabled <p>
     *            A Boolean value that specifies whether key rotation is
     *            enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetKeyRotationStatusResult withKeyRotationEnabled(Boolean keyRotationEnabled) {
        this.keyRotationEnabled = keyRotationEnabled;
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
        if (getKeyRotationEnabled() != null)
            sb.append("KeyRotationEnabled: " + getKeyRotationEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getKeyRotationEnabled() == null) ? 0 : getKeyRotationEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetKeyRotationStatusResult == false)
            return false;
        GetKeyRotationStatusResult other = (GetKeyRotationStatusResult) obj;

        if (other.getKeyRotationEnabled() == null ^ this.getKeyRotationEnabled() == null)
            return false;
        if (other.getKeyRotationEnabled() != null
                && other.getKeyRotationEnabled().equals(this.getKeyRotationEnabled()) == false)
            return false;
        return true;
    }
}
