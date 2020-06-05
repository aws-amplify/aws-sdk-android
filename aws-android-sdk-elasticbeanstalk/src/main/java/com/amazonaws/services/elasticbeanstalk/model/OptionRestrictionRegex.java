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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * A regular expression representing a restriction on a string configuration
 * option value.
 * </p>
 */
public class OptionRestrictionRegex implements Serializable {
    /**
     * <p>
     * The regular expression pattern that a string configuration option value
     * with this restriction must match.
     * </p>
     */
    private String pattern;

    /**
     * <p>
     * A unique name representing this regular expression.
     * </p>
     */
    private String label;

    /**
     * <p>
     * The regular expression pattern that a string configuration option value
     * with this restriction must match.
     * </p>
     *
     * @return <p>
     *         The regular expression pattern that a string configuration option
     *         value with this restriction must match.
     *         </p>
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * <p>
     * The regular expression pattern that a string configuration option value
     * with this restriction must match.
     * </p>
     *
     * @param pattern <p>
     *            The regular expression pattern that a string configuration
     *            option value with this restriction must match.
     *            </p>
     */
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /**
     * <p>
     * The regular expression pattern that a string configuration option value
     * with this restriction must match.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pattern <p>
     *            The regular expression pattern that a string configuration
     *            option value with this restriction must match.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionRestrictionRegex withPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * <p>
     * A unique name representing this regular expression.
     * </p>
     *
     * @return <p>
     *         A unique name representing this regular expression.
     *         </p>
     */
    public String getLabel() {
        return label;
    }

    /**
     * <p>
     * A unique name representing this regular expression.
     * </p>
     *
     * @param label <p>
     *            A unique name representing this regular expression.
     *            </p>
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * A unique name representing this regular expression.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param label <p>
     *            A unique name representing this regular expression.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionRestrictionRegex withLabel(String label) {
        this.label = label;
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
        if (getPattern() != null)
            sb.append("Pattern: " + getPattern() + ",");
        if (getLabel() != null)
            sb.append("Label: " + getLabel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPattern() == null) ? 0 : getPattern().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OptionRestrictionRegex == false)
            return false;
        OptionRestrictionRegex other = (OptionRestrictionRegex) obj;

        if (other.getPattern() == null ^ this.getPattern() == null)
            return false;
        if (other.getPattern() != null && other.getPattern().equals(this.getPattern()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        return true;
    }
}
