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
 * Specifies one or more conditions that determine which objects a
 * classification job analyzes.
 * </p>
 */
public class JobScopeTerm implements Serializable {
    /**
     * <p>
     * A property-based condition that defines a property, operator, and one or
     * more values for including or excluding an object from a job.
     * </p>
     */
    private SimpleScopeTerm simpleScopeTerm;

    /**
     * <p>
     * A tag-based condition that defines a property, operator, and one or more
     * values for including or excluding an object from a job.
     * </p>
     */
    private TagScopeTerm tagScopeTerm;

    /**
     * <p>
     * A property-based condition that defines a property, operator, and one or
     * more values for including or excluding an object from a job.
     * </p>
     *
     * @return <p>
     *         A property-based condition that defines a property, operator, and
     *         one or more values for including or excluding an object from a
     *         job.
     *         </p>
     */
    public SimpleScopeTerm getSimpleScopeTerm() {
        return simpleScopeTerm;
    }

    /**
     * <p>
     * A property-based condition that defines a property, operator, and one or
     * more values for including or excluding an object from a job.
     * </p>
     *
     * @param simpleScopeTerm <p>
     *            A property-based condition that defines a property, operator,
     *            and one or more values for including or excluding an object
     *            from a job.
     *            </p>
     */
    public void setSimpleScopeTerm(SimpleScopeTerm simpleScopeTerm) {
        this.simpleScopeTerm = simpleScopeTerm;
    }

    /**
     * <p>
     * A property-based condition that defines a property, operator, and one or
     * more values for including or excluding an object from a job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param simpleScopeTerm <p>
     *            A property-based condition that defines a property, operator,
     *            and one or more values for including or excluding an object
     *            from a job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobScopeTerm withSimpleScopeTerm(SimpleScopeTerm simpleScopeTerm) {
        this.simpleScopeTerm = simpleScopeTerm;
        return this;
    }

    /**
     * <p>
     * A tag-based condition that defines a property, operator, and one or more
     * values for including or excluding an object from a job.
     * </p>
     *
     * @return <p>
     *         A tag-based condition that defines a property, operator, and one
     *         or more values for including or excluding an object from a job.
     *         </p>
     */
    public TagScopeTerm getTagScopeTerm() {
        return tagScopeTerm;
    }

    /**
     * <p>
     * A tag-based condition that defines a property, operator, and one or more
     * values for including or excluding an object from a job.
     * </p>
     *
     * @param tagScopeTerm <p>
     *            A tag-based condition that defines a property, operator, and
     *            one or more values for including or excluding an object from a
     *            job.
     *            </p>
     */
    public void setTagScopeTerm(TagScopeTerm tagScopeTerm) {
        this.tagScopeTerm = tagScopeTerm;
    }

    /**
     * <p>
     * A tag-based condition that defines a property, operator, and one or more
     * values for including or excluding an object from a job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagScopeTerm <p>
     *            A tag-based condition that defines a property, operator, and
     *            one or more values for including or excluding an object from a
     *            job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobScopeTerm withTagScopeTerm(TagScopeTerm tagScopeTerm) {
        this.tagScopeTerm = tagScopeTerm;
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
        if (getSimpleScopeTerm() != null)
            sb.append("simpleScopeTerm: " + getSimpleScopeTerm() + ",");
        if (getTagScopeTerm() != null)
            sb.append("tagScopeTerm: " + getTagScopeTerm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSimpleScopeTerm() == null) ? 0 : getSimpleScopeTerm().hashCode());
        hashCode = prime * hashCode
                + ((getTagScopeTerm() == null) ? 0 : getTagScopeTerm().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobScopeTerm == false)
            return false;
        JobScopeTerm other = (JobScopeTerm) obj;

        if (other.getSimpleScopeTerm() == null ^ this.getSimpleScopeTerm() == null)
            return false;
        if (other.getSimpleScopeTerm() != null
                && other.getSimpleScopeTerm().equals(this.getSimpleScopeTerm()) == false)
            return false;
        if (other.getTagScopeTerm() == null ^ this.getTagScopeTerm() == null)
            return false;
        if (other.getTagScopeTerm() != null
                && other.getTagScopeTerm().equals(this.getTagScopeTerm()) == false)
            return false;
        return true;
    }
}
