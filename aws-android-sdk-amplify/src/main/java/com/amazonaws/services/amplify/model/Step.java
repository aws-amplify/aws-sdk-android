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

package com.amazonaws.services.amplify.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an execution step, for an execution job, for an Amplify app.
 * </p>
 */
public class Step implements Serializable {
    /**
     * <p>
     * The name of the execution step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String stepName;

    /**
     * <p>
     * The start date and time of the execution step.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The status of the execution step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, PROVISIONING, RUNNING, FAILED, SUCCEED,
     * CANCELLING, CANCELLED
     */
    private String status;

    /**
     * <p>
     * The end date and time of the execution step.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The URL to the logs for the execution step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     */
    private String logUrl;

    /**
     * <p>
     * The URL to the artifact for the execution step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     */
    private String artifactsUrl;

    /**
     * <p>
     * The URL to the test artifact for the execution step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     */
    private String testArtifactsUrl;

    /**
     * <p>
     * The URL to the test configuration for the execution step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     */
    private String testConfigUrl;

    /**
     * <p>
     * The list of screenshot URLs for the execution step, if relevant.
     * </p>
     */
    private java.util.Map<String, String> screenshots;

    /**
     * <p>
     * The reason for the current step status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     */
    private String statusReason;

    /**
     * <p>
     * The context for the current step. Includes a build image if the step is
     * build.
     * </p>
     */
    private String context;

    /**
     * <p>
     * The name of the execution step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The name of the execution step.
     *         </p>
     */
    public String getStepName() {
        return stepName;
    }

