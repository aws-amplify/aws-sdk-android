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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * This data type is used as a response element in the action
 * <code>DescribeDBEngineVersions</code>.
 * </p>
 */
public class CharacterSet implements Serializable {
    /**
     * <p>
     * The name of the character set.
     * </p>
     */
    private String characterSetName;

    /**
     * <p>
     * The description of the character set.
     * </p>
     */
    private String characterSetDescription;

    /**
     * <p>
     * The name of the character set.
     * </p>
     *
     * @return <p>
     *         The name of the character set.
     *         </p>
     */
    public String getCharacterSetName() {
        return characterSetName;
    }

    /**
     * <p>
     * The name of the character set.
     * </p>
     *
     * @param characterSetName <p>
     *            The name of the character set.
     *            </p>
     */
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * <p>
     * The name of the character set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param characterSetName <p>
     *            The name of the character set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CharacterSet withCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
        return this;
    }

    /**
     * <p>
     * The description of the character set.
     * </p>
     *
     * @return <p>
     *         The description of the character set.
     *         </p>
     */
    public String getCharacterSetDescription() {
        return characterSetDescription;
    }

    /**
     * <p>
     * The description of the character set.
     * </p>
     *
     * @param characterSetDescription <p>
     *            The description of the character set.
     *            </p>
     */
    public void setCharacterSetDescription(String characterSetDescription) {
        this.characterSetDescription = characterSetDescription;
    }

    /**
     * <p>
     * The description of the character set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param characterSetDescription <p>
     *            The description of the character set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CharacterSet withCharacterSetDescription(String characterSetDescription) {
        this.characterSetDescription = characterSetDescription;
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
        if (getCharacterSetName() != null)
            sb.append("CharacterSetName: " + getCharacterSetName() + ",");
        if (getCharacterSetDescription() != null)
            sb.append("CharacterSetDescription: " + getCharacterSetDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCharacterSetName() == null) ? 0 : getCharacterSetName().hashCode());
        hashCode = prime
                * hashCode
                + ((getCharacterSetDescription() == null) ? 0 : getCharacterSetDescription()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CharacterSet == false)
            return false;
        CharacterSet other = (CharacterSet) obj;

        if (other.getCharacterSetName() == null ^ this.getCharacterSetName() == null)
            return false;
        if (other.getCharacterSetName() != null
                && other.getCharacterSetName().equals(this.getCharacterSetName()) == false)
            return false;
        if (other.getCharacterSetDescription() == null ^ this.getCharacterSetDescription() == null)
            return false;
        if (other.getCharacterSetDescription() != null
                && other.getCharacterSetDescription().equals(this.getCharacterSetDescription()) == false)
            return false;
        return true;
    }
}
