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
 * Describes the vCPU configurations for the instance type.
 * </p>
 */
public class VCpuInfo implements Serializable {
    /**
     * <p>
     * The default number of vCPUs for the instance type.
     * </p>
     */
    private Integer defaultVCpus;

    /**
     * <p>
     * The default number of cores for the instance type.
     * </p>
     */
    private Integer defaultCores;

    /**
     * <p>
     * The default number of threads per core for the instance type.
     * </p>
     */
    private Integer defaultThreadsPerCore;

    /**
     * <p>
     * List of the valid number of cores that can be configured for the instance
     * type.
     * </p>
     */
    private java.util.List<Integer> validCores;

    /**
     * <p>
     * List of the valid number of threads per core that can be configured for
     * the instance type.
     * </p>
     */
    private java.util.List<Integer> validThreadsPerCore;

    /**
     * <p>
     * The default number of vCPUs for the instance type.
     * </p>
     *
     * @return <p>
     *         The default number of vCPUs for the instance type.
     *         </p>
     */
    public Integer getDefaultVCpus() {
        return defaultVCpus;
    }

    /**
     * <p>
     * The default number of vCPUs for the instance type.
     * </p>
     *
     * @param defaultVCpus <p>
     *            The default number of vCPUs for the instance type.
     *            </p>
     */
    public void setDefaultVCpus(Integer defaultVCpus) {
        this.defaultVCpus = defaultVCpus;
    }

    /**
     * <p>
     * The default number of vCPUs for the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultVCpus <p>
     *            The default number of vCPUs for the instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VCpuInfo withDefaultVCpus(Integer defaultVCpus) {
        this.defaultVCpus = defaultVCpus;
        return this;
    }

    /**
     * <p>
     * The default number of cores for the instance type.
     * </p>
     *
     * @return <p>
     *         The default number of cores for the instance type.
     *         </p>
     */
    public Integer getDefaultCores() {
        return defaultCores;
    }

    /**
     * <p>
     * The default number of cores for the instance type.
     * </p>
     *
     * @param defaultCores <p>
     *            The default number of cores for the instance type.
     *            </p>
     */
    public void setDefaultCores(Integer defaultCores) {
        this.defaultCores = defaultCores;
    }

    /**
     * <p>
     * The default number of cores for the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultCores <p>
     *            The default number of cores for the instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VCpuInfo withDefaultCores(Integer defaultCores) {
        this.defaultCores = defaultCores;
        return this;
    }

    /**
     * <p>
     * The default number of threads per core for the instance type.
     * </p>
     *
     * @return <p>
     *         The default number of threads per core for the instance type.
     *         </p>
     */
    public Integer getDefaultThreadsPerCore() {
        return defaultThreadsPerCore;
    }

    /**
     * <p>
     * The default number of threads per core for the instance type.
     * </p>
     *
     * @param defaultThreadsPerCore <p>
     *            The default number of threads per core for the instance type.
     *            </p>
     */
    public void setDefaultThreadsPerCore(Integer defaultThreadsPerCore) {
        this.defaultThreadsPerCore = defaultThreadsPerCore;
    }

    /**
     * <p>
     * The default number of threads per core for the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultThreadsPerCore <p>
     *            The default number of threads per core for the instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VCpuInfo withDefaultThreadsPerCore(Integer defaultThreadsPerCore) {
        this.defaultThreadsPerCore = defaultThreadsPerCore;
        return this;
    }

    /**
     * <p>
     * List of the valid number of cores that can be configured for the instance
     * type.
     * </p>
     *
     * @return <p>
     *         List of the valid number of cores that can be configured for the
     *         instance type.
     *         </p>
     */
    public java.util.List<Integer> getValidCores() {
        return validCores;
    }

    /**
     * <p>
     * List of the valid number of cores that can be configured for the instance
     * type.
     * </p>
     *
     * @param validCores <p>
     *            List of the valid number of cores that can be configured for
     *            the instance type.
     *            </p>
     */
    public void setValidCores(java.util.Collection<Integer> validCores) {
        if (validCores == null) {
            this.validCores = null;
            return;
        }

        this.validCores = new java.util.ArrayList<Integer>(validCores);
    }

