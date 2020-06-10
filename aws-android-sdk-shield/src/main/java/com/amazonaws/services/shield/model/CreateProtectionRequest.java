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

package com.amazonaws.services.shield.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Enables AWS Shield Advanced for a specific AWS resource. The resource can be
 * an Amazon CloudFront distribution, Elastic Load Balancing load balancer, AWS
 * Global Accelerator accelerator, Elastic IP Address, or an Amazon Route 53
 * hosted zone.
 * </p>
 * <p>
 * You can add protection to only a single resource with each CreateProtection
 * request. If you want to add protection to multiple resources at once, use the
 * <a href="https://console.aws.amazon.com/waf/">AWS WAF console</a>. For more
 * information see <a href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/getting-started-ddos.html"
 * >Getting Started with AWS Shield Advanced</a> and <a href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/configure-new-protection.html"
 * >Add AWS Shield Advanced Protection to more AWS Resources</a>.
 * </p>
 */
public class CreateProtectionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Friendly name for the <code>Protection</code> you are creating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[ a-zA-Z0-9_\\.\\-]*<br/>
     */
    private String name;

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource to be protected.
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
     * For an Elastic Load Balancer (Classic Load Balancer):
     * <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/<i>load-balancer-name</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an AWS CloudFront distribution:
     * <code>arn:aws:cloudfront::<i>account-id</i>:distribution/<i>distribution-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an AWS Global Accelerator accelerator:
     * <code>arn:aws:globalaccelerator::<i>account-id</i>:accelerator/<i>accelerator-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon Route 53:
     * <code>arn:aws:route53:::hostedzone/<i>hosted-zone-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an Elastic IP address:
     * <code>arn:aws:ec2:<i>region</i>:<i>account-id</i>:eip-allocation/<i>allocation-id</i> </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^arn:aws.*<br/>
     */
    private String resourceArn;

    /**
     * <p>
     * Friendly name for the <code>Protection</code> you are creating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[ a-zA-Z0-9_\\.\\-]*<br/>
     *
     * @return <p>
     *         Friendly name for the <code>Protection</code> you are creating.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Friendly name for the <code>Protection</code> you are creating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[ a-zA-Z0-9_\\.\\-]*<br/>
     *
     * @param name <p>
     *            Friendly name for the <code>Protection</code> you are
     *            creating.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Friendly name for the <code>Protection</code> you are creating.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[ a-zA-Z0-9_\\.\\-]*<br/>
     *
     * @param name <p>
     *            Friendly name for the <code>Protection</code> you are
     *            creating.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProtectionRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource to be protected.
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
     * For an Elastic Load Balancer (Classic Load Balancer):
     * <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/<i>load-balancer-name</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an AWS CloudFront distribution:
     * <code>arn:aws:cloudfront::<i>account-id</i>:distribution/<i>distribution-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an AWS Global Accelerator accelerator:
     * <code>arn:aws:globalaccelerator::<i>account-id</i>:accelerator/<i>accelerator-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon Route 53:
     * <code>arn:aws:route53:::hostedzone/<i>hosted-zone-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an Elastic IP address:
     * <code>arn:aws:ec2:<i>region</i>:<i>account-id</i>:eip-allocation/<i>allocation-id</i> </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^arn:aws.*<br/>
     *
     * @return <p>
     *         The ARN (Amazon Resource Name) of the resource to be protected.
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
     *         For an Elastic Load Balancer (Classic Load Balancer):
     *         <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/<i>load-balancer-name</i> </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For an AWS CloudFront distribution:
     *         <code>arn:aws:cloudfront::<i>account-id</i>:distribution/<i>distribution-id</i> </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For an AWS Global Accelerator accelerator:
     *         <code>arn:aws:globalaccelerator::<i>account-id</i>:accelerator/<i>accelerator-id</i> </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For Amazon Route 53:
     *         <code>arn:aws:route53:::hostedzone/<i>hosted-zone-id</i> </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For an Elastic IP address:
     *         <code>arn:aws:ec2:<i>region</i>:<i>account-id</i>:eip-allocation/<i>allocation-id</i> </code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource to be protected.
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
     * For an Elastic Load Balancer (Classic Load Balancer):
     * <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/<i>load-balancer-name</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an AWS CloudFront distribution:
     * <code>arn:aws:cloudfront::<i>account-id</i>:distribution/<i>distribution-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an AWS Global Accelerator accelerator:
     * <code>arn:aws:globalaccelerator::<i>account-id</i>:accelerator/<i>accelerator-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon Route 53:
     * <code>arn:aws:route53:::hostedzone/<i>hosted-zone-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an Elastic IP address:
     * <code>arn:aws:ec2:<i>region</i>:<i>account-id</i>:eip-allocation/<i>allocation-id</i> </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^arn:aws.*<br/>
     *
     * @param resourceArn <p>
     *            The ARN (Amazon Resource Name) of the resource to be
     *            protected.
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
     *            For an Elastic Load Balancer (Classic Load Balancer):
     *            <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/<i>load-balancer-name</i> </code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For an AWS CloudFront distribution:
     *            <code>arn:aws:cloudfront::<i>account-id</i>:distribution/<i>distribution-id</i> </code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For an AWS Global Accelerator accelerator:
     *            <code>arn:aws:globalaccelerator::<i>account-id</i>:accelerator/<i>accelerator-id</i> </code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For Amazon Route 53:
     *            <code>arn:aws:route53:::hostedzone/<i>hosted-zone-id</i> </code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For an Elastic IP address:
     *            <code>arn:aws:ec2:<i>region</i>:<i>account-id</i>:eip-allocation/<i>allocation-id</i> </code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource to be protected.
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
     * For an Elastic Load Balancer (Classic Load Balancer):
     * <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/<i>load-balancer-name</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an AWS CloudFront distribution:
     * <code>arn:aws:cloudfront::<i>account-id</i>:distribution/<i>distribution-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an AWS Global Accelerator accelerator:
     * <code>arn:aws:globalaccelerator::<i>account-id</i>:accelerator/<i>accelerator-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon Route 53:
     * <code>arn:aws:route53:::hostedzone/<i>hosted-zone-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an Elastic IP address:
     * <code>arn:aws:ec2:<i>region</i>:<i>account-id</i>:eip-allocation/<i>allocation-id</i> </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^arn:aws.*<br/>
     *
     * @param resourceArn <p>
     *            The ARN (Amazon Resource Name) of the resource to be
     *            protected.
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
     *            For an Elastic Load Balancer (Classic Load Balancer):
     *            <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/<i>load-balancer-name</i> </code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For an AWS CloudFront distribution:
     *            <code>arn:aws:cloudfront::<i>account-id</i>:distribution/<i>distribution-id</i> </code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For an AWS Global Accelerator accelerator:
     *            <code>arn:aws:globalaccelerator::<i>account-id</i>:accelerator/<i>accelerator-id</i> </code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For Amazon Route 53:
     *            <code>arn:aws:route53:::hostedzone/<i>hosted-zone-id</i> </code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For an Elastic IP address:
     *            <code>arn:aws:ec2:<i>region</i>:<i>account-id</i>:eip-allocation/<i>allocation-id</i> </code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProtectionRequest withResourceArn(String resourceArn) {
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: " + getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
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

        if (obj instanceof CreateProtectionRequest == false)
            return false;
        CreateProtectionRequest other = (CreateProtectionRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }
}
