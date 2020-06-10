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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;


/**
 * <p> Details about a package dependency. </p>
 */
public class PackageDependency implements Serializable {
    /**
     * <p> The namespace of the package. The package component that specifies its namespace depends on its type. For example: </p> <ul> <li> <p> The namespace of a Maven package is its <code>groupId</code>. </p> </li> <li> <p> The namespace of an npm package is its <code>scope</code>. </p> </li> <li> <p> A Python package does not contain a corresponding component, so Python packages do not have a namespace. </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     */
    private String namespace;

    /**
     * <p> The name of the package that this package depends on. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     */
    private String package;

    /**
     * <p> The type of a package dependency. The possible values depend on the package type. Example types are <code>compile</code>, <code>runtime</code>, and <code>test</code> for Maven packages, and <code>dev</code>, <code>prod</code>, and <code>optional</code> for npm packages. </p>
     */
    private String dependencyType;

    /**
     * <p> The required version, or version range, of the package that this package depends on. The version format is specific to the package type. For example, the following are possible valid required versions: <code>1.2.3</code>, <code>^2.3.4</code>, or <code>4.x</code>. </p>
     */
    private String versionRequirement;

    /**
     * <p> The namespace of the package. The package component that specifies its namespace depends on its type. For example: </p> <ul> <li> <p> The namespace of a Maven package is its <code>groupId</code>. </p> </li> <li> <p> The namespace of an npm package is its <code>scope</code>. </p> </li> <li> <p> A Python package does not contain a corresponding component, so Python packages do not have a namespace. </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @return <p> The namespace of the package. The package component that specifies its namespace depends on its type. For example: </p> <ul> <li> <p> The namespace of a Maven package is its <code>groupId</code>. </p> </li> <li> <p> The namespace of an npm package is its <code>scope</code>. </p> </li> <li> <p> A Python package does not contain a corresponding component, so Python packages do not have a namespace. </p> </li> </ul>
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * <p> The namespace of the package. The package component that specifies its namespace depends on its type. For example: </p> <ul> <li> <p> The namespace of a Maven package is its <code>groupId</code>. </p> </li> <li> <p> The namespace of an npm package is its <code>scope</code>. </p> </li> <li> <p> A Python package does not contain a corresponding component, so Python packages do not have a namespace. </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @param namespace <p> The namespace of the package. The package component that specifies its namespace depends on its type. For example: </p> <ul> <li> <p> The namespace of a Maven package is its <code>groupId</code>. </p> </li> <li> <p> The namespace of an npm package is its <code>scope</code>. </p> </li> <li> <p> A Python package does not contain a corresponding component, so Python packages do not have a namespace. </p> </li> </ul>
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p> The namespace of the package. The package component that specifies its namespace depends on its type. For example: </p> <ul> <li> <p> The namespace of a Maven package is its <code>groupId</code>. </p> </li> <li> <p> The namespace of an npm package is its <code>scope</code>. </p> </li> <li> <p> A Python package does not contain a corresponding component, so Python packages do not have a namespace. </p> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @param namespace <p> The namespace of the package. The package component that specifies its namespace depends on its type. For example: </p> <ul> <li> <p> The namespace of a Maven package is its <code>groupId</code>. </p> </li> <li> <p> The namespace of an npm package is its <code>scope</code>. </p> </li> <li> <p> A Python package does not contain a corresponding component, so Python packages do not have a namespace. </p> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PackageDependency withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * <p> The name of the package that this package depends on. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @return <p> The name of the package that this package depends on. </p>
     */
    public String getPackage() {
        return package;
    }

    /**
     * <p> The name of the package that this package depends on. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @param package <p> The name of the package that this package depends on. </p>
     */
    public void setPackage(String package) {
        this.package = package;
    }

    /**
     * <p> The name of the package that this package depends on. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @param package <p> The name of the package that this package depends on. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PackageDependency withPackage(String package) {
        this.package = package;
        return this;
    }

    /**
     * <p> The type of a package dependency. The possible values depend on the package type. Example types are <code>compile</code>, <code>runtime</code>, and <code>test</code> for Maven packages, and <code>dev</code>, <code>prod</code>, and <code>optional</code> for npm packages. </p>
     *
     * @return <p> The type of a package dependency. The possible values depend on the package type. Example types are <code>compile</code>, <code>runtime</code>, and <code>test</code> for Maven packages, and <code>dev</code>, <code>prod</code>, and <code>optional</code> for npm packages. </p>
     */
    public String getDependencyType() {
        return dependencyType;
    }

