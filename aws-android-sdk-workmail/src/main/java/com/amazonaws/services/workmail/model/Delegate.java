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
 * The name of the attribute, which is one of the values defined in the
 * UserAttribute enumeration.
 * </p>
 */
public class Delegate implements Serializable {
    /**
     * <p>
     * The identifier for the user or group associated as the resource's
     * delegate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String id;

    /**
     * <p>
     * The type of the delegate: user or group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GROUP, USER
     */
    private String type;

    /**
     * <p>
     * The identifier for the user or group associated as the resource's
     * delegate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The identifier for the user or group associated as the resource's
     *         delegate.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier for the user or group associated as the resource's
     * delegate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param id <p>
     *            The identifier for the user or group associated as the
     *            resource's delegate.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the user or group associated as the resource's
     * delegate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param id <p>
     *            The identifier for the user or group associated as the
     *            resource's delegate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Delegate withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The type of the delegate: user or group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GROUP, USER
     *
     * @return <p>
     *         The type of the delegate: user or group.
     *         </p>
     * @see MemberType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the delegate: user or group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GROUP, USER
     *
     * @param type <p>
     *            The type of the delegate: user or group.
     *            </p>
     * @see MemberType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the delegate: user or group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GROUP, USER
     *
     * @param type <p>
     *            The type of the delegate: user or group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MemberType
     */
    public Delegate withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the delegate: user or group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GROUP, USER
     *
     * @param type <p>
     *            The type of the delegate: user or group.
     *            </p>
     * @see MemberType
     */
    public void setType(MemberType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the delegate: user or group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GROUP, USER
     *
     * @param type <p>
     *            The type of the delegate: user or group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MemberType
     */
    public Delegate withType(MemberType type) {
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

        if (obj instanceof Delegate == false)
            return false;
        Delegate other = (Delegate) obj;

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
