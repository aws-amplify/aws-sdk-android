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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the display name of a trial.
 * </p>
 */
public class UpdateTrialRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the trial to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String trialName;

    /**
     * <p>
     * The name of the trial as displayed. The name doesn't need to be unique.
     * If <code>DisplayName</code> isn't specified, <code>TrialName</code> is
     * displayed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String displayName;

    /**
     * <p>
     * The name of the trial to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the trial to update.
     *         </p>
     */
    public String getTrialName() {
        return trialName;
    }

    /**
     * <p>
     * The name of the trial to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param trialName <p>
     *            The name of the trial to update.
     *            </p>
     */
    public void setTrialName(String trialName) {
        this.trialName = trialName;
    }

    /**
     * <p>
     * The name of the trial to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param trialName <p>
     *            The name of the trial to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTrialRequest withTrialName(String trialName) {
        this.trialName = trialName;
        return this;
    }

    /**
     * <p>
     * The name of the trial as displayed. The name doesn't need to be unique.
     * If <code>DisplayName</code> isn't specified, <code>TrialName</code> is
     * displayed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the trial as displayed. The name doesn't need to be
     *         unique. If <code>DisplayName</code> isn't specified,
     *         <code>TrialName</code> is displayed.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * The name of the trial as displayed. The name doesn't need to be unique.
     * If <code>DisplayName</code> isn't specified, <code>TrialName</code> is
     * displayed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param displayName <p>
     *            The name of the trial as displayed. The name doesn't need to
     *            be unique. If <code>DisplayName</code> isn't specified,
     *            <code>TrialName</code> is displayed.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the trial as displayed. The name doesn't need to be unique.
     * If <code>DisplayName</code> isn't specified, <code>TrialName</code> is
     * displayed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param displayName <p>
     *            The name of the trial as displayed. The name doesn't need to
     *            be unique. If <code>DisplayName</code> isn't specified,
     *            <code>TrialName</code> is displayed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTrialRequest withDisplayName(String displayName) {
        this.displayName = displayName;
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
        if (getTrialName() != null)
            sb.append("TrialName: " + getTrialName() + ",");
        if (getDisplayName() != null)
            sb.append("DisplayName: " + getDisplayName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrialName() == null) ? 0 : getTrialName().hashCode());
        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTrialRequest == false)
            return false;
        UpdateTrialRequest other = (UpdateTrialRequest) obj;

        if (other.getTrialName() == null ^ this.getTrialName() == null)
            return false;
        if (other.getTrialName() != null
                && other.getTrialName().equals(this.getTrialName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null
                && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        return true;
    }
}
