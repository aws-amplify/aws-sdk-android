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

public class ListImportsResult implements Serializable {
    /**
     * <p>
     * A list of stack names that are importing the specified exported output
     * value.
     * </p>
     */
    private java.util.List<String> imports;

    /**
     * <p>
     * A string that identifies the next page of exports. If there is no
     * additional page, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of stack names that are importing the specified exported output
     * value.
     * </p>
     *
     * @return <p>
     *         A list of stack names that are importing the specified exported
     *         output value.
     *         </p>
     */
    public java.util.List<String> getImports() {
        return imports;
    }

    /**
     * <p>
     * A list of stack names that are importing the specified exported output
     * value.
     * </p>
     *
     * @param imports <p>
     *            A list of stack names that are importing the specified
     *            exported output value.
     *            </p>
     */
    public void setImports(java.util.Collection<String> imports) {
        if (imports == null) {
            this.imports = null;
            return;
        }

        this.imports = new java.util.ArrayList<String>(imports);
    }

    /**
     * <p>
     * A list of stack names that are importing the specified exported output
     * value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imports <p>
     *            A list of stack names that are importing the specified
     *            exported output value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListImportsResult withImports(String... imports) {
        if (getImports() == null) {
            this.imports = new java.util.ArrayList<String>(imports.length);
        }
        for (String value : imports) {
            this.imports.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of stack names that are importing the specified exported output
     * value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imports <p>
     *            A list of stack names that are importing the specified
     *            exported output value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListImportsResult withImports(java.util.Collection<String> imports) {
        setImports(imports);
        return this;
    }

    /**
     * <p>
     * A string that identifies the next page of exports. If there is no
     * additional page, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         A string that identifies the next page of exports. If there is no
     *         additional page, this value is null.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A string that identifies the next page of exports. If there is no
     * additional page, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            A string that identifies the next page of exports. If there is
     *            no additional page, this value is null.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string that identifies the next page of exports. If there is no
     * additional page, this value is null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            A string that identifies the next page of exports. If there is
     *            no additional page, this value is null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListImportsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getImports() != null)
            sb.append("Imports: " + getImports() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImports() == null) ? 0 : getImports().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListImportsResult == false)
            return false;
        ListImportsResult other = (ListImportsResult) obj;

        if (other.getImports() == null ^ this.getImports() == null)
            return false;
        if (other.getImports() != null && other.getImports().equals(this.getImports()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
