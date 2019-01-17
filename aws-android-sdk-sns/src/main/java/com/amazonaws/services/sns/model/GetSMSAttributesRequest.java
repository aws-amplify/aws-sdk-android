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

package com.amazonaws.services.sns.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns the settings for sending SMS messages from your account.
 * </p>
 * <p>
 * These settings are set with the <code>SetSMSAttributes</code> action.
 * </p>
 */
public class GetSMSAttributesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A list of the individual attribute names, such as
     * <code>MonthlySpendLimit</code>, for which you want values.
     * </p>
     * <p>
     * For all attribute names, see <a href=
     * "http://docs.aws.amazon.com/sns/latest/api/API_SetSMSAttributes.html"
     * >SetSMSAttributes</a>.
     * </p>
     * <p>
     * If you don't use this parameter, Amazon SNS returns all SMS attributes.
     * </p>
     */
    private java.util.List<String> attributes = new java.util.ArrayList<String>();

    /**
     * <p>
     * A list of the individual attribute names, such as
     * <code>MonthlySpendLimit</code>, for which you want values.
     * </p>
     * <p>
     * For all attribute names, see <a href=
     * "http://docs.aws.amazon.com/sns/latest/api/API_SetSMSAttributes.html"
     * >SetSMSAttributes</a>.
     * </p>
     * <p>
     * If you don't use this parameter, Amazon SNS returns all SMS attributes.
     * </p>
     *
     * @return <p>
     *         A list of the individual attribute names, such as
     *         <code>MonthlySpendLimit</code>, for which you want values.
     *         </p>
     *         <p>
     *         For all attribute names, see <a href=
     *         "http://docs.aws.amazon.com/sns/latest/api/API_SetSMSAttributes.html"
     *         >SetSMSAttributes</a>.
     *         </p>
     *         <p>
     *         If you don't use this parameter, Amazon SNS returns all SMS
     *         attributes.
     *         </p>
     */
    public java.util.List<String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A list of the individual attribute names, such as
     * <code>MonthlySpendLimit</code>, for which you want values.
     * </p>
     * <p>
     * For all attribute names, see <a href=
     * "http://docs.aws.amazon.com/sns/latest/api/API_SetSMSAttributes.html"
     * >SetSMSAttributes</a>.
     * </p>
     * <p>
     * If you don't use this parameter, Amazon SNS returns all SMS attributes.
     * </p>
     *
     * @param attributes <p>
     *            A list of the individual attribute names, such as
     *            <code>MonthlySpendLimit</code>, for which you want values.
     *            </p>
     *            <p>
     *            For all attribute names, see <a href=
     *            "http://docs.aws.amazon.com/sns/latest/api/API_SetSMSAttributes.html"
     *            >SetSMSAttributes</a>.
     *            </p>
     *            <p>
     *            If you don't use this parameter, Amazon SNS returns all SMS
     *            attributes.
     *            </p>
     */
    public void setAttributes(java.util.Collection<String> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<String>(attributes);
    }

    /**
     * <p>
     * A list of the individual attribute names, such as
     * <code>MonthlySpendLimit</code>, for which you want values.
     * </p>
     * <p>
     * For all attribute names, see <a href=
     * "http://docs.aws.amazon.com/sns/latest/api/API_SetSMSAttributes.html"
     * >SetSMSAttributes</a>.
     * </p>
     * <p>
     * If you don't use this parameter, Amazon SNS returns all SMS attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            A list of the individual attribute names, such as
     *            <code>MonthlySpendLimit</code>, for which you want values.
     *            </p>
     *            <p>
     *            For all attribute names, see <a href=
     *            "http://docs.aws.amazon.com/sns/latest/api/API_SetSMSAttributes.html"
     *            >SetSMSAttributes</a>.
     *            </p>
     *            <p>
     *            If you don't use this parameter, Amazon SNS returns all SMS
     *            attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSMSAttributesRequest withAttributes(String... attributes) {
        if (getAttributes() == null) {
            this.attributes = new java.util.ArrayList<String>(attributes.length);
        }
        for (String value : attributes) {
            this.attributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the individual attribute names, such as
     * <code>MonthlySpendLimit</code>, for which you want values.
     * </p>
     * <p>
     * For all attribute names, see <a href=
     * "http://docs.aws.amazon.com/sns/latest/api/API_SetSMSAttributes.html"
     * >SetSMSAttributes</a>.
     * </p>
     * <p>
     * If you don't use this parameter, Amazon SNS returns all SMS attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            A list of the individual attribute names, such as
     *            <code>MonthlySpendLimit</code>, for which you want values.
     *            </p>
     *            <p>
     *            For all attribute names, see <a href=
     *            "http://docs.aws.amazon.com/sns/latest/api/API_SetSMSAttributes.html"
     *            >SetSMSAttributes</a>.
     *            </p>
     *            <p>
     *            If you don't use this parameter, Amazon SNS returns all SMS
     *            attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSMSAttributesRequest withAttributes(java.util.Collection<String> attributes) {
        setAttributes(attributes);
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
        if (getAttributes() != null)
            sb.append("attributes: " + getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSMSAttributesRequest == false)
            return false;
        GetSMSAttributesRequest other = (GetSMSAttributesRequest) obj;

        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }
}
