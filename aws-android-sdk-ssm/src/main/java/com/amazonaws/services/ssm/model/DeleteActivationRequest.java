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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes an activation. You are not required to delete an activation. If you
 * delete an activation, you can no longer use it to register additional managed
 * instances. Deleting an activation does not de-register managed instances. You
 * must manually de-register managed instances.
 * </p>
 */
public class DeleteActivationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the activation that you want to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     */
    private String activationId;

    /**
     * <p>
     * The ID of the activation that you want to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the activation that you want to delete.
     *         </p>
     */
    public String getActivationId() {
        return activationId;
    }

    /**
     * <p>
     * The ID of the activation that you want to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param activationId <p>
     *            The ID of the activation that you want to delete.
     *            </p>
     */
    public void setActivationId(String activationId) {
        this.activationId = activationId;
    }

    /**
     * <p>
     * The ID of the activation that you want to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param activationId <p>
     *            The ID of the activation that you want to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteActivationRequest withActivationId(String activationId) {
        this.activationId = activationId;
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
        if (getActivationId() != null)
            sb.append("ActivationId: " + getActivationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getActivationId() == null) ? 0 : getActivationId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteActivationRequest == false)
            return false;
        DeleteActivationRequest other = (DeleteActivationRequest) obj;

        if (other.getActivationId() == null ^ this.getActivationId() == null)
            return false;
        if (other.getActivationId() != null
                && other.getActivationId().equals(this.getActivationId()) == false)
            return false;
        return true;
    }
}