    /**
     * <p>
     * List of the valid number of cores that can be configured for the instance
     * type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validCores <p>
     *            List of the valid number of cores that can be configured for
     *            the instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VCpuInfo withValidCores(Integer... validCores) {
        if (getValidCores() == null) {
            this.validCores = new java.util.ArrayList<Integer>(validCores.length);
        }
        for (Integer value : validCores) {
            this.validCores.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of the valid number of cores that can be configured for the instance
     * type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validCores <p>
     *            List of the valid number of cores that can be configured for
     *            the instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VCpuInfo withValidCores(java.util.Collection<Integer> validCores) {
        setValidCores(validCores);
        return this;
    }

    /**
     * <p>
     * List of the valid number of threads per core that can be configured for
     * the instance type.
     * </p>
     *
     * @return <p>
     *         List of the valid number of threads per core that can be
     *         configured for the instance type.
     *         </p>
     */
    public java.util.List<Integer> getValidThreadsPerCore() {
        return validThreadsPerCore;
    }

    /**
     * <p>
     * List of the valid number of threads per core that can be configured for
     * the instance type.
     * </p>
     *
     * @param validThreadsPerCore <p>
     *            List of the valid number of threads per core that can be
     *            configured for the instance type.
     *            </p>
     */
    public void setValidThreadsPerCore(java.util.Collection<Integer> validThreadsPerCore) {
        if (validThreadsPerCore == null) {
            this.validThreadsPerCore = null;
            return;
        }

        this.validThreadsPerCore = new java.util.ArrayList<Integer>(validThreadsPerCore);
    }

    /**
     * <p>
     * List of the valid number of threads per core that can be configured for
     * the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validThreadsPerCore <p>
     *            List of the valid number of threads per core that can be
     *            configured for the instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VCpuInfo withValidThreadsPerCore(Integer... validThreadsPerCore) {
        if (getValidThreadsPerCore() == null) {
            this.validThreadsPerCore = new java.util.ArrayList<Integer>(validThreadsPerCore.length);
        }
        for (Integer value : validThreadsPerCore) {
            this.validThreadsPerCore.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of the valid number of threads per core that can be configured for
     * the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validThreadsPerCore <p>
     *            List of the valid number of threads per core that can be
     *            configured for the instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VCpuInfo withValidThreadsPerCore(java.util.Collection<Integer> validThreadsPerCore) {
        setValidThreadsPerCore(validThreadsPerCore);
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
        if (getDefaultVCpus() != null)
            sb.append("DefaultVCpus: " + getDefaultVCpus() + ",");
        if (getDefaultCores() != null)
            sb.append("DefaultCores: " + getDefaultCores() + ",");
        if (getDefaultThreadsPerCore() != null)
            sb.append("DefaultThreadsPerCore: " + getDefaultThreadsPerCore() + ",");
        if (getValidCores() != null)
            sb.append("ValidCores: " + getValidCores() + ",");
        if (getValidThreadsPerCore() != null)
            sb.append("ValidThreadsPerCore: " + getValidThreadsPerCore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDefaultVCpus() == null) ? 0 : getDefaultVCpus().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultCores() == null) ? 0 : getDefaultCores().hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultThreadsPerCore() == null) ? 0 : getDefaultThreadsPerCore().hashCode());
        hashCode = prime * hashCode + ((getValidCores() == null) ? 0 : getValidCores().hashCode());
        hashCode = prime * hashCode
                + ((getValidThreadsPerCore() == null) ? 0 : getValidThreadsPerCore().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VCpuInfo == false)
            return false;
        VCpuInfo other = (VCpuInfo) obj;

        if (other.getDefaultVCpus() == null ^ this.getDefaultVCpus() == null)
            return false;
        if (other.getDefaultVCpus() != null
                && other.getDefaultVCpus().equals(this.getDefaultVCpus()) == false)
            return false;
        if (other.getDefaultCores() == null ^ this.getDefaultCores() == null)
            return false;
        if (other.getDefaultCores() != null
                && other.getDefaultCores().equals(this.getDefaultCores()) == false)
            return false;
        if (other.getDefaultThreadsPerCore() == null ^ this.getDefaultThreadsPerCore() == null)
            return false;
        if (other.getDefaultThreadsPerCore() != null
                && other.getDefaultThreadsPerCore().equals(this.getDefaultThreadsPerCore()) == false)
            return false;
        if (other.getValidCores() == null ^ this.getValidCores() == null)
            return false;
        if (other.getValidCores() != null
                && other.getValidCores().equals(this.getValidCores()) == false)
            return false;
        if (other.getValidThreadsPerCore() == null ^ this.getValidThreadsPerCore() == null)
            return false;
        if (other.getValidThreadsPerCore() != null
                && other.getValidThreadsPerCore().equals(this.getValidThreadsPerCore()) == false)
            return false;
        return true;
    }
}
