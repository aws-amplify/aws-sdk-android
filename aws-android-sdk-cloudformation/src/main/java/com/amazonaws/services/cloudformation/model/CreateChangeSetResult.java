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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

/**
 * <p>
 * The output for the <a>CreateChangeSet</a> action.
 * </p>
 */
public class CreateChangeSetResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the change set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>arn:[-a-zA-Z0-9:/]*<br/>
     */
    private String id;

    /**
     * <p>
     * The unique ID of the stack.
     * </p>
     */
    private String stackId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the change set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>arn:[-a-zA-Z0-9:/]*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the change set.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the change set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>arn:[-a-zA-Z0-9:/]*<br/>
     *
     * @param id <p>
     *            The Amazon Resource Name (ARN) of the change set.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the change set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>arn:[-a-zA-Z0-9:/]*<br/>
     *
     * @param id <p>
     *            The Amazon Resource Name (ARN) of the change set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChangeSetResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The unique ID of the stack.
     * </p>
     *
     * @return <p>
     *         The unique ID of the stack.
     *         </p>
     */
    public String getStackId() {
        return stackId;
    }

    /**
     * <p>
     * The unique ID of the stack.
     * </p>
     *
     * @param stackId <p>
     *            The unique ID of the stack.
     *            </p>
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The unique ID of the stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackId <p>
     *            The unique ID of the stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChangeSetResult withStackId(String stackId) {
        this.stackId = stackId;
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
        if (getStackId() != null)
            sb.append("StackId: " + getStackId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateChangeSetResult == false)
            return false;
        CreateChangeSetResult other = (CreateChangeSetResult) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        return true;
    }
}
