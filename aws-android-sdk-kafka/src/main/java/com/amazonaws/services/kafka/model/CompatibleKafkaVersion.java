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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

/**
 * 
 <p>
 * Contains source Kafka versions and compatible target Kafka versions.
 * </p>
 */
public class CompatibleKafkaVersion implements Serializable {
    /**
     * 
     <p>
     * A Kafka version.
     * </p>
     */
    private String sourceVersion;

    /**
     * 
     <p>
     * A list of Kafka versions.
     * </p>
     */
    private java.util.List<String> targetVersions;

    /**
     * 
     <p>
     * A Kafka version.
     * </p>
     * 
     * @return <p>
     *         A Kafka version.
     *         </p>
     */
    public String getSourceVersion() {
        return sourceVersion;
    }

    /**
     * 
     <p>
     * A Kafka version.
     * </p>
     * 
     * @param sourceVersion <p>
     *            A Kafka version.
     *            </p>
     */
    public void setSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
    }

    /**
     * 
     <p>
     * A Kafka version.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceVersion <p>
     *            A Kafka version.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompatibleKafkaVersion withSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
        return this;
    }

    /**
     * 
     <p>
     * A list of Kafka versions.
     * </p>
     * 
     * @return <p>
     *         A list of Kafka versions.
     *         </p>
     */
    public java.util.List<String> getTargetVersions() {
        return targetVersions;
    }

    /**
     * 
     <p>
     * A list of Kafka versions.
     * </p>
     * 
     * @param targetVersions <p>
     *            A list of Kafka versions.
     *            </p>
     */
    public void setTargetVersions(java.util.Collection<String> targetVersions) {
        if (targetVersions == null) {
            this.targetVersions = null;
            return;
        }

        this.targetVersions = new java.util.ArrayList<String>(targetVersions);
    }

    /**
     * 
     <p>
     * A list of Kafka versions.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetVersions <p>
     *            A list of Kafka versions.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompatibleKafkaVersion withTargetVersions(String... targetVersions) {
        if (getTargetVersions() == null) {
            this.targetVersions = new java.util.ArrayList<String>(targetVersions.length);
        }
        for (String value : targetVersions) {
            this.targetVersions.add(value);
        }
        return this;
    }

    /**
     * 
     <p>
     * A list of Kafka versions.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetVersions <p>
     *            A list of Kafka versions.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompatibleKafkaVersion withTargetVersions(java.util.Collection<String> targetVersions) {
        setTargetVersions(targetVersions);
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
        if (getSourceVersion() != null)
            sb.append("SourceVersion: " + getSourceVersion() + ",");
        if (getTargetVersions() != null)
            sb.append("TargetVersions: " + getTargetVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSourceVersion() == null) ? 0 : getSourceVersion().hashCode());
        hashCode = prime * hashCode
                + ((getTargetVersions() == null) ? 0 : getTargetVersions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompatibleKafkaVersion == false)
            return false;
        CompatibleKafkaVersion other = (CompatibleKafkaVersion) obj;

        if (other.getSourceVersion() == null ^ this.getSourceVersion() == null)
            return false;
        if (other.getSourceVersion() != null
                && other.getSourceVersion().equals(this.getSourceVersion()) == false)
            return false;
        if (other.getTargetVersions() == null ^ this.getTargetVersions() == null)
            return false;
        if (other.getTargetVersions() != null
                && other.getTargetVersions().equals(this.getTargetVersions()) == false)
            return false;
        return true;
    }
}
