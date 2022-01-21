/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * A toggle for an individual feature at the instance level.
 * </p>
 */
public class Attribute implements Serializable {
    /**
     * <p>
     * The type of attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INBOUND_CALLS, OUTBOUND_CALLS, CONTACTFLOW_LOGS,
     * CONTACT_LENS, AUTO_RESOLVE_BEST_VOICES, USE_CUSTOM_TTS_VOICES,
     * EARLY_MEDIA
     */
    private String attributeType;

    /**
     * <p>
     * The value of the attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String value;

    /**
     * <p>
     * The type of attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INBOUND_CALLS, OUTBOUND_CALLS, CONTACTFLOW_LOGS,
     * CONTACT_LENS, AUTO_RESOLVE_BEST_VOICES, USE_CUSTOM_TTS_VOICES,
     * EARLY_MEDIA
     *
     * @return <p>
     *         The type of attribute.
     *         </p>
     * @see InstanceAttributeType
     */
    public String getAttributeType() {
        return attributeType;
    }

    /**
     * <p>
     * The type of attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INBOUND_CALLS, OUTBOUND_CALLS, CONTACTFLOW_LOGS,
     * CONTACT_LENS, AUTO_RESOLVE_BEST_VOICES, USE_CUSTOM_TTS_VOICES,
     * EARLY_MEDIA
     *
     * @param attributeType <p>
     *            The type of attribute.
     *            </p>
     * @see InstanceAttributeType
     */
    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    /**
     * <p>
     * The type of attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INBOUND_CALLS, OUTBOUND_CALLS, CONTACTFLOW_LOGS,
     * CONTACT_LENS, AUTO_RESOLVE_BEST_VOICES, USE_CUSTOM_TTS_VOICES,
     * EARLY_MEDIA
     *
     * @param attributeType <p>
     *            The type of attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceAttributeType
     */
    public Attribute withAttributeType(String attributeType) {
        this.attributeType = attributeType;
        return this;
    }

    /**
     * <p>
     * The type of attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INBOUND_CALLS, OUTBOUND_CALLS, CONTACTFLOW_LOGS,
     * CONTACT_LENS, AUTO_RESOLVE_BEST_VOICES, USE_CUSTOM_TTS_VOICES,
     * EARLY_MEDIA
     *
     * @param attributeType <p>
     *            The type of attribute.
     *            </p>
     * @see InstanceAttributeType
     */
    public void setAttributeType(InstanceAttributeType attributeType) {
        this.attributeType = attributeType.toString();
    }

    /**
     * <p>
     * The type of attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INBOUND_CALLS, OUTBOUND_CALLS, CONTACTFLOW_LOGS,
     * CONTACT_LENS, AUTO_RESOLVE_BEST_VOICES, USE_CUSTOM_TTS_VOICES,
     * EARLY_MEDIA
     *
     * @param attributeType <p>
     *            The type of attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceAttributeType
     */
    public Attribute withAttributeType(InstanceAttributeType attributeType) {
        this.attributeType = attributeType.toString();
        return this;
    }

    /**
     * <p>
     * The value of the attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The value of the attribute.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value of the attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param value <p>
     *            The value of the attribute.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param value <p>
     *            The value of the attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Attribute withValue(String value) {
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
        if (getAttributeType() != null)
            sb.append("AttributeType: " + getAttributeType() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAttributeType() == null) ? 0 : getAttributeType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Attribute == false)
            return false;
        Attribute other = (Attribute) obj;

        if (other.getAttributeType() == null ^ this.getAttributeType() == null)
            return false;
        if (other.getAttributeType() != null
                && other.getAttributeType().equals(this.getAttributeType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
