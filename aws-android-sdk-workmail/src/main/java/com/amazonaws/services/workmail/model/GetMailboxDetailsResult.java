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

package com.amazonaws.services.workmail.model;

import java.io.Serializable;

public class GetMailboxDetailsResult implements Serializable {
    /**
     * <p>
     * The maximum allowed mailbox size, in MB, for the specified user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer mailboxQuota;

    /**
     * <p>
     * The current mailbox size, in MB, for the specified user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Double mailboxSize;

    /**
     * <p>
     * The maximum allowed mailbox size, in MB, for the specified user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum allowed mailbox size, in MB, for the specified user.
     *         </p>
     */
    public Integer getMailboxQuota() {
        return mailboxQuota;
    }

    /**
     * <p>
     * The maximum allowed mailbox size, in MB, for the specified user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param mailboxQuota <p>
     *            The maximum allowed mailbox size, in MB, for the specified
     *            user.
     *            </p>
     */
    public void setMailboxQuota(Integer mailboxQuota) {
        this.mailboxQuota = mailboxQuota;
    }

    /**
     * <p>
     * The maximum allowed mailbox size, in MB, for the specified user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param mailboxQuota <p>
     *            The maximum allowed mailbox size, in MB, for the specified
     *            user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMailboxDetailsResult withMailboxQuota(Integer mailboxQuota) {
        this.mailboxQuota = mailboxQuota;
        return this;
    }

    /**
     * <p>
     * The current mailbox size, in MB, for the specified user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The current mailbox size, in MB, for the specified user.
     *         </p>
     */
    public Double getMailboxSize() {
        return mailboxSize;
    }

    /**
     * <p>
     * The current mailbox size, in MB, for the specified user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param mailboxSize <p>
     *            The current mailbox size, in MB, for the specified user.
     *            </p>
     */
    public void setMailboxSize(Double mailboxSize) {
        this.mailboxSize = mailboxSize;
    }

    /**
     * <p>
     * The current mailbox size, in MB, for the specified user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param mailboxSize <p>
     *            The current mailbox size, in MB, for the specified user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMailboxDetailsResult withMailboxSize(Double mailboxSize) {
        this.mailboxSize = mailboxSize;
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
        if (getMailboxQuota() != null)
            sb.append("MailboxQuota: " + getMailboxQuota() + ",");
        if (getMailboxSize() != null)
            sb.append("MailboxSize: " + getMailboxSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMailboxQuota() == null) ? 0 : getMailboxQuota().hashCode());
        hashCode = prime * hashCode
                + ((getMailboxSize() == null) ? 0 : getMailboxSize().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMailboxDetailsResult == false)
            return false;
        GetMailboxDetailsResult other = (GetMailboxDetailsResult) obj;

        if (other.getMailboxQuota() == null ^ this.getMailboxQuota() == null)
            return false;
        if (other.getMailboxQuota() != null
                && other.getMailboxQuota().equals(this.getMailboxQuota()) == false)
            return false;
        if (other.getMailboxSize() == null ^ this.getMailboxSize() == null)
            return false;
        if (other.getMailboxSize() != null
                && other.getMailboxSize().equals(this.getMailboxSize()) == false)
            return false;
        return true;
    }
}
