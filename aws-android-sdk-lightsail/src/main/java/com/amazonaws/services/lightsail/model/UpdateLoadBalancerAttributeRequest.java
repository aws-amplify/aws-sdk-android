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
 * Updates the specified attribute for a load balancer. You can only update one
 * attribute at a time.
 * </p>
 * <p>
 * The <code>update load balancer attribute</code> operation supports tag-based
 * access control via resource tags applied to the resource identified by
 * <code>load balancer name</code>. For more information, see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class UpdateLoadBalancerAttributeRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the load balancer that you want to modify (e.g.,
     * <code>my-load-balancer</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String loadBalancerName;

    /**
     * <p>
     * The name of the attribute you want to update. Valid values are below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HealthCheckPath, SessionStickinessEnabled,
     * SessionStickiness_LB_CookieDurationSeconds
     */
    private String attributeName;

    /**
     * <p>
     * The value that you want to specify for the attribute name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String attributeValue;

    /**
     * <p>
     * The name of the load balancer that you want to modify (e.g.,
     * <code>my-load-balancer</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the load balancer that you want to modify (e.g.,
     *         <code>my-load-balancer</code>.
     *         </p>
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer that you want to modify (e.g.,
     * <code>my-load-balancer</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param loadBalancerName <p>
     *            The name of the load balancer that you want to modify (e.g.,
     *            <code>my-load-balancer</code>.
     *            </p>
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer that you want to modify (e.g.,
     * <code>my-load-balancer</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param loadBalancerName <p>
     *            The name of the load balancer that you want to modify (e.g.,
     *            <code>my-load-balancer</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateLoadBalancerAttributeRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * <p>
     * The name of the attribute you want to update. Valid values are below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HealthCheckPath, SessionStickinessEnabled,
     * SessionStickiness_LB_CookieDurationSeconds
     *
     * @return <p>
     *         The name of the attribute you want to update. Valid values are
     *         below.
     *         </p>
     * @see LoadBalancerAttributeName
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * <p>
     * The name of the attribute you want to update. Valid values are below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HealthCheckPath, SessionStickinessEnabled,
     * SessionStickiness_LB_CookieDurationSeconds
     *
     * @param attributeName <p>
     *            The name of the attribute you want to update. Valid values are
     *            below.
     *            </p>
     * @see LoadBalancerAttributeName
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of the attribute you want to update. Valid values are below.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HealthCheckPath, SessionStickinessEnabled,
     * SessionStickiness_LB_CookieDurationSeconds
     *
     * @param attributeName <p>
     *            The name of the attribute you want to update. Valid values are
     *            below.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoadBalancerAttributeName
     */
    public UpdateLoadBalancerAttributeRequest withAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * <p>
     * The name of the attribute you want to update. Valid values are below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HealthCheckPath, SessionStickinessEnabled,
     * SessionStickiness_LB_CookieDurationSeconds
     *
     * @param attributeName <p>
     *            The name of the attribute you want to update. Valid values are
     *            below.
     *            </p>
     * @see LoadBalancerAttributeName
     */
    public void setAttributeName(LoadBalancerAttributeName attributeName) {
        this.attributeName = attributeName.toString();
    }

    /**
     * <p>
     * The name of the attribute you want to update. Valid values are below.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HealthCheckPath, SessionStickinessEnabled,
     * SessionStickiness_LB_CookieDurationSeconds
     *
     * @param attributeName <p>
     *            The name of the attribute you want to update. Valid values are
     *            below.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoadBalancerAttributeName
     */
    public UpdateLoadBalancerAttributeRequest withAttributeName(
            LoadBalancerAttributeName attributeName) {
        this.attributeName = attributeName.toString();
        return this;
    }

    /**
     * <p>
     * The value that you want to specify for the attribute name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The value that you want to specify for the attribute name.
     *         </p>
     */
    public String getAttributeValue() {
        return attributeValue;
    }

    /**
     * <p>
     * The value that you want to specify for the attribute name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param attributeValue <p>
     *            The value that you want to specify for the attribute name.
     *            </p>
     */
    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    /**
     * <p>
     * The value that you want to specify for the attribute name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param attributeValue <p>
     *            The value that you want to specify for the attribute name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateLoadBalancerAttributeRequest withAttributeValue(String attributeValue) {
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
        if (getLoadBalancerName() != null)
            sb.append("loadBalancerName: " + getLoadBalancerName() + ",");
        if (getAttributeName() != null)
            sb.append("attributeName: " + getAttributeName() + ",");
        if (getAttributeValue() != null)
            sb.append("attributeValue: " + getAttributeValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
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

        if (obj instanceof UpdateLoadBalancerAttributeRequest == false)
            return false;
        UpdateLoadBalancerAttributeRequest other = (UpdateLoadBalancerAttributeRequest) obj;

        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null
                && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
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
