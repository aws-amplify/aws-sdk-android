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

package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;

/**
 * <p>
 * An object that contains the latest status details for an edge agent's
 * recorder and uploader jobs. Use this information to determine the current
 * health of an edge agent.
 * </p>
 */
public class EdgeAgentStatus implements Serializable {
    /**
     * <p>
     * The latest status of a stream’s edge recording job.
     * </p>
     */
    private LastRecorderStatus lastRecorderStatus;

    /**
     * <p>
     * The latest status of a stream’s edge to cloud uploader job.
     * </p>
     */
    private LastUploaderStatus lastUploaderStatus;

    /**
     * <p>
     * The latest status of a stream’s edge recording job.
     * </p>
     *
     * @return <p>
     *         The latest status of a stream’s edge recording job.
     *         </p>
     */
    public LastRecorderStatus getLastRecorderStatus() {
        return lastRecorderStatus;
    }

    /**
     * <p>
     * The latest status of a stream’s edge recording job.
     * </p>
     *
     * @param lastRecorderStatus <p>
     *            The latest status of a stream’s edge recording job.
     *            </p>
     */
    public void setLastRecorderStatus(LastRecorderStatus lastRecorderStatus) {
        this.lastRecorderStatus = lastRecorderStatus;
    }

    /**
     * <p>
     * The latest status of a stream’s edge recording job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastRecorderStatus <p>
     *            The latest status of a stream’s edge recording job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EdgeAgentStatus withLastRecorderStatus(LastRecorderStatus lastRecorderStatus) {
        this.lastRecorderStatus = lastRecorderStatus;
        return this;
    }

    /**
     * <p>
     * The latest status of a stream’s edge to cloud uploader job.
     * </p>
     *
     * @return <p>
     *         The latest status of a stream’s edge to cloud uploader job.
     *         </p>
     */
    public LastUploaderStatus getLastUploaderStatus() {
        return lastUploaderStatus;
    }

    /**
     * <p>
     * The latest status of a stream’s edge to cloud uploader job.
     * </p>
     *
     * @param lastUploaderStatus <p>
     *            The latest status of a stream’s edge to cloud uploader job.
     *            </p>
     */
    public void setLastUploaderStatus(LastUploaderStatus lastUploaderStatus) {
        this.lastUploaderStatus = lastUploaderStatus;
    }

    /**
     * <p>
     * The latest status of a stream’s edge to cloud uploader job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUploaderStatus <p>
     *            The latest status of a stream’s edge to cloud uploader job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EdgeAgentStatus withLastUploaderStatus(LastUploaderStatus lastUploaderStatus) {
        this.lastUploaderStatus = lastUploaderStatus;
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
        if (getLastRecorderStatus() != null)
            sb.append("LastRecorderStatus: " + getLastRecorderStatus() + ",");
        if (getLastUploaderStatus() != null)
            sb.append("LastUploaderStatus: " + getLastUploaderStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLastRecorderStatus() == null) ? 0 : getLastRecorderStatus().hashCode());
        hashCode = prime * hashCode
                + ((getLastUploaderStatus() == null) ? 0 : getLastUploaderStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EdgeAgentStatus == false)
            return false;
        EdgeAgentStatus other = (EdgeAgentStatus) obj;

        if (other.getLastRecorderStatus() == null ^ this.getLastRecorderStatus() == null)
            return false;
        if (other.getLastRecorderStatus() != null
                && other.getLastRecorderStatus().equals(this.getLastRecorderStatus()) == false)
            return false;
        if (other.getLastUploaderStatus() == null ^ this.getLastUploaderStatus() == null)
            return false;
        if (other.getLastUploaderStatus() != null
                && other.getLastUploaderStatus().equals(this.getLastUploaderStatus()) == false)
            return false;
        return true;
    }
}
