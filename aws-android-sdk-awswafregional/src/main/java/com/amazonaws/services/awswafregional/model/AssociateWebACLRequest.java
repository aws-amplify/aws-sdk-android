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
 * Associates a web ACL with a resource, either an application load balancer or
 * Amazon API Gateway stage.
 * </p>
 */
public class AssociateWebACLRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A unique identifier (ID) for the web ACL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String webACLId;

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource to be protected, either an
     * application load balancer or Amazon API Gateway stage.
     * </p>
     * <p>
     * The ARN should be in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an Application Load Balancer:
     * <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an Amazon API Gateway stage:
     * <code>arn:aws:apigateway:<i>region</i>::/restapis/<i>api-id</i>/stages/<i>stage-name</i> </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String resourceArn;

    /**
     * <p>
     * A unique identifier (ID) for the web ACL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A unique identifier (ID) for the web ACL.
     *         </p>
     */
    public String getWebACLId() {
        return webACLId;
    }

    /**
     * <p>
     * A unique identifier (ID) for the web ACL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param webACLId <p>
     *            A unique identifier (ID) for the web ACL.
     *            </p>
     */
    public void setWebACLId(String webACLId) {
        this.webACLId = webACLId;
    }

    /**
     * <p>
     * A unique identifier (ID) for the web ACL.
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
     *            A unique identifier (ID) for the web ACL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateWebACLRequest withWebACLId(String webACLId) {
        this.webACLId = webACLId;
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource to be protected, either an
     * application load balancer or Amazon API Gateway stage.
     * </p>
     * <p>
     * The ARN should be in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an Application Load Balancer:
     * <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an Amazon API Gateway stage:
     * <code>arn:aws:apigateway:<i>region</i>::/restapis/<i>api-id</i>/stages/<i>stage-name</i> </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ARN (Amazon Resource Name) of the resource to be protected,
     *         either an application load balancer or Amazon API Gateway stage.
     *         </p>
     *         <p>
     *         The ARN should be in one of the following formats:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For an Application Load Balancer:
     *         <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For an Amazon API Gateway stage:
     *         <code>arn:aws:apigateway:<i>region</i>::/restapis/<i>api-id</i>/stages/<i>stage-name</i> </code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource to be protected, either an
     * application load balancer or Amazon API Gateway stage.
     * </p>
     * <p>
     * The ARN should be in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an Application Load Balancer:
     * <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an Amazon API Gateway stage:
     * <code>arn:aws:apigateway:<i>region</i>::/restapis/<i>api-id</i>/stages/<i>stage-name</i> </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param resourceArn <p>
     *            The ARN (Amazon Resource Name) of the resource to be
     *            protected, either an application load balancer or Amazon API
     *            Gateway stage.
     *            </p>
     *            <p>
     *            The ARN should be in one of the following formats:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For an Application Load Balancer:
     *            <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For an Amazon API Gateway stage:
     *            <code>arn:aws:apigateway:<i>region</i>::/restapis/<i>api-id</i>/stages/<i>stage-name</i> </code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource to be protected, either an
     * application load balancer or Amazon API Gateway stage.
     * </p>
     * <p>
     * The ARN should be in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an Application Load Balancer:
     * <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an Amazon API Gateway stage:
     * <code>arn:aws:apigateway:<i>region</i>::/restapis/<i>api-id</i>/stages/<i>stage-name</i> </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param resourceArn <p>
     *            The ARN (Amazon Resource Name) of the resource to be
     *            protected, either an application load balancer or Amazon API
     *            Gateway stage.
     *            </p>
     *            <p>
     *            The ARN should be in one of the following formats:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For an Application Load Balancer:
     *            <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For an Amazon API Gateway stage:
     *            <code>arn:aws:apigateway:<i>region</i>::/restapis/<i>api-id</i>/stages/<i>stage-name</i> </code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateWebACLRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: " + getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebACLId() == null) ? 0 : getWebACLId().hashCode());
        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateWebACLRequest == false)
            return false;
        AssociateWebACLRequest other = (AssociateWebACLRequest) obj;

        if (other.getWebACLId() == null ^ this.getWebACLId() == null)
            return false;
        if (other.getWebACLId() != null && other.getWebACLId().equals(this.getWebACLId()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }
}
