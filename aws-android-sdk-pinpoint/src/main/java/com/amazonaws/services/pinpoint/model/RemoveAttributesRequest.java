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
 * Used to remove the attributes for an app
 */
public class RemoveAttributesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The unique ID of your Amazon Pinpoint application.
     */
    private String applicationId;

    /**
     * Type of attribute. Can be endpoint-custom-attributes,
     * endpoint-custom-metrics, endpoint-user-attributes.
     */
    private String attributeType;

    /**
     * Update attributes request
     */
    private UpdateAttributesRequest updateAttributesRequest;

    /**
     * The unique ID of your Amazon Pinpoint application.
     *
     * @return The unique ID of your Amazon Pinpoint application.
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * The unique ID of your Amazon Pinpoint application.
     *
     * @param applicationId The unique ID of your Amazon Pinpoint application.
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The unique ID of your Amazon Pinpoint application.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId The unique ID of your Amazon Pinpoint application.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveAttributesRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Type of attribute. Can be endpoint-custom-attributes,
     * endpoint-custom-metrics, endpoint-user-attributes.
     *
     * @return Type of attribute. Can be endpoint-custom-attributes,
     *         endpoint-custom-metrics, endpoint-user-attributes.
     */
    public String getAttributeType() {
        return attributeType;
    }

    /**
     * Type of attribute. Can be endpoint-custom-attributes,
     * endpoint-custom-metrics, endpoint-user-attributes.
     *
     * @param attributeType Type of attribute. Can be
     *            endpoint-custom-attributes, endpoint-custom-metrics,
     *            endpoint-user-attributes.
     */
    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    /**
     * Type of attribute. Can be endpoint-custom-attributes,
     * endpoint-custom-metrics, endpoint-user-attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeType Type of attribute. Can be
     *            endpoint-custom-attributes, endpoint-custom-metrics,
     *            endpoint-user-attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveAttributesRequest withAttributeType(String attributeType) {
        this.attributeType = attributeType;
        return this;
    }

    /**
     * Update attributes request
     *
     * @return Update attributes request
     */
    public UpdateAttributesRequest getUpdateAttributesRequest() {
        return updateAttributesRequest;
    }

    /**
     * Update attributes request
     *
     * @param updateAttributesRequest Update attributes request
     */
    public void setUpdateAttributesRequest(UpdateAttributesRequest updateAttributesRequest) {
        this.updateAttributesRequest = updateAttributesRequest;
    }

    /**
     * Update attributes request
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateAttributesRequest Update attributes request
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
