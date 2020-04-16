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

package com.amazonaws.services.awsmigrationhub.model;

import java.io.Serializable;

/**
 * <p>
 * An ARN of the AWS cloud resource target receiving the migration (e.g., AMI,
 * EC2 instance, RDS instance, etc.).
 * </p>
 */
public class CreatedArtifact implements Serializable {
    /**
     * <p>
     * An ARN that uniquely identifies the result of a migration task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>arn:[a-z-]+:[a-z0-9-]+:(?:[a-z0-9-]+|):(?:[0-9]{12}|):.*
     * <br/>
     */
    private String name;

    /**
     * <p>
     * A description that can be free-form text to record additional detail
     * about the artifact for clarity or for later reference.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>^.{0,500}$<br/>
     */
    private String description;

    /**
     * <p>
     * An ARN that uniquely identifies the result of a migration task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>arn:[a-z-]+:[a-z0-9-]+:(?:[a-z0-9-]+|):(?:[0-9]{12}|):.*
     * <br/>
     *
     * @return <p>
     *         An ARN that uniquely identifies the result of a migration task.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * An ARN that uniquely identifies the result of a migration task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>arn:[a-z-]+:[a-z0-9-]+:(?:[a-z0-9-]+|):(?:[0-9]{12}|):.*
     * <br/>
     *
     * @param name <p>
     *            An ARN that uniquely identifies the result of a migration
     *            task.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * An ARN that uniquely identifies the result of a migration task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>arn:[a-z-]+:[a-z0-9-]+:(?:[a-z0-9-]+|):(?:[0-9]{12}|):.*
     * <br/>
     *
     * @param name <p>
     *            An ARN that uniquely identifies the result of a migration
     *            task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatedArtifact withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A description that can be free-form text to record additional detail
     * about the artifact for clarity or for later reference.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>^.{0,500}$<br/>
     *
     * @return <p>
     *         A description that can be free-form text to record additional
     *         detail about the artifact for clarity or for later reference.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description that can be free-form text to record additional detail
     * about the artifact for clarity or for later reference.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>^.{0,500}$<br/>
     *
     * @param description <p>
     *            A description that can be free-form text to record additional
     *            detail about the artifact for clarity or for later reference.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description that can be free-form text to record additional detail
     * about the artifact for clarity or for later reference.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>^.{0,500}$<br/>
     *
     * @param description <p>
     *            A description that can be free-form text to record additional
     *            detail about the artifact for clarity or for later reference.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatedArtifact withDescription(String description) {
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
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

        if (obj instanceof CreatedArtifact == false)
            return false;
        CreatedArtifact other = (CreatedArtifact) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }
}
