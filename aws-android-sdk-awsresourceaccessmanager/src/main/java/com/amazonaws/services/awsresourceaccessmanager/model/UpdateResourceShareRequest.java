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
 * Updates the specified resource share that you own.
 * </p>
 */
public class UpdateResourceShareRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     */
    private String resourceShareArn;

    /**
     * <p>
     * The name of the resource share.
     * </p>
     */
    private String name;

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
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the resource share.
     *         </p>
     */
    public String getResourceShareArn() {
        return resourceShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     *
     * @param resourceShareArn <p>
     *            The Amazon Resource Name (ARN) of the resource share.
     *            </p>
     */
    public void setResourceShareArn(String resourceShareArn) {
        this.resourceShareArn = resourceShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceShareArn <p>
     *            The Amazon Resource Name (ARN) of the resource share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateResourceShareRequest withResourceShareArn(String resourceShareArn) {
        this.resourceShareArn = resourceShareArn;
        return this;
    }

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
    public UpdateResourceShareRequest withName(String name) {
        this.name = name;
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
    public UpdateResourceShareRequest withAllowExternalPrincipals(Boolean allowExternalPrincipals) {
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
    public UpdateResourceShareRequest withClientToken(String clientToken) {
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
        if (getResourceShareArn() != null)
            sb.append("resourceShareArn: " + getResourceShareArn() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getAllowExternalPrincipals() != null)
            sb.append("allowExternalPrincipals: " + getAllowExternalPrincipals() + ",");
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
                + ((getResourceShareArn() == null) ? 0 : getResourceShareArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime
                * hashCode
                + ((getAllowExternalPrincipals() == null) ? 0 : getAllowExternalPrincipals()
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

        if (obj instanceof UpdateResourceShareRequest == false)
            return false;
        UpdateResourceShareRequest other = (UpdateResourceShareRequest) obj;

        if (other.getResourceShareArn() == null ^ this.getResourceShareArn() == null)
            return false;
        if (other.getResourceShareArn() != null
                && other.getResourceShareArn().equals(this.getResourceShareArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        return true;
    }
}
