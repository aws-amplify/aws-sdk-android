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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * The user pool add-ons type.
 * </p>
 */
public class UserPoolAddOnsType implements Serializable {
    /**
     * <p>
     * The advanced security mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, AUDIT, ENFORCED
     */
    private String advancedSecurityMode;

    /**
     * <p>
     * The advanced security mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, AUDIT, ENFORCED
     *
     * @return <p>
     *         The advanced security mode.
     *         </p>
     * @see AdvancedSecurityModeType
     */
    public String getAdvancedSecurityMode() {
        return advancedSecurityMode;
    }

    /**
     * <p>
     * The advanced security mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, AUDIT, ENFORCED
     *
     * @param advancedSecurityMode <p>
     *            The advanced security mode.
     *            </p>
     * @see AdvancedSecurityModeType
     */
    public void setAdvancedSecurityMode(String advancedSecurityMode) {
        this.advancedSecurityMode = advancedSecurityMode;
    }

    /**
     * <p>
     * The advanced security mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, AUDIT, ENFORCED
     *
     * @param advancedSecurityMode <p>
     *            The advanced security mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AdvancedSecurityModeType
     */
    public UserPoolAddOnsType withAdvancedSecurityMode(String advancedSecurityMode) {
        this.advancedSecurityMode = advancedSecurityMode;
        return this;
    }

    /**
     * <p>
     * The advanced security mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, AUDIT, ENFORCED
     *
     * @param advancedSecurityMode <p>
     *            The advanced security mode.
     *            </p>
     * @see AdvancedSecurityModeType
     */
    public void setAdvancedSecurityMode(AdvancedSecurityModeType advancedSecurityMode) {
        this.advancedSecurityMode = advancedSecurityMode.toString();
    }

    /**
     * <p>
     * The advanced security mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, AUDIT, ENFORCED
     *
     * @param advancedSecurityMode <p>
     *            The advanced security mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AdvancedSecurityModeType
     */
    public UserPoolAddOnsType withAdvancedSecurityMode(AdvancedSecurityModeType advancedSecurityMode) {
        this.advancedSecurityMode = advancedSecurityMode.toString();
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
        if (getAdvancedSecurityMode() != null)
            sb.append("AdvancedSecurityMode: " + getAdvancedSecurityMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAdvancedSecurityMode() == null) ? 0 : getAdvancedSecurityMode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserPoolAddOnsType == false)
            return false;
        UserPoolAddOnsType other = (UserPoolAddOnsType) obj;

        if (other.getAdvancedSecurityMode() == null ^ this.getAdvancedSecurityMode() == null)
            return false;
        if (other.getAdvancedSecurityMode() != null
                && other.getAdvancedSecurityMode().equals(this.getAdvancedSecurityMode()) == false)
            return false;
        return true;
    }
}
