/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * A resource server scope.
 * </p>
 */
public class ResourceServerScopeType implements Serializable {
    /**
     * <p>
     * The name of the scope.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\x21\x23-\x2E\x30-\x5B\x5D-\x7E]+<br/>
     */
    private String scopeName;

    /**
     * <p>
     * A description of the scope.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String scopeDescription;

    /**
     * <p>
     * The name of the scope.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\x21\x23-\x2E\x30-\x5B\x5D-\x7E]+<br/>
     *
     * @return <p>
     *         The name of the scope.
     *         </p>
     */
    public String getScopeName() {
        return scopeName;
    }

    /**
     * <p>
     * The name of the scope.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\x21\x23-\x2E\x30-\x5B\x5D-\x7E]+<br/>
     *
     * @param scopeName <p>
     *            The name of the scope.
     *            </p>
     */
    public void setScopeName(String scopeName) {
        this.scopeName = scopeName;
    }

    /**
     * <p>
     * The name of the scope.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\x21\x23-\x2E\x30-\x5B\x5D-\x7E]+<br/>
     *
     * @param scopeName <p>
     *            The name of the scope.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceServerScopeType withScopeName(String scopeName) {
        this.scopeName = scopeName;
        return this;
    }

    /**
     * <p>
     * A description of the scope.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         A description of the scope.
     *         </p>
     */
    public String getScopeDescription() {
        return scopeDescription;
    }

    /**
     * <p>
     * A description of the scope.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param scopeDescription <p>
     *            A description of the scope.
     *            </p>
     */
    public void setScopeDescription(String scopeDescription) {
        this.scopeDescription = scopeDescription;
    }

    /**
     * <p>
     * A description of the scope.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param scopeDescription <p>
     *            A description of the scope.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceServerScopeType withScopeDescription(String scopeDescription) {
        this.scopeDescription = scopeDescription;
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
        if (getScopeName() != null)
            sb.append("ScopeName: " + getScopeName() + ",");
        if (getScopeDescription() != null)
            sb.append("ScopeDescription: " + getScopeDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScopeName() == null) ? 0 : getScopeName().hashCode());
        hashCode = prime * hashCode
                + ((getScopeDescription() == null) ? 0 : getScopeDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceServerScopeType == false)
            return false;
        ResourceServerScopeType other = (ResourceServerScopeType) obj;

        if (other.getScopeName() == null ^ this.getScopeName() == null)
            return false;
        if (other.getScopeName() != null
                && other.getScopeName().equals(this.getScopeName()) == false)
            return false;
        if (other.getScopeDescription() == null ^ this.getScopeDescription() == null)
            return false;
        if (other.getScopeDescription() != null
                && other.getScopeDescription().equals(this.getScopeDescription()) == false)
            return false;
        return true;
    }
}
