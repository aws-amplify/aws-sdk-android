/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

/**
 * <p>
 * Options for filtering API keys.
 * </p>
 */
public class ApiKeyFilter implements Serializable {
    /**
     * <p>
     * Filter on <code>Active</code> or <code>Expired</code> API keys.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Expired
     */
    private String keyStatus;

    /**
     * <p>
     * Filter on <code>Active</code> or <code>Expired</code> API keys.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Expired
     *
     * @return <p>
     *         Filter on <code>Active</code> or <code>Expired</code> API keys.
     *         </p>
     * @see Status
     */
    public String getKeyStatus() {
        return keyStatus;
    }

    /**
     * <p>
     * Filter on <code>Active</code> or <code>Expired</code> API keys.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Expired
     *
     * @param keyStatus <p>
     *            Filter on <code>Active</code> or <code>Expired</code> API
     *            keys.
     *            </p>
     * @see Status
     */
    public void setKeyStatus(String keyStatus) {
        this.keyStatus = keyStatus;
    }

    /**
     * <p>
     * Filter on <code>Active</code> or <code>Expired</code> API keys.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Expired
     *
     * @param keyStatus <p>
     *            Filter on <code>Active</code> or <code>Expired</code> API
     *            keys.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Status
     */
    public ApiKeyFilter withKeyStatus(String keyStatus) {
        this.keyStatus = keyStatus;
        return this;
    }

    /**
     * <p>
     * Filter on <code>Active</code> or <code>Expired</code> API keys.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Expired
     *
     * @param keyStatus <p>
     *            Filter on <code>Active</code> or <code>Expired</code> API
     *            keys.
     *            </p>
     * @see Status
     */
    public void setKeyStatus(Status keyStatus) {
        this.keyStatus = keyStatus.toString();
    }

    /**
     * <p>
     * Filter on <code>Active</code> or <code>Expired</code> API keys.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Expired
     *
     * @param keyStatus <p>
     *            Filter on <code>Active</code> or <code>Expired</code> API
     *            keys.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Status
     */
    public ApiKeyFilter withKeyStatus(Status keyStatus) {
        this.keyStatus = keyStatus.toString();
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
        if (getKeyStatus() != null)
            sb.append("KeyStatus: " + getKeyStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyStatus() == null) ? 0 : getKeyStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApiKeyFilter == false)
            return false;
        ApiKeyFilter other = (ApiKeyFilter) obj;

        if (other.getKeyStatus() == null ^ this.getKeyStatus() == null)
            return false;
        if (other.getKeyStatus() != null
                && other.getKeyStatus().equals(this.getKeyStatus()) == false)
            return false;
        return true;
    }
}
