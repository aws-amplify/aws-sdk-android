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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * A property name returned from a <code>GetSearchSuggestions</code> call that
 * specifies a value in the <code>PropertyNameQuery</code> field.
 * </p>
 */
public class PropertyNameSuggestion implements Serializable {
    /**
     * <p>
     * A suggested property name based on what you entered in the search textbox
     * in the Amazon SageMaker console.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String propertyName;

    /**
     * <p>
     * A suggested property name based on what you entered in the search textbox
     * in the Amazon SageMaker console.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         A suggested property name based on what you entered in the search
     *         textbox in the Amazon SageMaker console.
     *         </p>
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * <p>
     * A suggested property name based on what you entered in the search textbox
     * in the Amazon SageMaker console.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param propertyName <p>
     *            A suggested property name based on what you entered in the
     *            search textbox in the Amazon SageMaker console.
     *            </p>
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * <p>
     * A suggested property name based on what you entered in the search textbox
     * in the Amazon SageMaker console.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param propertyName <p>
     *            A suggested property name based on what you entered in the
     *            search textbox in the Amazon SageMaker console.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PropertyNameSuggestion withPropertyName(String propertyName) {
        this.propertyName = propertyName;
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
        if (getPropertyName() != null)
            sb.append("PropertyName: " + getPropertyName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPropertyName() == null) ? 0 : getPropertyName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PropertyNameSuggestion == false)
            return false;
        PropertyNameSuggestion other = (PropertyNameSuggestion) obj;

        if (other.getPropertyName() == null ^ this.getPropertyName() == null)
            return false;
        if (other.getPropertyName() != null
                && other.getPropertyName().equals(this.getPropertyName()) == false)
            return false;
        return true;
    }
}
