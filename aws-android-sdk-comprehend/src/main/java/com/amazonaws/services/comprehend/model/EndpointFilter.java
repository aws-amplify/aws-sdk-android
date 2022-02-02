/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

/**
 * <p>
 * The filter used to determine which endpoints are returned. You can filter
 * jobs on their name, model, status, or the date and time that they were
 * created. You can only set one filter at a time.
 * </p>
 */
public class EndpointFilter implements Serializable {
    /**
     * <p>
     * The Amazon Resource Number (ARN) of the model to which the endpoint is
     * attached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:(document
     * -classifier
     * |entity-recognizer)/[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-
     * Z0-9](-*[a-zA-Z0-9])*)?<br/>
     */
    private String modelArn;

    /**
     * <p>
     * Specifies the status of the endpoint being returned. Possible values are:
     * Creating, Ready, Updating, Deleting, Failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, FAILED, IN_SERVICE, UPDATING
     */
    private String status;

    /**
     * <p>
     * Specifies a date before which the returned endpoint or endpoints were
     * created.
     * </p>
     */
    private java.util.Date creationTimeBefore;

    /**
     * <p>
     * Specifies a date after which the returned endpoint or endpoints were
     * created.
     * </p>
     */
    private java.util.Date creationTimeAfter;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the model to which the endpoint is
     * attached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:(document
     * -classifier
     * |entity-recognizer)/[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-
     * Z0-9](-*[a-zA-Z0-9])*)?<br/>
     *
     * @return <p>
     *         The Amazon Resource Number (ARN) of the model to which the
     *         endpoint is attached.
     *         </p>
     */
    public String getModelArn() {
        return modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the model to which the endpoint is
     * attached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:(document
     * -classifier
     * |entity-recognizer)/[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-
     * Z0-9](-*[a-zA-Z0-9])*)?<br/>
     *
     * @param modelArn <p>
     *            The Amazon Resource Number (ARN) of the model to which the
     *            endpoint is attached.
     *            </p>
     */
    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the model to which the endpoint is
     * attached.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:(document
     * -classifier
     * |entity-recognizer)/[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-
     * Z0-9](-*[a-zA-Z0-9])*)?<br/>
     *
     * @param modelArn <p>
     *            The Amazon Resource Number (ARN) of the model to which the
     *            endpoint is attached.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointFilter withModelArn(String modelArn) {
        this.modelArn = modelArn;
        return this;
    }

    /**
     * <p>
     * Specifies the status of the endpoint being returned. Possible values are:
     * Creating, Ready, Updating, Deleting, Failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, FAILED, IN_SERVICE, UPDATING
     *
     * @return <p>
     *         Specifies the status of the endpoint being returned. Possible
     *         values are: Creating, Ready, Updating, Deleting, Failed.
     *         </p>
     * @see EndpointStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Specifies the status of the endpoint being returned. Possible values are:
     * Creating, Ready, Updating, Deleting, Failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, FAILED, IN_SERVICE, UPDATING
     *
     * @param status <p>
     *            Specifies the status of the endpoint being returned. Possible
     *            values are: Creating, Ready, Updating, Deleting, Failed.
     *            </p>
     * @see EndpointStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the status of the endpoint being returned. Possible values are:
     * Creating, Ready, Updating, Deleting, Failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, FAILED, IN_SERVICE, UPDATING
     *
     * @param status <p>
     *            Specifies the status of the endpoint being returned. Possible
     *            values are: Creating, Ready, Updating, Deleting, Failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EndpointStatus
     */
    public EndpointFilter withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Specifies the status of the endpoint being returned. Possible values are:
     * Creating, Ready, Updating, Deleting, Failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, FAILED, IN_SERVICE, UPDATING
     *
     * @param status <p>
     *            Specifies the status of the endpoint being returned. Possible
     *            values are: Creating, Ready, Updating, Deleting, Failed.
     *            </p>
     * @see EndpointStatus
     */
    public void setStatus(EndpointStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Specifies the status of the endpoint being returned. Possible values are:
     * Creating, Ready, Updating, Deleting, Failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, FAILED, IN_SERVICE, UPDATING
     *
     * @param status <p>
     *            Specifies the status of the endpoint being returned. Possible
     *            values are: Creating, Ready, Updating, Deleting, Failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EndpointStatus
     */
    public EndpointFilter withStatus(EndpointStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Specifies a date before which the returned endpoint or endpoints were
     * created.
     * </p>
     *
     * @return <p>
     *         Specifies a date before which the returned endpoint or endpoints
     *         were created.
     *         </p>
     */
    public java.util.Date getCreationTimeBefore() {
        return creationTimeBefore;
    }

    /**
     * <p>
     * Specifies a date before which the returned endpoint or endpoints were
     * created.
     * </p>
     *
     * @param creationTimeBefore <p>
     *            Specifies a date before which the returned endpoint or
     *            endpoints were created.
     *            </p>
     */
    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * Specifies a date before which the returned endpoint or endpoints were
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTimeBefore <p>
     *            Specifies a date before which the returned endpoint or
     *            endpoints were created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointFilter withCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
        return this;
    }

    /**
     * <p>
     * Specifies a date after which the returned endpoint or endpoints were
     * created.
     * </p>
     *
     * @return <p>
     *         Specifies a date after which the returned endpoint or endpoints
     *         were created.
     *         </p>
     */
    public java.util.Date getCreationTimeAfter() {
        return creationTimeAfter;
    }

    /**
     * <p>
     * Specifies a date after which the returned endpoint or endpoints were
     * created.
     * </p>
     *
     * @param creationTimeAfter <p>
     *            Specifies a date after which the returned endpoint or
     *            endpoints were created.
     *            </p>
     */
    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * Specifies a date after which the returned endpoint or endpoints were
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTimeAfter <p>
     *            Specifies a date after which the returned endpoint or
     *            endpoints were created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointFilter withCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
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
        if (getModelArn() != null)
            sb.append("ModelArn: " + getModelArn() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getCreationTimeBefore() != null)
            sb.append("CreationTimeBefore: " + getCreationTimeBefore() + ",");
        if (getCreationTimeAfter() != null)
            sb.append("CreationTimeAfter: " + getCreationTimeAfter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTimeBefore() == null) ? 0 : getCreationTimeBefore().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTimeAfter() == null) ? 0 : getCreationTimeAfter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointFilter == false)
            return false;
        EndpointFilter other = (EndpointFilter) obj;

        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTimeBefore() == null ^ this.getCreationTimeBefore() == null)
            return false;
        if (other.getCreationTimeBefore() != null
                && other.getCreationTimeBefore().equals(this.getCreationTimeBefore()) == false)
            return false;
        if (other.getCreationTimeAfter() == null ^ this.getCreationTimeAfter() == null)
            return false;
        if (other.getCreationTimeAfter() != null
                && other.getCreationTimeAfter().equals(this.getCreationTimeAfter()) == false)
            return false;
        return true;
    }
}
