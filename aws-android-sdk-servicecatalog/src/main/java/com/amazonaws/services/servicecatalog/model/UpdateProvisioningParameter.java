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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * <p>
 * The parameter key-value pair used to update a provisioned product.
 * </p>
 */
public class UpdateProvisioningParameter implements Serializable {
    /**
     * <p>
     * The parameter key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String key;

    /**
     * <p>
     * The parameter value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     */
    private String value;

    /**
     * <p>
     * If set to true, <code>Value</code> is ignored and the previous parameter
     * value is kept.
     * </p>
     */
    private Boolean usePreviousValue;

    /**
     * <p>
     * The parameter key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The parameter key.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The parameter key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param key <p>
     *            The parameter key.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The parameter key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param key <p>
     *            The parameter key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisioningParameter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The parameter value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @return <p>
     *         The parameter value.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The parameter value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param value <p>
     *            The parameter value.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The parameter value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param value <p>
     *            The parameter value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisioningParameter withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * If set to true, <code>Value</code> is ignored and the previous parameter
     * value is kept.
     * </p>
     *
     * @return <p>
     *         If set to true, <code>Value</code> is ignored and the previous
     *         parameter value is kept.
     *         </p>
     */
    public Boolean isUsePreviousValue() {
        return usePreviousValue;
    }

    /**
     * <p>
     * If set to true, <code>Value</code> is ignored and the previous parameter
     * value is kept.
     * </p>
     *
     * @return <p>
     *         If set to true, <code>Value</code> is ignored and the previous
     *         parameter value is kept.
     *         </p>
     */
    public Boolean getUsePreviousValue() {
        return usePreviousValue;
    }

    /**
     * <p>
     * If set to true, <code>Value</code> is ignored and the previous parameter
     * value is kept.
     * </p>
     *
     * @param usePreviousValue <p>
     *            If set to true, <code>Value</code> is ignored and the previous
     *            parameter value is kept.
     *            </p>
     */
    public void setUsePreviousValue(Boolean usePreviousValue) {
        this.usePreviousValue = usePreviousValue;
    }

    /**
     * <p>
     * If set to true, <code>Value</code> is ignored and the previous parameter
     * value is kept.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usePreviousValue <p>
     *            If set to true, <code>Value</code> is ignored and the previous
     *            parameter value is kept.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisioningParameter withUsePreviousValue(Boolean usePreviousValue) {
        this.usePreviousValue = usePreviousValue;
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
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getUsePreviousValue() != null)
            sb.append("UsePreviousValue: " + getUsePreviousValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode
                + ((getUsePreviousValue() == null) ? 0 : getUsePreviousValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProvisioningParameter == false)
            return false;
        UpdateProvisioningParameter other = (UpdateProvisioningParameter) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getUsePreviousValue() == null ^ this.getUsePreviousValue() == null)
            return false;
        if (other.getUsePreviousValue() != null
                && other.getUsePreviousValue().equals(this.getUsePreviousValue()) == false)
            return false;
        return true;
    }
}
