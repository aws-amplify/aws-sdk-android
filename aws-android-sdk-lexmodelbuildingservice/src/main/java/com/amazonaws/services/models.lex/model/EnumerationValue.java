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

/**
 * <p>
 * Each slot type can have a set of values. Each enumeration value represents a
 * value the slot type can take.
 * </p>
 * <p>
 * For example, a pizza ordering bot could have a slot type that specifies the
 * type of crust that the pizza should have. The slot type could include the
 * values
 * </p>
 * <ul>
 * <li>
 * <p>
 * thick
 * </p>
 * </li>
 * <li>
 * <p>
 * thin
 * </p>
 * </li>
 * <li>
 * <p>
 * stuffed
 * </p>
 * </li>
 * </ul>
 */
public class EnumerationValue implements Serializable {
    /**
     * <p>
     * The value of the slot type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     */
    private String value;

    /**
     * <p>
     * Additional values related to the slot type value.
     * </p>
     */
    private java.util.List<String> synonyms;

    /**
     * <p>
     * The value of the slot type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     *
     * @return <p>
     *         The value of the slot type.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value of the slot type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     *
     * @param value <p>
     *            The value of the slot type.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the slot type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     *
     * @param value <p>
     *            The value of the slot type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnumerationValue withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * Additional values related to the slot type value.
     * </p>
     *
     * @return <p>
     *         Additional values related to the slot type value.
     *         </p>
     */
    public java.util.List<String> getSynonyms() {
        return synonyms;
    }

    /**
     * <p>
     * Additional values related to the slot type value.
     * </p>
     *
     * @param synonyms <p>
     *            Additional values related to the slot type value.
     *            </p>
     */
    public void setSynonyms(java.util.Collection<String> synonyms) {
        if (synonyms == null) {
            this.synonyms = null;
            return;
        }

        this.synonyms = new java.util.ArrayList<String>(synonyms);
    }

    /**
     * <p>
     * Additional values related to the slot type value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param synonyms <p>
     *            Additional values related to the slot type value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnumerationValue withSynonyms(String... synonyms) {
        if (getSynonyms() == null) {
            this.synonyms = new java.util.ArrayList<String>(synonyms.length);
        }
        for (String value : synonyms) {
            this.synonyms.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Additional values related to the slot type value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param synonyms <p>
     *            Additional values related to the slot type value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnumerationValue withSynonyms(java.util.Collection<String> synonyms) {
        setSynonyms(synonyms);
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
        if (getValue() != null)
            sb.append("value: " + getValue() + ",");
        if (getSynonyms() != null)
            sb.append("synonyms: " + getSynonyms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getSynonyms() == null) ? 0 : getSynonyms().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnumerationValue == false)
            return false;
        EnumerationValue other = (EnumerationValue) obj;

        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getSynonyms() == null ^ this.getSynonyms() == null)
            return false;
        if (other.getSynonyms() != null && other.getSynonyms().equals(this.getSynonyms()) == false)
            return false;
        return true;
    }
}
