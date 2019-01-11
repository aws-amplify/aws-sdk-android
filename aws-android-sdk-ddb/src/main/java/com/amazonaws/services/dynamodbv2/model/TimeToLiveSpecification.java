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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the settings used to enable or disable Time to Live for the
 * specified table.
 * </p>
 */
public class TimeToLiveSpecification implements Serializable {
    /**
     * <p>
     * Indicates whether Time To Live is to be enabled (true) or disabled
     * (false) on the table.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The name of the Time to Live attribute used to store the expiration time
     * for items in the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String attributeName;

    /**
     * <p>
     * Indicates whether Time To Live is to be enabled (true) or disabled
     * (false) on the table.
     * </p>
     *
     * @return <p>
     *         Indicates whether Time To Live is to be enabled (true) or
     *         disabled (false) on the table.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Indicates whether Time To Live is to be enabled (true) or disabled
     * (false) on the table.
     * </p>
     *
     * @return <p>
     *         Indicates whether Time To Live is to be enabled (true) or
     *         disabled (false) on the table.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Indicates whether Time To Live is to be enabled (true) or disabled
     * (false) on the table.
     * </p>
     *
     * @param enabled <p>
     *            Indicates whether Time To Live is to be enabled (true) or
     *            disabled (false) on the table.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether Time To Live is to be enabled (true) or disabled
     * (false) on the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Indicates whether Time To Live is to be enabled (true) or
     *            disabled (false) on the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimeToLiveSpecification withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * The name of the Time to Live attribute used to store the expiration time
     * for items in the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name of the Time to Live attribute used to store the
     *         expiration time for items in the table.
     *         </p>
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * <p>
     * The name of the Time to Live attribute used to store the expiration time
     * for items in the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param attributeName <p>
     *            The name of the Time to Live attribute used to store the
     *            expiration time for items in the table.
     *            </p>
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of the Time to Live attribute used to store the expiration time
     * for items in the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param attributeName <p>
     *            The name of the Time to Live attribute used to store the
     *            expiration time for items in the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimeToLiveSpecification withAttributeName(String attributeName) {
        this.attributeName = attributeName;
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
            sb.append("Enabled: " + getEnabled() + ",");
        if (getAttributeName() != null)
            sb.append("AttributeName: " + getAttributeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeToLiveSpecification == false)
            return false;
        TimeToLiveSpecification other = (TimeToLiveSpecification) obj;

        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null
                && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        return true;
    }
}
