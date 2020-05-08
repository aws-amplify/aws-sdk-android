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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

public class DeleteInvitationsResult implements Serializable {
    /**
     * <p>
     * A list of objects that contain the unprocessed account and a result
     * string that explains why it was unprocessed.
     * </p>
     */
    private java.util.List<UnprocessedAccount> unprocessedAccounts;

    /**
     * <p>
     * A list of objects that contain the unprocessed account and a result
     * string that explains why it was unprocessed.
     * </p>
     *
     * @return <p>
     *         A list of objects that contain the unprocessed account and a
     *         result string that explains why it was unprocessed.
     *         </p>
     */
    public java.util.List<UnprocessedAccount> getUnprocessedAccounts() {
        return unprocessedAccounts;
    }

    /**
     * <p>
     * A list of objects that contain the unprocessed account and a result
     * string that explains why it was unprocessed.
     * </p>
     *
     * @param unprocessedAccounts <p>
     *            A list of objects that contain the unprocessed account and a
     *            result string that explains why it was unprocessed.
     *            </p>
     */
    public void setUnprocessedAccounts(java.util.Collection<UnprocessedAccount> unprocessedAccounts) {
        if (unprocessedAccounts == null) {
            this.unprocessedAccounts = null;
            return;
        }

        this.unprocessedAccounts = new java.util.ArrayList<UnprocessedAccount>(unprocessedAccounts);
    }

    /**
     * <p>
     * A list of objects that contain the unprocessed account and a result
     * string that explains why it was unprocessed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unprocessedAccounts <p>
     *            A list of objects that contain the unprocessed account and a
     *            result string that explains why it was unprocessed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteInvitationsResult withUnprocessedAccounts(
            UnprocessedAccount... unprocessedAccounts) {
        if (getUnprocessedAccounts() == null) {
            this.unprocessedAccounts = new java.util.ArrayList<UnprocessedAccount>(
                    unprocessedAccounts.length);
        }
        for (UnprocessedAccount value : unprocessedAccounts) {
            this.unprocessedAccounts.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects that contain the unprocessed account and a result
     * string that explains why it was unprocessed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unprocessedAccounts <p>
     *            A list of objects that contain the unprocessed account and a
     *            result string that explains why it was unprocessed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteInvitationsResult withUnprocessedAccounts(
            java.util.Collection<UnprocessedAccount> unprocessedAccounts) {
        setUnprocessedAccounts(unprocessedAccounts);
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
        if (getUnprocessedAccounts() != null)
            sb.append("UnprocessedAccounts: " + getUnprocessedAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUnprocessedAccounts() == null) ? 0 : getUnprocessedAccounts().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteInvitationsResult == false)
            return false;
        DeleteInvitationsResult other = (DeleteInvitationsResult) obj;

        if (other.getUnprocessedAccounts() == null ^ this.getUnprocessedAccounts() == null)
            return false;
        if (other.getUnprocessedAccounts() != null
                && other.getUnprocessedAccounts().equals(this.getUnprocessedAccounts()) == false)
            return false;
        return true;
    }
}
