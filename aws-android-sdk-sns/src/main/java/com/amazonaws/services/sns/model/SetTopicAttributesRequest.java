/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.sns.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Allows a topic owner to set an attribute of the topic to a new value.
 * </p>
 */
public class SetTopicAttributesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the topic to modify.
     * </p>
     */
    private String topicArn;

    /**
     * <p>
     * The name of the attribute you want to set. Only a subset of the topic's
     * attributes are mutable.
     * </p>
     * <p>
     * Valid values: <code>Policy</code> | <code>DisplayName</code> |
     * <code>DeliveryPolicy</code>
     * </p>
     */
    private String attributeName;

    /**
     * <p>
     * The new value for the attribute.
     * </p>
     */
    private String attributeValue;

    /**
     * Default constructor for SetTopicAttributesRequest object. Callers should
     * use the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     */
    public SetTopicAttributesRequest() {
    }

    /**
     * Constructs a new SetTopicAttributesRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param topicArn <p>
     *            The ARN of the topic to modify.
     *            </p>
     * @param attributeName <p>
     *            The name of the attribute you want to set. Only a subset of
     *            the topic's attributes are mutable.
     *            </p>
     *            <p>
     *            Valid values: <code>Policy</code> | <code>DisplayName</code> |
     *            <code>DeliveryPolicy</code>
     *            </p>
     * @param attributeValue <p>
     *            The new value for the attribute.
     *            </p>
     */
    public SetTopicAttributesRequest(String topicArn, String attributeName, String attributeValue) {
        setTopicArn(topicArn);
        setAttributeName(attributeName);
        setAttributeValue(attributeValue);
    }

    /**
     * <p>
     * The ARN of the topic to modify.
     * </p>
     *
     * @return <p>
     *         The ARN of the topic to modify.
     *         </p>
     */
    public String getTopicArn() {
        return topicArn;
    }

    /**
     * <p>
     * The ARN of the topic to modify.
     * </p>
     *
     * @param topicArn <p>
     *            The ARN of the topic to modify.
     *            </p>
     */
    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The ARN of the topic to modify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topicArn <p>
     *            The ARN of the topic to modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetTopicAttributesRequest withTopicArn(String topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    /**
     * <p>
     * The name of the attribute you want to set. Only a subset of the topic's
     * attributes are mutable.
     * </p>
     * <p>
     * Valid values: <code>Policy</code> | <code>DisplayName</code> |
     * <code>DeliveryPolicy</code>
     * </p>
     *
     * @return <p>
     *         The name of the attribute you want to set. Only a subset of the
     *         topic's attributes are mutable.
     *         </p>
     *         <p>
     *         Valid values: <code>Policy</code> | <code>DisplayName</code> |
     *         <code>DeliveryPolicy</code>
     *         </p>
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * <p>
     * The name of the attribute you want to set. Only a subset of the topic's
     * attributes are mutable.
     * </p>
     * <p>
     * Valid values: <code>Policy</code> | <code>DisplayName</code> |
     * <code>DeliveryPolicy</code>
     * </p>
     *
     * @param attributeName <p>
     *            The name of the attribute you want to set. Only a subset of
     *            the topic's attributes are mutable.
     *            </p>
     *            <p>
     *            Valid values: <code>Policy</code> | <code>DisplayName</code> |
     *            <code>DeliveryPolicy</code>
     *            </p>
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of the attribute you want to set. Only a subset of the topic's
     * attributes are mutable.
     * </p>
     * <p>
     * Valid values: <code>Policy</code> | <code>DisplayName</code> |
     * <code>DeliveryPolicy</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeName <p>
     *            The name of the attribute you want to set. Only a subset of
     *            the topic's attributes are mutable.
     *            </p>
     *            <p>
     *            Valid values: <code>Policy</code> | <code>DisplayName</code> |
     *            <code>DeliveryPolicy</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetTopicAttributesRequest withAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * <p>
     * The new value for the attribute.
     * </p>
     *
     * @return <p>
     *         The new value for the attribute.
     *         </p>
     */
    public String getAttributeValue() {
        return attributeValue;
    }

    /**
     * <p>
     * The new value for the attribute.
     * </p>
     *
     * @param attributeValue <p>
     *            The new value for the attribute.
     *            </p>
     */
    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    /**
     * <p>
     * The new value for the attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeValue <p>
     *            The new value for the attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetTopicAttributesRequest withAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
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
        if (getTopicArn() != null)
            sb.append("TopicArn: " + getTopicArn() + ",");
        if (getAttributeName() != null)
            sb.append("AttributeName: " + getAttributeName() + ",");
        if (getAttributeValue() != null)
            sb.append("AttributeValue: " + getAttributeValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        hashCode = prime * hashCode
                + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode
                + ((getAttributeValue() == null) ? 0 : getAttributeValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetTopicAttributesRequest == false)
            return false;
        SetTopicAttributesRequest other = (SetTopicAttributesRequest) obj;

        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null
                && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getAttributeValue() == null ^ this.getAttributeValue() == null)
            return false;
        if (other.getAttributeValue() != null
                && other.getAttributeValue().equals(this.getAttributeValue()) == false)
            return false;
        return true;
    }
}
