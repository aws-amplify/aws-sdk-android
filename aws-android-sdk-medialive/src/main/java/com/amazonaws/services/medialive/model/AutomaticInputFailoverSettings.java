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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * The settings for Automatic Input Failover.
 */
public class AutomaticInputFailoverSettings implements Serializable {
    /**
     * Input preference when deciding which input to make active when a
     * previously failed input has recovered.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUAL_INPUT_PREFERENCE, PRIMARY_INPUT_PREFERRED
     */
    private String inputPreference;

    /**
     * The input ID of the secondary input in the automatic input failover pair.
     */
    private String secondaryInputId;

    /**
     * Input preference when deciding which input to make active when a
     * previously failed input has recovered.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUAL_INPUT_PREFERENCE, PRIMARY_INPUT_PREFERRED
     *
     * @return Input preference when deciding which input to make active when a
     *         previously failed input has recovered.
     * @see InputPreference
     */
    public String getInputPreference() {
        return inputPreference;
    }

    /**
     * Input preference when deciding which input to make active when a
     * previously failed input has recovered.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUAL_INPUT_PREFERENCE, PRIMARY_INPUT_PREFERRED
     *
     * @param inputPreference Input preference when deciding which input to make
     *            active when a previously failed input has recovered.
     * @see InputPreference
     */
    public void setInputPreference(String inputPreference) {
        this.inputPreference = inputPreference;
    }

    /**
     * Input preference when deciding which input to make active when a
     * previously failed input has recovered.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUAL_INPUT_PREFERENCE, PRIMARY_INPUT_PREFERRED
     *
     * @param inputPreference Input preference when deciding which input to make
     *            active when a previously failed input has recovered.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputPreference
     */
    public AutomaticInputFailoverSettings withInputPreference(String inputPreference) {
        this.inputPreference = inputPreference;
        return this;
    }

    /**
     * Input preference when deciding which input to make active when a
     * previously failed input has recovered.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUAL_INPUT_PREFERENCE, PRIMARY_INPUT_PREFERRED
     *
     * @param inputPreference Input preference when deciding which input to make
     *            active when a previously failed input has recovered.
     * @see InputPreference
     */
    public void setInputPreference(InputPreference inputPreference) {
        this.inputPreference = inputPreference.toString();
    }

    /**
     * Input preference when deciding which input to make active when a
     * previously failed input has recovered.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUAL_INPUT_PREFERENCE, PRIMARY_INPUT_PREFERRED
     *
     * @param inputPreference Input preference when deciding which input to make
     *            active when a previously failed input has recovered.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputPreference
     */
    public AutomaticInputFailoverSettings withInputPreference(InputPreference inputPreference) {
        this.inputPreference = inputPreference.toString();
        return this;
    }

    /**
     * The input ID of the secondary input in the automatic input failover pair.
     *
     * @return The input ID of the secondary input in the automatic input
     *         failover pair.
     */
    public String getSecondaryInputId() {
        return secondaryInputId;
    }

    /**
     * The input ID of the secondary input in the automatic input failover pair.
     *
     * @param secondaryInputId The input ID of the secondary input in the
     *            automatic input failover pair.
     */
    public void setSecondaryInputId(String secondaryInputId) {
        this.secondaryInputId = secondaryInputId;
    }

    /**
     * The input ID of the secondary input in the automatic input failover pair.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secondaryInputId The input ID of the secondary input in the
     *            automatic input failover pair.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomaticInputFailoverSettings withSecondaryInputId(String secondaryInputId) {
        this.secondaryInputId = secondaryInputId;
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
        if (getInputPreference() != null)
            sb.append("InputPreference: " + getInputPreference() + ",");
        if (getSecondaryInputId() != null)
            sb.append("SecondaryInputId: " + getSecondaryInputId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInputPreference() == null) ? 0 : getInputPreference().hashCode());
        hashCode = prime * hashCode
                + ((getSecondaryInputId() == null) ? 0 : getSecondaryInputId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutomaticInputFailoverSettings == false)
            return false;
        AutomaticInputFailoverSettings other = (AutomaticInputFailoverSettings) obj;

        if (other.getInputPreference() == null ^ this.getInputPreference() == null)
            return false;
        if (other.getInputPreference() != null
                && other.getInputPreference().equals(this.getInputPreference()) == false)
            return false;
        if (other.getSecondaryInputId() == null ^ this.getSecondaryInputId() == null)
            return false;
        if (other.getSecondaryInputId() != null
                && other.getSecondaryInputId().equals(this.getSecondaryInputId()) == false)
            return false;
        return true;
    }
}
