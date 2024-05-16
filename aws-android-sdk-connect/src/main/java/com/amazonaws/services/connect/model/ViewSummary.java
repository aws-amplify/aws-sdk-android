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
 * A summary of a view's metadata.
 * </p>
 */
public class ViewSummary implements Serializable {
    /**
     * <p>
     * The identifier of the view.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/$]+$<br/>
     */
    private String id;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the view.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The name of the view.
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
     * The type of the view.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_MANAGED, AWS_MANAGED
     */
    private String type;

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or
     * <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will initiate
     * validation on the content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     */
    private String status;

    /**
     * <p>
     * The description of the view.
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
     * The identifier of the view.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/$]+$<br/>
     *
     * @return <p>
     *         The identifier of the view.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the view.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/$]+$<br/>
     *
     * @param id <p>
     *            The identifier of the view.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the view.
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
     *            The identifier of the view.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViewSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the view.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the view.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the view.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the view.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the view.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the view.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViewSummary withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The name of the view.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@()']*)$<br/>
     *
     * @return <p>
     *         The name of the view.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the view.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@()']*)$<br/>
     *
     * @param name <p>
     *            The name of the view.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the view.
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
     *            The name of the view.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViewSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of the view.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_MANAGED, AWS_MANAGED
     *
     * @return <p>
     *         The type of the view.
     *         </p>
     * @see ViewType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the view.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_MANAGED, AWS_MANAGED
     *
     * @param type <p>
     *            The type of the view.
     *            </p>
     * @see ViewType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the view.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_MANAGED, AWS_MANAGED
     *
     * @param type <p>
     *            The type of the view.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ViewType
     */
    public ViewSummary withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the view.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_MANAGED, AWS_MANAGED
     *
     * @param type <p>
     *            The type of the view.
     *            </p>
     * @see ViewType
     */
    public void setType(ViewType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the view.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_MANAGED, AWS_MANAGED
     *
     * @param type <p>
     *            The type of the view.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ViewType
     */
    public ViewSummary withType(ViewType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or
     * <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will initiate
     * validation on the content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     *
     * @return <p>
     *         Indicates the view status as either <code>SAVED</code> or
     *         <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will
     *         initiate validation on the content.
     *         </p>
     * @see ViewStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or
     * <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will initiate
     * validation on the content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     *
     * @param status <p>
     *            Indicates the view status as either <code>SAVED</code> or
     *            <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will
     *            initiate validation on the content.
     *            </p>
     * @see ViewStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or
     * <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will initiate
     * validation on the content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     *
     * @param status <p>
     *            Indicates the view status as either <code>SAVED</code> or
     *            <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will
     *            initiate validation on the content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ViewStatus
     */
    public ViewSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or
     * <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will initiate
     * validation on the content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     *
     * @param status <p>
     *            Indicates the view status as either <code>SAVED</code> or
     *            <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will
     *            initiate validation on the content.
     *            </p>
     * @see ViewStatus
     */
    public void setStatus(ViewStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or
     * <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will initiate
     * validation on the content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     *
     * @param status <p>
     *            Indicates the view status as either <code>SAVED</code> or
     *            <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will
     *            initiate validation on the content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ViewStatus
     */
    public ViewSummary withStatus(ViewStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The description of the view.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@,()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@,()']*)$<br/>
     *
     * @return <p>
     *         The description of the view.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the view.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@,()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@,()']*)$<br/>
     *
     * @param description <p>
     *            The description of the view.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the view.
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
     *            The description of the view.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViewSummary withDescription(String description) {
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
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

        if (obj instanceof ViewSummary == false)
            return false;
        ViewSummary other = (ViewSummary) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }
}
