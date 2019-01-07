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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Associates a group with a continuous job. The following criteria must be met:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The job must have been created with the <code>targetSelection</code> field
 * set to "CONTINUOUS".
 * </p>
 * </li>
 * <li>
 * <p>
 * The job status must currently be "IN_PROGRESS".
 * </p>
 * </li>
 * <li>
 * <p>
 * The total number of targets associated with a job must not exceed 100.
 * </p>
 * </li>
 * </ul>
 */
public class AssociateTargetsWithJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A list of thing group ARNs that define the targets of the job.
     * </p>
     */
    private java.util.List<String> targets;

    /**
     * <p>
     * The unique identifier you assigned to this job when it was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String jobId;

    /**
     * <p>
     * An optional comment string describing why the job was associated with the
     * targets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     */
    private String comment;

    /**
     * <p>
     * A list of thing group ARNs that define the targets of the job.
     * </p>
     *
     * @return <p>
     *         A list of thing group ARNs that define the targets of the job.
     *         </p>
     */
    public java.util.List<String> getTargets() {
        return targets;
    }

    /**
     * <p>
     * A list of thing group ARNs that define the targets of the job.
     * </p>
     *
     * @param targets <p>
     *            A list of thing group ARNs that define the targets of the job.
     *            </p>
     */
    public void setTargets(java.util.Collection<String> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<String>(targets);
    }

    /**
     * <p>
     * A list of thing group ARNs that define the targets of the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            A list of thing group ARNs that define the targets of the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateTargetsWithJobRequest withTargets(String... targets) {
        if (getTargets() == null) {
            this.targets = new java.util.ArrayList<String>(targets.length);
        }
        for (String value : targets) {
            this.targets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of thing group ARNs that define the targets of the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            A list of thing group ARNs that define the targets of the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateTargetsWithJobRequest withTargets(java.util.Collection<String> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * The unique identifier you assigned to this job when it was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The unique identifier you assigned to this job when it was
     *         created.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * The unique identifier you assigned to this job when it was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param jobId <p>
     *            The unique identifier you assigned to this job when it was
     *            created.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The unique identifier you assigned to this job when it was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param jobId <p>
     *            The unique identifier you assigned to this job when it was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateTargetsWithJobRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * An optional comment string describing why the job was associated with the
     * targets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @return <p>
     *         An optional comment string describing why the job was associated
     *         with the targets.
     *         </p>
     */
    public String getComment() {
        return comment;
    }

    /**
     * <p>
     * An optional comment string describing why the job was associated with the
     * targets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param comment <p>
     *            An optional comment string describing why the job was
     *            associated with the targets.
     *            </p>
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * An optional comment string describing why the job was associated with the
     * targets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param comment <p>
     *            An optional comment string describing why the job was
     *            associated with the targets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateTargetsWithJobRequest withComment(String comment) {
        this.comment = comment;
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
        if (getTargets() != null)
            sb.append("targets: " + getTargets() + ",");
        if (getJobId() != null)
            sb.append("jobId: " + getJobId() + ",");
        if (getComment() != null)
            sb.append("comment: " + getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateTargetsWithJobRequest == false)
            return false;
        AssociateTargetsWithJobRequest other = (AssociateTargetsWithJobRequest) obj;

        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        return true;
    }
}
