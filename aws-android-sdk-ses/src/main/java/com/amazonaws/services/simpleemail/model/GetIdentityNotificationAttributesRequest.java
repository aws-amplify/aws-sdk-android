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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Given a list of verified identities (email addresses and/or domains), returns
 * a structure describing identity notification attributes.
 * </p>
 * <p>
 * This operation is throttled at one request per second and can only get
 * notification attributes for up to 100 identities at a time.
 * </p>
 * <p>
 * For more information about using notifications with Amazon SES, see the <a
 * href
 * ="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 */
public class GetIdentityNotificationAttributesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A list of one or more identities. You can specify an identity by using
     * its name or by using its Amazon Resource Name (ARN). Examples:
     * <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     */
    private java.util.List<String> identities = new java.util.ArrayList<String>();

    /**
     * <p>
     * A list of one or more identities. You can specify an identity by using
     * its name or by using its Amazon Resource Name (ARN). Examples:
     * <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     *
     * @return <p>
     *         A list of one or more identities. You can specify an identity by
     *         using its name or by using its Amazon Resource Name (ARN).
     *         Examples: <code>user@example.com</code>, <code>example.com</code>,
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *         .
     *         </p>
     */
    public java.util.List<String> getIdentities() {
        return identities;
    }

    /**
     * <p>
     * A list of one or more identities. You can specify an identity by using
     * its name or by using its Amazon Resource Name (ARN). Examples:
     * <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     *
     * @param identities <p>
     *            A list of one or more identities. You can specify an identity
     *            by using its name or by using its Amazon Resource Name (ARN).
     *            Examples: <code>user@example.com</code>,
     *            <code>example.com</code>,
     *            <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *            .
     *            </p>
     */
    public void setIdentities(java.util.Collection<String> identities) {
        if (identities == null) {
            this.identities = null;
            return;
        }

        this.identities = new java.util.ArrayList<String>(identities);
    }

    /**
     * <p>
     * A list of one or more identities. You can specify an identity by using
     * its name or by using its Amazon Resource Name (ARN). Examples:
     * <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identities <p>
     *            A list of one or more identities. You can specify an identity
     *            by using its name or by using its Amazon Resource Name (ARN).
     *            Examples: <code>user@example.com</code>,
     *            <code>example.com</code>,
     *            <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIdentityNotificationAttributesRequest withIdentities(String... identities) {
        if (getIdentities() == null) {
            this.identities = new java.util.ArrayList<String>(identities.length);
        }
        for (String value : identities) {
            this.identities.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of one or more identities. You can specify an identity by using
     * its name or by using its Amazon Resource Name (ARN). Examples:
     * <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identities <p>
     *            A list of one or more identities. You can specify an identity
     *            by using its name or by using its Amazon Resource Name (ARN).
     *            Examples: <code>user@example.com</code>,
     *            <code>example.com</code>,
     *            <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIdentityNotificationAttributesRequest withIdentities(
            java.util.Collection<String> identities) {
        setIdentities(identities);
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
        if (getIdentities() != null)
            sb.append("Identities: " + getIdentities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentities() == null) ? 0 : getIdentities().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIdentityNotificationAttributesRequest == false)
            return false;
        GetIdentityNotificationAttributesRequest other = (GetIdentityNotificationAttributesRequest) obj;

        if (other.getIdentities() == null ^ this.getIdentities() == null)
            return false;
        if (other.getIdentities() != null
                && other.getIdentities().equals(this.getIdentities()) == false)
            return false;
        return true;
    }
}
