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
 * Contains summary information about a specific version of a CloudFormation
 * type.
 * </p>
 */
public class TypeVersionSummary implements Serializable {
    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RESOURCE
     */
    private String type;

    /**
     * <p>
     * The name of the type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 196<br/>
     * <b>Pattern: </b>[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}
     * <br/>
     */
    private String typeName;

    /**
     * <p>
     * The ID of a specific version of the type. The version ID is the value at
     * the end of the Amazon Resource Name (ARN) assigned to the type version
     * when it is registered.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[A-Za-z0-9-]+<br/>
     */
    private String versionId;

    /**
     * <p>
     * Whether the specified type version is set as the default version.
     * </p>
     */
    private Boolean isDefaultVersion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[A-Za-z0-9-]{0,64}:cloudformation:[A-Za-z0-9-]{1,64
     * }:([0-9]{12})?:type/.+<br/>
     */
    private String arn;

    /**
     * <p>
     * When the version was registered.
     * </p>
     */
    private java.util.Date timeCreated;

    /**
     * <p>
     * The description of the type version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RESOURCE
     *
     * @return <p>
     *         The kind of type.
     *         </p>
     * @see RegistryType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RESOURCE
     *
     * @param type <p>
     *            The kind of type.
     *            </p>
     * @see RegistryType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RESOURCE
     *
     * @param type <p>
     *            The kind of type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RegistryType
     */
    public TypeVersionSummary withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RESOURCE
     *
     * @param type <p>
     *            The kind of type.
     *            </p>
     * @see RegistryType
     */
    public void setType(RegistryType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RESOURCE
     *
     * @param type <p>
     *            The kind of type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RegistryType
     */
    public TypeVersionSummary withType(RegistryType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 196<br/>
     * <b>Pattern: </b>[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}
     * <br/>
     *
     * @return <p>
     *         The name of the type.
     *         </p>
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * <p>
     * The name of the type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 196<br/>
     * <b>Pattern: </b>[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}
     * <br/>
     *
     * @param typeName <p>
     *            The name of the type.
     *            </p>
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 196<br/>
     * <b>Pattern: </b>[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}
     * <br/>
     *
     * @param typeName <p>
     *            The name of the type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TypeVersionSummary withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * <p>
     * The ID of a specific version of the type. The version ID is the value at
     * the end of the Amazon Resource Name (ARN) assigned to the type version
     * when it is registered.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[A-Za-z0-9-]+<br/>
     *
     * @return <p>
     *         The ID of a specific version of the type. The version ID is the
     *         value at the end of the Amazon Resource Name (ARN) assigned to
     *         the type version when it is registered.
     *         </p>
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * <p>
     * The ID of a specific version of the type. The version ID is the value at
     * the end of the Amazon Resource Name (ARN) assigned to the type version
     * when it is registered.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[A-Za-z0-9-]+<br/>
     *
     * @param versionId <p>
     *            The ID of a specific version of the type. The version ID is
     *            the value at the end of the Amazon Resource Name (ARN)
     *            assigned to the type version when it is registered.
     *            </p>
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The ID of a specific version of the type. The version ID is the value at
     * the end of the Amazon Resource Name (ARN) assigned to the type version
     * when it is registered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[A-Za-z0-9-]+<br/>
     *
     * @param versionId <p>
     *            The ID of a specific version of the type. The version ID is
     *            the value at the end of the Amazon Resource Name (ARN)
     *            assigned to the type version when it is registered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TypeVersionSummary withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * <p>
     * Whether the specified type version is set as the default version.
     * </p>
     *
     * @return <p>
     *         Whether the specified type version is set as the default version.
     *         </p>
     */
    public Boolean isIsDefaultVersion() {
        return isDefaultVersion;
    }

    /**
     * <p>
     * Whether the specified type version is set as the default version.
     * </p>
     *
     * @return <p>
     *         Whether the specified type version is set as the default version.
     *         </p>
     */
    public Boolean getIsDefaultVersion() {
        return isDefaultVersion;
    }

    /**
     * <p>
     * Whether the specified type version is set as the default version.
     * </p>
     *
     * @param isDefaultVersion <p>
     *            Whether the specified type version is set as the default
     *            version.
     *            </p>
     */
    public void setIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
    }

    /**
     * <p>
     * Whether the specified type version is set as the default version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isDefaultVersion <p>
     *            Whether the specified type version is set as the default
     *            version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TypeVersionSummary withIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[A-Za-z0-9-]{0,64}:cloudformation:[A-Za-z0-9-]{1,64
     * }:([0-9]{12})?:type/.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the type version.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[A-Za-z0-9-]{0,64}:cloudformation:[A-Za-z0-9-]{1,64
     * }:([0-9]{12})?:type/.+<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the type version.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[A-Za-z0-9-]{0,64}:cloudformation:[A-Za-z0-9-]{1,64
     * }:([0-9]{12})?:type/.+<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the type version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TypeVersionSummary withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * When the version was registered.
     * </p>
     *
     * @return <p>
     *         When the version was registered.
     *         </p>
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * <p>
     * When the version was registered.
     * </p>
     *
     * @param timeCreated <p>
     *            When the version was registered.
     *            </p>
     */
    public void setTimeCreated(java.util.Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    /**
     * <p>
     * When the version was registered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeCreated <p>
     *            When the version was registered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TypeVersionSummary withTimeCreated(java.util.Date timeCreated) {
        this.timeCreated = timeCreated;
        return this;
    }

    /**
     * <p>
     * The description of the type version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The description of the type version.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the type version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            The description of the type version.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the type version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            The description of the type version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TypeVersionSummary withDescription(String description) {
        this.description = description;
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
            sb.append("Type: " + getType() + ",");
        if (getTypeName() != null)
            sb.append("TypeName: " + getTypeName() + ",");
        if (getVersionId() != null)
            sb.append("VersionId: " + getVersionId() + ",");
        if (getIsDefaultVersion() != null)
            sb.append("IsDefaultVersion: " + getIsDefaultVersion() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getTimeCreated() != null)
            sb.append("TimeCreated: " + getTimeCreated() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode
                + ((getIsDefaultVersion() == null) ? 0 : getIsDefaultVersion().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getTimeCreated() == null) ? 0 : getTimeCreated().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TypeVersionSummary == false)
            return false;
        TypeVersionSummary other = (TypeVersionSummary) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null
                && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getIsDefaultVersion() == null ^ this.getIsDefaultVersion() == null)
            return false;
        if (other.getIsDefaultVersion() != null
                && other.getIsDefaultVersion().equals(this.getIsDefaultVersion()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getTimeCreated() == null ^ this.getTimeCreated() == null)
            return false;
        if (other.getTimeCreated() != null
                && other.getTimeCreated().equals(this.getTimeCreated()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }
}
