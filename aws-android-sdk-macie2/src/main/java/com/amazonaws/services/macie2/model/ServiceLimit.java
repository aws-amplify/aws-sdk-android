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

/**
 * <p>
 * Specifies a current quota for an account.
 * </p>
 */
public class ServiceLimit implements Serializable {
    /**
     * <p>
     * Specifies whether the account has met the quota that corresponds to the
     * metric specified by the UsageByAccount.type field in the response.
     * </p>
     */
    private Boolean isServiceLimited;

    /**
     * <p>
     * The unit of measurement for the value specified by the value field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERABYTES
     */
    private String unit;

    /**
     * <p>
     * The value for the metric specified by the UsageByAccount.type field in
     * the response.
     * </p>
     */
    private Long value;

    /**
     * <p>
     * Specifies whether the account has met the quota that corresponds to the
     * metric specified by the UsageByAccount.type field in the response.
     * </p>
     *
     * @return <p>
     *         Specifies whether the account has met the quota that corresponds
     *         to the metric specified by the UsageByAccount.type field in the
     *         response.
     *         </p>
     */
    public Boolean isIsServiceLimited() {
        return isServiceLimited;
    }

    /**
     * <p>
     * Specifies whether the account has met the quota that corresponds to the
     * metric specified by the UsageByAccount.type field in the response.
     * </p>
     *
     * @return <p>
     *         Specifies whether the account has met the quota that corresponds
     *         to the metric specified by the UsageByAccount.type field in the
     *         response.
     *         </p>
     */
    public Boolean getIsServiceLimited() {
        return isServiceLimited;
    }

    /**
     * <p>
     * Specifies whether the account has met the quota that corresponds to the
     * metric specified by the UsageByAccount.type field in the response.
     * </p>
     *
     * @param isServiceLimited <p>
     *            Specifies whether the account has met the quota that
     *            corresponds to the metric specified by the UsageByAccount.type
     *            field in the response.
     *            </p>
     */
    public void setIsServiceLimited(Boolean isServiceLimited) {
        this.isServiceLimited = isServiceLimited;
    }

    /**
     * <p>
     * Specifies whether the account has met the quota that corresponds to the
     * metric specified by the UsageByAccount.type field in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isServiceLimited <p>
     *            Specifies whether the account has met the quota that
     *            corresponds to the metric specified by the UsageByAccount.type
     *            field in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceLimit withIsServiceLimited(Boolean isServiceLimited) {
        this.isServiceLimited = isServiceLimited;
        return this;
    }

    /**
     * <p>
     * The unit of measurement for the value specified by the value field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERABYTES
     *
     * @return <p>
     *         The unit of measurement for the value specified by the value
     *         field.
     *         </p>
     * @see Unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * <p>
     * The unit of measurement for the value specified by the value field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERABYTES
     *
     * @param unit <p>
     *            The unit of measurement for the value specified by the value
     *            field.
     *            </p>
     * @see Unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of measurement for the value specified by the value field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERABYTES
     *
     * @param unit <p>
     *            The unit of measurement for the value specified by the value
     *            field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Unit
     */
    public ServiceLimit withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * <p>
     * The unit of measurement for the value specified by the value field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERABYTES
     *
     * @param unit <p>
     *            The unit of measurement for the value specified by the value
     *            field.
     *            </p>
     * @see Unit
     */
    public void setUnit(Unit unit) {
        this.unit = unit.toString();
    }

    /**
     * <p>
     * The unit of measurement for the value specified by the value field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERABYTES
     *
     * @param unit <p>
     *            The unit of measurement for the value specified by the value
     *            field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Unit
     */
    public ServiceLimit withUnit(Unit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * The value for the metric specified by the UsageByAccount.type field in
     * the response.
     * </p>
     *
     * @return <p>
     *         The value for the metric specified by the UsageByAccount.type
     *         field in the response.
     *         </p>
     */
    public Long getValue() {
        return value;
    }

    /**
     * <p>
     * The value for the metric specified by the UsageByAccount.type field in
     * the response.
     * </p>
     *
     * @param value <p>
     *            The value for the metric specified by the UsageByAccount.type
     *            field in the response.
     *            </p>
     */
    public void setValue(Long value) {
        this.value = value;
    }

    /**
     * <p>
     * The value for the metric specified by the UsageByAccount.type field in
     * the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value for the metric specified by the UsageByAccount.type
     *            field in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceLimit withValue(Long value) {
        this.value = value;
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
        if (getIsServiceLimited() != null)
            sb.append("isServiceLimited: " + getIsServiceLimited() + ",");
        if (getUnit() != null)
            sb.append("unit: " + getUnit() + ",");
        if (getValue() != null)
            sb.append("value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIsServiceLimited() == null) ? 0 : getIsServiceLimited().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceLimit == false)
            return false;
        ServiceLimit other = (ServiceLimit) obj;

        if (other.getIsServiceLimited() == null ^ this.getIsServiceLimited() == null)
            return false;
        if (other.getIsServiceLimited() != null
                && other.getIsServiceLimited().equals(this.getIsServiceLimited()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
