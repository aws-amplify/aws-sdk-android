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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new ledger in your AWS account.
 * </p>
 */
public class CreateLedgerRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the ledger that you want to create. The name must be unique
     * among all of your ledgers in the current AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     */
    private String name;

    /**
     * <p>
     * The key-value pairs to add as tags to the ledger that you want to create.
     * Tag keys are case sensitive. Tag values are case sensitive and can be
     * null.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The permissions mode to assign to the ledger that you want to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW_ALL
     */
    private String permissionsMode;

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
     * The name of the ledger that you want to create. The name must be unique
     * among all of your ledgers in the current AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     *
     * @return <p>
     *         The name of the ledger that you want to create. The name must be
     *         unique among all of your ledgers in the current AWS Region.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the ledger that you want to create. The name must be unique
     * among all of your ledgers in the current AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     *
     * @param name <p>
     *            The name of the ledger that you want to create. The name must
     *            be unique among all of your ledgers in the current AWS Region.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the ledger that you want to create. The name must be unique
     * among all of your ledgers in the current AWS Region.
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
     *            The name of the ledger that you want to create. The name must
     *            be unique among all of your ledgers in the current AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLedgerRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The key-value pairs to add as tags to the ledger that you want to create.
     * Tag keys are case sensitive. Tag values are case sensitive and can be
     * null.
     * </p>
     *
     * @return <p>
     *         The key-value pairs to add as tags to the ledger that you want to
     *         create. Tag keys are case sensitive. Tag values are case
     *         sensitive and can be null.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key-value pairs to add as tags to the ledger that you want to create.
     * Tag keys are case sensitive. Tag values are case sensitive and can be
     * null.
     * </p>
     *
     * @param tags <p>
     *            The key-value pairs to add as tags to the ledger that you want
     *            to create. Tag keys are case sensitive. Tag values are case
     *            sensitive and can be null.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The key-value pairs to add as tags to the ledger that you want to create.
     * Tag keys are case sensitive. Tag values are case sensitive and can be
     * null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The key-value pairs to add as tags to the ledger that you want
     *            to create. Tag keys are case sensitive. Tag values are case
     *            sensitive and can be null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLedgerRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The key-value pairs to add as tags to the ledger that you want to create.
     * Tag keys are case sensitive. Tag values are case sensitive and can be
     * null.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLedgerRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateLedgerRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The permissions mode to assign to the ledger that you want to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW_ALL
     *
     * @return <p>
     *         The permissions mode to assign to the ledger that you want to
     *         create.
     *         </p>
     * @see PermissionsMode
     */
    public String getPermissionsMode() {
        return permissionsMode;
    }

    /**
     * <p>
     * The permissions mode to assign to the ledger that you want to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW_ALL
     *
     * @param permissionsMode <p>
     *            The permissions mode to assign to the ledger that you want to
     *            create.
     *            </p>
     * @see PermissionsMode
     */
    public void setPermissionsMode(String permissionsMode) {
        this.permissionsMode = permissionsMode;
    }

    /**
     * <p>
     * The permissions mode to assign to the ledger that you want to create.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW_ALL
     *
     * @param permissionsMode <p>
     *            The permissions mode to assign to the ledger that you want to
     *            create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PermissionsMode
     */
    public CreateLedgerRequest withPermissionsMode(String permissionsMode) {
        this.permissionsMode = permissionsMode;
        return this;
    }

    /**
     * <p>
     * The permissions mode to assign to the ledger that you want to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW_ALL
     *
     * @param permissionsMode <p>
     *            The permissions mode to assign to the ledger that you want to
     *            create.
     *            </p>
     * @see PermissionsMode
     */
    public void setPermissionsMode(PermissionsMode permissionsMode) {
        this.permissionsMode = permissionsMode.toString();
    }

    /**
     * <p>
     * The permissions mode to assign to the ledger that you want to create.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW_ALL
     *
     * @param permissionsMode <p>
     *            The permissions mode to assign to the ledger that you want to
     *            create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PermissionsMode
     */
    public CreateLedgerRequest withPermissionsMode(PermissionsMode permissionsMode) {
        this.permissionsMode = permissionsMode.toString();
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
    public CreateLedgerRequest withDeletionProtection(Boolean deletionProtection) {
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
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getPermissionsMode() != null)
            sb.append("PermissionsMode: " + getPermissionsMode() + ",");
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getPermissionsMode() == null) ? 0 : getPermissionsMode().hashCode());
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

        if (obj instanceof CreateLedgerRequest == false)
            return false;
        CreateLedgerRequest other = (CreateLedgerRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getPermissionsMode() == null ^ this.getPermissionsMode() == null)
            return false;
        if (other.getPermissionsMode() != null
                && other.getPermissionsMode().equals(this.getPermissionsMode()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null
                && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        return true;
    }
}
