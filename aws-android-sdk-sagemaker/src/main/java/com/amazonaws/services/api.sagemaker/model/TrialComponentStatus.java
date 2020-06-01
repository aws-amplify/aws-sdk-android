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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * The status of the trial component.
 * </p>
 */
public class TrialComponentStatus implements Serializable {
    /**
     * <p>
     * The status of the trial component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     */
    private String primaryStatus;

    /**
     * <p>
     * If the component failed, a message describing why.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String message;

    /**
     * <p>
     * The status of the trial component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @return <p>
     *         The status of the trial component.
     *         </p>
     * @see TrialComponentPrimaryStatus
     */
    public String getPrimaryStatus() {
        return primaryStatus;
    }

    /**
     * <p>
     * The status of the trial component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param primaryStatus <p>
     *            The status of the trial component.
     *            </p>
     * @see TrialComponentPrimaryStatus
     */
    public void setPrimaryStatus(String primaryStatus) {
        this.primaryStatus = primaryStatus;
    }

    /**
     * <p>
     * The status of the trial component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param primaryStatus <p>
     *            The status of the trial component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrialComponentPrimaryStatus
     */
    public TrialComponentStatus withPrimaryStatus(String primaryStatus) {
        this.primaryStatus = primaryStatus;
        return this;
    }

    /**
     * <p>
     * The status of the trial component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param primaryStatus <p>
     *            The status of the trial component.
     *            </p>
     * @see TrialComponentPrimaryStatus
     */
    public void setPrimaryStatus(TrialComponentPrimaryStatus primaryStatus) {
        this.primaryStatus = primaryStatus.toString();
    }

    /**
     * <p>
     * The status of the trial component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param primaryStatus <p>
     *            The status of the trial component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrialComponentPrimaryStatus
     */
    public TrialComponentStatus withPrimaryStatus(TrialComponentPrimaryStatus primaryStatus) {
        this.primaryStatus = primaryStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the component failed, a message describing why.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         If the component failed, a message describing why.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * If the component failed, a message describing why.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param message <p>
     *            If the component failed, a message describing why.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * If the component failed, a message describing why.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param message <p>
     *            If the component failed, a message describing why.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialComponentStatus withMessage(String message) {
        this.message = message;
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
        if (getPrimaryStatus() != null)
            sb.append("PrimaryStatus: " + getPrimaryStatus() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPrimaryStatus() == null) ? 0 : getPrimaryStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrialComponentStatus == false)
            return false;
        TrialComponentStatus other = (TrialComponentStatus) obj;

        if (other.getPrimaryStatus() == null ^ this.getPrimaryStatus() == null)
            return false;
        if (other.getPrimaryStatus() != null
                && other.getPrimaryStatus().equals(this.getPrimaryStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }
}
