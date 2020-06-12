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

package com.amazonaws.services.models.lex.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes all versions of the slot type, including the <code>$LATEST</code>
 * version. To delete a specific version of the slot type, use the
 * <a>DeleteSlotTypeVersion</a> operation.
 * </p>
 * <p>
 * You can delete a version of a slot type only if it is not referenced. To
 * delete a slot type that is referred to in one or more intents, you must
 * remove those references first.
 * </p>
 * <note>
 * <p>
 * If you get the <code>ResourceInUseException</code> exception, the exception
 * provides an example reference that shows the intent where the slot type is
 * referenced. To remove the reference to the slot type, either update the
 * intent or delete it. If you get the same exception when you attempt to delete
 * the slot type again, repeat until the slot type has no references and the
 * <code>DeleteSlotType</code> call is successful.
 * </p>
 * </note>
 * <p>
 * This operation requires permission for the <code>lex:DeleteSlotType</code>
 * action.
 * </p>
 */
public class DeleteSlotTypeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the slot type. The name is case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     */
    private String name;

    /**
     * <p>
     * The name of the slot type. The name is case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @return <p>
     *         The name of the slot type. The name is case sensitive.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the slot type. The name is case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the slot type. The name is case sensitive.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the slot type. The name is case sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the slot type. The name is case sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteSlotTypeRequest withName(String name) {
        this.name = name;
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
            sb.append("name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSlotTypeRequest == false)
            return false;
        DeleteSlotTypeRequest other = (DeleteSlotTypeRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
