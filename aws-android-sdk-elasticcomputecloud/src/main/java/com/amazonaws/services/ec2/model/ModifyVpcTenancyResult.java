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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class ModifyVpcTenancyResult implements Serializable {
    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, returns an
     * error.
     * </p>
     */
    private Boolean returnValue;

    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, returns an
     * error.
     * </p>
     *
     * @return <p>
     *         Returns <code>true</code> if the request succeeds; otherwise,
     *         returns an error.
     *         </p>
     */
    public Boolean isReturnValue() {
        return returnValue;
    }

    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, returns an
     * error.
     * </p>
     *
     * @return <p>
     *         Returns <code>true</code> if the request succeeds; otherwise,
     *         returns an error.
     *         </p>
     */
    public Boolean getReturnValue() {
        return returnValue;
    }

    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, returns an
     * error.
     * </p>
     *
     * @param returnValue <p>
     *            Returns <code>true</code> if the request succeeds; otherwise,
     *            returns an error.
     *            </p>
     */
    public void setReturnValue(Boolean returnValue) {
        this.returnValue = returnValue;
    }

    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, returns an
     * error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param returnValue <p>
     *            Returns <code>true</code> if the request succeeds; otherwise,
     *            returns an error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcTenancyResult withReturnValue(Boolean returnValue) {
        this.returnValue = returnValue;
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
        if (getReturnValue() != null)
            sb.append("ReturnValue: " + getReturnValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReturnValue() == null) ? 0 : getReturnValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVpcTenancyResult == false)
            return false;
        ModifyVpcTenancyResult other = (ModifyVpcTenancyResult) obj;

        if (other.getReturnValue() == null ^ this.getReturnValue() == null)
            return false;
        if (other.getReturnValue() != null
                && other.getReturnValue().equals(this.getReturnValue()) == false)
            return false;
        return true;
    }
}
