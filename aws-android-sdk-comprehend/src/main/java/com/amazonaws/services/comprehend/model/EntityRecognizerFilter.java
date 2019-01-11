/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides information for filtering a list of entity recognizers. You can only
 * specify one filtering parameter in a request. For more information, see the
 * operation./&gt;
 * </p>
 */
public class EntityRecognizerFilter implements Serializable {
    /**
     * <p>
     * The status of an entity recognizer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, TRAINING, DELETING, IN_ERROR, TRAINED
     */
    private String status;

    /**
     * <p>
     * Filters the list of entities based on the time that the list was
     * submitted for processing. Returns only jobs submitted before the
     * specified time. Jobs are returned in descending order, newest to oldest.
     * </p>
     */
    private java.util.Date submitTimeBefore;

    /**
     * <p>
     * Filters the list of entities based on the time that the list was
     * submitted for processing. Returns only jobs submitted after the specified
     * time. Jobs are returned in ascending order, oldest to newest.
     * </p>
     */
    private java.util.Date submitTimeAfter;

    /**
     * <p>
     * The status of an entity recognizer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, TRAINING, DELETING, IN_ERROR, TRAINED
     *
     * @return <p>
     *         The status of an entity recognizer.
     *         </p>
     * @see ModelStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of an entity recognizer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, TRAINING, DELETING, IN_ERROR, TRAINED
     *
     * @param status <p>
     *            The status of an entity recognizer.
     *            </p>
     * @see ModelStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of an entity recognizer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, TRAINING, DELETING, IN_ERROR, TRAINED
     *
     * @param status <p>
     *            The status of an entity recognizer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelStatus
     */
    public EntityRecognizerFilter withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of an entity recognizer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, TRAINING, DELETING, IN_ERROR, TRAINED
     *
     * @param status <p>
     *            The status of an entity recognizer.
     *            </p>
     * @see ModelStatus
     */
    public void setStatus(ModelStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of an entity recognizer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, TRAINING, DELETING, IN_ERROR, TRAINED
     *
     * @param status <p>
     *            The status of an entity recognizer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelStatus
     */
    public EntityRecognizerFilter withStatus(ModelStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Filters the list of entities based on the time that the list was
     * submitted for processing. Returns only jobs submitted before the
     * specified time. Jobs are returned in descending order, newest to oldest.
     * </p>
     *
     * @return <p>
     *         Filters the list of entities based on the time that the list was
     *         submitted for processing. Returns only jobs submitted before the
     *         specified time. Jobs are returned in descending order, newest to
     *         oldest.
     *         </p>
     */
    public java.util.Date getSubmitTimeBefore() {
        return submitTimeBefore;
    }

    /**
     * <p>
     * Filters the list of entities based on the time that the list was
     * submitted for processing. Returns only jobs submitted before the
     * specified time. Jobs are returned in descending order, newest to oldest.
     * </p>
     *
     * @param submitTimeBefore <p>
     *            Filters the list of entities based on the time that the list
     *            was submitted for processing. Returns only jobs submitted
     *            before the specified time. Jobs are returned in descending
     *            order, newest to oldest.
     *            </p>
     */
    public void setSubmitTimeBefore(java.util.Date submitTimeBefore) {
        this.submitTimeBefore = submitTimeBefore;
    }

    /**
     * <p>
     * Filters the list of entities based on the time that the list was
     * submitted for processing. Returns only jobs submitted before the
     * specified time. Jobs are returned in descending order, newest to oldest.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param submitTimeBefore <p>
     *            Filters the list of entities based on the time that the list
     *            was submitted for processing. Returns only jobs submitted
     *            before the specified time. Jobs are returned in descending
     *            order, newest to oldest.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognizerFilter withSubmitTimeBefore(java.util.Date submitTimeBefore) {
        this.submitTimeBefore = submitTimeBefore;
        return this;
    }

    /**
     * <p>
     * Filters the list of entities based on the time that the list was
     * submitted for processing. Returns only jobs submitted after the specified
     * time. Jobs are returned in ascending order, oldest to newest.
     * </p>
     *
     * @return <p>
     *         Filters the list of entities based on the time that the list was
     *         submitted for processing. Returns only jobs submitted after the
     *         specified time. Jobs are returned in ascending order, oldest to
     *         newest.
     *         </p>
     */
    public java.util.Date getSubmitTimeAfter() {
        return submitTimeAfter;
    }

    /**
     * <p>
     * Filters the list of entities based on the time that the list was
     * submitted for processing. Returns only jobs submitted after the specified
     * time. Jobs are returned in ascending order, oldest to newest.
     * </p>
     *
     * @param submitTimeAfter <p>
     *            Filters the list of entities based on the time that the list
     *            was submitted for processing. Returns only jobs submitted
     *            after the specified time. Jobs are returned in ascending
     *            order, oldest to newest.
     *            </p>
     */
    public void setSubmitTimeAfter(java.util.Date submitTimeAfter) {
        this.submitTimeAfter = submitTimeAfter;
    }

    /**
     * <p>
     * Filters the list of entities based on the time that the list was
     * submitted for processing. Returns only jobs submitted after the specified
     * time. Jobs are returned in ascending order, oldest to newest.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param submitTimeAfter <p>
     *            Filters the list of entities based on the time that the list
     *            was submitted for processing. Returns only jobs submitted
     *            after the specified time. Jobs are returned in ascending
     *            order, oldest to newest.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognizerFilter withSubmitTimeAfter(java.util.Date submitTimeAfter) {
        this.submitTimeAfter = submitTimeAfter;
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getSubmitTimeBefore() != null)
            sb.append("SubmitTimeBefore: " + getSubmitTimeBefore() + ",");
        if (getSubmitTimeAfter() != null)
            sb.append("SubmitTimeAfter: " + getSubmitTimeAfter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getSubmitTimeBefore() == null) ? 0 : getSubmitTimeBefore().hashCode());
        hashCode = prime * hashCode
                + ((getSubmitTimeAfter() == null) ? 0 : getSubmitTimeAfter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityRecognizerFilter == false)
            return false;
        EntityRecognizerFilter other = (EntityRecognizerFilter) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSubmitTimeBefore() == null ^ this.getSubmitTimeBefore() == null)
            return false;
        if (other.getSubmitTimeBefore() != null
                && other.getSubmitTimeBefore().equals(this.getSubmitTimeBefore()) == false)
            return false;
        if (other.getSubmitTimeAfter() == null ^ this.getSubmitTimeAfter() == null)
            return false;
        if (other.getSubmitTimeAfter() != null
                && other.getSubmitTimeAfter().equals(this.getSubmitTimeAfter()) == false)
            return false;
        return true;
    }
}
