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

package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

/**
 * <p>
 * The policies for a load balancer.
 * </p>
 */
public class Policies implements Serializable {
    /**
     * <p>
     * The stickiness policies created using
     * <a>CreateAppCookieStickinessPolicy</a>.
     * </p>
     */
    private java.util.List<AppCookieStickinessPolicy> appCookieStickinessPolicies = new java.util.ArrayList<AppCookieStickinessPolicy>();

    /**
     * <p>
     * The stickiness policies created using
     * <a>CreateLBCookieStickinessPolicy</a>.
     * </p>
     */
    private java.util.List<LBCookieStickinessPolicy> lBCookieStickinessPolicies = new java.util.ArrayList<LBCookieStickinessPolicy>();

    /**
     * <p>
     * The policies other than the stickiness policies.
     * </p>
     */
    private java.util.List<String> otherPolicies = new java.util.ArrayList<String>();

    /**
     * <p>
     * The stickiness policies created using
     * <a>CreateAppCookieStickinessPolicy</a>.
     * </p>
     *
     * @return <p>
     *         The stickiness policies created using
     *         <a>CreateAppCookieStickinessPolicy</a>.
     *         </p>
     */
    public java.util.List<AppCookieStickinessPolicy> getAppCookieStickinessPolicies() {
        return appCookieStickinessPolicies;
    }

    /**
     * <p>
     * The stickiness policies created using
     * <a>CreateAppCookieStickinessPolicy</a>.
     * </p>
     *
     * @param appCookieStickinessPolicies <p>
     *            The stickiness policies created using
     *            <a>CreateAppCookieStickinessPolicy</a>.
     *            </p>
     */
    public void setAppCookieStickinessPolicies(
            java.util.Collection<AppCookieStickinessPolicy> appCookieStickinessPolicies) {
        if (appCookieStickinessPolicies == null) {
            this.appCookieStickinessPolicies = null;
            return;
        }

        this.appCookieStickinessPolicies = new java.util.ArrayList<AppCookieStickinessPolicy>(
                appCookieStickinessPolicies);
    }

    /**
     * <p>
     * The stickiness policies created using
     * <a>CreateAppCookieStickinessPolicy</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param appCookieStickinessPolicies <p>
     *            The stickiness policies created using
     *            <a>CreateAppCookieStickinessPolicy</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Policies withAppCookieStickinessPolicies(
            AppCookieStickinessPolicy... appCookieStickinessPolicies) {
        if (getAppCookieStickinessPolicies() == null) {
            this.appCookieStickinessPolicies = new java.util.ArrayList<AppCookieStickinessPolicy>(
                    appCookieStickinessPolicies.length);
        }
        for (AppCookieStickinessPolicy value : appCookieStickinessPolicies) {
            this.appCookieStickinessPolicies.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The stickiness policies created using
     * <a>CreateAppCookieStickinessPolicy</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param appCookieStickinessPolicies <p>
     *            The stickiness policies created using
     *            <a>CreateAppCookieStickinessPolicy</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Policies withAppCookieStickinessPolicies(
            java.util.Collection<AppCookieStickinessPolicy> appCookieStickinessPolicies) {
        setAppCookieStickinessPolicies(appCookieStickinessPolicies);
        return this;
    }

    /**
     * <p>
     * The stickiness policies created using
     * <a>CreateLBCookieStickinessPolicy</a>.
     * </p>
     *
     * @return <p>
     *         The stickiness policies created using
     *         <a>CreateLBCookieStickinessPolicy</a>.
     *         </p>
     */
    public java.util.List<LBCookieStickinessPolicy> getLBCookieStickinessPolicies() {
        return lBCookieStickinessPolicies;
    }

    /**
     * <p>
     * The stickiness policies created using
     * <a>CreateLBCookieStickinessPolicy</a>.
     * </p>
     *
     * @param lBCookieStickinessPolicies <p>
     *            The stickiness policies created using
     *            <a>CreateLBCookieStickinessPolicy</a>.
     *            </p>
     */
    public void setLBCookieStickinessPolicies(
            java.util.Collection<LBCookieStickinessPolicy> lBCookieStickinessPolicies) {
        if (lBCookieStickinessPolicies == null) {
            this.lBCookieStickinessPolicies = null;
            return;
        }

        this.lBCookieStickinessPolicies = new java.util.ArrayList<LBCookieStickinessPolicy>(
                lBCookieStickinessPolicies);
    }

