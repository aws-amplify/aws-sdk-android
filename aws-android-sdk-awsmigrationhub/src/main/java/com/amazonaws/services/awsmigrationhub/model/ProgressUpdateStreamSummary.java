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

/**
 * <p>
 * Summary of the AWS resource used for access control that is implicitly linked
 * to your AWS account.
 * </p>
 */
public class ProgressUpdateStreamSummary implements Serializable {
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
    public ProgressUpdateStreamSummary withProgressUpdateStreamName(String progressUpdateStreamName) {
        this.progressUpdateStreamName = progressUpdateStreamName;
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
            sb.append("ProgressUpdateStreamName: " + getProgressUpdateStreamName());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProgressUpdateStreamSummary == false)
            return false;
        ProgressUpdateStreamSummary other = (ProgressUpdateStreamSummary) obj;

        if (other.getProgressUpdateStreamName() == null
                ^ this.getProgressUpdateStreamName() == null)
            return false;
        if (other.getProgressUpdateStreamName() != null
                && other.getProgressUpdateStreamName().equals(this.getProgressUpdateStreamName()) == false)
            return false;
        return true;
    }
}
