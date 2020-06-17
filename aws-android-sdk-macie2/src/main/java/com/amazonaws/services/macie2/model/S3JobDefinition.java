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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies which S3 buckets contain the objects that a classification job
 * analyzes, and the scope of that analysis.
 * </p>
 */
public class S3JobDefinition implements Serializable {
    /**
     * <p>
     * An array of objects, one for each bucket that contains objects to
     * analyze.
     * </p>
     */
    private java.util.List<S3BucketDefinitionForJob> bucketDefinitions;

    /**
     * <p>
     * A JobScopeTerm object that specifies conditions for including or
     * excluding objects from the job.
     * </p>
     */
    private Scoping scoping;

    /**
     * <p>
     * An array of objects, one for each bucket that contains objects to
     * analyze.
     * </p>
     *
     * @return <p>
     *         An array of objects, one for each bucket that contains objects to
     *         analyze.
     *         </p>
     */
    public java.util.List<S3BucketDefinitionForJob> getBucketDefinitions() {
        return bucketDefinitions;
    }

    /**
     * <p>
     * An array of objects, one for each bucket that contains objects to
     * analyze.
     * </p>
     *
     * @param bucketDefinitions <p>
     *            An array of objects, one for each bucket that contains objects
     *            to analyze.
     *            </p>
     */
    public void setBucketDefinitions(
            java.util.Collection<S3BucketDefinitionForJob> bucketDefinitions) {
        if (bucketDefinitions == null) {
            this.bucketDefinitions = null;
            return;
        }

        this.bucketDefinitions = new java.util.ArrayList<S3BucketDefinitionForJob>(
                bucketDefinitions);
    }

    /**
     * <p>
     * An array of objects, one for each bucket that contains objects to
     * analyze.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucketDefinitions <p>
     *            An array of objects, one for each bucket that contains objects
     *            to analyze.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3JobDefinition withBucketDefinitions(S3BucketDefinitionForJob... bucketDefinitions) {
        if (getBucketDefinitions() == null) {
            this.bucketDefinitions = new java.util.ArrayList<S3BucketDefinitionForJob>(
                    bucketDefinitions.length);
        }
        for (S3BucketDefinitionForJob value : bucketDefinitions) {
            this.bucketDefinitions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each bucket that contains objects to
     * analyze.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucketDefinitions <p>
     *            An array of objects, one for each bucket that contains objects
     *            to analyze.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3JobDefinition withBucketDefinitions(
            java.util.Collection<S3BucketDefinitionForJob> bucketDefinitions) {
        setBucketDefinitions(bucketDefinitions);
        return this;
    }

    /**
     * <p>
     * A JobScopeTerm object that specifies conditions for including or
     * excluding objects from the job.
     * </p>
     *
     * @return <p>
     *         A JobScopeTerm object that specifies conditions for including or
     *         excluding objects from the job.
     *         </p>
     */
    public Scoping getScoping() {
        return scoping;
    }

    /**
     * <p>
     * A JobScopeTerm object that specifies conditions for including or
     * excluding objects from the job.
     * </p>
     *
     * @param scoping <p>
     *            A JobScopeTerm object that specifies conditions for including
     *            or excluding objects from the job.
     *            </p>
     */
    public void setScoping(Scoping scoping) {
        this.scoping = scoping;
    }

    /**
     * <p>
     * A JobScopeTerm object that specifies conditions for including or
     * excluding objects from the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scoping <p>
     *            A JobScopeTerm object that specifies conditions for including
     *            or excluding objects from the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3JobDefinition withScoping(Scoping scoping) {
        this.scoping = scoping;
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
        if (getBucketDefinitions() != null)
            sb.append("bucketDefinitions: " + getBucketDefinitions() + ",");
        if (getScoping() != null)
            sb.append("scoping: " + getScoping());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBucketDefinitions() == null) ? 0 : getBucketDefinitions().hashCode());
        hashCode = prime * hashCode + ((getScoping() == null) ? 0 : getScoping().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3JobDefinition == false)
            return false;
        S3JobDefinition other = (S3JobDefinition) obj;

        if (other.getBucketDefinitions() == null ^ this.getBucketDefinitions() == null)
            return false;
        if (other.getBucketDefinitions() != null
                && other.getBucketDefinitions().equals(this.getBucketDefinitions()) == false)
            return false;
        if (other.getScoping() == null ^ this.getScoping() == null)
            return false;
        if (other.getScoping() != null && other.getScoping().equals(this.getScoping()) == false)
            return false;
        return true;
    }
}
