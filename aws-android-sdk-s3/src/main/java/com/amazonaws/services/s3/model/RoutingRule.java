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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the redirect behavior and when a redirect is applied.
 * </p>
 */
public class RoutingRule implements Serializable {
    /**
     * <p>
     * A container for describing a condition that must be met for the specified
     * redirect to apply. For example, 1. If request is for pages in the
     * <code>/docs</code> folder, redirect to the <code>/documents</code>
     * folder. 2. If request results in HTTP error 4xx, redirect request to
     * another host where you might process the error.
     * </p>
     */
    private Condition condition;

    /**
     * <p>
     * Container for redirect information. You can redirect requests to another
     * host, to another page, or with another protocol. In the event of an
     * error, you can specify a different error code to return.
     * </p>
     */
    private Redirect redirect;

    /**
     * <p>
     * A container for describing a condition that must be met for the specified
     * redirect to apply. For example, 1. If request is for pages in the
     * <code>/docs</code> folder, redirect to the <code>/documents</code>
     * folder. 2. If request results in HTTP error 4xx, redirect request to
     * another host where you might process the error.
     * </p>
     *
     * @return <p>
     *         A container for describing a condition that must be met for the
     *         specified redirect to apply. For example, 1. If request is for
     *         pages in the <code>/docs</code> folder, redirect to the
     *         <code>/documents</code> folder. 2. If request results in HTTP
     *         error 4xx, redirect request to another host where you might
     *         process the error.
     *         </p>
     */
    public Condition getCondition() {
        return condition;
    }

    /**
     * <p>
     * A container for describing a condition that must be met for the specified
     * redirect to apply. For example, 1. If request is for pages in the
     * <code>/docs</code> folder, redirect to the <code>/documents</code>
     * folder. 2. If request results in HTTP error 4xx, redirect request to
     * another host where you might process the error.
     * </p>
     *
     * @param condition <p>
     *            A container for describing a condition that must be met for
     *            the specified redirect to apply. For example, 1. If request is
     *            for pages in the <code>/docs</code> folder, redirect to the
     *            <code>/documents</code> folder. 2. If request results in HTTP
     *            error 4xx, redirect request to another host where you might
     *            process the error.
     *            </p>
     */
    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * A container for describing a condition that must be met for the specified
     * redirect to apply. For example, 1. If request is for pages in the
     * <code>/docs</code> folder, redirect to the <code>/documents</code>
     * folder. 2. If request results in HTTP error 4xx, redirect request to
     * another host where you might process the error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param condition <p>
     *            A container for describing a condition that must be met for
     *            the specified redirect to apply. For example, 1. If request is
     *            for pages in the <code>/docs</code> folder, redirect to the
     *            <code>/documents</code> folder. 2. If request results in HTTP
     *            error 4xx, redirect request to another host where you might
     *            process the error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RoutingRule withCondition(Condition condition) {
        this.condition = condition;
        return this;
    }

    /**
     * <p>
     * Container for redirect information. You can redirect requests to another
     * host, to another page, or with another protocol. In the event of an
     * error, you can specify a different error code to return.
     * </p>
     *
     * @return <p>
     *         Container for redirect information. You can redirect requests to
     *         another host, to another page, or with another protocol. In the
     *         event of an error, you can specify a different error code to
     *         return.
     *         </p>
     */
    public Redirect getRedirect() {
        return redirect;
    }

    /**
     * <p>
     * Container for redirect information. You can redirect requests to another
     * host, to another page, or with another protocol. In the event of an
     * error, you can specify a different error code to return.
     * </p>
     *
     * @param redirect <p>
     *            Container for redirect information. You can redirect requests
     *            to another host, to another page, or with another protocol. In
     *            the event of an error, you can specify a different error code
     *            to return.
     *            </p>
     */
    public void setRedirect(Redirect redirect) {
        this.redirect = redirect;
    }

    /**
     * <p>
     * Container for redirect information. You can redirect requests to another
     * host, to another page, or with another protocol. In the event of an
     * error, you can specify a different error code to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param redirect <p>
     *            Container for redirect information. You can redirect requests
     *            to another host, to another page, or with another protocol. In
     *            the event of an error, you can specify a different error code
     *            to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RoutingRule withRedirect(Redirect redirect) {
        this.redirect = redirect;
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
        if (getCondition() != null)
            sb.append("Condition: " + getCondition() + ",");
        if (getRedirect() != null)
            sb.append("Redirect: " + getRedirect());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        hashCode = prime * hashCode + ((getRedirect() == null) ? 0 : getRedirect().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RoutingRule == false)
            return false;
        RoutingRule other = (RoutingRule) obj;

        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null
                && other.getCondition().equals(this.getCondition()) == false)
            return false;
        if (other.getRedirect() == null ^ this.getRedirect() == null)
            return false;
        if (other.getRedirect() != null && other.getRedirect().equals(this.getRedirect()) == false)
            return false;
        return true;
    }
}
