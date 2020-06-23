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

/**
 * <p>
 * Contains information about either a root or an organizational unit (OU) that
 * can contain OUs or accounts in an organization.
 * </p>
 */
public class Parent implements Serializable {
    /**
     * <p>
     * The unique identifier (ID) of the parent entity.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * parent ID string requires one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Root: A string that begins with "r-" followed by from 4 to 32 lower-case
     * letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): A string that begins with "ou-" followed by
     * from 4 to 32 lower-case letters or digits (the ID of the root that the OU
     * is in). This string is followed by a second "-" dash and from 8 to 32
     * additional lower-case letters or digits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(r-[0-9a-z]{4,32})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$
     * <br/>
     */
    private String id;

    /**
     * <p>
     * The type of the parent entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROOT, ORGANIZATIONAL_UNIT
     */
    private String type;

    /**
     * <p>
     * The unique identifier (ID) of the parent entity.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * parent ID string requires one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Root: A string that begins with "r-" followed by from 4 to 32 lower-case
     * letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): A string that begins with "ou-" followed by
     * from 4 to 32 lower-case letters or digits (the ID of the root that the OU
     * is in). This string is followed by a second "-" dash and from 8 to 32
     * additional lower-case letters or digits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(r-[0-9a-z]{4,32})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$
     * <br/>
     *
     * @return <p>
     *         The unique identifier (ID) of the parent entity.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         for a parent ID string requires one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Root: A string that begins with "r-" followed by from 4 to 32
     *         lower-case letters or digits.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Organizational unit (OU): A string that begins with "ou-"
     *         followed by from 4 to 32 lower-case letters or digits (the ID of
     *         the root that the OU is in). This string is followed by a second
     *         "-" dash and from 8 to 32 additional lower-case letters or
     *         digits.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier (ID) of the parent entity.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * parent ID string requires one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Root: A string that begins with "r-" followed by from 4 to 32 lower-case
     * letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): A string that begins with "ou-" followed by
     * from 4 to 32 lower-case letters or digits (the ID of the root that the OU
     * is in). This string is followed by a second "-" dash and from 8 to 32
     * additional lower-case letters or digits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(r-[0-9a-z]{4,32})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$
     * <br/>
     *
     * @param id <p>
     *            The unique identifier (ID) of the parent entity.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for a parent ID string requires one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Root: A string that begins with "r-" followed by from 4 to 32
     *            lower-case letters or digits.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Organizational unit (OU): A string that begins with "ou-"
     *            followed by from 4 to 32 lower-case letters or digits (the ID
     *            of the root that the OU is in). This string is followed by a
     *            second "-" dash and from 8 to 32 additional lower-case letters
     *            or digits.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier (ID) of the parent entity.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * parent ID string requires one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Root: A string that begins with "r-" followed by from 4 to 32 lower-case
     * letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): A string that begins with "ou-" followed by
     * from 4 to 32 lower-case letters or digits (the ID of the root that the OU
     * is in). This string is followed by a second "-" dash and from 8 to 32
     * additional lower-case letters or digits.
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
     * @param id <p>
     *            The unique identifier (ID) of the parent entity.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for a parent ID string requires one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Root: A string that begins with "r-" followed by from 4 to 32
     *            lower-case letters or digits.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Organizational unit (OU): A string that begins with "ou-"
     *            followed by from 4 to 32 lower-case letters or digits (the ID
     *            of the root that the OU is in). This string is followed by a
     *            second "-" dash and from 8 to 32 additional lower-case letters
     *            or digits.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Parent withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The type of the parent entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROOT, ORGANIZATIONAL_UNIT
     *
     * @return <p>
     *         The type of the parent entity.
     *         </p>
     * @see ParentType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the parent entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROOT, ORGANIZATIONAL_UNIT
     *
     * @param type <p>
     *            The type of the parent entity.
     *            </p>
     * @see ParentType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the parent entity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROOT, ORGANIZATIONAL_UNIT
     *
     * @param type <p>
     *            The type of the parent entity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParentType
     */
    public Parent withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the parent entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROOT, ORGANIZATIONAL_UNIT
     *
     * @param type <p>
     *            The type of the parent entity.
     *            </p>
     * @see ParentType
     */
    public void setType(ParentType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the parent entity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROOT, ORGANIZATIONAL_UNIT
     *
     * @param type <p>
     *            The type of the parent entity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParentType
     */
    public Parent withType(ParentType type) {
        this.type = type.toString();
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Parent == false)
            return false;
        Parent other = (Parent) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
