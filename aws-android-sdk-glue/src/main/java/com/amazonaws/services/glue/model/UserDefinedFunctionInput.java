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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

/**
 * <p>
 * A structure used to create or update a user-defined function.
 * </p>
 */
public class UserDefinedFunctionInput implements Serializable {
    /**
     * <p>
     * The name of the function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String functionName;

    /**
     * <p>
     * The Java class that contains the function code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String className;

    /**
     * <p>
     * The owner of the function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String ownerName;

    /**
     * <p>
     * The owner type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, ROLE, GROUP
     */
    private String ownerType;

    /**
     * <p>
     * The resource URIs for the function.
     * </p>
     */
    private java.util.List<ResourceUri> resourceUris;

    /**
     * <p>
     * The name of the function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the function.
     *         </p>
     */
    public String getFunctionName() {
        return functionName;
    }

    /**
     * <p>
     * The name of the function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param functionName <p>
     *            The name of the function.
     *            </p>
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The name of the function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param functionName <p>
     *            The name of the function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserDefinedFunctionInput withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * <p>
     * The Java class that contains the function code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The Java class that contains the function code.
     *         </p>
     */
    public String getClassName() {
        return className;
    }

    /**
     * <p>
     * The Java class that contains the function code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param className <p>
     *            The Java class that contains the function code.
     *            </p>
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * <p>
     * The Java class that contains the function code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param className <p>
     *            The Java class that contains the function code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserDefinedFunctionInput withClassName(String className) {
        this.className = className;
        return this;
    }

    /**
     * <p>
     * The owner of the function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The owner of the function.
     *         </p>
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * <p>
     * The owner of the function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param ownerName <p>
     *            The owner of the function.
     *            </p>
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * <p>
     * The owner of the function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param ownerName <p>
     *            The owner of the function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserDefinedFunctionInput withOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    /**
     * <p>
     * The owner type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, ROLE, GROUP
     *
     * @return <p>
     *         The owner type.
     *         </p>
     * @see PrincipalType
     */
    public String getOwnerType() {
        return ownerType;
    }

    /**
     * <p>
     * The owner type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, ROLE, GROUP
     *
     * @param ownerType <p>
     *            The owner type.
     *            </p>
     * @see PrincipalType
     */
    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    /**
     * <p>
     * The owner type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, ROLE, GROUP
     *
     * @param ownerType <p>
     *            The owner type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PrincipalType
     */
    public UserDefinedFunctionInput withOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }

    /**
     * <p>
     * The owner type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, ROLE, GROUP
     *
     * @param ownerType <p>
     *            The owner type.
     *            </p>
     * @see PrincipalType
     */
    public void setOwnerType(PrincipalType ownerType) {
        this.ownerType = ownerType.toString();
    }

    /**
     * <p>
     * The owner type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, ROLE, GROUP
     *
     * @param ownerType <p>
     *            The owner type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PrincipalType
     */
    public UserDefinedFunctionInput withOwnerType(PrincipalType ownerType) {
        this.ownerType = ownerType.toString();
        return this;
    }

    /**
     * <p>
     * The resource URIs for the function.
     * </p>
     *
     * @return <p>
     *         The resource URIs for the function.
     *         </p>
     */
    public java.util.List<ResourceUri> getResourceUris() {
        return resourceUris;
    }

    /**
     * <p>
     * The resource URIs for the function.
     * </p>
     *
     * @param resourceUris <p>
     *            The resource URIs for the function.
     *            </p>
     */
    public void setResourceUris(java.util.Collection<ResourceUri> resourceUris) {
        if (resourceUris == null) {
            this.resourceUris = null;
            return;
        }

        this.resourceUris = new java.util.ArrayList<ResourceUri>(resourceUris);
    }

    /**
     * <p>
     * The resource URIs for the function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceUris <p>
     *            The resource URIs for the function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserDefinedFunctionInput withResourceUris(ResourceUri... resourceUris) {
        if (getResourceUris() == null) {
            this.resourceUris = new java.util.ArrayList<ResourceUri>(resourceUris.length);
        }
        for (ResourceUri value : resourceUris) {
            this.resourceUris.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The resource URIs for the function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceUris <p>
     *            The resource URIs for the function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserDefinedFunctionInput withResourceUris(java.util.Collection<ResourceUri> resourceUris) {
        setResourceUris(resourceUris);
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
        if (getFunctionName() != null)
            sb.append("FunctionName: " + getFunctionName() + ",");
        if (getClassName() != null)
            sb.append("ClassName: " + getClassName() + ",");
        if (getOwnerName() != null)
            sb.append("OwnerName: " + getOwnerName() + ",");
        if (getOwnerType() != null)
            sb.append("OwnerType: " + getOwnerType() + ",");
        if (getResourceUris() != null)
            sb.append("ResourceUris: " + getResourceUris());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getClassName() == null) ? 0 : getClassName().hashCode());
        hashCode = prime * hashCode + ((getOwnerName() == null) ? 0 : getOwnerName().hashCode());
        hashCode = prime * hashCode + ((getOwnerType() == null) ? 0 : getOwnerType().hashCode());
        hashCode = prime * hashCode
                + ((getResourceUris() == null) ? 0 : getResourceUris().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserDefinedFunctionInput == false)
            return false;
        UserDefinedFunctionInput other = (UserDefinedFunctionInput) obj;

        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null
                && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getClassName() == null ^ this.getClassName() == null)
            return false;
        if (other.getClassName() != null
                && other.getClassName().equals(this.getClassName()) == false)
            return false;
        if (other.getOwnerName() == null ^ this.getOwnerName() == null)
            return false;
        if (other.getOwnerName() != null
                && other.getOwnerName().equals(this.getOwnerName()) == false)
            return false;
        if (other.getOwnerType() == null ^ this.getOwnerType() == null)
            return false;
        if (other.getOwnerType() != null
                && other.getOwnerType().equals(this.getOwnerType()) == false)
            return false;
        if (other.getResourceUris() == null ^ this.getResourceUris() == null)
            return false;
        if (other.getResourceUris() != null
                && other.getResourceUris().equals(this.getResourceUris()) == false)
            return false;
        return true;
    }
}
