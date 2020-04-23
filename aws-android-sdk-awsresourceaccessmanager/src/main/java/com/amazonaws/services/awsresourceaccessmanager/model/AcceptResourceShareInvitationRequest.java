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
 * Accepts an invitation to a resource share from another AWS account.
 * </p>
 */
public class AcceptResourceShareInvitationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the invitation.
     * </p>
     */
    private String resourceShareInvitationArn;

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the invitation.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the invitation.
     *         </p>
     */
    public String getResourceShareInvitationArn() {
        return resourceShareInvitationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the invitation.
     * </p>
     *
     * @param resourceShareInvitationArn <p>
     *            The Amazon Resource Name (ARN) of the invitation.
     *            </p>
     */
    public void setResourceShareInvitationArn(String resourceShareInvitationArn) {
        this.resourceShareInvitationArn = resourceShareInvitationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the invitation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceShareInvitationArn <p>
     *            The Amazon Resource Name (ARN) of the invitation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceptResourceShareInvitationRequest withResourceShareInvitationArn(
            String resourceShareInvitationArn) {
        this.resourceShareInvitationArn = resourceShareInvitationArn;
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
    public AcceptResourceShareInvitationRequest withClientToken(String clientToken) {
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
        if (getResourceShareInvitationArn() != null)
            sb.append("resourceShareInvitationArn: " + getResourceShareInvitationArn() + ",");
        if (getClientToken() != null)
            sb.append("clientToken: " + getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getResourceShareInvitationArn() == null) ? 0 : getResourceShareInvitationArn()
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

        if (obj instanceof AcceptResourceShareInvitationRequest == false)
            return false;
        AcceptResourceShareInvitationRequest other = (AcceptResourceShareInvitationRequest) obj;

        if (other.getResourceShareInvitationArn() == null
                ^ this.getResourceShareInvitationArn() == null)
            return false;
        if (other.getResourceShareInvitationArn() != null
                && other.getResourceShareInvitationArn().equals(
                        this.getResourceShareInvitationArn()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }
}
