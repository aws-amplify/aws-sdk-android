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

package com.amazonaws.services.awsresourceaccessmanager.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a resource share.
 * </p>
 */
public class CreateResourceShareRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the resource share.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resources to associate with the
     * resource share.
     * </p>
     */
    private java.util.List<String> resourceArns;

    /**
     * <p>
     * The principals to associate with the resource share. The possible values
     * are IDs of AWS accounts, the ARN of an OU or organization from AWS
     * Organizations.
     * </p>
     */
    private java.util.List<String> principals;

    /**
     * <p>
     * One or more tags.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Indicates whether principals outside your AWS organization can be
     * associated with a resource share.
     * </p>
     */
    private Boolean allowExternalPrincipals;

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ARNs of the permissions to associate with the resource share. If you
     * do not specify an ARN for the permission, AWS RAM automatically attaches
     * the default version of the permission for each resource type.
     * </p>
     */
    private java.util.List<String> permissionArns;

    /**
     * <p>
     * The name of the resource share.
     * </p>
     *
     * @return <p>
     *         The name of the resource share.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     *
     * @param name <p>
     *            The name of the resource share.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the resource share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateResourceShareRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resources to associate with the
     * resource share.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Names (ARN) of the resources to associate
     *         with the resource share.
     *         </p>
     */
    public java.util.List<String> getResourceArns() {
        return resourceArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resources to associate with the
     * resource share.
     * </p>
     *
     * @param resourceArns <p>
     *            The Amazon Resource Names (ARN) of the resources to associate
     *            with the resource share.
     *            </p>
     */
    public void setResourceArns(java.util.Collection<String> resourceArns) {
        if (resourceArns == null) {
            this.resourceArns = null;
            return;
        }

        this.resourceArns = new java.util.ArrayList<String>(resourceArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resources to associate with the
     * resource share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceArns <p>
     *            The Amazon Resource Names (ARN) of the resources to associate
     *            with the resource share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateResourceShareRequest withResourceArns(String... resourceArns) {
        if (getResourceArns() == null) {
            this.resourceArns = new java.util.ArrayList<String>(resourceArns.length);
        }
        for (String value : resourceArns) {
            this.resourceArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resources to associate with the
     * resource share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceArns <p>
     *            The Amazon Resource Names (ARN) of the resources to associate
     *            with the resource share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateResourceShareRequest withResourceArns(java.util.Collection<String> resourceArns) {
        setResourceArns(resourceArns);
        return this;
    }

    /**
     * <p>
     * The principals to associate with the resource share. The possible values
     * are IDs of AWS accounts, the ARN of an OU or organization from AWS
     * Organizations.
     * </p>
     *
     * @return <p>
     *         The principals to associate with the resource share. The possible
     *         values are IDs of AWS accounts, the ARN of an OU or organization
     *         from AWS Organizations.
     *         </p>
     */
    public java.util.List<String> getPrincipals() {
        return principals;
    }

    /**
     * <p>
     * The principals to associate with the resource share. The possible values
     * are IDs of AWS accounts, the ARN of an OU or organization from AWS
     * Organizations.
     * </p>
     *
     * @param principals <p>
     *            The principals to associate with the resource share. The
     *            possible values are IDs of AWS accounts, the ARN of an OU or
     *            organization from AWS Organizations.
     *            </p>
     */
    public void setPrincipals(java.util.Collection<String> principals) {
        if (principals == null) {
            this.principals = null;
            return;
        }

        this.principals = new java.util.ArrayList<String>(principals);
    }

    /**
     * <p>
     * The principals to associate with the resource share. The possible values
     * are IDs of AWS accounts, the ARN of an OU or organization from AWS
     * Organizations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param principals <p>
     *            The principals to associate with the resource share. The
     *            possible values are IDs of AWS accounts, the ARN of an OU or
     *            organization from AWS Organizations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateResourceShareRequest withPrincipals(String... principals) {
        if (getPrincipals() == null) {
            this.principals = new java.util.ArrayList<String>(principals.length);
        }
        for (String value : principals) {
            this.principals.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The principals to associate with the resource share. The possible values
     * are IDs of AWS accounts, the ARN of an OU or organization from AWS
     * Organizations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param principals <p>
     *            The principals to associate with the resource share. The
     *            possible values are IDs of AWS accounts, the ARN of an OU or
     *            organization from AWS Organizations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateResourceShareRequest withPrincipals(java.util.Collection<String> principals) {
        setPrincipals(principals);
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     *
     * @return <p>
     *         One or more tags.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     *
     * @param tags <p>
     *            One or more tags.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateResourceShareRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateResourceShareRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Indicates whether principals outside your AWS organization can be
     * associated with a resource share.
     * </p>
     *
     * @return <p>
     *         Indicates whether principals outside your AWS organization can be
     *         associated with a resource share.
     *         </p>
     */
    public Boolean isAllowExternalPrincipals() {
        return allowExternalPrincipals;
    }

    /**
     * <p>
     * Indicates whether principals outside your AWS organization can be
     * associated with a resource share.
     * </p>
     *
     * @return <p>
     *         Indicates whether principals outside your AWS organization can be
     *         associated with a resource share.
     *         </p>
     */
    public Boolean getAllowExternalPrincipals() {
        return allowExternalPrincipals;
    }

    /**
     * <p>
     * Indicates whether principals outside your AWS organization can be
     * associated with a resource share.
     * </p>
     *
     * @param allowExternalPrincipals <p>
     *            Indicates whether principals outside your AWS organization can
     *            be associated with a resource share.
     *            </p>
     */
    public void setAllowExternalPrincipals(Boolean allowExternalPrincipals) {
        this.allowExternalPrincipals = allowExternalPrincipals;
    }

    /**
     * <p>
     * Indicates whether principals outside your AWS organization can be
     * associated with a resource share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowExternalPrincipals <p>
     *            Indicates whether principals outside your AWS organization can
     *            be associated with a resource share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateResourceShareRequest withAllowExternalPrincipals(Boolean allowExternalPrincipals) {
        this.allowExternalPrincipals = allowExternalPrincipals;
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
     * </p>
     *
     * @return <p>
     *         A unique, case-sensitive identifier that you provide to ensure
     *         the idempotency of the request.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
     * </p>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            A unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateResourceShareRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The ARNs of the permissions to associate with the resource share. If you
     * do not specify an ARN for the permission, AWS RAM automatically attaches
     * the default version of the permission for each resource type.
     * </p>
     *
     * @return <p>
     *         The ARNs of the permissions to associate with the resource share.
     *         If you do not specify an ARN for the permission, AWS RAM
     *         automatically attaches the default version of the permission for
     *         each resource type.
     *         </p>
     */
    public java.util.List<String> getPermissionArns() {
        return permissionArns;
    }

    /**
     * <p>
     * The ARNs of the permissions to associate with the resource share. If you
     * do not specify an ARN for the permission, AWS RAM automatically attaches
     * the default version of the permission for each resource type.
     * </p>
     *
     * @param permissionArns <p>
     *            The ARNs of the permissions to associate with the resource
     *            share. If you do not specify an ARN for the permission, AWS
     *            RAM automatically attaches the default version of the
     *            permission for each resource type.
     *            </p>
     */
    public void setPermissionArns(java.util.Collection<String> permissionArns) {
        if (permissionArns == null) {
            this.permissionArns = null;
            return;
        }

        this.permissionArns = new java.util.ArrayList<String>(permissionArns);
    }

    /**
     * <p>
     * The ARNs of the permissions to associate with the resource share. If you
     * do not specify an ARN for the permission, AWS RAM automatically attaches
     * the default version of the permission for each resource type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissionArns <p>
     *            The ARNs of the permissions to associate with the resource
     *            share. If you do not specify an ARN for the permission, AWS
     *            RAM automatically attaches the default version of the
     *            permission for each resource type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateResourceShareRequest withPermissionArns(String... permissionArns) {
        if (getPermissionArns() == null) {
            this.permissionArns = new java.util.ArrayList<String>(permissionArns.length);
        }
        for (String value : permissionArns) {
            this.permissionArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The ARNs of the permissions to associate with the resource share. If you
     * do not specify an ARN for the permission, AWS RAM automatically attaches
     * the default version of the permission for each resource type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissionArns <p>
     *            The ARNs of the permissions to associate with the resource
     *            share. If you do not specify an ARN for the permission, AWS
     *            RAM automatically attaches the default version of the
     *            permission for each resource type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateResourceShareRequest withPermissionArns(java.util.Collection<String> permissionArns) {
        setPermissionArns(permissionArns);
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
            sb.append("name: " + getName() + ",");
        if (getResourceArns() != null)
            sb.append("resourceArns: " + getResourceArns() + ",");
        if (getPrincipals() != null)
            sb.append("principals: " + getPrincipals() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getAllowExternalPrincipals() != null)
            sb.append("allowExternalPrincipals: " + getAllowExternalPrincipals() + ",");
        if (getClientToken() != null)
            sb.append("clientToken: " + getClientToken() + ",");
        if (getPermissionArns() != null)
            sb.append("permissionArns: " + getPermissionArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getResourceArns() == null) ? 0 : getResourceArns().hashCode());
        hashCode = prime * hashCode + ((getPrincipals() == null) ? 0 : getPrincipals().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime
                * hashCode
                + ((getAllowExternalPrincipals() == null) ? 0 : getAllowExternalPrincipals()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode
                + ((getPermissionArns() == null) ? 0 : getPermissionArns().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateResourceShareRequest == false)
            return false;
        CreateResourceShareRequest other = (CreateResourceShareRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getResourceArns() == null ^ this.getResourceArns() == null)
            return false;
        if (other.getResourceArns() != null
                && other.getResourceArns().equals(this.getResourceArns()) == false)
            return false;
        if (other.getPrincipals() == null ^ this.getPrincipals() == null)
            return false;
        if (other.getPrincipals() != null
                && other.getPrincipals().equals(this.getPrincipals()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getAllowExternalPrincipals() == null ^ this.getAllowExternalPrincipals() == null)
            return false;
        if (other.getAllowExternalPrincipals() != null
                && other.getAllowExternalPrincipals().equals(this.getAllowExternalPrincipals()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getPermissionArns() == null ^ this.getPermissionArns() == null)
            return false;
        if (other.getPermissionArns() != null
                && other.getPermissionArns().equals(this.getPermissionArns()) == false)
            return false;
        return true;
    }
}
