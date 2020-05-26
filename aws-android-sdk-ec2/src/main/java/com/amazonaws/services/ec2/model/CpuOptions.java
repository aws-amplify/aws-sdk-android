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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * The CPU options for the instance.
 * </p>
 */
public class CpuOptions implements Serializable {
    /**
     * <p>
     * The number of CPU cores for the instance.
     * </p>
     */
    private Integer coreCount;

    /**
     * <p>
     * The number of threads per CPU core.
     * </p>
     */
    private Integer threadsPerCore;

    /**
     * <p>
     * The number of CPU cores for the instance.
     * </p>
     *
     * @return <p>
     *         The number of CPU cores for the instance.
     *         </p>
     */
    public Integer getCoreCount() {
        return coreCount;
    }

    /**
     * <p>
     * The number of CPU cores for the instance.
     * </p>
     *
     * @param coreCount <p>
     *            The number of CPU cores for the instance.
     *            </p>
     */
    public void setCoreCount(Integer coreCount) {
        this.coreCount = coreCount;
    }

    /**
     * <p>
     * The number of CPU cores for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param coreCount <p>
     *            The number of CPU cores for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CpuOptions withCoreCount(Integer coreCount) {
        this.coreCount = coreCount;
        return this;
    }

    /**
     * <p>
     * The number of threads per CPU core.
     * </p>
     *
     * @return <p>
     *         The number of threads per CPU core.
     *         </p>
     */
    public Integer getThreadsPerCore() {
        return threadsPerCore;
    }

    /**
     * <p>
     * The number of threads per CPU core.
     * </p>
     *
     * @param threadsPerCore <p>
     *            The number of threads per CPU core.
     *            </p>
     */
    public void setThreadsPerCore(Integer threadsPerCore) {
        this.threadsPerCore = threadsPerCore;
    }

    /**
     * <p>
     * The number of threads per CPU core.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param threadsPerCore <p>
     *            The number of threads per CPU core.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CpuOptions withThreadsPerCore(Integer threadsPerCore) {
        this.threadsPerCore = threadsPerCore;
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
        if (getCoreCount() != null)
            sb.append("CoreCount: " + getCoreCount() + ",");
        if (getThreadsPerCore() != null)
            sb.append("ThreadsPerCore: " + getThreadsPerCore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoreCount() == null) ? 0 : getCoreCount().hashCode());
        hashCode = prime * hashCode
                + ((getThreadsPerCore() == null) ? 0 : getThreadsPerCore().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CpuOptions == false)
            return false;
        CpuOptions other = (CpuOptions) obj;

        if (other.getCoreCount() == null ^ this.getCoreCount() == null)
            return false;
        if (other.getCoreCount() != null
                && other.getCoreCount().equals(this.getCoreCount()) == false)
            return false;
        if (other.getThreadsPerCore() == null ^ this.getThreadsPerCore() == null)
            return false;
        if (other.getThreadsPerCore() != null
                && other.getThreadsPerCore().equals(this.getThreadsPerCore()) == false)
            return false;
        return true;
    }
}
