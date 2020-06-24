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

package com.amazonaws.services.codecommit.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the type of an object in a merge operation.
 * </p>
 */
public class ObjectTypes implements Serializable {
    /**
     * <p>
     * The type of the object in the source branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE, DIRECTORY, GIT_LINK, SYMBOLIC_LINK
     */
    private String source;

    /**
     * <p>
     * The type of the object in the destination branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE, DIRECTORY, GIT_LINK, SYMBOLIC_LINK
     */
    private String destination;

    /**
     * <p>
     * The type of the object in the base commit of the merge.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE, DIRECTORY, GIT_LINK, SYMBOLIC_LINK
     */
    private String base;

    /**
     * <p>
     * The type of the object in the source branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE, DIRECTORY, GIT_LINK, SYMBOLIC_LINK
     *
     * @return <p>
     *         The type of the object in the source branch.
     *         </p>
     * @see ObjectTypeEnum
     */
    public String getSource() {
        return source;
    }

    /**
     * <p>
     * The type of the object in the source branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE, DIRECTORY, GIT_LINK, SYMBOLIC_LINK
     *
     * @param source <p>
     *            The type of the object in the source branch.
     *            </p>
     * @see ObjectTypeEnum
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The type of the object in the source branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE, DIRECTORY, GIT_LINK, SYMBOLIC_LINK
     *
     * @param source <p>
     *            The type of the object in the source branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectTypeEnum
     */
    public ObjectTypes withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * <p>
     * The type of the object in the source branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE, DIRECTORY, GIT_LINK, SYMBOLIC_LINK
     *
     * @param source <p>
     *            The type of the object in the source branch.
     *            </p>
     * @see ObjectTypeEnum
     */
    public void setSource(ObjectTypeEnum source) {
        this.source = source.toString();
    }

    /**
     * <p>
     * The type of the object in the source branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE, DIRECTORY, GIT_LINK, SYMBOLIC_LINK
     *
     * @param source <p>
     *            The type of the object in the source branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectTypeEnum
     */
    public ObjectTypes withSource(ObjectTypeEnum source) {
        this.source = source.toString();
        return this;
    }

    /**
     * <p>
     * The type of the object in the destination branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE, DIRECTORY, GIT_LINK, SYMBOLIC_LINK
     *
     * @return <p>
     *         The type of the object in the destination branch.
     *         </p>
     * @see ObjectTypeEnum
     */
    public String getDestination() {
        return destination;
    }

    /**
     * <p>
     * The type of the object in the destination branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE, DIRECTORY, GIT_LINK, SYMBOLIC_LINK
     *
     * @param destination <p>
     *            The type of the object in the destination branch.
     *            </p>
     * @see ObjectTypeEnum
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The type of the object in the destination branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE, DIRECTORY, GIT_LINK, SYMBOLIC_LINK
     *
     * @param destination <p>
     *            The type of the object in the destination branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectTypeEnum
     */
    public ObjectTypes withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * <p>
     * The type of the object in the destination branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE, DIRECTORY, GIT_LINK, SYMBOLIC_LINK
     *
     * @param destination <p>
     *            The type of the object in the destination branch.
     *            </p>
     * @see ObjectTypeEnum
     */
    public void setDestination(ObjectTypeEnum destination) {
        this.destination = destination.toString();
    }

    /**
     * <p>
     * The type of the object in the destination branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE, DIRECTORY, GIT_LINK, SYMBOLIC_LINK
     *
     * @param destination <p>
     *            The type of the object in the destination branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectTypeEnum
     */
    public ObjectTypes withDestination(ObjectTypeEnum destination) {
        this.destination = destination.toString();
        return this;
    }

    /**
     * <p>
     * The type of the object in the base commit of the merge.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE, DIRECTORY, GIT_LINK, SYMBOLIC_LINK
     *
     * @return <p>
     *         The type of the object in the base commit of the merge.
     *         </p>
     * @see ObjectTypeEnum
     */
    public String getBase() {
        return base;
    }

    /**
     * <p>
     * The type of the object in the base commit of the merge.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE, DIRECTORY, GIT_LINK, SYMBOLIC_LINK
     *
     * @param base <p>
     *            The type of the object in the base commit of the merge.
     *            </p>
     * @see ObjectTypeEnum
     */
    public void setBase(String base) {
        this.base = base;
    }

    /**
     * <p>
     * The type of the object in the base commit of the merge.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE, DIRECTORY, GIT_LINK, SYMBOLIC_LINK
     *
     * @param base <p>
     *            The type of the object in the base commit of the merge.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectTypeEnum
     */
    public ObjectTypes withBase(String base) {
        this.base = base;
        return this;
    }

    /**
     * <p>
     * The type of the object in the base commit of the merge.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE, DIRECTORY, GIT_LINK, SYMBOLIC_LINK
     *
     * @param base <p>
     *            The type of the object in the base commit of the merge.
     *            </p>
     * @see ObjectTypeEnum
     */
    public void setBase(ObjectTypeEnum base) {
        this.base = base.toString();
    }

    /**
     * <p>
     * The type of the object in the base commit of the merge.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE, DIRECTORY, GIT_LINK, SYMBOLIC_LINK
     *
     * @param base <p>
     *            The type of the object in the base commit of the merge.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectTypeEnum
     */
    public ObjectTypes withBase(ObjectTypeEnum base) {
        this.base = base.toString();
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
        if (getSource() != null)
            sb.append("source: " + getSource() + ",");
        if (getDestination() != null)
            sb.append("destination: " + getDestination() + ",");
        if (getBase() != null)
            sb.append("base: " + getBase());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode
                + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getBase() == null) ? 0 : getBase().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ObjectTypes == false)
            return false;
        ObjectTypes other = (ObjectTypes) obj;

        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null
                && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getBase() == null ^ this.getBase() == null)
            return false;
        if (other.getBase() != null && other.getBase().equals(this.getBase()) == false)
            return false;
        return true;
    }
}
