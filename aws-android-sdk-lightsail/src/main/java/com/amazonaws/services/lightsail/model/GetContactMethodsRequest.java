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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns information about the configured contact methods. Specify a protocol
 * in your request to return information about a specific contact method.
 * </p>
 * <p>
 * A contact method is used to send you notifications about your Amazon
 * Lightsail resources. You can add one email address and one mobile phone
 * number contact method in each AWS Region. However, SMS text messaging is not
 * supported in some AWS Regions, and SMS text messages cannot be sent to some
 * countries/regions. For more information, see <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications"
 * >Notifications in Amazon Lightsail</a>.
 * </p>
 */
public class GetContactMethodsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The protocols used to send notifications, such as <code>Email</code>, or
     * <code>SMS</code> (text messaging).
     * </p>
     * <p>
     * Specify a protocol in your request to return information about a specific
     * contact method protocol.
     * </p>
     */
    private java.util.List<String> protocols;

    /**
     * <p>
     * The protocols used to send notifications, such as <code>Email</code>, or
     * <code>SMS</code> (text messaging).
     * </p>
     * <p>
     * Specify a protocol in your request to return information about a specific
     * contact method protocol.
     * </p>
     *
     * @return <p>
     *         The protocols used to send notifications, such as
     *         <code>Email</code>, or <code>SMS</code> (text messaging).
     *         </p>
     *         <p>
     *         Specify a protocol in your request to return information about a
     *         specific contact method protocol.
     *         </p>
     */
    public java.util.List<String> getProtocols() {
        return protocols;
    }

    /**
     * <p>
     * The protocols used to send notifications, such as <code>Email</code>, or
     * <code>SMS</code> (text messaging).
     * </p>
     * <p>
     * Specify a protocol in your request to return information about a specific
     * contact method protocol.
     * </p>
     *
     * @param protocols <p>
     *            The protocols used to send notifications, such as
     *            <code>Email</code>, or <code>SMS</code> (text messaging).
     *            </p>
     *            <p>
     *            Specify a protocol in your request to return information about
     *            a specific contact method protocol.
     *            </p>
     */
    public void setProtocols(java.util.Collection<String> protocols) {
        if (protocols == null) {
            this.protocols = null;
            return;
        }

        this.protocols = new java.util.ArrayList<String>(protocols);
    }

    /**
     * <p>
     * The protocols used to send notifications, such as <code>Email</code>, or
     * <code>SMS</code> (text messaging).
     * </p>
     * <p>
     * Specify a protocol in your request to return information about a specific
     * contact method protocol.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param protocols <p>
     *            The protocols used to send notifications, such as
     *            <code>Email</code>, or <code>SMS</code> (text messaging).
     *            </p>
     *            <p>
     *            Specify a protocol in your request to return information about
     *            a specific contact method protocol.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetContactMethodsRequest withProtocols(String... protocols) {
        if (getProtocols() == null) {
            this.protocols = new java.util.ArrayList<String>(protocols.length);
        }
        for (String value : protocols) {
            this.protocols.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The protocols used to send notifications, such as <code>Email</code>, or
     * <code>SMS</code> (text messaging).
     * </p>
     * <p>
     * Specify a protocol in your request to return information about a specific
     * contact method protocol.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param protocols <p>
     *            The protocols used to send notifications, such as
     *            <code>Email</code>, or <code>SMS</code> (text messaging).
     *            </p>
     *            <p>
     *            Specify a protocol in your request to return information about
     *            a specific contact method protocol.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetContactMethodsRequest withProtocols(java.util.Collection<String> protocols) {
        setProtocols(protocols);
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
        if (getProtocols() != null)
            sb.append("protocols: " + getProtocols());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtocols() == null) ? 0 : getProtocols().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetContactMethodsRequest == false)
            return false;
        GetContactMethodsRequest other = (GetContactMethodsRequest) obj;

        if (other.getProtocols() == null ^ this.getProtocols() == null)
            return false;
        if (other.getProtocols() != null
                && other.getProtocols().equals(this.getProtocols()) == false)
            return false;
        return true;
    }
}
