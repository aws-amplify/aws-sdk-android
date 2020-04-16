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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * The details of process-related information about a finding.
 * </p>
 */
public class ProcessDetails implements Serializable {
    /**
     * <p>
     * The name of the process.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String name;

    /**
     * <p>
     * The path to the process executable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String path;

    /**
     * <p>
     * The process ID.
     * </p>
     */
    private Integer pid;

    /**
     * <p>
     * The parent process ID.
     * </p>
     */
    private Integer parentPid;

    /**
     * <p>
     * The date/time that the process was launched.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String launchedAt;

    /**
     * <p>
     * The date and time when the process was terminated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String terminatedAt;

    /**
     * <p>
     * The name of the process.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The name of the process.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the process.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            The name of the process.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the process.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            The name of the process.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessDetails withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The path to the process executable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The path to the process executable.
     *         </p>
     */
    public String getPath() {
        return path;
    }

    /**
     * <p>
     * The path to the process executable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param path <p>
     *            The path to the process executable.
     *            </p>
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the process executable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param path <p>
     *            The path to the process executable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessDetails withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * <p>
     * The process ID.
     * </p>
     *
     * @return <p>
     *         The process ID.
     *         </p>
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * <p>
     * The process ID.
     * </p>
     *
     * @param pid <p>
     *            The process ID.
     *            </p>
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * <p>
     * The process ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pid <p>
     *            The process ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessDetails withPid(Integer pid) {
        this.pid = pid;
        return this;
    }

    /**
     * <p>
     * The parent process ID.
     * </p>
     *
     * @return <p>
     *         The parent process ID.
     *         </p>
     */
    public Integer getParentPid() {
        return parentPid;
    }

    /**
     * <p>
     * The parent process ID.
     * </p>
     *
     * @param parentPid <p>
     *            The parent process ID.
     *            </p>
     */
    public void setParentPid(Integer parentPid) {
        this.parentPid = parentPid;
    }

    /**
     * <p>
     * The parent process ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parentPid <p>
     *            The parent process ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessDetails withParentPid(Integer parentPid) {
        this.parentPid = parentPid;
        return this;
    }

    /**
     * <p>
     * The date/time that the process was launched.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The date/time that the process was launched.
     *         </p>
     */
    public String getLaunchedAt() {
        return launchedAt;
    }

    /**
     * <p>
     * The date/time that the process was launched.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param launchedAt <p>
     *            The date/time that the process was launched.
     *            </p>
     */
    public void setLaunchedAt(String launchedAt) {
        this.launchedAt = launchedAt;
    }

    /**
     * <p>
     * The date/time that the process was launched.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param launchedAt <p>
     *            The date/time that the process was launched.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessDetails withLaunchedAt(String launchedAt) {
        this.launchedAt = launchedAt;
        return this;
    }

    /**
     * <p>
     * The date and time when the process was terminated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The date and time when the process was terminated.
     *         </p>
     */
    public String getTerminatedAt() {
        return terminatedAt;
    }

    /**
     * <p>
     * The date and time when the process was terminated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param terminatedAt <p>
     *            The date and time when the process was terminated.
     *            </p>
     */
    public void setTerminatedAt(String terminatedAt) {
        this.terminatedAt = terminatedAt;
    }

    /**
     * <p>
     * The date and time when the process was terminated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param terminatedAt <p>
     *            The date and time when the process was terminated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessDetails withTerminatedAt(String terminatedAt) {
        this.terminatedAt = terminatedAt;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getPath() != null)
            sb.append("Path: " + getPath() + ",");
        if (getPid() != null)
            sb.append("Pid: " + getPid() + ",");
        if (getParentPid() != null)
            sb.append("ParentPid: " + getParentPid() + ",");
        if (getLaunchedAt() != null)
            sb.append("LaunchedAt: " + getLaunchedAt() + ",");
        if (getTerminatedAt() != null)
            sb.append("TerminatedAt: " + getTerminatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getPid() == null) ? 0 : getPid().hashCode());
        hashCode = prime * hashCode + ((getParentPid() == null) ? 0 : getParentPid().hashCode());
        hashCode = prime * hashCode + ((getLaunchedAt() == null) ? 0 : getLaunchedAt().hashCode());
        hashCode = prime * hashCode
                + ((getTerminatedAt() == null) ? 0 : getTerminatedAt().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProcessDetails == false)
            return false;
        ProcessDetails other = (ProcessDetails) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getPid() == null ^ this.getPid() == null)
            return false;
        if (other.getPid() != null && other.getPid().equals(this.getPid()) == false)
            return false;
        if (other.getParentPid() == null ^ this.getParentPid() == null)
            return false;
        if (other.getParentPid() != null
                && other.getParentPid().equals(this.getParentPid()) == false)
            return false;
        if (other.getLaunchedAt() == null ^ this.getLaunchedAt() == null)
            return false;
        if (other.getLaunchedAt() != null
                && other.getLaunchedAt().equals(this.getLaunchedAt()) == false)
            return false;
        if (other.getTerminatedAt() == null ^ this.getTerminatedAt() == null)
            return false;
        if (other.getTerminatedAt() != null
                && other.getTerminatedAt().equals(this.getTerminatedAt()) == false)
            return false;
        return true;
    }
}
