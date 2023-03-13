/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.sns.model;

import java.io.Serializable;

public class GetDataProtectionPolicyResult implements Serializable {
    /**
     * <p>
     * Retrieves the <code>DataProtectionPolicy</code> in JSON string format.
     * </p>
     */
    private String dataProtectionPolicy;

    /**
     * <p>
     * Retrieves the <code>DataProtectionPolicy</code> in JSON string format.
     * </p>
     *
     * @return <p>
     *         Retrieves the <code>DataProtectionPolicy</code> in JSON string
     *         format.
     *         </p>
     */
    public String getDataProtectionPolicy() {
        return dataProtectionPolicy;
    }

    /**
     * <p>
     * Retrieves the <code>DataProtectionPolicy</code> in JSON string format.
     * </p>
     *
     * @param dataProtectionPolicy <p>
     *            Retrieves the <code>DataProtectionPolicy</code> in JSON string
     *            format.
     *            </p>
     */
    public void setDataProtectionPolicy(String dataProtectionPolicy) {
        this.dataProtectionPolicy = dataProtectionPolicy;
    }

    /**
     * <p>
     * Retrieves the <code>DataProtectionPolicy</code> in JSON string format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataProtectionPolicy <p>
     *            Retrieves the <code>DataProtectionPolicy</code> in JSON string
     *            format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDataProtectionPolicyResult withDataProtectionPolicy(String dataProtectionPolicy) {
        this.dataProtectionPolicy = dataProtectionPolicy;
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
        if (getDataProtectionPolicy() != null)
            sb.append("DataProtectionPolicy: " + getDataProtectionPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDataProtectionPolicy() == null) ? 0 : getDataProtectionPolicy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataProtectionPolicyResult == false)
            return false;
        GetDataProtectionPolicyResult other = (GetDataProtectionPolicyResult) obj;

        if (other.getDataProtectionPolicy() == null ^ this.getDataProtectionPolicy() == null)
            return false;
        if (other.getDataProtectionPolicy() != null
                && other.getDataProtectionPolicy().equals(this.getDataProtectionPolicy()) == false)
            return false;
        return true;
    }
}
