/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * A summary of a view version's metadata.
 * </p>
 */
public class ViewVersionSummary implements Serializable {
    /**
     * <p>
     * The identifier of the view version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/$]+$<br/>
     */
    private String id;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the view version.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The description of the view version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@,()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@,()']*)$<br/>
     */
    private String description;

    /**
     * <p>
     * The name of the view version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@()']*)$<br/>
     */
    private String name;

    /**
     * <p>
     * The type of the view version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_MANAGED, AWS_MANAGED
     */
    private String type;

    /**
     * <p>
     * The sequentially incremented version of the view version.
     * </p>
     */
    private Integer version;

    /**
     * <p>
     * The description of the view version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@,()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@,()']*)$<br/>
     */
    private String versionDescription;

    /**
     * <p>
     * The identifier of the view version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/$]+$<br/>
     *
     * @return <p>
     *         The identifier of the view version.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the view version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/$]+$<br/>
     *
     * @param id <p>
     *            The identifier of the view version.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the view version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/$]+$<br/>
     *
     * @param id <p>
     *            The identifier of the view version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViewVersionSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the view version.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the view version.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the view version.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the view version.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the view version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the view version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViewVersionSummary withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The description of the view version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@,()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@,()']*)$<br/>
     *
     * @return <p>
     *         The description of the view version.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the view version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@,()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@,()']*)$<br/>
     *
     * @param description <p>
     *            The description of the view version.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the view version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@,()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@,()']*)$<br/>
     *
     * @param description <p>
     *            The description of the view version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViewVersionSummary withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The name of the view version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@()']*)$<br/>
     *
     * @return <p>
     *         The name of the view version.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the view version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@()']*)$<br/>
     *
     * @param name <p>
     *            The name of the view version.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the view version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@()']*)$<br/>
     *
     * @param name <p>
     *            The name of the view version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViewVersionSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of the view version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_MANAGED, AWS_MANAGED
     *
     * @return <p>
     *         The type of the view version.
     *         </p>
     * @see ViewType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the view version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_MANAGED, AWS_MANAGED
     *
     * @param type <p>
     *            The type of the view version.
     *            </p>
     * @see ViewType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the view version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_MANAGED, AWS_MANAGED
     *
     * @param type <p>
     *            The type of the view version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ViewType
     */
    public ViewVersionSummary withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the view version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_MANAGED, AWS_MANAGED
     *
     * @param type <p>
     *            The type of the view version.
     *            </p>
     * @see ViewType
     */
    public void setType(ViewType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the view version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_MANAGED, AWS_MANAGED
     *
     * @param type <p>
     *            The type of the view version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ViewType
     */
    public ViewVersionSummary withType(ViewType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The sequentially incremented version of the view version.
     * </p>
     *
     * @return <p>
     *         The sequentially incremented version of the view version.
     *         </p>
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * <p>
     * The sequentially incremented version of the view version.
     * </p>
     *
     * @param version <p>
     *            The sequentially incremented version of the view version.
     *            </p>
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The sequentially incremented version of the view version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The sequentially incremented version of the view version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViewVersionSummary withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The description of the view version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@,()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@,()']*)$<br/>
     *
     * @return <p>
     *         The description of the view version.
     *         </p>
     */
    public String getVersionDescription() {
        return versionDescription;
    }

    /**
     * <p>
     * The description of the view version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@,()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@,()']*)$<br/>
     *
     * @param versionDescription <p>
     *            The description of the view version.
     *            </p>
     */
    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    /**
     * <p>
     * The description of the view version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@,()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@,()']*)$<br/>
     *
     * @param versionDescription <p>
     *            The description of the view version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViewVersionSummary withVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion() + ",");
        if (getVersionDescription() != null)
            sb.append("VersionDescription: " + getVersionDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode
                + ((getVersionDescription() == null) ? 0 : getVersionDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ViewVersionSummary == false)
            return false;
        ViewVersionSummary other = (ViewVersionSummary) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getVersionDescription() == null ^ this.getVersionDescription() == null)
            return false;
        if (other.getVersionDescription() != null
                && other.getVersionDescription().equals(this.getVersionDescription()) == false)
            return false;
        return true;
    }
}
