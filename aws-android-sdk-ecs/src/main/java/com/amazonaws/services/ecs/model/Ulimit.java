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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * The <code>ulimit</code> settings to pass to the container.
 * </p>
 */
public class Ulimit implements Serializable {
    /**
     * <p>
     * The <code>type</code> of the <code>ulimit</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>core, cpu, data, fsize, locks, memlock, msgqueue,
     * nice, nofile, nproc, rss, rtprio, rttime, sigpending, stack
     */
    private String name;

    /**
     * <p>
     * The soft limit for the ulimit type.
     * </p>
     */
    private Integer softLimit;

    /**
     * <p>
     * The hard limit for the ulimit type.
     * </p>
     */
    private Integer hardLimit;

    /**
     * <p>
     * The <code>type</code> of the <code>ulimit</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>core, cpu, data, fsize, locks, memlock, msgqueue,
     * nice, nofile, nproc, rss, rtprio, rttime, sigpending, stack
     *
     * @return <p>
     *         The <code>type</code> of the <code>ulimit</code>.
     *         </p>
     * @see UlimitName
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The <code>type</code> of the <code>ulimit</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>core, cpu, data, fsize, locks, memlock, msgqueue,
     * nice, nofile, nproc, rss, rtprio, rttime, sigpending, stack
     *
     * @param name <p>
     *            The <code>type</code> of the <code>ulimit</code>.
     *            </p>
     * @see UlimitName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The <code>type</code> of the <code>ulimit</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>core, cpu, data, fsize, locks, memlock, msgqueue,
     * nice, nofile, nproc, rss, rtprio, rttime, sigpending, stack
     *
     * @param name <p>
     *            The <code>type</code> of the <code>ulimit</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UlimitName
     */
    public Ulimit withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The <code>type</code> of the <code>ulimit</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>core, cpu, data, fsize, locks, memlock, msgqueue,
     * nice, nofile, nproc, rss, rtprio, rttime, sigpending, stack
     *
     * @param name <p>
     *            The <code>type</code> of the <code>ulimit</code>.
     *            </p>
     * @see UlimitName
     */
    public void setName(UlimitName name) {
        this.name = name.toString();
    }

    /**
     * <p>
     * The <code>type</code> of the <code>ulimit</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>core, cpu, data, fsize, locks, memlock, msgqueue,
     * nice, nofile, nproc, rss, rtprio, rttime, sigpending, stack
     *
     * @param name <p>
     *            The <code>type</code> of the <code>ulimit</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UlimitName
     */
    public Ulimit withName(UlimitName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The soft limit for the ulimit type.
     * </p>
     *
     * @return <p>
     *         The soft limit for the ulimit type.
     *         </p>
     */
    public Integer getSoftLimit() {
        return softLimit;
    }

    /**
     * <p>
     * The soft limit for the ulimit type.
     * </p>
     *
     * @param softLimit <p>
     *            The soft limit for the ulimit type.
     *            </p>
     */
    public void setSoftLimit(Integer softLimit) {
        this.softLimit = softLimit;
    }

    /**
     * <p>
     * The soft limit for the ulimit type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param softLimit <p>
     *            The soft limit for the ulimit type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ulimit withSoftLimit(Integer softLimit) {
        this.softLimit = softLimit;
        return this;
    }

    /**
     * <p>
     * The hard limit for the ulimit type.
     * </p>
     *
     * @return <p>
     *         The hard limit for the ulimit type.
     *         </p>
     */
    public Integer getHardLimit() {
        return hardLimit;
    }

    /**
     * <p>
     * The hard limit for the ulimit type.
     * </p>
     *
     * @param hardLimit <p>
     *            The hard limit for the ulimit type.
     *            </p>
     */
    public void setHardLimit(Integer hardLimit) {
        this.hardLimit = hardLimit;
    }

    /**
     * <p>
     * The hard limit for the ulimit type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hardLimit <p>
     *            The hard limit for the ulimit type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ulimit withHardLimit(Integer hardLimit) {
        this.hardLimit = hardLimit;
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
            sb.append("name: " + getName() + ",");
        if (getSoftLimit() != null)
            sb.append("softLimit: " + getSoftLimit() + ",");
        if (getHardLimit() != null)
            sb.append("hardLimit: " + getHardLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSoftLimit() == null) ? 0 : getSoftLimit().hashCode());
        hashCode = prime * hashCode + ((getHardLimit() == null) ? 0 : getHardLimit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ulimit == false)
            return false;
        Ulimit other = (Ulimit) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSoftLimit() == null ^ this.getSoftLimit() == null)
            return false;
        if (other.getSoftLimit() != null
                && other.getSoftLimit().equals(this.getSoftLimit()) == false)
            return false;
        if (other.getHardLimit() == null ^ this.getHardLimit() == null)
            return false;
        if (other.getHardLimit() != null
                && other.getHardLimit().equals(this.getHardLimit()) == false)
            return false;
        return true;
    }
}
