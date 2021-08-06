/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;

public class BatchCreateChannelMembershipResult implements Serializable {
    /**
     * <p>
     * The list of channel memberships in the response.
     * </p>
     */
    private BatchChannelMemberships batchChannelMemberships;

    /**
     * <p>
     * If the action fails for one or more of the memberships in the request, a
     * list of the memberships is returned, along with error codes and error
     * messages.
     * </p>
     */
    private java.util.List<BatchCreateChannelMembershipError> errors;

    /**
     * <p>
     * The list of channel memberships in the response.
     * </p>
     *
     * @return <p>
     *         The list of channel memberships in the response.
     *         </p>
     */
    public BatchChannelMemberships getBatchChannelMemberships() {
        return batchChannelMemberships;
    }

    /**
     * <p>
     * The list of channel memberships in the response.
     * </p>
     *
     * @param batchChannelMemberships <p>
     *            The list of channel memberships in the response.
     *            </p>
     */
    public void setBatchChannelMemberships(BatchChannelMemberships batchChannelMemberships) {
        this.batchChannelMemberships = batchChannelMemberships;
    }

    /**
     * <p>
     * The list of channel memberships in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param batchChannelMemberships <p>
     *            The list of channel memberships in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchCreateChannelMembershipResult withBatchChannelMemberships(
            BatchChannelMemberships batchChannelMemberships) {
        this.batchChannelMemberships = batchChannelMemberships;
        return this;
    }

    /**
     * <p>
     * If the action fails for one or more of the memberships in the request, a
     * list of the memberships is returned, along with error codes and error
     * messages.
     * </p>
     *
     * @return <p>
     *         If the action fails for one or more of the memberships in the
     *         request, a list of the memberships is returned, along with error
     *         codes and error messages.
     *         </p>
     */
    public java.util.List<BatchCreateChannelMembershipError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * If the action fails for one or more of the memberships in the request, a
     * list of the memberships is returned, along with error codes and error
     * messages.
     * </p>
     *
     * @param errors <p>
     *            If the action fails for one or more of the memberships in the
     *            request, a list of the memberships is returned, along with
     *            error codes and error messages.
     *            </p>
     */
    public void setErrors(java.util.Collection<BatchCreateChannelMembershipError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchCreateChannelMembershipError>(errors);
    }

    /**
     * <p>
     * If the action fails for one or more of the memberships in the request, a
     * list of the memberships is returned, along with error codes and error
     * messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            If the action fails for one or more of the memberships in the
     *            request, a list of the memberships is returned, along with
     *            error codes and error messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchCreateChannelMembershipResult withErrors(
            BatchCreateChannelMembershipError... errors) {
        if (getErrors() == null) {
            this.errors = new java.util.ArrayList<BatchCreateChannelMembershipError>(errors.length);
        }
        for (BatchCreateChannelMembershipError value : errors) {
            this.errors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * If the action fails for one or more of the memberships in the request, a
     * list of the memberships is returned, along with error codes and error
     * messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            If the action fails for one or more of the memberships in the
     *            request, a list of the memberships is returned, along with
     *            error codes and error messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchCreateChannelMembershipResult withErrors(
            java.util.Collection<BatchCreateChannelMembershipError> errors) {
        setErrors(errors);
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
        if (getBatchChannelMemberships() != null)
            sb.append("BatchChannelMemberships: " + getBatchChannelMemberships() + ",");
        if (getErrors() != null)
            sb.append("Errors: " + getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getBatchChannelMemberships() == null) ? 0 : getBatchChannelMemberships()
                        .hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchCreateChannelMembershipResult == false)
            return false;
        BatchCreateChannelMembershipResult other = (BatchCreateChannelMembershipResult) obj;

        if (other.getBatchChannelMemberships() == null ^ this.getBatchChannelMemberships() == null)
            return false;
        if (other.getBatchChannelMemberships() != null
                && other.getBatchChannelMemberships().equals(this.getBatchChannelMemberships()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }
}
