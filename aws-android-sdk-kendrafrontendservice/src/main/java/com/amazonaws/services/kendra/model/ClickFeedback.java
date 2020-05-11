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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

/**
 * <p>
 * Gathers information about when a particular result was clicked by a user.
 * Your application uses the <a>SubmitFeedback</a> operation to provide click
 * information.
 * </p>
 */
public class ClickFeedback implements Serializable {
    /**
     * <p>
     * The unique identifier of the search result that was clicked.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 73<br/>
     */
    private String resultId;

    /**
     * <p>
     * The Unix timestamp of the date and time that the result was clicked.
     * </p>
     */
    private java.util.Date clickTime;

    /**
     * <p>
     * The unique identifier of the search result that was clicked.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 73<br/>
     *
     * @return <p>
     *         The unique identifier of the search result that was clicked.
     *         </p>
     */
    public String getResultId() {
        return resultId;
    }

    /**
     * <p>
     * The unique identifier of the search result that was clicked.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 73<br/>
     *
     * @param resultId <p>
     *            The unique identifier of the search result that was clicked.
     *            </p>
     */
    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    /**
     * <p>
     * The unique identifier of the search result that was clicked.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 73<br/>
     *
     * @param resultId <p>
     *            The unique identifier of the search result that was clicked.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClickFeedback withResultId(String resultId) {
        this.resultId = resultId;
        return this;
    }

    /**
     * <p>
     * The Unix timestamp of the date and time that the result was clicked.
     * </p>
     *
     * @return <p>
     *         The Unix timestamp of the date and time that the result was
     *         clicked.
     *         </p>
     */
    public java.util.Date getClickTime() {
        return clickTime;
    }

    /**
     * <p>
     * The Unix timestamp of the date and time that the result was clicked.
     * </p>
     *
     * @param clickTime <p>
     *            The Unix timestamp of the date and time that the result was
     *            clicked.
     *            </p>
     */
    public void setClickTime(java.util.Date clickTime) {
        this.clickTime = clickTime;
    }

    /**
     * <p>
     * The Unix timestamp of the date and time that the result was clicked.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clickTime <p>
     *            The Unix timestamp of the date and time that the result was
     *            clicked.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClickFeedback withClickTime(java.util.Date clickTime) {
        this.clickTime = clickTime;
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
        if (getResultId() != null)
            sb.append("ResultId: " + getResultId() + ",");
        if (getClickTime() != null)
            sb.append("ClickTime: " + getClickTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResultId() == null) ? 0 : getResultId().hashCode());
        hashCode = prime * hashCode + ((getClickTime() == null) ? 0 : getClickTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClickFeedback == false)
            return false;
        ClickFeedback other = (ClickFeedback) obj;

        if (other.getResultId() == null ^ this.getResultId() == null)
            return false;
        if (other.getResultId() != null && other.getResultId().equals(this.getResultId()) == false)
            return false;
        if (other.getClickTime() == null ^ this.getClickTime() == null)
            return false;
        if (other.getClickTime() != null
                && other.getClickTime().equals(this.getClickTime()) == false)
            return false;
        return true;
    }
}
