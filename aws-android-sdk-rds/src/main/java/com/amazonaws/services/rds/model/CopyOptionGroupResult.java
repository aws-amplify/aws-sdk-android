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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

public class CopyOptionGroupResult implements Serializable {
    /**
     * <p/>
     */
    private OptionGroup optionGroup;

    /**
     * <p/>
     *
     * @return <p/>
     */
    public OptionGroup getOptionGroup() {
        return optionGroup;
    }

    /**
     * <p/>
     *
     * @param optionGroup <p/>
     */
    public void setOptionGroup(OptionGroup optionGroup) {
        this.optionGroup = optionGroup;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionGroup <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyOptionGroupResult withOptionGroup(OptionGroup optionGroup) {
        this.optionGroup = optionGroup;
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
        if (getOptionGroup() != null)
            sb.append("OptionGroup: " + getOptionGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOptionGroup() == null) ? 0 : getOptionGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyOptionGroupResult == false)
            return false;
        CopyOptionGroupResult other = (CopyOptionGroupResult) obj;

        if (other.getOptionGroup() == null ^ this.getOptionGroup() == null)
            return false;
        if (other.getOptionGroup() != null
                && other.getOptionGroup().equals(this.getOptionGroup()) == false)
            return false;
        return true;
    }
}
