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

package com.amazonaws.services.awsiotsitewise.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates an existing access policy that specifies an AWS SSO user or group's
 * access to an AWS IoT SiteWise Monitor portal or project resource.
 * </p>
 */
public class UpdateAccessPolicyRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The identity for this access policy. Choose either a <code>user</code> or
     * a <code>group</code> but not both.
     * </p>
     */
    private Identity accessPolicyIdentity;

    /**
     * <p>
     * The AWS IoT SiteWise Monitor resource for this access policy. Choose
     * either <code>portal</code> or <code>project</code> but not both.
     * </p>
     */
    private Resource accessPolicyResource;

    /**
     * <p>
     * The permission level for this access policy. Note that a project
     * <code>ADMINISTRATOR</code> is also known as a project owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMINISTRATOR, VIEWER
     */
    private String accessPolicyPermission;

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the
     * idempotency of the request. Don't reuse this client token if a new
     * idempotent request is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 64<br/>
     * <b>Pattern: </b>\S{36,64}<br/>
     */
    private String clientToken;

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
    public UpdateAccessPolicyRequest withAccessPolicyId(String accessPolicyId) {
        this.accessPolicyId = accessPolicyId;
        return this;
    }

    /**
     * <p>
     * The identity for this access policy. Choose either a <code>user</code> or
     * a <code>group</code> but not both.
     * </p>
     *
     * @return <p>
     *         The identity for this access policy. Choose either a
     *         <code>user</code> or a <code>group</code> but not both.
     *         </p>
     */
    public Identity getAccessPolicyIdentity() {
        return accessPolicyIdentity;
    }

    /**
     * <p>
     * The identity for this access policy. Choose either a <code>user</code> or
     * a <code>group</code> but not both.
     * </p>
     *
     * @param accessPolicyIdentity <p>
     *            The identity for this access policy. Choose either a
     *            <code>user</code> or a <code>group</code> but not both.
     *            </p>
     */
    public void setAccessPolicyIdentity(Identity accessPolicyIdentity) {
        this.accessPolicyIdentity = accessPolicyIdentity;
    }

    /**
     * <p>
     * The identity for this access policy. Choose either a <code>user</code> or
     * a <code>group</code> but not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessPolicyIdentity <p>
     *            The identity for this access policy. Choose either a
     *            <code>user</code> or a <code>group</code> but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAccessPolicyRequest withAccessPolicyIdentity(Identity accessPolicyIdentity) {
        this.accessPolicyIdentity = accessPolicyIdentity;
        return this;
    }

    /**
     * <p>
     * The AWS IoT SiteWise Monitor resource for this access policy. Choose
     * either <code>portal</code> or <code>project</code> but not both.
     * </p>
     *
     * @return <p>
     *         The AWS IoT SiteWise Monitor resource for this access policy.
     *         Choose either <code>portal</code> or <code>project</code> but not
     *         both.
     *         </p>
     */
    public Resource getAccessPolicyResource() {
        return accessPolicyResource;
    }

    /**
     * <p>
     * The AWS IoT SiteWise Monitor resource for this access policy. Choose
     * either <code>portal</code> or <code>project</code> but not both.
     * </p>
     *
     * @param accessPolicyResource <p>
     *            The AWS IoT SiteWise Monitor resource for this access policy.
     *            Choose either <code>portal</code> or <code>project</code> but
     *            not both.
     *            </p>
     */
    public void setAccessPolicyResource(Resource accessPolicyResource) {
        this.accessPolicyResource = accessPolicyResource;
    }

    /**
     * <p>
     * The AWS IoT SiteWise Monitor resource for this access policy. Choose
     * either <code>portal</code> or <code>project</code> but not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessPolicyResource <p>
     *            The AWS IoT SiteWise Monitor resource for this access policy.
     *            Choose either <code>portal</code> or <code>project</code> but
     *            not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAccessPolicyRequest withAccessPolicyResource(Resource accessPolicyResource) {
        this.accessPolicyResource = accessPolicyResource;
        return this;
    }

    /**
     * <p>
     * The permission level for this access policy. Note that a project
     * <code>ADMINISTRATOR</code> is also known as a project owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMINISTRATOR, VIEWER
     *
     * @return <p>
     *         The permission level for this access policy. Note that a project
     *         <code>ADMINISTRATOR</code> is also known as a project owner.
     *         </p>
     * @see Permission
     */
    public String getAccessPolicyPermission() {
        return accessPolicyPermission;
    }

    /**
     * <p>
     * The permission level for this access policy. Note that a project
     * <code>ADMINISTRATOR</code> is also known as a project owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMINISTRATOR, VIEWER
     *
     * @param accessPolicyPermission <p>
     *            The permission level for this access policy. Note that a
     *            project <code>ADMINISTRATOR</code> is also known as a project
     *            owner.
     *            </p>
     * @see Permission
     */
    public void setAccessPolicyPermission(String accessPolicyPermission) {
        this.accessPolicyPermission = accessPolicyPermission;
    }

    /**
     * <p>
     * The permission level for this access policy. Note that a project
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
     *            The permission level for this access policy. Note that a
     *            project <code>ADMINISTRATOR</code> is also known as a project
     *            owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Permission
     */
    public UpdateAccessPolicyRequest withAccessPolicyPermission(String accessPolicyPermission) {
        this.accessPolicyPermission = accessPolicyPermission;
        return this;
    }

    /**
     * <p>
     * The permission level for this access policy. Note that a project
     * <code>ADMINISTRATOR</code> is also known as a project owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMINISTRATOR, VIEWER
     *
     * @param accessPolicyPermission <p>
     *            The permission level for this access policy. Note that a
     *            project <code>ADMINISTRATOR</code> is also known as a project
     *            owner.
     *            </p>
     * @see Permission
     */
    public void setAccessPolicyPermission(Permission accessPolicyPermission) {
        this.accessPolicyPermission = accessPolicyPermission.toString();
    }

    /**
     * <p>
     * The permission level for this access policy. Note that a project
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
     *            The permission level for this access policy. Note that a
     *            project <code>ADMINISTRATOR</code> is also known as a project
     *            owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Permission
     */
    public UpdateAccessPolicyRequest withAccessPolicyPermission(Permission accessPolicyPermission) {
        this.accessPolicyPermission = accessPolicyPermission.toString();
        return this;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the
     * idempotency of the request. Don't reuse this client token if a new
     * idempotent request is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 64<br/>
     * <b>Pattern: </b>\S{36,64}<br/>
     *
     * @return <p>
     *         A unique case-sensitive identifier that you can provide to ensure
     *         the idempotency of the request. Don't reuse this client token if
     *         a new idempotent request is required.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the
     * idempotency of the request. Don't reuse this client token if a new
     * idempotent request is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 64<br/>
     * <b>Pattern: </b>\S{36,64}<br/>
     *
     * @param clientToken <p>
     *            A unique case-sensitive identifier that you can provide to
     *            ensure the idempotency of the request. Don't reuse this client
     *            token if a new idempotent request is required.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the
     * idempotency of the request. Don't reuse this client token if a new
     * idempotent request is required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 64<br/>
     * <b>Pattern: </b>\S{36,64}<br/>
     *
     * @param clientToken <p>
     *            A unique case-sensitive identifier that you can provide to
     *            ensure the idempotency of the request. Don't reuse this client
     *            token if a new idempotent request is required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAccessPolicyRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
        if (getAccessPolicyIdentity() != null)
            sb.append("accessPolicyIdentity: " + getAccessPolicyIdentity() + ",");
        if (getAccessPolicyResource() != null)
            sb.append("accessPolicyResource: " + getAccessPolicyResource() + ",");
        if (getAccessPolicyPermission() != null)
            sb.append("accessPolicyPermission: " + getAccessPolicyPermission() + ",");
        if (getClientToken() != null)
            sb.append("clientToken: " + getClientToken());
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
                + ((getAccessPolicyIdentity() == null) ? 0 : getAccessPolicyIdentity().hashCode());
        hashCode = prime * hashCode
                + ((getAccessPolicyResource() == null) ? 0 : getAccessPolicyResource().hashCode());
        hashCode = prime
                * hashCode
                + ((getAccessPolicyPermission() == null) ? 0 : getAccessPolicyPermission()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAccessPolicyRequest == false)
            return false;
        UpdateAccessPolicyRequest other = (UpdateAccessPolicyRequest) obj;

        if (other.getAccessPolicyId() == null ^ this.getAccessPolicyId() == null)
            return false;
        if (other.getAccessPolicyId() != null
                && other.getAccessPolicyId().equals(this.getAccessPolicyId()) == false)
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
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }
}
