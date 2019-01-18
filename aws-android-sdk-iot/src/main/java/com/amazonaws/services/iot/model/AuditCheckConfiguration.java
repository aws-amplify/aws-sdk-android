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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Which audit checks are enabled and disabled for this account.
 * </p>
 */
public class AuditCheckConfiguration implements Serializable {
    /**
     * <p>
     * True if this audit check is enabled for this account.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * True if this audit check is enabled for this account.
     * </p>
     *
     * @return <p>
     *         True if this audit check is enabled for this account.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * True if this audit check is enabled for this account.
     * </p>
     *
     * @return <p>
     *         True if this audit check is enabled for this account.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * True if this audit check is enabled for this account.
     * </p>
     *
     * @param enabled <p>
     *            True if this audit check is enabled for this account.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * True if this audit check is enabled for this account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            True if this audit check is enabled for this account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditCheckConfiguration withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
        if (getEnabled() != null)
            sb.append("enabled: " + getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuditCheckConfiguration == false)
            return false;
        AuditCheckConfiguration other = (AuditCheckConfiguration) obj;

        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }
}
