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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the delivery configuration settings for sending a campaign or
 * campaign treatment through a custom channel. This object is required if you
 * use the CampaignCustomMessage object to define the message to send for the
 * campaign or campaign treatment.
 * </p>
 */
public class CustomDeliveryConfiguration implements Serializable {
    /**
     * <p>
     * The destination to send the campaign or treatment to. This value can be
     * one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name or Amazon Resource Name (ARN) of an AWS Lambda function to
     * invoke to handle delivery of the campaign or treatment.
     * </p>
     * </li>
     * <li>
     * <p>
     * The URL for a web application or service that supports HTTPS and can
     * receive the message. The URL has to be a full URL, including the HTTPS
     * protocol.
     * </p>
     * </li>
     * </ul>
     */
    private String deliveryUri;

    /**
     * <p>
     * The types of endpoints to send the campaign or treatment to. Each valid
     * value maps to a type of channel that you can associate with an endpoint
     * by using the ChannelType property of an endpoint.
     * </p>
     */
    private java.util.List<String> endpointTypes;

    /**
     * <p>
     * The destination to send the campaign or treatment to. This value can be
     * one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name or Amazon Resource Name (ARN) of an AWS Lambda function to
     * invoke to handle delivery of the campaign or treatment.
     * </p>
     * </li>
     * <li>
     * <p>
     * The URL for a web application or service that supports HTTPS and can
     * receive the message. The URL has to be a full URL, including the HTTPS
     * protocol.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The destination to send the campaign or treatment to. This value
     *         can be one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The name or Amazon Resource Name (ARN) of an AWS Lambda function
     *         to invoke to handle delivery of the campaign or treatment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The URL for a web application or service that supports HTTPS and
     *         can receive the message. The URL has to be a full URL, including
     *         the HTTPS protocol.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getDeliveryUri() {
        return deliveryUri;
    }

    /**
     * <p>
     * The destination to send the campaign or treatment to. This value can be
     * one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name or Amazon Resource Name (ARN) of an AWS Lambda function to
     * invoke to handle delivery of the campaign or treatment.
     * </p>
     * </li>
     * <li>
     * <p>
     * The URL for a web application or service that supports HTTPS and can
     * receive the message. The URL has to be a full URL, including the HTTPS
     * protocol.
     * </p>
     * </li>
     * </ul>
     *
     * @param deliveryUri <p>
     *            The destination to send the campaign or treatment to. This
     *            value can be one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The name or Amazon Resource Name (ARN) of an AWS Lambda
     *            function to invoke to handle delivery of the campaign or
     *            treatment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The URL for a web application or service that supports HTTPS
     *            and can receive the message. The URL has to be a full URL,
     *            including the HTTPS protocol.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDeliveryUri(String deliveryUri) {
        this.deliveryUri = deliveryUri;
    }

    /**
     * <p>
     * The destination to send the campaign or treatment to. This value can be
     * one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name or Amazon Resource Name (ARN) of an AWS Lambda function to
     * invoke to handle delivery of the campaign or treatment.
     * </p>
     * </li>
     * <li>
     * <p>
     * The URL for a web application or service that supports HTTPS and can
     * receive the message. The URL has to be a full URL, including the HTTPS
     * protocol.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deliveryUri <p>
     *            The destination to send the campaign or treatment to. This
     *            value can be one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The name or Amazon Resource Name (ARN) of an AWS Lambda
     *            function to invoke to handle delivery of the campaign or
     *            treatment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The URL for a web application or service that supports HTTPS
     *            and can receive the message. The URL has to be a full URL,
     *            including the HTTPS protocol.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomDeliveryConfiguration withDeliveryUri(String deliveryUri) {
        this.deliveryUri = deliveryUri;
        return this;
    }

    /**
     * <p>
     * The types of endpoints to send the campaign or treatment to. Each valid
     * value maps to a type of channel that you can associate with an endpoint
     * by using the ChannelType property of an endpoint.
     * </p>
     *
     * @return <p>
     *         The types of endpoints to send the campaign or treatment to. Each
     *         valid value maps to a type of channel that you can associate with
     *         an endpoint by using the ChannelType property of an endpoint.
     *         </p>
     */
    public java.util.List<String> getEndpointTypes() {
        return endpointTypes;
    }

    /**
     * <p>
     * The types of endpoints to send the campaign or treatment to. Each valid
     * value maps to a type of channel that you can associate with an endpoint
     * by using the ChannelType property of an endpoint.
     * </p>
     *
     * @param endpointTypes <p>
     *            The types of endpoints to send the campaign or treatment to.
     *            Each valid value maps to a type of channel that you can
     *            associate with an endpoint by using the ChannelType property
     *            of an endpoint.
     *            </p>
     */
    public void setEndpointTypes(java.util.Collection<String> endpointTypes) {
        if (endpointTypes == null) {
            this.endpointTypes = null;
            return;
        }

        this.endpointTypes = new java.util.ArrayList<String>(endpointTypes);
    }

    /**
     * <p>
     * The types of endpoints to send the campaign or treatment to. Each valid
     * value maps to a type of channel that you can associate with an endpoint
     * by using the ChannelType property of an endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointTypes <p>
     *            The types of endpoints to send the campaign or treatment to.
     *            Each valid value maps to a type of channel that you can
     *            associate with an endpoint by using the ChannelType property
     *            of an endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomDeliveryConfiguration withEndpointTypes(String... endpointTypes) {
        if (getEndpointTypes() == null) {
            this.endpointTypes = new java.util.ArrayList<String>(endpointTypes.length);
        }
        for (String value : endpointTypes) {
            this.endpointTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The types of endpoints to send the campaign or treatment to. Each valid
     * value maps to a type of channel that you can associate with an endpoint
     * by using the ChannelType property of an endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointTypes <p>
     *            The types of endpoints to send the campaign or treatment to.
     *            Each valid value maps to a type of channel that you can
     *            associate with an endpoint by using the ChannelType property
     *            of an endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomDeliveryConfiguration withEndpointTypes(java.util.Collection<String> endpointTypes) {
        setEndpointTypes(endpointTypes);
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
        if (getDeliveryUri() != null)
            sb.append("DeliveryUri: " + getDeliveryUri() + ",");
        if (getEndpointTypes() != null)
            sb.append("EndpointTypes: " + getEndpointTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeliveryUri() == null) ? 0 : getDeliveryUri().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointTypes() == null) ? 0 : getEndpointTypes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomDeliveryConfiguration == false)
            return false;
        CustomDeliveryConfiguration other = (CustomDeliveryConfiguration) obj;

        if (other.getDeliveryUri() == null ^ this.getDeliveryUri() == null)
            return false;
        if (other.getDeliveryUri() != null
                && other.getDeliveryUri().equals(this.getDeliveryUri()) == false)
            return false;
        if (other.getEndpointTypes() == null ^ this.getEndpointTypes() == null)
            return false;
        if (other.getEndpointTypes() != null
                && other.getEndpointTypes().equals(this.getEndpointTypes()) == false)
            return false;
        return true;
    }
}
