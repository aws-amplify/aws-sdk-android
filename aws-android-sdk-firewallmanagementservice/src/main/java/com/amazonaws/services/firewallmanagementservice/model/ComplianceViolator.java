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

package com.amazonaws.services.firewallmanagementservice.model;

import java.io.Serializable;

/**
 * <p>
 * Details of the resource that is not protected by the policy.
 * </p>
 */
public class ComplianceViolator implements Serializable {
    /**
     * <p>
     * The resource ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     */
    private String resourceId;

    /**
     * <p>
     * The reason that the resource is not protected by the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WEB_ACL_MISSING_RULE_GROUP,
     * RESOURCE_MISSING_WEB_ACL, RESOURCE_INCORRECT_WEB_ACL,
     * RESOURCE_MISSING_SHIELD_PROTECTION,
     * RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION,
     * RESOURCE_MISSING_SECURITY_GROUP, RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP,
     * SECURITY_GROUP_UNUSED, SECURITY_GROUP_REDUNDANT
     */
    private String violationReason;

    /**
     * <p>
     * The resource type. This is in the format shown in the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * >AWS Resource Types Reference</a>. For example:
     * <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> or
     * <code>AWS::CloudFront::Distribution</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     */
    private String resourceType;

    /**
     * <p>
     * The resource ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @return <p>
     *         The resource ID.
     *         </p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * The resource ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param resourceId <p>
     *            The resource ID.
     *            </p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param resourceId <p>
     *            The resource ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComplianceViolator withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * <p>
     * The reason that the resource is not protected by the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WEB_ACL_MISSING_RULE_GROUP,
     * RESOURCE_MISSING_WEB_ACL, RESOURCE_INCORRECT_WEB_ACL,
     * RESOURCE_MISSING_SHIELD_PROTECTION,
     * RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION,
     * RESOURCE_MISSING_SECURITY_GROUP, RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP,
     * SECURITY_GROUP_UNUSED, SECURITY_GROUP_REDUNDANT
     *
     * @return <p>
     *         The reason that the resource is not protected by the policy.
     *         </p>
     * @see ViolationReason
     */
    public String getViolationReason() {
        return violationReason;
    }

    /**
     * <p>
     * The reason that the resource is not protected by the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WEB_ACL_MISSING_RULE_GROUP,
     * RESOURCE_MISSING_WEB_ACL, RESOURCE_INCORRECT_WEB_ACL,
     * RESOURCE_MISSING_SHIELD_PROTECTION,
     * RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION,
     * RESOURCE_MISSING_SECURITY_GROUP, RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP,
     * SECURITY_GROUP_UNUSED, SECURITY_GROUP_REDUNDANT
     *
     * @param violationReason <p>
     *            The reason that the resource is not protected by the policy.
     *            </p>
     * @see ViolationReason
     */
    public void setViolationReason(String violationReason) {
        this.violationReason = violationReason;
    }

    /**
     * <p>
     * The reason that the resource is not protected by the policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WEB_ACL_MISSING_RULE_GROUP,
     * RESOURCE_MISSING_WEB_ACL, RESOURCE_INCORRECT_WEB_ACL,
     * RESOURCE_MISSING_SHIELD_PROTECTION,
     * RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION,
     * RESOURCE_MISSING_SECURITY_GROUP, RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP,
     * SECURITY_GROUP_UNUSED, SECURITY_GROUP_REDUNDANT
     *
     * @param violationReason <p>
     *            The reason that the resource is not protected by the policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ViolationReason
     */
    public ComplianceViolator withViolationReason(String violationReason) {
        this.violationReason = violationReason;
        return this;
    }

    /**
     * <p>
     * The reason that the resource is not protected by the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WEB_ACL_MISSING_RULE_GROUP,
     * RESOURCE_MISSING_WEB_ACL, RESOURCE_INCORRECT_WEB_ACL,
     * RESOURCE_MISSING_SHIELD_PROTECTION,
     * RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION,
     * RESOURCE_MISSING_SECURITY_GROUP, RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP,
     * SECURITY_GROUP_UNUSED, SECURITY_GROUP_REDUNDANT
     *
     * @param violationReason <p>
     *            The reason that the resource is not protected by the policy.
     *            </p>
     * @see ViolationReason
     */
    public void setViolationReason(ViolationReason violationReason) {
        this.violationReason = violationReason.toString();
    }

    /**
     * <p>
     * The reason that the resource is not protected by the policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WEB_ACL_MISSING_RULE_GROUP,
     * RESOURCE_MISSING_WEB_ACL, RESOURCE_INCORRECT_WEB_ACL,
     * RESOURCE_MISSING_SHIELD_PROTECTION,
     * RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION,
     * RESOURCE_MISSING_SECURITY_GROUP, RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP,
     * SECURITY_GROUP_UNUSED, SECURITY_GROUP_REDUNDANT
     *
     * @param violationReason <p>
     *            The reason that the resource is not protected by the policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ViolationReason
     */
    public ComplianceViolator withViolationReason(ViolationReason violationReason) {
        this.violationReason = violationReason.toString();
        return this;
    }

    /**
     * <p>
     * The resource type. This is in the format shown in the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * >AWS Resource Types Reference</a>. For example:
     * <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> or
     * <code>AWS::CloudFront::Distribution</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @return <p>
     *         The resource type. This is in the format shown in the <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *         >AWS Resource Types Reference</a>. For example:
     *         <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> or
     *         <code>AWS::CloudFront::Distribution</code>.
     *         </p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The resource type. This is in the format shown in the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * >AWS Resource Types Reference</a>. For example:
     * <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> or
     * <code>AWS::CloudFront::Distribution</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param resourceType <p>
     *            The resource type. This is in the format shown in the <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *            >AWS Resource Types Reference</a>. For example:
     *            <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> or
     *            <code>AWS::CloudFront::Distribution</code>.
     *            </p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type. This is in the format shown in the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * >AWS Resource Types Reference</a>. For example:
     * <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> or
     * <code>AWS::CloudFront::Distribution</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param resourceType <p>
     *            The resource type. This is in the format shown in the <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *            >AWS Resource Types Reference</a>. For example:
     *            <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> or
     *            <code>AWS::CloudFront::Distribution</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComplianceViolator withResourceType(String resourceType) {
        this.resourceType = resourceType;
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
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getViolationReason() != null)
            sb.append("ViolationReason: " + getViolationReason() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode
                + ((getViolationReason() == null) ? 0 : getViolationReason().hashCode());
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

        if (obj instanceof ComplianceViolator == false)
            return false;
        ComplianceViolator other = (ComplianceViolator) obj;

        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getViolationReason() == null ^ this.getViolationReason() == null)
            return false;
        if (other.getViolationReason() != null
                && other.getViolationReason().equals(this.getViolationReason()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }
}
