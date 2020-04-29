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

package com.amazonaws.services.awswafregional.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <note>
 * <p>
 * This is <b>AWS WAF Classic Regional</b> documentation. For more information,
 * see <a href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
 * >AWS WAF Classic</a> in the developer guide.
 * </p>
 * <p>
 * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the
 * <a href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS
 * WAF Developer Guide</a>. With the latest version, AWS WAF has a single set of
 * endpoints for regional and global use.
 * </p>
 * </note>
 * <p>
 * Returns an array of resources associated with the specified web ACL.
 * </p>
 */
public class ListResourcesForWebACLRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier (ID) of the web ACL for which to list the
     * associated resources.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String webACLId;

    /**
     * <p>
     * The type of resource to list, either an application load balancer or
     * Amazon API Gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPLICATION_LOAD_BALANCER, API_GATEWAY
     */
    private String resourceType;

    /**
     * <p>
     * The unique identifier (ID) of the web ACL for which to list the
     * associated resources.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The unique identifier (ID) of the web ACL for which to list the
     *         associated resources.
     *         </p>
     */
    public String getWebACLId() {
        return webACLId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the web ACL for which to list the
     * associated resources.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param webACLId <p>
     *            The unique identifier (ID) of the web ACL for which to list
     *            the associated resources.
     *            </p>
     */
    public void setWebACLId(String webACLId) {
        this.webACLId = webACLId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the web ACL for which to list the
     * associated resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param webACLId <p>
     *            The unique identifier (ID) of the web ACL for which to list
     *            the associated resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourcesForWebACLRequest withWebACLId(String webACLId) {
        this.webACLId = webACLId;
        return this;
    }

    /**
     * <p>
     * The type of resource to list, either an application load balancer or
     * Amazon API Gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPLICATION_LOAD_BALANCER, API_GATEWAY
     *
     * @return <p>
     *         The type of resource to list, either an application load balancer
     *         or Amazon API Gateway.
     *         </p>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of resource to list, either an application load balancer or
     * Amazon API Gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPLICATION_LOAD_BALANCER, API_GATEWAY
     *
     * @param resourceType <p>
     *            The type of resource to list, either an application load
     *            balancer or Amazon API Gateway.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource to list, either an application load balancer or
     * Amazon API Gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPLICATION_LOAD_BALANCER, API_GATEWAY
     *
     * @param resourceType <p>
     *            The type of resource to list, either an application load
     *            balancer or Amazon API Gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public ListResourcesForWebACLRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The type of resource to list, either an application load balancer or
     * Amazon API Gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPLICATION_LOAD_BALANCER, API_GATEWAY
     *
     * @param resourceType <p>
     *            The type of resource to list, either an application load
     *            balancer or Amazon API Gateway.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The type of resource to list, either an application load balancer or
     * Amazon API Gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPLICATION_LOAD_BALANCER, API_GATEWAY
     *
     * @param resourceType <p>
     *            The type of resource to list, either an application load
     *            balancer or Amazon API Gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public ListResourcesForWebACLRequest withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
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
        if (getWebACLId() != null)
            sb.append("WebACLId: " + getWebACLId() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebACLId() == null) ? 0 : getWebACLId().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResourcesForWebACLRequest == false)
            return false;
        ListResourcesForWebACLRequest other = (ListResourcesForWebACLRequest) obj;

        if (other.getWebACLId() == null ^ this.getWebACLId() == null)
            return false;
        if (other.getWebACLId() != null && other.getWebACLId().equals(this.getWebACLId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }
}
