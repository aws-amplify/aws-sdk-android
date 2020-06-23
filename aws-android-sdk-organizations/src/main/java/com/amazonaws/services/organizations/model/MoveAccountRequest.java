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

package com.amazonaws.services.organizations.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Moves an account from its current source parent root or organizational unit
 * (OU) to the specified destination parent root or OU.
 * </p>
 * <p>
 * This operation can be called only from the organization's master account.
 * </p>
 */
public class MoveAccountRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier (ID) of the account that you want to move.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * account ID string requires exactly 12 digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     */
    private String accountId;

    /**
     * <p>
     * The unique identifier (ID) of the root or organizational unit that you
     * want to move the account from.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * parent ID string requires one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Root</b> - A string that begins with "r-" followed by from 4 to 32
     * lowercase letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Organizational unit (OU)</b> - A string that begins with "ou-"
     * followed by from 4 to 32 lowercase letters or digits (the ID of the root
     * that the OU is in). This string is followed by a second "-" dash and from
     * 8 to 32 additional lowercase letters or digits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(r-[0-9a-z]{4,32})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$
     * <br/>
     */
    private String sourceParentId;

    /**
     * <p>
     * The unique identifier (ID) of the root or organizational unit that you
     * want to move the account to.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * parent ID string requires one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Root</b> - A string that begins with "r-" followed by from 4 to 32
     * lowercase letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Organizational unit (OU)</b> - A string that begins with "ou-"
     * followed by from 4 to 32 lowercase letters or digits (the ID of the root
     * that the OU is in). This string is followed by a second "-" dash and from
     * 8 to 32 additional lowercase letters or digits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(r-[0-9a-z]{4,32})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$
     * <br/>
     */
    private String destinationParentId;

    /**
     * <p>
     * The unique identifier (ID) of the account that you want to move.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * account ID string requires exactly 12 digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @return <p>
     *         The unique identifier (ID) of the account that you want to move.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         for an account ID string requires exactly 12 digits.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the account that you want to move.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * account ID string requires exactly 12 digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param accountId <p>
     *            The unique identifier (ID) of the account that you want to
     *            move.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for an account ID string requires exactly 12
     *            digits.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the account that you want to move.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * account ID string requires exactly 12 digits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param accountId <p>
     *            The unique identifier (ID) of the account that you want to
     *            move.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for an account ID string requires exactly 12
     *            digits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MoveAccountRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The unique identifier (ID) of the root or organizational unit that you
     * want to move the account from.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * parent ID string requires one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Root</b> - A string that begins with "r-" followed by from 4 to 32
     * lowercase letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Organizational unit (OU)</b> - A string that begins with "ou-"
     * followed by from 4 to 32 lowercase letters or digits (the ID of the root
     * that the OU is in). This string is followed by a second "-" dash and from
     * 8 to 32 additional lowercase letters or digits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(r-[0-9a-z]{4,32})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$
     * <br/>
     *
     * @return <p>
     *         The unique identifier (ID) of the root or organizational unit
     *         that you want to move the account from.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         for a parent ID string requires one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Root</b> - A string that begins with "r-" followed by from 4
     *         to 32 lowercase letters or digits.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Organizational unit (OU)</b> - A string that begins with "ou-"
     *         followed by from 4 to 32 lowercase letters or digits (the ID of
     *         the root that the OU is in). This string is followed by a second
     *         "-" dash and from 8 to 32 additional lowercase letters or digits.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getSourceParentId() {
        return sourceParentId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the root or organizational unit that you
     * want to move the account from.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * parent ID string requires one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Root</b> - A string that begins with "r-" followed by from 4 to 32
     * lowercase letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Organizational unit (OU)</b> - A string that begins with "ou-"
     * followed by from 4 to 32 lowercase letters or digits (the ID of the root
     * that the OU is in). This string is followed by a second "-" dash and from
     * 8 to 32 additional lowercase letters or digits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(r-[0-9a-z]{4,32})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$
     * <br/>
     *
     * @param sourceParentId <p>
     *            The unique identifier (ID) of the root or organizational unit
     *            that you want to move the account from.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for a parent ID string requires one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Root</b> - A string that begins with "r-" followed by from
     *            4 to 32 lowercase letters or digits.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Organizational unit (OU)</b> - A string that begins with
     *            "ou-" followed by from 4 to 32 lowercase letters or digits
     *            (the ID of the root that the OU is in). This string is
     *            followed by a second "-" dash and from 8 to 32 additional
     *            lowercase letters or digits.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setSourceParentId(String sourceParentId) {
        this.sourceParentId = sourceParentId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the root or organizational unit that you
     * want to move the account from.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * parent ID string requires one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Root</b> - A string that begins with "r-" followed by from 4 to 32
     * lowercase letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Organizational unit (OU)</b> - A string that begins with "ou-"
     * followed by from 4 to 32 lowercase letters or digits (the ID of the root
     * that the OU is in). This string is followed by a second "-" dash and from
     * 8 to 32 additional lowercase letters or digits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(r-[0-9a-z]{4,32})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$
     * <br/>
     *
     * @param sourceParentId <p>
     *            The unique identifier (ID) of the root or organizational unit
     *            that you want to move the account from.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for a parent ID string requires one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Root</b> - A string that begins with "r-" followed by from
     *            4 to 32 lowercase letters or digits.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Organizational unit (OU)</b> - A string that begins with
     *            "ou-" followed by from 4 to 32 lowercase letters or digits
     *            (the ID of the root that the OU is in). This string is
     *            followed by a second "-" dash and from 8 to 32 additional
     *            lowercase letters or digits.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MoveAccountRequest withSourceParentId(String sourceParentId) {
        this.sourceParentId = sourceParentId;
        return this;
    }

    /**
     * <p>
     * The unique identifier (ID) of the root or organizational unit that you
     * want to move the account to.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * parent ID string requires one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Root</b> - A string that begins with "r-" followed by from 4 to 32
     * lowercase letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Organizational unit (OU)</b> - A string that begins with "ou-"
     * followed by from 4 to 32 lowercase letters or digits (the ID of the root
     * that the OU is in). This string is followed by a second "-" dash and from
     * 8 to 32 additional lowercase letters or digits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(r-[0-9a-z]{4,32})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$
     * <br/>
     *
     * @return <p>
     *         The unique identifier (ID) of the root or organizational unit
     *         that you want to move the account to.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         for a parent ID string requires one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Root</b> - A string that begins with "r-" followed by from 4
     *         to 32 lowercase letters or digits.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Organizational unit (OU)</b> - A string that begins with "ou-"
     *         followed by from 4 to 32 lowercase letters or digits (the ID of
     *         the root that the OU is in). This string is followed by a second
     *         "-" dash and from 8 to 32 additional lowercase letters or digits.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getDestinationParentId() {
        return destinationParentId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the root or organizational unit that you
     * want to move the account to.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * parent ID string requires one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Root</b> - A string that begins with "r-" followed by from 4 to 32
     * lowercase letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Organizational unit (OU)</b> - A string that begins with "ou-"
     * followed by from 4 to 32 lowercase letters or digits (the ID of the root
     * that the OU is in). This string is followed by a second "-" dash and from
     * 8 to 32 additional lowercase letters or digits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(r-[0-9a-z]{4,32})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$
     * <br/>
     *
     * @param destinationParentId <p>
     *            The unique identifier (ID) of the root or organizational unit
     *            that you want to move the account to.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for a parent ID string requires one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Root</b> - A string that begins with "r-" followed by from
     *            4 to 32 lowercase letters or digits.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Organizational unit (OU)</b> - A string that begins with
     *            "ou-" followed by from 4 to 32 lowercase letters or digits
     *            (the ID of the root that the OU is in). This string is
     *            followed by a second "-" dash and from 8 to 32 additional
     *            lowercase letters or digits.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDestinationParentId(String destinationParentId) {
        this.destinationParentId = destinationParentId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the root or organizational unit that you
     * want to move the account to.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * parent ID string requires one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Root</b> - A string that begins with "r-" followed by from 4 to 32
     * lowercase letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Organizational unit (OU)</b> - A string that begins with "ou-"
     * followed by from 4 to 32 lowercase letters or digits (the ID of the root
     * that the OU is in). This string is followed by a second "-" dash and from
     * 8 to 32 additional lowercase letters or digits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(r-[0-9a-z]{4,32})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$
     * <br/>
     *
     * @param destinationParentId <p>
     *            The unique identifier (ID) of the root or organizational unit
     *            that you want to move the account to.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for a parent ID string requires one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Root</b> - A string that begins with "r-" followed by from
     *            4 to 32 lowercase letters or digits.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Organizational unit (OU)</b> - A string that begins with
     *            "ou-" followed by from 4 to 32 lowercase letters or digits
     *            (the ID of the root that the OU is in). This string is
     *            followed by a second "-" dash and from 8 to 32 additional
     *            lowercase letters or digits.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MoveAccountRequest withDestinationParentId(String destinationParentId) {
        this.destinationParentId = destinationParentId;
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
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId() + ",");
        if (getSourceParentId() != null)
            sb.append("SourceParentId: " + getSourceParentId() + ",");
        if (getDestinationParentId() != null)
            sb.append("DestinationParentId: " + getDestinationParentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getSourceParentId() == null) ? 0 : getSourceParentId().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationParentId() == null) ? 0 : getDestinationParentId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MoveAccountRequest == false)
            return false;
        MoveAccountRequest other = (MoveAccountRequest) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getSourceParentId() == null ^ this.getSourceParentId() == null)
            return false;
        if (other.getSourceParentId() != null
                && other.getSourceParentId().equals(this.getSourceParentId()) == false)
            return false;
        if (other.getDestinationParentId() == null ^ this.getDestinationParentId() == null)
            return false;
        if (other.getDestinationParentId() != null
                && other.getDestinationParentId().equals(this.getDestinationParentId()) == false)
            return false;
        return true;
    }
}