    /**
     * <p>
     * The name of the execution step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param stepName <p>
     *            The name of the execution step.
     *            </p>
     */
    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    /**
     * <p>
     * The name of the execution step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param stepName <p>
     *            The name of the execution step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Step withStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }

    /**
     * <p>
     * The start date and time of the execution step.
     * </p>
     *
     * @return <p>
     *         The start date and time of the execution step.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The start date and time of the execution step.
     * </p>
     *
     * @param startTime <p>
     *            The start date and time of the execution step.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start date and time of the execution step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The start date and time of the execution step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Step withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The status of the execution step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, PROVISIONING, RUNNING, FAILED, SUCCEED,
     * CANCELLING, CANCELLED
     *
     * @return <p>
     *         The status of the execution step.
     *         </p>
     * @see JobStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the execution step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, PROVISIONING, RUNNING, FAILED, SUCCEED,
     * CANCELLING, CANCELLED
     *
     * @param status <p>
     *            The status of the execution step.
     *            </p>
     * @see JobStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the execution step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, PROVISIONING, RUNNING, FAILED, SUCCEED,
     * CANCELLING, CANCELLED
     *
     * @param status <p>
     *            The status of the execution step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public Step withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the execution step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, PROVISIONING, RUNNING, FAILED, SUCCEED,
     * CANCELLING, CANCELLED
     *
     * @param status <p>
     *            The status of the execution step.
     *            </p>
     * @see JobStatus
     */
    public void setStatus(JobStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the execution step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, PROVISIONING, RUNNING, FAILED, SUCCEED,
     * CANCELLING, CANCELLED
     *
     * @param status <p>
     *            The status of the execution step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public Step withStatus(JobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The end date and time of the execution step.
     * </p>
     *
     * @return <p>
     *         The end date and time of the execution step.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The end date and time of the execution step.
     * </p>
     *
     * @param endTime <p>
     *            The end date and time of the execution step.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end date and time of the execution step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The end date and time of the execution step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Step withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The URL to the logs for the execution step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @return <p>
     *         The URL to the logs for the execution step.
     *         </p>
     */
    public String getLogUrl() {
        return logUrl;
    }

    /**
     * <p>
     * The URL to the logs for the execution step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param logUrl <p>
     *            The URL to the logs for the execution step.
     *            </p>
     */
    public void setLogUrl(String logUrl) {
        this.logUrl = logUrl;
    }

    /**
     * <p>
     * The URL to the logs for the execution step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param logUrl <p>
     *            The URL to the logs for the execution step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Step withLogUrl(String logUrl) {
        this.logUrl = logUrl;
        return this;
    }

    /**
     * <p>
     * The URL to the artifact for the execution step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @return <p>
     *         The URL to the artifact for the execution step.
     *         </p>
     */
    public String getArtifactsUrl() {
        return artifactsUrl;
    }

    /**
     * <p>
     * The URL to the artifact for the execution step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param artifactsUrl <p>
     *            The URL to the artifact for the execution step.
     *            </p>
     */
    public void setArtifactsUrl(String artifactsUrl) {
        this.artifactsUrl = artifactsUrl;
    }

    /**
     * <p>
     * The URL to the artifact for the execution step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param artifactsUrl <p>
     *            The URL to the artifact for the execution step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Step withArtifactsUrl(String artifactsUrl) {
        this.artifactsUrl = artifactsUrl;
        return this;
    }

    /**
     * <p>
     * The URL to the test artifact for the execution step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @return <p>
     *         The URL to the test artifact for the execution step.
     *         </p>
     */
    public String getTestArtifactsUrl() {
        return testArtifactsUrl;
    }

    /**
     * <p>
     * The URL to the test artifact for the execution step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param testArtifactsUrl <p>
     *            The URL to the test artifact for the execution step.
     *            </p>
     */
    public void setTestArtifactsUrl(String testArtifactsUrl) {
        this.testArtifactsUrl = testArtifactsUrl;
    }

    /**
     * <p>
     * The URL to the test artifact for the execution step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param testArtifactsUrl <p>
     *            The URL to the test artifact for the execution step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Step withTestArtifactsUrl(String testArtifactsUrl) {
        this.testArtifactsUrl = testArtifactsUrl;
        return this;
    }

    /**
     * <p>
     * The URL to the test configuration for the execution step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @return <p>
     *         The URL to the test configuration for the execution step.
     *         </p>
     */
    public String getTestConfigUrl() {
        return testConfigUrl;
    }

    /**
     * <p>
     * The URL to the test configuration for the execution step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param testConfigUrl <p>
     *            The URL to the test configuration for the execution step.
     *            </p>
     */
    public void setTestConfigUrl(String testConfigUrl) {
        this.testConfigUrl = testConfigUrl;
    }

    /**
     * <p>
     * The URL to the test configuration for the execution step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param testConfigUrl <p>
     *            The URL to the test configuration for the execution step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Step withTestConfigUrl(String testConfigUrl) {
        this.testConfigUrl = testConfigUrl;
        return this;
    }

    /**
     * <p>
     * The list of screenshot URLs for the execution step, if relevant.
     * </p>
     *
     * @return <p>
     *         The list of screenshot URLs for the execution step, if relevant.
     *         </p>
     */
    public java.util.Map<String, String> getScreenshots() {
        return screenshots;
    }

    /**
     * <p>
     * The list of screenshot URLs for the execution step, if relevant.
     * </p>
     *
     * @param screenshots <p>
     *            The list of screenshot URLs for the execution step, if
     *            relevant.
     *            </p>
     */
    public void setScreenshots(java.util.Map<String, String> screenshots) {
        this.screenshots = screenshots;
    }

    /**
     * <p>
     * The list of screenshot URLs for the execution step, if relevant.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param screenshots <p>
     *            The list of screenshot URLs for the execution step, if
     *            relevant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Step withScreenshots(java.util.Map<String, String> screenshots) {
        this.screenshots = screenshots;
        return this;
    }

    /**
     * <p>
     * The list of screenshot URLs for the execution step, if relevant.
     * </p>
     * <p>
     * The method adds a new key-value pair into screenshots parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into screenshots.
     * @param value The corresponding value of the entry to be added into
     *            screenshots.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Step addscreenshotsEntry(String key, String value) {
        if (null == this.screenshots) {
            this.screenshots = new java.util.HashMap<String, String>();
        }
        if (this.screenshots.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.screenshots.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into screenshots.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Step clearscreenshotsEntries() {
        this.screenshots = null;
        return this;
    }

    /**
     * <p>
     * The reason for the current step status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @return <p>
     *         The reason for the current step status.
     *         </p>
     */
    public String getStatusReason() {
        return statusReason;
    }

    /**
     * <p>
     * The reason for the current step status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param statusReason <p>
     *            The reason for the current step status.
     *            </p>
     */
    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason for the current step status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param statusReason <p>
     *            The reason for the current step status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Step withStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    /**
     * <p>
     * The context for the current step. Includes a build image if the step is
     * build.
     * </p>
     *
     * @return <p>
     *         The context for the current step. Includes a build image if the
     *         step is build.
     *         </p>
     */
    public String getContext() {
        return context;
    }

    /**
     * <p>
     * The context for the current step. Includes a build image if the step is
     * build.
     * </p>
     *
     * @param context <p>
     *            The context for the current step. Includes a build image if
     *            the step is build.
     *            </p>
     */
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * <p>
     * The context for the current step. Includes a build image if the step is
     * build.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param context <p>
     *            The context for the current step. Includes a build image if
     *            the step is build.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Step withContext(String context) {
        this.context = context;
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
        if (getStepName() != null)
            sb.append("stepName: " + getStepName() + ",");
        if (getStartTime() != null)
            sb.append("startTime: " + getStartTime() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getEndTime() != null)
            sb.append("endTime: " + getEndTime() + ",");
        if (getLogUrl() != null)
            sb.append("logUrl: " + getLogUrl() + ",");
        if (getArtifactsUrl() != null)
            sb.append("artifactsUrl: " + getArtifactsUrl() + ",");
        if (getTestArtifactsUrl() != null)
            sb.append("testArtifactsUrl: " + getTestArtifactsUrl() + ",");
        if (getTestConfigUrl() != null)
            sb.append("testConfigUrl: " + getTestConfigUrl() + ",");
        if (getScreenshots() != null)
            sb.append("screenshots: " + getScreenshots() + ",");
        if (getStatusReason() != null)
            sb.append("statusReason: " + getStatusReason() + ",");
        if (getContext() != null)
            sb.append("context: " + getContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStepName() == null) ? 0 : getStepName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getLogUrl() == null) ? 0 : getLogUrl().hashCode());
        hashCode = prime * hashCode
                + ((getArtifactsUrl() == null) ? 0 : getArtifactsUrl().hashCode());
        hashCode = prime * hashCode
                + ((getTestArtifactsUrl() == null) ? 0 : getTestArtifactsUrl().hashCode());
        hashCode = prime * hashCode
                + ((getTestConfigUrl() == null) ? 0 : getTestConfigUrl().hashCode());
        hashCode = prime * hashCode
                + ((getScreenshots() == null) ? 0 : getScreenshots().hashCode());
        hashCode = prime * hashCode
                + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getContext() == null) ? 0 : getContext().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Step == false)
            return false;
        Step other = (Step) obj;

        if (other.getStepName() == null ^ this.getStepName() == null)
            return false;
        if (other.getStepName() != null && other.getStepName().equals(this.getStepName()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getLogUrl() == null ^ this.getLogUrl() == null)
            return false;
        if (other.getLogUrl() != null && other.getLogUrl().equals(this.getLogUrl()) == false)
            return false;
        if (other.getArtifactsUrl() == null ^ this.getArtifactsUrl() == null)
            return false;
        if (other.getArtifactsUrl() != null
                && other.getArtifactsUrl().equals(this.getArtifactsUrl()) == false)
            return false;
        if (other.getTestArtifactsUrl() == null ^ this.getTestArtifactsUrl() == null)
            return false;
        if (other.getTestArtifactsUrl() != null
                && other.getTestArtifactsUrl().equals(this.getTestArtifactsUrl()) == false)
            return false;
        if (other.getTestConfigUrl() == null ^ this.getTestConfigUrl() == null)
            return false;
        if (other.getTestConfigUrl() != null
                && other.getTestConfigUrl().equals(this.getTestConfigUrl()) == false)
            return false;
        if (other.getScreenshots() == null ^ this.getScreenshots() == null)
            return false;
        if (other.getScreenshots() != null
                && other.getScreenshots().equals(this.getScreenshots()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null
                && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getContext() == null ^ this.getContext() == null)
            return false;
        if (other.getContext() != null && other.getContext().equals(this.getContext()) == false)
            return false;
        return true;
    }
}
