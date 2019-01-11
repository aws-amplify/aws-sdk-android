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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Generates a stickiness policy with sticky session lifetimes that follow that
 * of an application-generated cookie. This policy can be associated only with
 * HTTP/HTTPS listeners.
 * </p>
 * <p>
 * This policy is similar to the policy created by
 * <a>CreateLBCookieStickinessPolicy</a>, except that the lifetime of the
 * special Elastic Load Balancing cookie, <code>AWSELB</code>, follows the
 * lifetime of the application-generated cookie specified in the policy
 * configuration. The load balancer only inserts a new stickiness cookie when
 * the application response includes a new application cookie.
 * </p>
 * <p>
 * If the application cookie is explicitly removed or expires, the session stops
 * being sticky until a new application cookie is issued.
 * </p>
 * <p>
 * For more information, see <a href=
 * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-sticky-sessions.html#enable-sticky-sessions-application"
 * >Application-Controlled Session Stickiness</a> in the <i>Classic Load
 * Balancers Guide</i>.
 * </p>
 */
public class CreateAppCookieStickinessPolicyRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the load balancer.
     * </p>
     */
    private String loadBalancerName;

    /**
     * <p>
     * The name of the policy being created. Policy names must consist of
     * alphanumeric characters and dashes (-). This name must be unique within
     * the set of policies for this load balancer.
     * </p>
     */
    private String policyName;

    /**
     * <p>
     * The name of the application cookie used for stickiness.
     * </p>
     */
    private String cookieName;

    /**
     * Default constructor for CreateAppCookieStickinessPolicyRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     */
    public CreateAppCookieStickinessPolicyRequest() {
    }

    /**
     * Constructs a new CreateAppCookieStickinessPolicyRequest object. Callers
     * should use the setter or fluent setter (with...) methods to initialize
     * any additional object members.
     * 
     * @param loadBalancerName <p>
     *            The name of the load balancer.
     *            </p>
     * @param policyName <p>
     *            The name of the policy being created. Policy names must
     *            consist of alphanumeric characters and dashes (-). This name
     *            must be unique within the set of policies for this load
     *            balancer.
     *            </p>
     * @param cookieName <p>
     *            The name of the application cookie used for stickiness.
     *            </p>
     */
    public CreateAppCookieStickinessPolicyRequest(String loadBalancerName, String policyName,
            String cookieName) {
        setLoadBalancerName(loadBalancerName);
        setPolicyName(policyName);
        setCookieName(cookieName);
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     *
     * @return <p>
     *         The name of the load balancer.
     *         </p>
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     *
     * @param loadBalancerName <p>
     *            The name of the load balancer.
     *            </p>
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancerName <p>
     *            The name of the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAppCookieStickinessPolicyRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * <p>
     * The name of the policy being created. Policy names must consist of
     * alphanumeric characters and dashes (-). This name must be unique within
     * the set of policies for this load balancer.
     * </p>
     *
     * @return <p>
     *         The name of the policy being created. Policy names must consist
     *         of alphanumeric characters and dashes (-). This name must be
     *         unique within the set of policies for this load balancer.
     *         </p>
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * <p>
     * The name of the policy being created. Policy names must consist of
     * alphanumeric characters and dashes (-). This name must be unique within
     * the set of policies for this load balancer.
     * </p>
     *
     * @param policyName <p>
     *            The name of the policy being created. Policy names must
     *            consist of alphanumeric characters and dashes (-). This name
     *            must be unique within the set of policies for this load
     *            balancer.
     *            </p>
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the policy being created. Policy names must consist of
     * alphanumeric characters and dashes (-). This name must be unique within
     * the set of policies for this load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyName <p>
     *            The name of the policy being created. Policy names must
     *            consist of alphanumeric characters and dashes (-). This name
     *            must be unique within the set of policies for this load
     *            balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAppCookieStickinessPolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * <p>
     * The name of the application cookie used for stickiness.
     * </p>
     *
     * @return <p>
     *         The name of the application cookie used for stickiness.
     *         </p>
     */
    public String getCookieName() {
        return cookieName;
    }

    /**
     * <p>
     * The name of the application cookie used for stickiness.
     * </p>
     *
     * @param cookieName <p>
     *            The name of the application cookie used for stickiness.
     *            </p>
     */
    public void setCookieName(String cookieName) {
        this.cookieName = cookieName;
    }

    /**
     * <p>
     * The name of the application cookie used for stickiness.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cookieName <p>
     *            The name of the application cookie used for stickiness.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAppCookieStickinessPolicyRequest withCookieName(String cookieName) {
        this.cookieName = cookieName;
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
        if (getLoadBalancerName() != null)
            sb.append("LoadBalancerName: " + getLoadBalancerName() + ",");
        if (getPolicyName() != null)
            sb.append("PolicyName: " + getPolicyName() + ",");
        if (getCookieName() != null)
            sb.append("CookieName: " + getCookieName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getCookieName() == null) ? 0 : getCookieName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAppCookieStickinessPolicyRequest == false)
            return false;
        CreateAppCookieStickinessPolicyRequest other = (CreateAppCookieStickinessPolicyRequest) obj;

        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null
                && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null
                && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getCookieName() == null ^ this.getCookieName() == null)
            return false;
        if (other.getCookieName() != null
                && other.getCookieName().equals(this.getCookieName()) == false)
            return false;
        return true;
    }
}
