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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Removes one or more attributes, of the same attribute type, from all the
 * endpoints that are associated with an application.
 * </p>
 */
public class RemoveAttributesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     */
    private String applicationId;

    /**
     * <p>
     * The type of attribute or attributes to remove. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * endpoint-custom-attributes - Custom attributes that describe endpoints,
     * such as the date when an associated user opted in or out of receiving
     * communications from you through a specific type of channel.
     * </p>
     * </li>
     * <li>
     * <p>
     * endpoint-custom-metrics - Custom metrics that your app reports to Amazon
     * Pinpoint for endpoints, such as the number of app sessions or the number
     * of items left in a cart.
     * </p>
     * </li>
     * <li>
     * <p>
     * endpoint-user-attributes - Custom attributes that describe users, such as
     * first name, last name, and age.
     * </p>
     * </li>
     * </ul>
     */
    private String attributeType;

    /**
     * <p>
     * Specifies one or more attributes to remove from all the endpoints that
     * are associated with an application.
     * </p>
     */
    private UpdateAttributesRequest updateAttributesRequest;

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the application. This identifier is
     *         displayed as the <b>Project ID</b> on the Amazon Pinpoint
     *         console.
     *         </p>
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     *
     * @param applicationId <p>
     *            The unique identifier for the application. This identifier is
     *            displayed as the <b>Project ID</b> on the Amazon Pinpoint
     *            console.
     *            </p>
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId <p>
     *            The unique identifier for the application. This identifier is
     *            displayed as the <b>Project ID</b> on the Amazon Pinpoint
     *            console.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveAttributesRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * The type of attribute or attributes to remove. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * endpoint-custom-attributes - Custom attributes that describe endpoints,
     * such as the date when an associated user opted in or out of receiving
     * communications from you through a specific type of channel.
     * </p>
     * </li>
     * <li>
     * <p>
     * endpoint-custom-metrics - Custom metrics that your app reports to Amazon
     * Pinpoint for endpoints, such as the number of app sessions or the number
     * of items left in a cart.
     * </p>
     * </li>
     * <li>
     * <p>
     * endpoint-user-attributes - Custom attributes that describe users, such as
     * first name, last name, and age.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The type of attribute or attributes to remove. Valid values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         endpoint-custom-attributes - Custom attributes that describe
     *         endpoints, such as the date when an associated user opted in or
     *         out of receiving communications from you through a specific type
     *         of channel.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         endpoint-custom-metrics - Custom metrics that your app reports to
     *         Amazon Pinpoint for endpoints, such as the number of app sessions
     *         or the number of items left in a cart.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         endpoint-user-attributes - Custom attributes that describe users,
     *         such as first name, last name, and age.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getAttributeType() {
        return attributeType;
    }

    /**
     * <p>
     * The type of attribute or attributes to remove. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * endpoint-custom-attributes - Custom attributes that describe endpoints,
     * such as the date when an associated user opted in or out of receiving
     * communications from you through a specific type of channel.
     * </p>
     * </li>
     * <li>
     * <p>
     * endpoint-custom-metrics - Custom metrics that your app reports to Amazon
     * Pinpoint for endpoints, such as the number of app sessions or the number
     * of items left in a cart.
     * </p>
     * </li>
     * <li>
     * <p>
     * endpoint-user-attributes - Custom attributes that describe users, such as
     * first name, last name, and age.
     * </p>
     * </li>
     * </ul>
     *
     * @param attributeType <p>
     *            The type of attribute or attributes to remove. Valid values
     *            are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            endpoint-custom-attributes - Custom attributes that describe
     *            endpoints, such as the date when an associated user opted in
     *            or out of receiving communications from you through a specific
     *            type of channel.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            endpoint-custom-metrics - Custom metrics that your app reports
     *            to Amazon Pinpoint for endpoints, such as the number of app
     *            sessions or the number of items left in a cart.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            endpoint-user-attributes - Custom attributes that describe
     *            users, such as first name, last name, and age.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    /**
     * <p>
     * The type of attribute or attributes to remove. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * endpoint-custom-attributes - Custom attributes that describe endpoints,
     * such as the date when an associated user opted in or out of receiving
     * communications from you through a specific type of channel.
     * </p>
     * </li>
     * <li>
     * <p>
     * endpoint-custom-metrics - Custom metrics that your app reports to Amazon
     * Pinpoint for endpoints, such as the number of app sessions or the number
     * of items left in a cart.
     * </p>
     * </li>
     * <li>
     * <p>
     * endpoint-user-attributes - Custom attributes that describe users, such as
     * first name, last name, and age.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeType <p>
     *            The type of attribute or attributes to remove. Valid values
     *            are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            endpoint-custom-attributes - Custom attributes that describe
     *            endpoints, such as the date when an associated user opted in
     *            or out of receiving communications from you through a specific
     *            type of channel.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            endpoint-custom-metrics - Custom metrics that your app reports
     *            to Amazon Pinpoint for endpoints, such as the number of app
     *            sessions or the number of items left in a cart.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            endpoint-user-attributes - Custom attributes that describe
     *            users, such as first name, last name, and age.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveAttributesRequest withAttributeType(String attributeType) {
        this.attributeType = attributeType;
        return this;
    }

    /**
     * <p>
     * Specifies one or more attributes to remove from all the endpoints that
     * are associated with an application.
     * </p>
     *
     * @return <p>
     *         Specifies one or more attributes to remove from all the endpoints
     *         that are associated with an application.
     *         </p>
     */
    public UpdateAttributesRequest getUpdateAttributesRequest() {
        return updateAttributesRequest;
    }

    /**
     * <p>
     * Specifies one or more attributes to remove from all the endpoints that
     * are associated with an application.
     * </p>
     *
     * @param updateAttributesRequest <p>
     *            Specifies one or more attributes to remove from all the
     *            endpoints that are associated with an application.
     *            </p>
     */
    public void setUpdateAttributesRequest(UpdateAttributesRequest updateAttributesRequest) {
        this.updateAttributesRequest = updateAttributesRequest;
    }

    /**
     * <p>
     * Specifies one or more attributes to remove from all the endpoints that
     * are associated with an application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateAttributesRequest <p>
     *            Specifies one or more attributes to remove from all the
     *            endpoints that are associated with an application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveAttributesRequest withUpdateAttributesRequest(
            UpdateAttributesRequest updateAttributesRequest) {
        this.updateAttributesRequest = updateAttributesRequest;
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getAttributeType() != null)
            sb.append("AttributeType: " + getAttributeType() + ",");
        if (getUpdateAttributesRequest() != null)
            sb.append("UpdateAttributesRequest: " + getUpdateAttributesRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode
                + ((getAttributeType() == null) ? 0 : getAttributeType().hashCode());
        hashCode = prime
                * hashCode
                + ((getUpdateAttributesRequest() == null) ? 0 : getUpdateAttributesRequest()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveAttributesRequest == false)
            return false;
        RemoveAttributesRequest other = (RemoveAttributesRequest) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getAttributeType() == null ^ this.getAttributeType() == null)
            return false;
        if (other.getAttributeType() != null
                && other.getAttributeType().equals(this.getAttributeType()) == false)
            return false;
        if (other.getUpdateAttributesRequest() == null ^ this.getUpdateAttributesRequest() == null)
            return false;
        if (other.getUpdateAttributesRequest() != null
                && other.getUpdateAttributesRequest().equals(this.getUpdateAttributesRequest()) == false)
            return false;
        return true;
    }
}
