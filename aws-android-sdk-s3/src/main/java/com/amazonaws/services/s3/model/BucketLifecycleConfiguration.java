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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the lifecycle configuration for objects in an Amazon S3 bucket. For
 * more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html"
 * >Object Lifecycle Management</a> in the <i>Amazon Simple Storage Service
 * Developer Guide</i>.
 * </p>
 */
public class BucketLifecycleConfiguration implements Serializable {
    /**
     * <p>
     * A lifecycle rule for individual objects in an Amazon S3 bucket.
     * </p>
     */
    private java.util.List<LifecycleRule> rules;

    /**
     * <p>
     * A lifecycle rule for individual objects in an Amazon S3 bucket.
     * </p>
     *
     * @return <p>
     *         A lifecycle rule for individual objects in an Amazon S3 bucket.
     *         </p>
     */
    public java.util.List<LifecycleRule> getRules() {
        return rules;
    }

    /**
     * <p>
     * A lifecycle rule for individual objects in an Amazon S3 bucket.
     * </p>
     *
     * @param rules <p>
     *            A lifecycle rule for individual objects in an Amazon S3
     *            bucket.
     *            </p>
     */
    public void setRules(java.util.Collection<LifecycleRule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<LifecycleRule>(rules);
    }

    /**
     * <p>
     * A lifecycle rule for individual objects in an Amazon S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            A lifecycle rule for individual objects in an Amazon S3
     *            bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketLifecycleConfiguration withRules(LifecycleRule... rules) {
        if (getRules() == null) {
            this.rules = new java.util.ArrayList<LifecycleRule>(rules.length);
        }
        for (LifecycleRule value : rules) {
            this.rules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A lifecycle rule for individual objects in an Amazon S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            A lifecycle rule for individual objects in an Amazon S3
     *            bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketLifecycleConfiguration withRules(java.util.Collection<LifecycleRule> rules) {
        setRules(rules);
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
        if (getRules() != null)
            sb.append("Rules: " + getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BucketLifecycleConfiguration == false)
            return false;
        BucketLifecycleConfiguration other = (BucketLifecycleConfiguration) obj;

        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }
}