    /**
     * <p>
     * The stickiness policies created using
     * <a>CreateLBCookieStickinessPolicy</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lBCookieStickinessPolicies <p>
     *            The stickiness policies created using
     *            <a>CreateLBCookieStickinessPolicy</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Policies withLBCookieStickinessPolicies(
            LBCookieStickinessPolicy... lBCookieStickinessPolicies) {
        if (getLBCookieStickinessPolicies() == null) {
            this.lBCookieStickinessPolicies = new java.util.ArrayList<LBCookieStickinessPolicy>(
                    lBCookieStickinessPolicies.length);
        }
        for (LBCookieStickinessPolicy value : lBCookieStickinessPolicies) {
            this.lBCookieStickinessPolicies.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The stickiness policies created using
     * <a>CreateLBCookieStickinessPolicy</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lBCookieStickinessPolicies <p>
     *            The stickiness policies created using
     *            <a>CreateLBCookieStickinessPolicy</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Policies withLBCookieStickinessPolicies(
            java.util.Collection<LBCookieStickinessPolicy> lBCookieStickinessPolicies) {
        setLBCookieStickinessPolicies(lBCookieStickinessPolicies);
        return this;
    }

    /**
     * <p>
     * The policies other than the stickiness policies.
     * </p>
     *
     * @return <p>
     *         The policies other than the stickiness policies.
     *         </p>
     */
    public java.util.List<String> getOtherPolicies() {
        return otherPolicies;
    }

    /**
     * <p>
     * The policies other than the stickiness policies.
     * </p>
     *
     * @param otherPolicies <p>
     *            The policies other than the stickiness policies.
     *            </p>
     */
    public void setOtherPolicies(java.util.Collection<String> otherPolicies) {
        if (otherPolicies == null) {
            this.otherPolicies = null;
            return;
        }

        this.otherPolicies = new java.util.ArrayList<String>(otherPolicies);
    }

    /**
     * <p>
     * The policies other than the stickiness policies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param otherPolicies <p>
     *            The policies other than the stickiness policies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Policies withOtherPolicies(String... otherPolicies) {
        if (getOtherPolicies() == null) {
            this.otherPolicies = new java.util.ArrayList<String>(otherPolicies.length);
        }
        for (String value : otherPolicies) {
            this.otherPolicies.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The policies other than the stickiness policies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param otherPolicies <p>
     *            The policies other than the stickiness policies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Policies withOtherPolicies(java.util.Collection<String> otherPolicies) {
        setOtherPolicies(otherPolicies);
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
        if (getAppCookieStickinessPolicies() != null)
            sb.append("AppCookieStickinessPolicies: " + getAppCookieStickinessPolicies() + ",");
        if (getLBCookieStickinessPolicies() != null)
            sb.append("LBCookieStickinessPolicies: " + getLBCookieStickinessPolicies() + ",");
        if (getOtherPolicies() != null)
            sb.append("OtherPolicies: " + getOtherPolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAppCookieStickinessPolicies() == null) ? 0
                        : getAppCookieStickinessPolicies().hashCode());
        hashCode = prime
                * hashCode
                + ((getLBCookieStickinessPolicies() == null) ? 0 : getLBCookieStickinessPolicies()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getOtherPolicies() == null) ? 0 : getOtherPolicies().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Policies == false)
            return false;
        Policies other = (Policies) obj;

        if (other.getAppCookieStickinessPolicies() == null
                ^ this.getAppCookieStickinessPolicies() == null)
            return false;
        if (other.getAppCookieStickinessPolicies() != null
                && other.getAppCookieStickinessPolicies().equals(
                        this.getAppCookieStickinessPolicies()) == false)
            return false;
        if (other.getLBCookieStickinessPolicies() == null
                ^ this.getLBCookieStickinessPolicies() == null)
            return false;
        if (other.getLBCookieStickinessPolicies() != null
                && other.getLBCookieStickinessPolicies().equals(
                        this.getLBCookieStickinessPolicies()) == false)
            return false;
        if (other.getOtherPolicies() == null ^ this.getOtherPolicies() == null)
            return false;
        if (other.getOtherPolicies() != null
                && other.getOtherPolicies().equals(this.getOtherPolicies()) == false)
            return false;
        return true;
    }
}
