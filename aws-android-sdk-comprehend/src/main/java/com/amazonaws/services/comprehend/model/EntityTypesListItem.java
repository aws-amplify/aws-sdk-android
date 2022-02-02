/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

/**
 * <p>
 * An entity type within a labeled training dataset that Amazon Comprehend uses
 * to train a custom entity recognizer.
 * </p>
 */
public class EntityTypesListItem implements Serializable {
    /**
     * <p>
     * An entity type within a labeled training dataset that Amazon Comprehend
     * uses to train a custom entity recognizer.
     * </p>
     * <p>
     * Entity types must not contain the following invalid characters: \n (line
     * break), \\n (escaped line break, \r (carriage return), \\r (escaped
     * carriage return), \t (tab), \\t (escaped tab), space, and , (comma).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^(?![^\n\r\t,]*\\n|\\r|\\t)[^\n\r\t,]+$<br/>
     */
    private String type;

    /**
     * <p>
     * An entity type within a labeled training dataset that Amazon Comprehend
     * uses to train a custom entity recognizer.
     * </p>
     * <p>
     * Entity types must not contain the following invalid characters: \n (line
     * break), \\n (escaped line break, \r (carriage return), \\r (escaped
     * carriage return), \t (tab), \\t (escaped tab), space, and , (comma).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^(?![^\n\r\t,]*\\n|\\r|\\t)[^\n\r\t,]+$<br/>
     *
     * @return <p>
     *         An entity type within a labeled training dataset that Amazon
     *         Comprehend uses to train a custom entity recognizer.
     *         </p>
     *         <p>
     *         Entity types must not contain the following invalid characters:
     *         \n (line break), \\n (escaped line break, \r (carriage return),
     *         \\r (escaped carriage return), \t (tab), \\t (escaped tab),
     *         space, and , (comma).
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * An entity type within a labeled training dataset that Amazon Comprehend
     * uses to train a custom entity recognizer.
     * </p>
     * <p>
     * Entity types must not contain the following invalid characters: \n (line
     * break), \\n (escaped line break, \r (carriage return), \\r (escaped
     * carriage return), \t (tab), \\t (escaped tab), space, and , (comma).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^(?![^\n\r\t,]*\\n|\\r|\\t)[^\n\r\t,]+$<br/>
     *
     * @param type <p>
     *            An entity type within a labeled training dataset that Amazon
     *            Comprehend uses to train a custom entity recognizer.
     *            </p>
     *            <p>
     *            Entity types must not contain the following invalid
     *            characters: \n (line break), \\n (escaped line break, \r
     *            (carriage return), \\r (escaped carriage return), \t (tab),
     *            \\t (escaped tab), space, and , (comma).
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * An entity type within a labeled training dataset that Amazon Comprehend
     * uses to train a custom entity recognizer.
     * </p>
     * <p>
     * Entity types must not contain the following invalid characters: \n (line
     * break), \\n (escaped line break, \r (carriage return), \\r (escaped
     * carriage return), \t (tab), \\t (escaped tab), space, and , (comma).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^(?![^\n\r\t,]*\\n|\\r|\\t)[^\n\r\t,]+$<br/>
     *
     * @param type <p>
     *            An entity type within a labeled training dataset that Amazon
     *            Comprehend uses to train a custom entity recognizer.
     *            </p>
     *            <p>
     *            Entity types must not contain the following invalid
     *            characters: \n (line break), \\n (escaped line break, \r
     *            (carriage return), \\r (escaped carriage return), \t (tab),
     *            \\t (escaped tab), space, and , (comma).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityTypesListItem withType(String type) {
        this.type = type;
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
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityTypesListItem == false)
            return false;
        EntityTypesListItem other = (EntityTypesListItem) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
