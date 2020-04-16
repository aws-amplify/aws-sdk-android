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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a progress update stream, including all of its tasks, which was
 * previously created as an AWS resource used for access control. This API has
 * the following traits:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The only parameter needed for <code>DeleteProgressUpdateStream</code> is the
 * stream name (same as a <code>CreateProgressUpdateStream</code> call).
 * </p>
 * </li>
 * <li>
 * <p>
 * The call will return, and a background process will asynchronously delete the
 * stream and all of its resources (tasks, associated resources, resource
 * attributes, created artifacts).
 * </p>
 * </li>
 * <li>
 * <p>
 * If the stream takes time to be deleted, it might still show up on a
 * <code>ListProgressUpdateStreams</code> call.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateProgressUpdateStream</code>, <code>ImportMigrationTask</code>,
 * <code>NotifyMigrationTaskState</code>, and all Associate[*] APIs related to
 * the tasks belonging to the stream will throw "InvalidInputException" if the
 * stream of the same name is in the process of being deleted.
 * </p>
 * </li>
 * <li>
 * <p>
 * Once the stream and all of its resources are deleted,
 * <code>CreateProgressUpdateStream</code> for a stream of the same name will
 * succeed, and that stream will be an entirely new logical resource (without
 * any resources associated with the old stream).
 * </p>
 * </li>
 * </ul>
 */
public class DeleteProgressUpdateStreamRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the ProgressUpdateStream. <i>Do not store personal data in
     * this field.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[^/:|\000-\037]+<br/>
     */
    private String progressUpdateStreamName;

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place.
     * Used to test if the caller has permission to make the call.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The name of the ProgressUpdateStream. <i>Do not store personal data in
     * this field.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[^/:|\000-\037]+<br/>
     *
     * @return <p>
     *         The name of the ProgressUpdateStream. <i>Do not store personal
     *         data in this field.</i>
     *         </p>
     */
    public String getProgressUpdateStreamName() {
        return progressUpdateStreamName;
    }

    /**
     * <p>
     * The name of the ProgressUpdateStream. <i>Do not store personal data in
     * this field.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[^/:|\000-\037]+<br/>
     *
     * @param progressUpdateStreamName <p>
     *            The name of the ProgressUpdateStream. <i>Do not store personal
     *            data in this field.</i>
     *            </p>
     */
    public void setProgressUpdateStreamName(String progressUpdateStreamName) {
        this.progressUpdateStreamName = progressUpdateStreamName;
    }

    /**
     * <p>
     * The name of the ProgressUpdateStream. <i>Do not store personal data in
     * this field.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[^/:|\000-\037]+<br/>
     *
     * @param progressUpdateStreamName <p>
     *            The name of the ProgressUpdateStream. <i>Do not store personal
     *            data in this field.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteProgressUpdateStreamRequest withProgressUpdateStreamName(
            String progressUpdateStreamName) {
        this.progressUpdateStreamName = progressUpdateStreamName;
        return this;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place.
     * Used to test if the caller has permission to make the call.
     * </p>
     *
     * @return <p>
     *         Optional boolean flag to indicate whether any effect should take
     *         place. Used to test if the caller has permission to make the
     *         call.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place.
     * Used to test if the caller has permission to make the call.
     * </p>
     *
     * @return <p>
     *         Optional boolean flag to indicate whether any effect should take
     *         place. Used to test if the caller has permission to make the
     *         call.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place.
     * Used to test if the caller has permission to make the call.
     * </p>
     *
     * @param dryRun <p>
     *            Optional boolean flag to indicate whether any effect should
     *            take place. Used to test if the caller has permission to make
     *            the call.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place.
     * Used to test if the caller has permission to make the call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Optional boolean flag to indicate whether any effect should
     *            take place. Used to test if the caller has permission to make
     *            the call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteProgressUpdateStreamRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getProgressUpdateStreamName() != null)
            sb.append("ProgressUpdateStreamName: " + getProgressUpdateStreamName() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getProgressUpdateStreamName() == null) ? 0 : getProgressUpdateStreamName()
                        .hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteProgressUpdateStreamRequest == false)
            return false;
        DeleteProgressUpdateStreamRequest other = (DeleteProgressUpdateStreamRequest) obj;

        if (other.getProgressUpdateStreamName() == null
                ^ this.getProgressUpdateStreamName() == null)
            return false;
        if (other.getProgressUpdateStreamName() != null
                && other.getProgressUpdateStreamName().equals(this.getProgressUpdateStreamName()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
