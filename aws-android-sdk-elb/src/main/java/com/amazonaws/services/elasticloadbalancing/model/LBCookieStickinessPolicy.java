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
 * Information about a policy for duration-based session stickiness.
 * </p>
 */
public class LBCookieStickinessPolicy implements Serializable {
    /**
     * <p>
     * The name of the policy. This name must be unique within the set of
     * policies for this load balancer.
     * </p>
     */
    private String policyName;

    /**
     * <p>
     * The time period, in seconds, after which the cookie should be considered
     * stale. If this parameter is not specified, the stickiness session lasts
     * for the duration of the browser session.
     * </p>
     */
    private Long cookieExpirationPeriod;

    /**
     * Default constructor for LBCookieStickinessPolicy object. Callers should
     * use the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     */
    public LBCookieStickinessPolicy() {
    }

    /**
     * Constructs a new LBCookieStickinessPolicy object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param policyName <p>
     *            The name of the policy. This name must be unique within the
     *            set of policies for this load balancer.
     *            </p>
     * @param cookieExpirationPeriod <p>
     *            The time period, in seconds, after which the cookie should be
     *            considered stale. If this parameter is not specified, the
     *            stickiness session lasts for the duration of the browser
     *            session.
     *            </p>
     */
    public LBCookieStickinessPolicy(String policyName, Long cookieExpirationPeriod) {
        setPolicyName(policyName);
        setCookieExpirationPeriod(cookieExpirationPeriod);
    }

    /**
     * <p>
     * The name of the policy. This name must be unique within the set of
     * policies for this load balancer.
     * </p>
     *
     * @return <p>
     *         The name of the policy. This name must be unique within the set
     *         of policies for this load balancer.
     *         </p>
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * <p>
     * The name of the policy. This name must be unique within the set of
     * policies for this load balancer.
     * </p>
     *
     * @param policyName <p>
     *            The name of the policy. This name must be unique within the
     *            set of policies for this load balancer.
     *            </p>
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the policy. This name must be unique within the set of
     * policies for this load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyName <p>
     *            The name of the policy. This name must be unique within the
     *            set of policies for this load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LBCookieStickinessPolicy withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * <p>
     * The time period, in seconds, after which the cookie should be considered
     * stale. If this parameter is not specified, the stickiness session lasts
     * for the duration of the browser session.
     * </p>
     *
     * @return <p>
     *         The time period, in seconds, after which the cookie should be
     *         considered stale. If this parameter is not specified, the
     *         stickiness session lasts for the duration of the browser session.
     *         </p>
     */
    public Long getCookieExpirationPeriod() {
        return cookieExpirationPeriod;
    }

    /**
     * <p>
     * The time period, in seconds, after which the cookie should be considered
     * stale. If this parameter is not specified, the stickiness session lasts
     * for the duration of the browser session.
     * </p>
     *
     * @param cookieExpirationPeriod <p>
     *            The time period, in seconds, after which the cookie should be
     *            considered stale. If this parameter is not specified, the
     *            stickiness session lasts for the duration of the browser
     *            session.
     *            </p>
     */
    public void setCookieExpirationPeriod(Long cookieExpirationPeriod) {
        this.cookieExpirationPeriod = cookieExpirationPeriod;
    }

    /**
     * <p>
     * The time period, in seconds, after which the cookie should be considered
     * stale. If this parameter is not specified, the stickiness session lasts
     * for the duration of the browser session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cookieExpirationPeriod <p>
     *            The time period, in seconds, after which the cookie should be
     *            considered stale. If this parameter is not specified, the
     *            stickiness session lasts for the duration of the browser
     *            session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LBCookieStickinessPolicy withCookieExpirationPeriod(Long cookieExpirationPeriod) {
        this.cookieExpirationPeriod = cookieExpirationPeriod;
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
        if (getPolicyName() != null)
            sb.append("PolicyName: " + getPolicyName() + ",");
        if (getCookieExpirationPeriod() != null)
            sb.append("CookieExpirationPeriod: " + getCookieExpirationPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime
                * hashCode
                + ((getCookieExpirationPeriod() == null) ? 0 : getCookieExpirationPeriod()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LBCookieStickinessPolicy == false)
            return false;
        LBCookieStickinessPolicy other = (LBCookieStickinessPolicy) obj;

        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null
                && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getCookieExpirationPeriod() == null ^ this.getCookieExpirationPeriod() == null)
            return false;
        if (other.getCookieExpirationPeriod() != null
                && other.getCookieExpirationPeriod().equals(this.getCookieExpirationPeriod()) == false)
            return false;
        return true;
    }
}
