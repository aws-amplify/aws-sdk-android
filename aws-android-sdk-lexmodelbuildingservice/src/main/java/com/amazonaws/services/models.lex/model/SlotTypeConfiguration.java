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

package com.amazonaws.services.models.lex.model;

import java.io.Serializable;

/**
 * <p>
 * Provides configuration information for a slot type.
 * </p>
 */
public class SlotTypeConfiguration implements Serializable {
    /**
     * <p>
     * A regular expression used to validate the value of a slot.
     * </p>
     */
    private SlotTypeRegexConfiguration regexConfiguration;

    /**
     * <p>
     * A regular expression used to validate the value of a slot.
     * </p>
     *
     * @return <p>
     *         A regular expression used to validate the value of a slot.
     *         </p>
     */
    public SlotTypeRegexConfiguration getRegexConfiguration() {
        return regexConfiguration;
    }

    /**
     * <p>
     * A regular expression used to validate the value of a slot.
     * </p>
     *
     * @param regexConfiguration <p>
     *            A regular expression used to validate the value of a slot.
     *            </p>
     */
    public void setRegexConfiguration(SlotTypeRegexConfiguration regexConfiguration) {
        this.regexConfiguration = regexConfiguration;
    }

    /**
     * <p>
     * A regular expression used to validate the value of a slot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regexConfiguration <p>
     *            A regular expression used to validate the value of a slot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SlotTypeConfiguration withRegexConfiguration(
            SlotTypeRegexConfiguration regexConfiguration) {
        this.regexConfiguration = regexConfiguration;
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
        if (getRegexConfiguration() != null)
            sb.append("regexConfiguration: " + getRegexConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRegexConfiguration() == null) ? 0 : getRegexConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SlotTypeConfiguration == false)
            return false;
        SlotTypeConfiguration other = (SlotTypeConfiguration) obj;

        if (other.getRegexConfiguration() == null ^ this.getRegexConfiguration() == null)
            return false;
        if (other.getRegexConfiguration() != null
                && other.getRegexConfiguration().equals(this.getRegexConfiguration()) == false)
            return false;
        return true;
    }
}
