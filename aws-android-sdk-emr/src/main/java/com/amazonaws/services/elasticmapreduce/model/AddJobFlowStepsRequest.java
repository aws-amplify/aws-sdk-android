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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * AddJobFlowSteps adds new steps to a running cluster. A maximum of 256 steps
 * are allowed in each job flow.
 * </p>
 * <p>
 * If your cluster is long-running (such as a Hive data warehouse) or complex,
 * you may require more than 256 steps to process your data. You can bypass the
 * 256-step limitation in various ways, including using SSH to connect to the
 * master node and submitting queries directly to the software running on the
 * master node, such as Hive and Hadoop. For more information on how to do this,
 * see <a href=
 * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/AddMoreThan256Steps.html"
 * >Add More than 256 Steps to a Cluster</a> in the <i>Amazon EMR Management
 * Guide</i>.
 * </p>
 * <p>
 * A step specifies the location of a JAR file stored either on the master node
 * of the cluster or in Amazon S3. Each step is performed by the main function
 * of the main class of the JAR file. The main class can be specified either in
 * the manifest of the JAR or by using the MainFunction parameter of the step.
 * </p>
 * <p>
 * Amazon EMR executes each step in the order listed. For a step to be
 * considered complete, the main function must exit with a zero exit code and
 * all Hadoop jobs started while the step was running must have completed and
 * run successfully.
 * </p>
 * <p>
 * You can only add steps to a cluster that is in one of the following states:
 * STARTING, BOOTSTRAPPING, RUNNING, or WAITING.
 * </p>
 */
public class AddJobFlowStepsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A string that uniquely identifies the job flow. This identifier is
     * returned by <a>RunJobFlow</a> and can also be obtained from
     * <a>ListClusters</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String jobFlowId;

    /**
     * <p>
     * A list of <a>StepConfig</a> to be executed by the job flow.
     * </p>
     */
    private java.util.List<StepConfig> steps;

    /**
     * <p>
     * A string that uniquely identifies the job flow. This identifier is
     * returned by <a>RunJobFlow</a> and can also be obtained from
     * <a>ListClusters</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         A string that uniquely identifies the job flow. This identifier
     *         is returned by <a>RunJobFlow</a> and can also be obtained from
     *         <a>ListClusters</a>.
     *         </p>
     */
    public String getJobFlowId() {
        return jobFlowId;
    }

    /**
     * <p>
     * A string that uniquely identifies the job flow. This identifier is
     * returned by <a>RunJobFlow</a> and can also be obtained from
     * <a>ListClusters</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param jobFlowId <p>
     *            A string that uniquely identifies the job flow. This
     *            identifier is returned by <a>RunJobFlow</a> and can also be
     *            obtained from <a>ListClusters</a>.
     *            </p>
     */
    public void setJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
    }

    /**
     * <p>
     * A string that uniquely identifies the job flow. This identifier is
     * returned by <a>RunJobFlow</a> and can also be obtained from
     * <a>ListClusters</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param jobFlowId <p>
     *            A string that uniquely identifies the job flow. This
     *            identifier is returned by <a>RunJobFlow</a> and can also be
     *            obtained from <a>ListClusters</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddJobFlowStepsRequest withJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
        return this;
    }

    /**
     * <p>
     * A list of <a>StepConfig</a> to be executed by the job flow.
     * </p>
     *
     * @return <p>
     *         A list of <a>StepConfig</a> to be executed by the job flow.
     *         </p>
     */
    public java.util.List<StepConfig> getSteps() {
        return steps;
    }

    /**
     * <p>
     * A list of <a>StepConfig</a> to be executed by the job flow.
     * </p>
     *
     * @param steps <p>
     *            A list of <a>StepConfig</a> to be executed by the job flow.
     *            </p>
     */
    public void setSteps(java.util.Collection<StepConfig> steps) {
        if (steps == null) {
            this.steps = null;
            return;
        }

        this.steps = new java.util.ArrayList<StepConfig>(steps);
    }

    /**
     * <p>
     * A list of <a>StepConfig</a> to be executed by the job flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param steps <p>
     *            A list of <a>StepConfig</a> to be executed by the job flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddJobFlowStepsRequest withSteps(StepConfig... steps) {
        if (getSteps() == null) {
            this.steps = new java.util.ArrayList<StepConfig>(steps.length);
        }
        for (StepConfig value : steps) {
            this.steps.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>StepConfig</a> to be executed by the job flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param steps <p>
     *            A list of <a>StepConfig</a> to be executed by the job flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddJobFlowStepsRequest withSteps(java.util.Collection<StepConfig> steps) {
        setSteps(steps);
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
        if (getJobFlowId() != null)
            sb.append("JobFlowId: " + getJobFlowId() + ",");
        if (getSteps() != null)
            sb.append("Steps: " + getSteps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobFlowId() == null) ? 0 : getJobFlowId().hashCode());
        hashCode = prime * hashCode + ((getSteps() == null) ? 0 : getSteps().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddJobFlowStepsRequest == false)
            return false;
        AddJobFlowStepsRequest other = (AddJobFlowStepsRequest) obj;

        if (other.getJobFlowId() == null ^ this.getJobFlowId() == null)
            return false;
        if (other.getJobFlowId() != null
                && other.getJobFlowId().equals(this.getJobFlowId()) == false)
            return false;
        if (other.getSteps() == null ^ this.getSteps() == null)
            return false;
        if (other.getSteps() != null && other.getSteps().equals(this.getSteps()) == false)
            return false;
        return true;
    }
}
