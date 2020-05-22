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

package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;

public class DescribeAccessPolicyResult implements Serializable {
    /**
     * <p>
     * The ID of the access policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     */
    private String accessPolicyId;

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >ARN</a> of the access policy, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:access-policy/${AccessPolicyId}</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String accessPolicyArn;

    /**
     * <p>
     * The AWS SSO identity (user or group) to which this access policy applies.
     * </p>
     */
    private Identity accessPolicyIdentity;

    /**
     * <p>
     * The AWS IoT SiteWise Monitor resource (portal or project) to which this
     * access policy provides access.
     * </p>
     */
    private Resource accessPolicyResource;

    /**
     * <p>
     * The access policy permission. Note that a project
     * <code>ADMINISTRATOR</code> is also known as a project owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMINISTRATOR, VIEWER
     */
    private String accessPolicyPermission;

    /**
     * <p>
     * The date the access policy was created, in Unix epoch time.
     * </p>
     */
    private java.util.Date accessPolicyCreationDate;

    /**
     * <p>
     * The date the access policy was last updated, in Unix epoch time.
     * </p>
     */
    private java.util.Date accessPolicyLastUpdateDate;

    /**
     * <p>
     * The ID of the access policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the access policy.
     *         </p>
     */
    public String getAccessPolicyId() {
        return accessPolicyId;
    }

    /**
     * <p>
     * The ID of the access policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param accessPolicyId <p>
     *            The ID of the access policy.
     *            </p>
     */
    public void setAccessPolicyId(String accessPolicyId) {
        this.accessPolicyId = accessPolicyId;
    }

