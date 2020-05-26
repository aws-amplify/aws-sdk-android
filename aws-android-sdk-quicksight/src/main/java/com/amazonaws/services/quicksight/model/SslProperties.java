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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * Secure Socket Layer (SSL) properties that apply when QuickSight connects to
 * your underlying data source.
 * </p>
 */
public class SslProperties implements Serializable {
    /**
     * <p>
     * A Boolean option to control whether SSL should be disabled.
     * </p>
     */
    private Boolean disableSsl;

    /**
     * <p>
     * A Boolean option to control whether SSL should be disabled.
     * </p>
     *
     * @return <p>
     *         A Boolean option to control whether SSL should be disabled.
     *         </p>
     */
    public Boolean isDisableSsl() {
        return disableSsl;
    }

    /**
     * <p>
     * A Boolean option to control whether SSL should be disabled.
     * </p>
     *
     * @return <p>
     *         A Boolean option to control whether SSL should be disabled.
     *         </p>
     */
    public Boolean getDisableSsl() {
        return disableSsl;
    }

    /**
     * <p>
     * A Boolean option to control whether SSL should be disabled.
     * </p>
     *
     * @param disableSsl <p>
     *            A Boolean option to control whether SSL should be disabled.
     *            </p>
     */
    public void setDisableSsl(Boolean disableSsl) {
        this.disableSsl = disableSsl;
    }

    /**
     * <p>
     * A Boolean option to control whether SSL should be disabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disableSsl <p>
     *            A Boolean option to control whether SSL should be disabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SslProperties withDisableSsl(Boolean disableSsl) {
        this.disableSsl = disableSsl;
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
        if (getDisableSsl() != null)
            sb.append("DisableSsl: " + getDisableSsl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisableSsl() == null) ? 0 : getDisableSsl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SslProperties == false)
            return false;
        SslProperties other = (SslProperties) obj;

        if (other.getDisableSsl() == null ^ this.getDisableSsl() == null)
            return false;
        if (other.getDisableSsl() != null
                && other.getDisableSsl().equals(this.getDisableSsl()) == false)
            return false;
        return true;
    }
}