    /**
     * <p> The type of a package dependency. The possible values depend on the package type. Example types are <code>compile</code>, <code>runtime</code>, and <code>test</code> for Maven packages, and <code>dev</code>, <code>prod</code>, and <code>optional</code> for npm packages. </p>
     *
     * @param dependencyType <p> The type of a package dependency. The possible values depend on the package type. Example types are <code>compile</code>, <code>runtime</code>, and <code>test</code> for Maven packages, and <code>dev</code>, <code>prod</code>, and <code>optional</code> for npm packages. </p>
     */
    public void setDependencyType(String dependencyType) {
        this.dependencyType = dependencyType;
    }

    /**
     * <p> The type of a package dependency. The possible values depend on the package type. Example types are <code>compile</code>, <code>runtime</code>, and <code>test</code> for Maven packages, and <code>dev</code>, <code>prod</code>, and <code>optional</code> for npm packages. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dependencyType <p> The type of a package dependency. The possible values depend on the package type. Example types are <code>compile</code>, <code>runtime</code>, and <code>test</code> for Maven packages, and <code>dev</code>, <code>prod</code>, and <code>optional</code> for npm packages. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PackageDependency withDependencyType(String dependencyType) {
        this.dependencyType = dependencyType;
        return this;
    }

    /**
     * <p> The required version, or version range, of the package that this package depends on. The version format is specific to the package type. For example, the following are possible valid required versions: <code>1.2.3</code>, <code>^2.3.4</code>, or <code>4.x</code>. </p>
     *
     * @return <p> The required version, or version range, of the package that this package depends on. The version format is specific to the package type. For example, the following are possible valid required versions: <code>1.2.3</code>, <code>^2.3.4</code>, or <code>4.x</code>. </p>
     */
    public String getVersionRequirement() {
        return versionRequirement;
    }

    /**
     * <p> The required version, or version range, of the package that this package depends on. The version format is specific to the package type. For example, the following are possible valid required versions: <code>1.2.3</code>, <code>^2.3.4</code>, or <code>4.x</code>. </p>
     *
     * @param versionRequirement <p> The required version, or version range, of the package that this package depends on. The version format is specific to the package type. For example, the following are possible valid required versions: <code>1.2.3</code>, <code>^2.3.4</code>, or <code>4.x</code>. </p>
     */
    public void setVersionRequirement(String versionRequirement) {
        this.versionRequirement = versionRequirement;
    }

    /**
     * <p> The required version, or version range, of the package that this package depends on. The version format is specific to the package type. For example, the following are possible valid required versions: <code>1.2.3</code>, <code>^2.3.4</code>, or <code>4.x</code>. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param versionRequirement <p> The required version, or version range, of the package that this package depends on. The version format is specific to the package type. For example, the following are possible valid required versions: <code>1.2.3</code>, <code>^2.3.4</code>, or <code>4.x</code>. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PackageDependency withVersionRequirement(String versionRequirement) {
        this.versionRequirement = versionRequirement;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNamespace() != null) sb.append("namespace: " + getNamespace() + ",");
        if (getPackage() != null) sb.append("package: " + getPackage() + ",");
        if (getDependencyType() != null) sb.append("dependencyType: " + getDependencyType() + ",");
        if (getVersionRequirement() != null) sb.append("versionRequirement: " + getVersionRequirement());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getPackage() == null) ? 0 : getPackage().hashCode());
        hashCode = prime * hashCode + ((getDependencyType() == null) ? 0 : getDependencyType().hashCode());
        hashCode = prime * hashCode + ((getVersionRequirement() == null) ? 0 : getVersionRequirement().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PackageDependency == false) return false;
        PackageDependency other = (PackageDependency)obj;

        if (other.getNamespace() == null ^ this.getNamespace() == null) return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false) return false;
        if (other.getPackage() == null ^ this.getPackage() == null) return false;
        if (other.getPackage() != null && other.getPackage().equals(this.getPackage()) == false) return false;
        if (other.getDependencyType() == null ^ this.getDependencyType() == null) return false;
        if (other.getDependencyType() != null && other.getDependencyType().equals(this.getDependencyType()) == false) return false;
        if (other.getVersionRequirement() == null ^ this.getVersionRequirement() == null) return false;
        if (other.getVersionRequirement() != null && other.getVersionRequirement().equals(this.getVersionRequirement()) == false) return false;
        return true;
    }
}