    /**
     * <p>
     * The ID of the access policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param accessPolicyId <p>
     *            The ID of the access policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccessPolicyResult withAccessPolicyId(String accessPolicyId) {
        this.accessPolicyId = accessPolicyId;
        return this;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >ARN</a> of the access policy, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:access-policy/${AccessPolicyId}</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >ARN</a> of the access policy, which has the following format.
     *         </p>
     *         <p>
     *         <code>arn:${Partition}:iotsitewise:${Region}:${Account}:access-policy/${AccessPolicyId}</code>
     *         </p>
     */
    public String getAccessPolicyArn() {
        return accessPolicyArn;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >ARN</a> of the access policy, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:access-policy/${AccessPolicyId}</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param accessPolicyArn <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >ARN</a> of the access policy, which has the following format.
     *            </p>
     *            <p>
     *            <code>arn:${Partition}:iotsitewise:${Region}:${Account}:access-policy/${AccessPolicyId}</code>
     *            </p>
     */
    public void setAccessPolicyArn(String accessPolicyArn) {
        this.accessPolicyArn = accessPolicyArn;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >ARN</a> of the access policy, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:access-policy/${AccessPolicyId}</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param accessPolicyArn <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >ARN</a> of the access policy, which has the following format.
     *            </p>
     *            <p>
     *            <code>arn:${Partition}:iotsitewise:${Region}:${Account}:access-policy/${AccessPolicyId}</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccessPolicyResult withAccessPolicyArn(String accessPolicyArn) {
        this.accessPolicyArn = accessPolicyArn;
        return this;
    }

    /**
     * <p>
     * The AWS SSO identity (user or group) to which this access policy applies.
     * </p>
     *
     * @return <p>
     *         The AWS SSO identity (user or group) to which this access policy
     *         applies.
     *         </p>
     */
    public Identity getAccessPolicyIdentity() {
        return accessPolicyIdentity;
    }

    /**
     * <p>
     * The AWS SSO identity (user or group) to which this access policy applies.
     * </p>
     *
     * @param accessPolicyIdentity <p>
     *            The AWS SSO identity (user or group) to which this access
     *            policy applies.
     *            </p>
     */
    public void setAccessPolicyIdentity(Identity accessPolicyIdentity) {
        this.accessPolicyIdentity = accessPolicyIdentity;
    }

    /**
     * <p>
     * The AWS SSO identity (user or group) to which this access policy applies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessPolicyIdentity <p>
     *            The AWS SSO identity (user or group) to which this access
     *            policy applies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccessPolicyResult withAccessPolicyIdentity(Identity accessPolicyIdentity) {
        this.accessPolicyIdentity = accessPolicyIdentity;
        return this;
    }

    /**
     * <p>
     * The AWS IoT SiteWise Monitor resource (portal or project) to which this
     * access policy provides access.
     * </p>
     *
     * @return <p>
     *         The AWS IoT SiteWise Monitor resource (portal or project) to
     *         which this access policy provides access.
     *         </p>
     */
    public Resource getAccessPolicyResource() {
        return accessPolicyResource;
    }

    /**
     * <p>
     * The AWS IoT SiteWise Monitor resource (portal or project) to which this
     * access policy provides access.
     * </p>
     *
     * @param accessPolicyResource <p>
     *            The AWS IoT SiteWise Monitor resource (portal or project) to
     *            which this access policy provides access.
     *            </p>
     */
    public void setAccessPolicyResource(Resource accessPolicyResource) {
        this.accessPolicyResource = accessPolicyResource;
    }

    /**
     * <p>
     * The AWS IoT SiteWise Monitor resource (portal or project) to which this
     * access policy provides access.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessPolicyResource <p>
     *            The AWS IoT SiteWise Monitor resource (portal or project) to
     *            which this access policy provides access.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccessPolicyResult withAccessPolicyResource(Resource accessPolicyResource) {
        this.accessPolicyResource = accessPolicyResource;
        return this;
    }

    /**
     * <p>
     * The access policy permission. Note that a project
     * <code>ADMINISTRATOR</code> is also known as a project owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMINISTRATOR, VIEWER
     *
     * @return <p>
     *         The access policy permission. Note that a project
     *         <code>ADMINISTRATOR</code> is also known as a project owner.
     *         </p>
     * @see Permission
     */
    public String getAccessPolicyPermission() {
        return accessPolicyPermission;
    }

    /**
     * <p>
     * The access policy permission. Note that a project
     * <code>ADMINISTRATOR</code> is also known as a project owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMINISTRATOR, VIEWER
     *
     * @param accessPolicyPermission <p>
     *            The access policy permission. Note that a project
     *            <code>ADMINISTRATOR</code> is also known as a project owner.
     *            </p>
     * @see Permission
     */
    public void setAccessPolicyPermission(String accessPolicyPermission) {
        this.accessPolicyPermission = accessPolicyPermission;
    }

    /**
     * <p>
     * The access policy permission. Note that a project
     * <code>ADMINISTRATOR</code> is also known as a project owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMINISTRATOR, VIEWER
     *
     * @param accessPolicyPermission <p>
     *            The access policy permission. Note that a project
     *            <code>ADMINISTRATOR</code> is also known as a project owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Permission
     */
    public DescribeAccessPolicyResult withAccessPolicyPermission(String accessPolicyPermission) {
        this.accessPolicyPermission = accessPolicyPermission;
        return this;
    }

    /**
     * <p>
     * The access policy permission. Note that a project
     * <code>ADMINISTRATOR</code> is also known as a project owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMINISTRATOR, VIEWER
     *
     * @param accessPolicyPermission <p>
     *            The access policy permission. Note that a project
     *            <code>ADMINISTRATOR</code> is also known as a project owner.
     *            </p>
     * @see Permission
     */
    public void setAccessPolicyPermission(Permission accessPolicyPermission) {
        this.accessPolicyPermission = accessPolicyPermission.toString();
    }

    /**
     * <p>
     * The access policy permission. Note that a project
     * <code>ADMINISTRATOR</code> is also known as a project owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMINISTRATOR, VIEWER
     *
     * @param accessPolicyPermission <p>
     *            The access policy permission. Note that a project
     *            <code>ADMINISTRATOR</code> is also known as a project owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Permission
     */
    public DescribeAccessPolicyResult withAccessPolicyPermission(Permission accessPolicyPermission) {
        this.accessPolicyPermission = accessPolicyPermission.toString();
        return this;
    }

    /**
     * <p>
     * The date the access policy was created, in Unix epoch time.
     * </p>
     *
     * @return <p>
     *         The date the access policy was created, in Unix epoch time.
     *         </p>
     */
    public java.util.Date getAccessPolicyCreationDate() {
        return accessPolicyCreationDate;
    }

    /**
     * <p>
     * The date the access policy was created, in Unix epoch time.
     * </p>
     *
     * @param accessPolicyCreationDate <p>
     *            The date the access policy was created, in Unix epoch time.
     *            </p>
     */
    public void setAccessPolicyCreationDate(java.util.Date accessPolicyCreationDate) {
        this.accessPolicyCreationDate = accessPolicyCreationDate;
    }

    /**
     * <p>
     * The date the access policy was created, in Unix epoch time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessPolicyCreationDate <p>
     *            The date the access policy was created, in Unix epoch time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccessPolicyResult withAccessPolicyCreationDate(
            java.util.Date accessPolicyCreationDate) {
        this.accessPolicyCreationDate = accessPolicyCreationDate;
        return this;
    }

    /**
     * <p>
     * The date the access policy was last updated, in Unix epoch time.
     * </p>
     *
     * @return <p>
     *         The date the access policy was last updated, in Unix epoch time.
     *         </p>
     */
    public java.util.Date getAccessPolicyLastUpdateDate() {
        return accessPolicyLastUpdateDate;
    }

    /**
     * <p>
     * The date the access policy was last updated, in Unix epoch time.
     * </p>
     *
     * @param accessPolicyLastUpdateDate <p>
     *            The date the access policy was last updated, in Unix epoch
     *            time.
     *            </p>
     */
    public void setAccessPolicyLastUpdateDate(java.util.Date accessPolicyLastUpdateDate) {
        this.accessPolicyLastUpdateDate = accessPolicyLastUpdateDate;
    }

    /**
     * <p>
     * The date the access policy was last updated, in Unix epoch time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessPolicyLastUpdateDate <p>
     *            The date the access policy was last updated, in Unix epoch
     *            time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccessPolicyResult withAccessPolicyLastUpdateDate(
            java.util.Date accessPolicyLastUpdateDate) {
        this.accessPolicyLastUpdateDate = accessPolicyLastUpdateDate;
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
        if (getAccessPolicyId() != null)
            sb.append("accessPolicyId: " + getAccessPolicyId() + ",");
        if (getAccessPolicyArn() != null)
            sb.append("accessPolicyArn: " + getAccessPolicyArn() + ",");
        if (getAccessPolicyIdentity() != null)
            sb.append("accessPolicyIdentity: " + getAccessPolicyIdentity() + ",");
        if (getAccessPolicyResource() != null)
            sb.append("accessPolicyResource: " + getAccessPolicyResource() + ",");
        if (getAccessPolicyPermission() != null)
            sb.append("accessPolicyPermission: " + getAccessPolicyPermission() + ",");
        if (getAccessPolicyCreationDate() != null)
            sb.append("accessPolicyCreationDate: " + getAccessPolicyCreationDate() + ",");
        if (getAccessPolicyLastUpdateDate() != null)
            sb.append("accessPolicyLastUpdateDate: " + getAccessPolicyLastUpdateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccessPolicyId() == null) ? 0 : getAccessPolicyId().hashCode());
        hashCode = prime * hashCode
                + ((getAccessPolicyArn() == null) ? 0 : getAccessPolicyArn().hashCode());
        hashCode = prime * hashCode
                + ((getAccessPolicyIdentity() == null) ? 0 : getAccessPolicyIdentity().hashCode());
        hashCode = prime * hashCode
                + ((getAccessPolicyResource() == null) ? 0 : getAccessPolicyResource().hashCode());
        hashCode = prime
                * hashCode
                + ((getAccessPolicyPermission() == null) ? 0 : getAccessPolicyPermission()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAccessPolicyCreationDate() == null) ? 0 : getAccessPolicyCreationDate()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAccessPolicyLastUpdateDate() == null) ? 0 : getAccessPolicyLastUpdateDate()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAccessPolicyResult == false)
            return false;
        DescribeAccessPolicyResult other = (DescribeAccessPolicyResult) obj;

        if (other.getAccessPolicyId() == null ^ this.getAccessPolicyId() == null)
            return false;
        if (other.getAccessPolicyId() != null
                && other.getAccessPolicyId().equals(this.getAccessPolicyId()) == false)
            return false;
        if (other.getAccessPolicyArn() == null ^ this.getAccessPolicyArn() == null)
            return false;
        if (other.getAccessPolicyArn() != null
                && other.getAccessPolicyArn().equals(this.getAccessPolicyArn()) == false)
            return false;
        if (other.getAccessPolicyIdentity() == null ^ this.getAccessPolicyIdentity() == null)
            return false;
        if (other.getAccessPolicyIdentity() != null
                && other.getAccessPolicyIdentity().equals(this.getAccessPolicyIdentity()) == false)
            return false;
        if (other.getAccessPolicyResource() == null ^ this.getAccessPolicyResource() == null)
            return false;
        if (other.getAccessPolicyResource() != null
                && other.getAccessPolicyResource().equals(this.getAccessPolicyResource()) == false)
            return false;
        if (other.getAccessPolicyPermission() == null ^ this.getAccessPolicyPermission() == null)
            return false;
        if (other.getAccessPolicyPermission() != null
                && other.getAccessPolicyPermission().equals(this.getAccessPolicyPermission()) == false)
            return false;
        if (other.getAccessPolicyCreationDate() == null
                ^ this.getAccessPolicyCreationDate() == null)
            return false;
        if (other.getAccessPolicyCreationDate() != null
                && other.getAccessPolicyCreationDate().equals(this.getAccessPolicyCreationDate()) == false)
            return false;
        if (other.getAccessPolicyLastUpdateDate() == null
                ^ this.getAccessPolicyLastUpdateDate() == null)
            return false;
        if (other.getAccessPolicyLastUpdateDate() != null
                && other.getAccessPolicyLastUpdateDate().equals(
                        this.getAccessPolicyLastUpdateDate()) == false)
            return false;
        return true;
    }
}
