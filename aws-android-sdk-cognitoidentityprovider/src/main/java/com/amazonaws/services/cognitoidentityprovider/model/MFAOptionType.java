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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the different settings for multi-factor authentication (MFA).
 * </p>
 */
public class MFAOptionType implements Serializable {
    /**
     * <p>
     * The delivery medium (email message or SMS message) to send the MFA code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS, EMAIL
     */
    private String deliveryMedium;

    /**
     * <p>
     * The attribute name of the MFA option type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String attributeName;

    /**
     * <p>
     * The delivery medium (email message or SMS message) to send the MFA code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS, EMAIL
     *
     * @return <p>
     *         The delivery medium (email message or SMS message) to send the
     *         MFA code.
     *         </p>
     * @see DeliveryMediumType
     */
    public String getDeliveryMedium() {
        return deliveryMedium;
    }

    /**
     * <p>
     * The delivery medium (email message or SMS message) to send the MFA code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS, EMAIL
     *
     * @param deliveryMedium <p>
     *            The delivery medium (email message or SMS message) to send the
     *            MFA code.
     *            </p>
     * @see DeliveryMediumType
     */
    public void setDeliveryMedium(String deliveryMedium) {
        this.deliveryMedium = deliveryMedium;
    }

    /**
     * <p>
     * The delivery medium (email message or SMS message) to send the MFA code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS, EMAIL
     *
     * @param deliveryMedium <p>
     *            The delivery medium (email message or SMS message) to send the
     *            MFA code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeliveryMediumType
     */
    public MFAOptionType withDeliveryMedium(String deliveryMedium) {
        this.deliveryMedium = deliveryMedium;
        return this;
    }

    /**
     * <p>
     * The delivery medium (email message or SMS message) to send the MFA code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS, EMAIL
     *
     * @param deliveryMedium <p>
     *            The delivery medium (email message or SMS message) to send the
     *            MFA code.
     *            </p>
     * @see DeliveryMediumType
     */
    public void setDeliveryMedium(DeliveryMediumType deliveryMedium) {
        this.deliveryMedium = deliveryMedium.toString();
    }

    /**
     * <p>
     * The delivery medium (email message or SMS message) to send the MFA code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS, EMAIL
     *
     * @param deliveryMedium <p>
     *            The delivery medium (email message or SMS message) to send the
     *            MFA code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeliveryMediumType
     */
    public MFAOptionType withDeliveryMedium(DeliveryMediumType deliveryMedium) {
        this.deliveryMedium = deliveryMedium.toString();
        return this;
    }

    /**
     * <p>
     * The attribute name of the MFA option type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return <p>
     *         The attribute name of the MFA option type.
     *         </p>
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * <p>
     * The attribute name of the MFA option type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param attributeName <p>
     *            The attribute name of the MFA option type.
     *            </p>
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The attribute name of the MFA option type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param attributeName <p>
     *            The attribute name of the MFA option type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MFAOptionType withAttributeName(String attributeName) {
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
        if (getDeliveryMedium() != null)
            sb.append("DeliveryMedium: " + getDeliveryMedium() + ",");
        if (getAttributeName() != null)
            sb.append("AttributeName: " + getAttributeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeliveryMedium() == null) ? 0 : getDeliveryMedium().hashCode());
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

        if (obj instanceof MFAOptionType == false)
            return false;
        MFAOptionType other = (MFAOptionType) obj;

        if (other.getDeliveryMedium() == null ^ this.getDeliveryMedium() == null)
            return false;
        if (other.getDeliveryMedium() != null
                && other.getDeliveryMedium().equals(this.getDeliveryMedium()) == false)
            return false;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null
                && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        return true;
    }
}
