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

/**
 * <p>
 * The configuration applied to an organization's folders by its retention
 * policy.
 * </p>
 */
public class FolderConfiguration implements Serializable {
    /**
     * <p>
     * The folder name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INBOX, DELETED_ITEMS, SENT_ITEMS, DRAFTS,
     * JUNK_EMAIL
     */
    private String name;

    /**
     * <p>
     * The action to take on the folder contents at the end of the folder
     * configuration period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, DELETE, PERMANENTLY_DELETE
     */
    private String action;

    /**
     * <p>
     * The period of time at which the folder configuration action is applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 730<br/>
     */
    private Integer period;

    /**
     * <p>
     * The folder name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INBOX, DELETED_ITEMS, SENT_ITEMS, DRAFTS,
     * JUNK_EMAIL
     *
     * @return <p>
     *         The folder name.
     *         </p>
     * @see FolderName
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The folder name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INBOX, DELETED_ITEMS, SENT_ITEMS, DRAFTS,
     * JUNK_EMAIL
     *
     * @param name <p>
     *            The folder name.
     *            </p>
     * @see FolderName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The folder name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INBOX, DELETED_ITEMS, SENT_ITEMS, DRAFTS,
     * JUNK_EMAIL
     *
     * @param name <p>
     *            The folder name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FolderName
     */
    public FolderConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The folder name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INBOX, DELETED_ITEMS, SENT_ITEMS, DRAFTS,
     * JUNK_EMAIL
     *
     * @param name <p>
     *            The folder name.
     *            </p>
     * @see FolderName
     */
    public void setName(FolderName name) {
        this.name = name.toString();
    }

    /**
     * <p>
     * The folder name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INBOX, DELETED_ITEMS, SENT_ITEMS, DRAFTS,
     * JUNK_EMAIL
     *
     * @param name <p>
     *            The folder name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FolderName
     */
    public FolderConfiguration withName(FolderName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The action to take on the folder contents at the end of the folder
     * configuration period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, DELETE, PERMANENTLY_DELETE
     *
     * @return <p>
     *         The action to take on the folder contents at the end of the
     *         folder configuration period.
     *         </p>
     * @see RetentionAction
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * The action to take on the folder contents at the end of the folder
     * configuration period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, DELETE, PERMANENTLY_DELETE
     *
     * @param action <p>
     *            The action to take on the folder contents at the end of the
     *            folder configuration period.
     *            </p>
     * @see RetentionAction
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action to take on the folder contents at the end of the folder
     * configuration period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, DELETE, PERMANENTLY_DELETE
     *
     * @param action <p>
     *            The action to take on the folder contents at the end of the
     *            folder configuration period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RetentionAction
     */
    public FolderConfiguration withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * The action to take on the folder contents at the end of the folder
     * configuration period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, DELETE, PERMANENTLY_DELETE
     *
     * @param action <p>
     *            The action to take on the folder contents at the end of the
     *            folder configuration period.
     *            </p>
     * @see RetentionAction
     */
    public void setAction(RetentionAction action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * The action to take on the folder contents at the end of the folder
     * configuration period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, DELETE, PERMANENTLY_DELETE
     *
     * @param action <p>
     *            The action to take on the folder contents at the end of the
     *            folder configuration period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RetentionAction
     */
    public FolderConfiguration withAction(RetentionAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The period of time at which the folder configuration action is applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 730<br/>
     *
     * @return <p>
     *         The period of time at which the folder configuration action is
     *         applied.
     *         </p>
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * <p>
     * The period of time at which the folder configuration action is applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 730<br/>
     *
     * @param period <p>
     *            The period of time at which the folder configuration action is
     *            applied.
     *            </p>
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * The period of time at which the folder configuration action is applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 730<br/>
     *
     * @param period <p>
     *            The period of time at which the folder configuration action is
     *            applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FolderConfiguration withPeriod(Integer period) {
        this.period = period;
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
        if (getAction() != null)
            sb.append("Action: " + getAction() + ",");
        if (getPeriod() != null)
            sb.append("Period: " + getPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FolderConfiguration == false)
            return false;
        FolderConfiguration other = (FolderConfiguration) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        return true;
    }
}
