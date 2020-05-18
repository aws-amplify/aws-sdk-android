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

package com.amazonaws.services.qldb.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a ledger, including its name, state, and when it was
 * created.
 * </p>
 */
public class LedgerSummary implements Serializable {
    /**
     * <p>
     * The name of the ledger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     */
    private String name;

    /**
     * <p>
     * The current status of the ledger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, DELETING, DELETED
     */
    private String state;

    /**
     * <p>
     * The date and time, in epoch time format, when the ledger was created.
     * (Epoch time format is the number of seconds elapsed since 12:00:00 AM
     * January 1, 1970 UTC.)
     * </p>
     */
    private java.util.Date creationDateTime;

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     *
     * @return <p>
     *         The name of the ledger.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     *
     * @param name <p>
     *            The name of the ledger.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     *
     * @param name <p>
     *            The name of the ledger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LedgerSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The current status of the ledger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, DELETING, DELETED
     *
     * @return <p>
     *         The current status of the ledger.
     *         </p>
     * @see LedgerState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The current status of the ledger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, DELETING, DELETED
     *
     * @param state <p>
     *            The current status of the ledger.
     *            </p>
     * @see LedgerState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current status of the ledger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, DELETING, DELETED
     *
     * @param state <p>
     *            The current status of the ledger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LedgerState
     */
    public LedgerSummary withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The current status of the ledger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, DELETING, DELETED
     *
     * @param state <p>
     *            The current status of the ledger.
     *            </p>
     * @see LedgerState
     */
    public void setState(LedgerState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The current status of the ledger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, DELETING, DELETED
     *
     * @param state <p>
     *            The current status of the ledger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LedgerState
     */
    public LedgerSummary withState(LedgerState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The date and time, in epoch time format, when the ledger was created.
     * (Epoch time format is the number of seconds elapsed since 12:00:00 AM
     * January 1, 1970 UTC.)
     * </p>
     *
     * @return <p>
     *         The date and time, in epoch time format, when the ledger was
     *         created. (Epoch time format is the number of seconds elapsed
     *         since 12:00:00 AM January 1, 1970 UTC.)
     *         </p>
     */
    public java.util.Date getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * <p>
     * The date and time, in epoch time format, when the ledger was created.
     * (Epoch time format is the number of seconds elapsed since 12:00:00 AM
     * January 1, 1970 UTC.)
     * </p>
     *
     * @param creationDateTime <p>
     *            The date and time, in epoch time format, when the ledger was
     *            created. (Epoch time format is the number of seconds elapsed
     *            since 12:00:00 AM January 1, 1970 UTC.)
     *            </p>
     */
    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time, in epoch time format, when the ledger was created.
     * (Epoch time format is the number of seconds elapsed since 12:00:00 AM
     * January 1, 1970 UTC.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDateTime <p>
     *            The date and time, in epoch time format, when the ledger was
     *            created. (Epoch time format is the number of seconds elapsed
     *            since 12:00:00 AM January 1, 1970 UTC.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LedgerSummary withCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
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
            sb.append("Name: " + getName() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: " + getCreationDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LedgerSummary == false)
            return false;
        LedgerSummary other = (LedgerSummary) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null
                && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        return true;
    }
}
