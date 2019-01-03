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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information that denied the authorization.
 * </p>
 */
public class Denied implements Serializable {
    /**
     * <p>
     * Information that implicitly denies the authorization. When a policy
     * doesn't explicitly deny or allow an action on a resource it is considered
     * an implicit deny.
     * </p>
     */
    private ImplicitDeny implicitDeny;

    /**
     * <p>
     * Information that explicitly denies the authorization.
     * </p>
     */
    private ExplicitDeny explicitDeny;

    /**
     * <p>
     * Information that implicitly denies the authorization. When a policy
     * doesn't explicitly deny or allow an action on a resource it is considered
     * an implicit deny.
     * </p>
     *
     * @return <p>
     *         Information that implicitly denies the authorization. When a
     *         policy doesn't explicitly deny or allow an action on a resource
     *         it is considered an implicit deny.
     *         </p>
     */
    public ImplicitDeny getImplicitDeny() {
        return implicitDeny;
    }

    /**
     * <p>
     * Information that implicitly denies the authorization. When a policy
     * doesn't explicitly deny or allow an action on a resource it is considered
     * an implicit deny.
     * </p>
     *
     * @param implicitDeny <p>
     *            Information that implicitly denies the authorization. When a
     *            policy doesn't explicitly deny or allow an action on a
     *            resource it is considered an implicit deny.
     *            </p>
     */
    public void setImplicitDeny(ImplicitDeny implicitDeny) {
        this.implicitDeny = implicitDeny;
    }

    /**
     * <p>
     * Information that implicitly denies the authorization. When a policy
     * doesn't explicitly deny or allow an action on a resource it is considered
     * an implicit deny.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param implicitDeny <p>
     *            Information that implicitly denies the authorization. When a
     *            policy doesn't explicitly deny or allow an action on a
     *            resource it is considered an implicit deny.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Denied withImplicitDeny(ImplicitDeny implicitDeny) {
        this.implicitDeny = implicitDeny;
        return this;
    }

    /**
     * <p>
     * Information that explicitly denies the authorization.
     * </p>
     *
     * @return <p>
     *         Information that explicitly denies the authorization.
     *         </p>
     */
    public ExplicitDeny getExplicitDeny() {
        return explicitDeny;
    }

    /**
     * <p>
     * Information that explicitly denies the authorization.
     * </p>
     *
     * @param explicitDeny <p>
     *            Information that explicitly denies the authorization.
     *            </p>
     */
    public void setExplicitDeny(ExplicitDeny explicitDeny) {
        this.explicitDeny = explicitDeny;
    }

    /**
     * <p>
     * Information that explicitly denies the authorization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param explicitDeny <p>
     *            Information that explicitly denies the authorization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Denied withExplicitDeny(ExplicitDeny explicitDeny) {
        this.explicitDeny = explicitDeny;
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
        if (getImplicitDeny() != null)
            sb.append("implicitDeny: " + getImplicitDeny() + ",");
        if (getExplicitDeny() != null)
            sb.append("explicitDeny: " + getExplicitDeny());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getImplicitDeny() == null) ? 0 : getImplicitDeny().hashCode());
        hashCode = prime * hashCode
                + ((getExplicitDeny() == null) ? 0 : getExplicitDeny().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Denied == false)
            return false;
        Denied other = (Denied) obj;

        if (other.getImplicitDeny() == null ^ this.getImplicitDeny() == null)
            return false;
        if (other.getImplicitDeny() != null
                && other.getImplicitDeny().equals(this.getImplicitDeny()) == false)
            return false;
        if (other.getExplicitDeny() == null ^ this.getExplicitDeny() == null)
            return false;
        if (other.getExplicitDeny() != null
                && other.getExplicitDeny().equals(this.getExplicitDeny()) == false)
            return false;
        return true;
    }
}
