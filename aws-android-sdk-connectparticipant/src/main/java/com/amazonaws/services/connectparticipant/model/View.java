/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connectparticipant.model;

import java.io.Serializable;

/**
 * <p>
 * A view resource object. Contains metadata and content necessary to render the
 * view.
 * </p>
 */
public class View implements Serializable {
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
     * The current version of the view.
     * </p>
     */
    private Integer version;

    /**
     * <p>
     * View content containing all content necessary to render a view except for
     * runtime input data.
     * </p>
     */
    private ViewContent content;

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
    public View withId(String id) {
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
    public View withArn(String arn) {
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
    public View withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The current version of the view.
     * </p>
     *
     * @return <p>
     *         The current version of the view.
     *         </p>
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * <p>
     * The current version of the view.
     * </p>
     *
     * @param version <p>
     *            The current version of the view.
     *            </p>
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The current version of the view.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The current version of the view.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public View withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * View content containing all content necessary to render a view except for
     * runtime input data.
     * </p>
     *
     * @return <p>
     *         View content containing all content necessary to render a view
     *         except for runtime input data.
     *         </p>
     */
    public ViewContent getContent() {
        return content;
    }

    /**
     * <p>
     * View content containing all content necessary to render a view except for
     * runtime input data.
     * </p>
     *
     * @param content <p>
     *            View content containing all content necessary to render a view
     *            except for runtime input data.
     *            </p>
     */
    public void setContent(ViewContent content) {
        this.content = content;
    }

    /**
     * <p>
     * View content containing all content necessary to render a view except for
     * runtime input data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param content <p>
     *            View content containing all content necessary to render a view
     *            except for runtime input data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public View withContent(ViewContent content) {
        this.content = content;
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
        if (getVersion() != null)
            sb.append("Version: " + getVersion() + ",");
        if (getContent() != null)
            sb.append("Content: " + getContent());
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
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof View == false)
            return false;
        View other = (View) obj;

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
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }
}
