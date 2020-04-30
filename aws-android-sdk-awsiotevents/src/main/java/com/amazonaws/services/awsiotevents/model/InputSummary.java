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

package com.amazonaws.services.awsiotevents.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the input.
 * </p>
 */
public class InputSummary implements Serializable {
    /**
     * <p>
     * The name of the input.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     */
    private String inputName;

    /**
     * <p>
     * A brief description of the input.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     */
    private String inputDescription;

    /**
     * <p>
     * The ARN of the input.
     * </p>
     */
    private String inputArn;

    /**
     * <p>
     * The time the input was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The last time the input was updated.
     * </p>
     */
    private java.util.Date lastUpdateTime;

    /**
     * <p>
     * The status of the input.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING
     */
    private String status;

    /**
     * <p>
     * The name of the input.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     *
     * @return <p>
     *         The name of the input.
     *         </p>
     */
    public String getInputName() {
        return inputName;
    }

    /**
     * <p>
     * The name of the input.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     *
     * @param inputName <p>
     *            The name of the input.
     *            </p>
     */
    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    /**
     * <p>
     * The name of the input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     *
     * @param inputName <p>
     *            The name of the input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputSummary withInputName(String inputName) {
        this.inputName = inputName;
        return this;
    }

    /**
     * <p>
     * A brief description of the input.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @return <p>
     *         A brief description of the input.
     *         </p>
     */
    public String getInputDescription() {
        return inputDescription;
    }

    /**
     * <p>
     * A brief description of the input.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param inputDescription <p>
     *            A brief description of the input.
     *            </p>
     */
    public void setInputDescription(String inputDescription) {
        this.inputDescription = inputDescription;
    }

    /**
     * <p>
     * A brief description of the input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param inputDescription <p>
     *            A brief description of the input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputSummary withInputDescription(String inputDescription) {
        this.inputDescription = inputDescription;
        return this;
    }

    /**
     * <p>
     * The ARN of the input.
     * </p>
     *
     * @return <p>
     *         The ARN of the input.
     *         </p>
     */
    public String getInputArn() {
        return inputArn;
    }

    /**
     * <p>
     * The ARN of the input.
     * </p>
     *
     * @param inputArn <p>
     *            The ARN of the input.
     *            </p>
     */
    public void setInputArn(String inputArn) {
        this.inputArn = inputArn;
    }

    /**
     * <p>
     * The ARN of the input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputArn <p>
     *            The ARN of the input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputSummary withInputArn(String inputArn) {
        this.inputArn = inputArn;
        return this;
    }

    /**
     * <p>
     * The time the input was created.
     * </p>
     *
     * @return <p>
     *         The time the input was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The time the input was created.
     * </p>
     *
     * @param creationTime <p>
     *            The time the input was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the input was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time the input was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The last time the input was updated.
     * </p>
     *
     * @return <p>
     *         The last time the input was updated.
     *         </p>
     */
    public java.util.Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * <p>
     * The last time the input was updated.
     * </p>
     *
     * @param lastUpdateTime <p>
     *            The last time the input was updated.
     *            </p>
     */
    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The last time the input was updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdateTime <p>
     *            The last time the input was updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputSummary withLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * <p>
     * The status of the input.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING
     *
     * @return <p>
     *         The status of the input.
     *         </p>
     * @see InputStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the input.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING
     *
     * @param status <p>
     *            The status of the input.
     *            </p>
     * @see InputStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING
     *
     * @param status <p>
     *            The status of the input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputStatus
     */
    public InputSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the input.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING
     *
     * @param status <p>
     *            The status of the input.
     *            </p>
     * @see InputStatus
     */
    public void setStatus(InputStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING
     *
     * @param status <p>
     *            The status of the input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputStatus
     */
    public InputSummary withStatus(InputStatus status) {
        this.status = status.toString();
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
        if (getInputName() != null)
            sb.append("inputName: " + getInputName() + ",");
        if (getInputDescription() != null)
            sb.append("inputDescription: " + getInputDescription() + ",");
        if (getInputArn() != null)
            sb.append("inputArn: " + getInputArn() + ",");
        if (getCreationTime() != null)
            sb.append("creationTime: " + getCreationTime() + ",");
        if (getLastUpdateTime() != null)
            sb.append("lastUpdateTime: " + getLastUpdateTime() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputName() == null) ? 0 : getInputName().hashCode());
        hashCode = prime * hashCode
                + ((getInputDescription() == null) ? 0 : getInputDescription().hashCode());
        hashCode = prime * hashCode + ((getInputArn() == null) ? 0 : getInputArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputSummary == false)
            return false;
        InputSummary other = (InputSummary) obj;

        if (other.getInputName() == null ^ this.getInputName() == null)
            return false;
        if (other.getInputName() != null
                && other.getInputName().equals(this.getInputName()) == false)
            return false;
        if (other.getInputDescription() == null ^ this.getInputDescription() == null)
            return false;
        if (other.getInputDescription() != null
                && other.getInputDescription().equals(this.getInputDescription()) == false)
            return false;
        if (other.getInputArn() == null ^ this.getInputArn() == null)
            return false;
        if (other.getInputArn() != null && other.getInputArn().equals(this.getInputArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null
                && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
