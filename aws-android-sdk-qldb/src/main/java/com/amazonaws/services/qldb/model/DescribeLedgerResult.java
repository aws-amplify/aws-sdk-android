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

public class DescribeLedgerResult implements Serializable {
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
     * The Amazon Resource Name (ARN) for the ledger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     */
    private String arn;

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
     * The flag that prevents a ledger from being deleted by any user. If not
     * provided on ledger creation, this feature is enabled (<code>true</code>)
     * by default.
     * </p>
     * <p>
     * If deletion protection is enabled, you must first disable it before you
     * can delete the ledger using the QLDB API or the AWS Command Line
     * Interface (AWS CLI). You can disable it by calling the
     * <code>UpdateLedger</code> operation to set the flag to <code>false</code>
     * . The QLDB console disables deletion protection for you when you use it
     * to delete a ledger.
     * </p>
     */
    private Boolean deletionProtection;

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
    public DescribeLedgerResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the ledger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the ledger.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the ledger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) for the ledger.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the ledger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) for the ledger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLedgerResult withArn(String arn) {
        this.arn = arn;
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
    public DescribeLedgerResult withState(String state) {
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
    public DescribeLedgerResult withState(LedgerState state) {
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
    public DescribeLedgerResult withCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * <p>
     * The flag that prevents a ledger from being deleted by any user. If not
     * provided on ledger creation, this feature is enabled (<code>true</code>)
     * by default.
     * </p>
     * <p>
     * If deletion protection is enabled, you must first disable it before you
     * can delete the ledger using the QLDB API or the AWS Command Line
     * Interface (AWS CLI). You can disable it by calling the
     * <code>UpdateLedger</code> operation to set the flag to <code>false</code>
     * . The QLDB console disables deletion protection for you when you use it
     * to delete a ledger.
     * </p>
     *
     * @return <p>
     *         The flag that prevents a ledger from being deleted by any user.
     *         If not provided on ledger creation, this feature is enabled (
     *         <code>true</code>) by default.
     *         </p>
     *         <p>
     *         If deletion protection is enabled, you must first disable it
     *         before you can delete the ledger using the QLDB API or the AWS
     *         Command Line Interface (AWS CLI). You can disable it by calling
     *         the <code>UpdateLedger</code> operation to set the flag to
     *         <code>false</code>. The QLDB console disables deletion protection
     *         for you when you use it to delete a ledger.
     *         </p>
     */
    public Boolean isDeletionProtection() {
        return deletionProtection;
    }

    /**
     * <p>
     * The flag that prevents a ledger from being deleted by any user. If not
     * provided on ledger creation, this feature is enabled (<code>true</code>)
     * by default.
     * </p>
     * <p>
     * If deletion protection is enabled, you must first disable it before you
     * can delete the ledger using the QLDB API or the AWS Command Line
     * Interface (AWS CLI). You can disable it by calling the
     * <code>UpdateLedger</code> operation to set the flag to <code>false</code>
     * . The QLDB console disables deletion protection for you when you use it
     * to delete a ledger.
     * </p>
     *
     * @return <p>
     *         The flag that prevents a ledger from being deleted by any user.
     *         If not provided on ledger creation, this feature is enabled (
     *         <code>true</code>) by default.
     *         </p>
     *         <p>
     *         If deletion protection is enabled, you must first disable it
     *         before you can delete the ledger using the QLDB API or the AWS
     *         Command Line Interface (AWS CLI). You can disable it by calling
     *         the <code>UpdateLedger</code> operation to set the flag to
     *         <code>false</code>. The QLDB console disables deletion protection
     *         for you when you use it to delete a ledger.
     *         </p>
     */
    public Boolean getDeletionProtection() {
        return deletionProtection;
    }

    /**
     * <p>
     * The flag that prevents a ledger from being deleted by any user. If not
     * provided on ledger creation, this feature is enabled (<code>true</code>)
     * by default.
     * </p>
     * <p>
     * If deletion protection is enabled, you must first disable it before you
     * can delete the ledger using the QLDB API or the AWS Command Line
     * Interface (AWS CLI). You can disable it by calling the
     * <code>UpdateLedger</code> operation to set the flag to <code>false</code>
     * . The QLDB console disables deletion protection for you when you use it
     * to delete a ledger.
     * </p>
     *
     * @param deletionProtection <p>
     *            The flag that prevents a ledger from being deleted by any
     *            user. If not provided on ledger creation, this feature is
     *            enabled (<code>true</code>) by default.
     *            </p>
     *            <p>
     *            If deletion protection is enabled, you must first disable it
     *            before you can delete the ledger using the QLDB API or the AWS
     *            Command Line Interface (AWS CLI). You can disable it by
     *            calling the <code>UpdateLedger</code> operation to set the
     *            flag to <code>false</code>. The QLDB console disables deletion
     *            protection for you when you use it to delete a ledger.
     *            </p>
     */
    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * The flag that prevents a ledger from being deleted by any user. If not
     * provided on ledger creation, this feature is enabled (<code>true</code>)
     * by default.
     * </p>
     * <p>
     * If deletion protection is enabled, you must first disable it before you
     * can delete the ledger using the QLDB API or the AWS Command Line
     * Interface (AWS CLI). You can disable it by calling the
     * <code>UpdateLedger</code> operation to set the flag to <code>false</code>
     * . The QLDB console disables deletion protection for you when you use it
     * to delete a ledger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deletionProtection <p>
     *            The flag that prevents a ledger from being deleted by any
     *            user. If not provided on ledger creation, this feature is
     *            enabled (<code>true</code>) by default.
     *            </p>
     *            <p>
     *            If deletion protection is enabled, you must first disable it
     *            before you can delete the ledger using the QLDB API or the AWS
     *            Command Line Interface (AWS CLI). You can disable it by
     *            calling the <code>UpdateLedger</code> operation to set the
     *            flag to <code>false</code>. The QLDB console disables deletion
     *            protection for you when you use it to delete a ledger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLedgerResult withDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: " + getCreationDateTime() + ",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: " + getDeletionProtection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode
                + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLedgerResult == false)
            return false;
        DescribeLedgerResult other = (DescribeLedgerResult) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null
                && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        return true;
    }
}
