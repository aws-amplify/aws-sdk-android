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
 * The code delivery details being returned from the server.
 * </p>
 */
public class CodeDeliveryDetailsType implements Serializable {
    /**
     * <p>
     * The destination for the code delivery details.
     * </p>
     */
    private String destination;

    /**
     * <p>
     * The delivery medium (email message or phone number).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS, EMAIL
     */
    private String deliveryMedium;

    /**
     * <p>
     * The attribute name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String attributeName;

    /**
     * <p>
     * The destination for the code delivery details.
     * </p>
     *
     * @return <p>
     *         The destination for the code delivery details.
     *         </p>
     */
    public String getDestination() {
        return destination;
    }

    /**
     * <p>
     * The destination for the code delivery details.
     * </p>
     *
     * @param destination <p>
     *            The destination for the code delivery details.
     *            </p>
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The destination for the code delivery details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destination <p>
     *            The destination for the code delivery details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CodeDeliveryDetailsType withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * <p>
     * The delivery medium (email message or phone number).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS, EMAIL
     *
     * @return <p>
     *         The delivery medium (email message or phone number).
     *         </p>
     * @see DeliveryMediumType
     */
    public String getDeliveryMedium() {
        return deliveryMedium;
    }

    /**
     * <p>
     * The delivery medium (email message or phone number).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS, EMAIL
     *
     * @param deliveryMedium <p>
     *            The delivery medium (email message or phone number).
     *            </p>
     * @see DeliveryMediumType
     */
    public void setDeliveryMedium(String deliveryMedium) {
        this.deliveryMedium = deliveryMedium;
    }

    /**
     * <p>
     * The delivery medium (email message or phone number).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS, EMAIL
     *
     * @param deliveryMedium <p>
     *            The delivery medium (email message or phone number).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeliveryMediumType
     */
    public CodeDeliveryDetailsType withDeliveryMedium(String deliveryMedium) {
        this.deliveryMedium = deliveryMedium;
        return this;
    }

    /**
     * <p>
     * The delivery medium (email message or phone number).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS, EMAIL
     *
     * @param deliveryMedium <p>
     *            The delivery medium (email message or phone number).
     *            </p>
     * @see DeliveryMediumType
     */
    public void setDeliveryMedium(DeliveryMediumType deliveryMedium) {
        this.deliveryMedium = deliveryMedium.toString();
    }

    /**
     * <p>
     * The delivery medium (email message or phone number).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SMS, EMAIL
     *
     * @param deliveryMedium <p>
     *            The delivery medium (email message or phone number).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeliveryMediumType
     */
    public CodeDeliveryDetailsType withDeliveryMedium(DeliveryMediumType deliveryMedium) {
        this.deliveryMedium = deliveryMedium.toString();
        return this;
    }

    /**
     * <p>
     * The attribute name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return <p>
     *         The attribute name.
     *         </p>
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * <p>
     * The attribute name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param attributeName <p>
     *            The attribute name.
     *            </p>
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The attribute name.
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
     *            The attribute name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CodeDeliveryDetailsType withAttributeName(String attributeName) {
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
        if (getDestination() != null)
            sb.append("Destination: " + getDestination() + ",");
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
                + ((getDestination() == null) ? 0 : getDestination().hashCode());
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

        if (obj instanceof CodeDeliveryDetailsType == false)
            return false;
        CodeDeliveryDetailsType other = (CodeDeliveryDetailsType) obj;

        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null
                && other.getDestination().equals(this.getDestination()) == false)
            return false;
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
