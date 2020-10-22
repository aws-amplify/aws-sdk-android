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

package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

/**
 * <p>
 * Information about additional load balancer attributes.
 * </p>
 */
public class AdditionalAttribute implements Serializable {
    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * The following attribute is supported.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elb.http.desyncmitigationmode</code> - Determines how the load
     * balancer handles requests that might pose a security risk to your
     * application. The possible values are <code>monitor</code>,
     * <code>defensive</code>, and <code>strictest</code>. The default is
     * <code>defensive</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9.]+$<br/>
     */
    private String key;

    /**
     * <p>
     * This value of the attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9.]+$<br/>
     */
    private String value;

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * The following attribute is supported.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elb.http.desyncmitigationmode</code> - Determines how the load
     * balancer handles requests that might pose a security risk to your
     * application. The possible values are <code>monitor</code>,
     * <code>defensive</code>, and <code>strictest</code>. The default is
     * <code>defensive</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9.]+$<br/>
     *
     * @return <p>
     *         The name of the attribute.
     *         </p>
     *         <p>
     *         The following attribute is supported.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>elb.http.desyncmitigationmode</code> - Determines how the
     *         load balancer handles requests that might pose a security risk to
     *         your application. The possible values are <code>monitor</code>,
     *         <code>defensive</code>, and <code>strictest</code>. The default
     *         is <code>defensive</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * The following attribute is supported.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elb.http.desyncmitigationmode</code> - Determines how the load
     * balancer handles requests that might pose a security risk to your
     * application. The possible values are <code>monitor</code>,
     * <code>defensive</code>, and <code>strictest</code>. The default is
     * <code>defensive</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9.]+$<br/>
     *
     * @param key <p>
     *            The name of the attribute.
     *            </p>
     *            <p>
     *            The following attribute is supported.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>elb.http.desyncmitigationmode</code> - Determines how
     *            the load balancer handles requests that might pose a security
     *            risk to your application. The possible values are
     *            <code>monitor</code>, <code>defensive</code>, and
     *            <code>strictest</code>. The default is <code>defensive</code>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * The following attribute is supported.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elb.http.desyncmitigationmode</code> - Determines how the load
     * balancer handles requests that might pose a security risk to your
     * application. The possible values are <code>monitor</code>,
     * <code>defensive</code>, and <code>strictest</code>. The default is
     * <code>defensive</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9.]+$<br/>
     *
     * @param key <p>
     *            The name of the attribute.
     *            </p>
     *            <p>
     *            The following attribute is supported.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>elb.http.desyncmitigationmode</code> - Determines how
     *            the load balancer handles requests that might pose a security
     *            risk to your application. The possible values are
     *            <code>monitor</code>, <code>defensive</code>, and
     *            <code>strictest</code>. The default is <code>defensive</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdditionalAttribute withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * This value of the attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9.]+$<br/>
     *
     * @return <p>
     *         This value of the attribute.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * This value of the attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9.]+$<br/>
     *
     * @param value <p>
     *            This value of the attribute.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * This value of the attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9.]+$<br/>
     *
     * @param value <p>
     *            This value of the attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdditionalAttribute withValue(String value) {
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
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdditionalAttribute == false)
            return false;
        AdditionalAttribute other = (AdditionalAttribute) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
