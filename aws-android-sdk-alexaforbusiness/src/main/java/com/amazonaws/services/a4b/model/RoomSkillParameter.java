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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

/**
 * <p>
 * A skill parameter associated with a room.
 * </p>
 */
public class RoomSkillParameter implements Serializable {
    /**
     * <p>
     * The parameter key of a room skill parameter. ParameterKey is an
     * enumerated type that only takes “DEFAULT” or “SCOPE” as valid values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String parameterKey;

    /**
     * <p>
     * The parameter value of a room skill parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String parameterValue;

    /**
     * <p>
     * The parameter key of a room skill parameter. ParameterKey is an
     * enumerated type that only takes “DEFAULT” or “SCOPE” as valid values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The parameter key of a room skill parameter. ParameterKey is an
     *         enumerated type that only takes “DEFAULT” or “SCOPE” as valid
     *         values.
     *         </p>
     */
    public String getParameterKey() {
        return parameterKey;
    }

    /**
     * <p>
     * The parameter key of a room skill parameter. ParameterKey is an
     * enumerated type that only takes “DEFAULT” or “SCOPE” as valid values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param parameterKey <p>
     *            The parameter key of a room skill parameter. ParameterKey is
     *            an enumerated type that only takes “DEFAULT” or “SCOPE” as
     *            valid values.
     *            </p>
     */
    public void setParameterKey(String parameterKey) {
        this.parameterKey = parameterKey;
    }

    /**
     * <p>
     * The parameter key of a room skill parameter. ParameterKey is an
     * enumerated type that only takes “DEFAULT” or “SCOPE” as valid values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param parameterKey <p>
     *            The parameter key of a room skill parameter. ParameterKey is
     *            an enumerated type that only takes “DEFAULT” or “SCOPE” as
     *            valid values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RoomSkillParameter withParameterKey(String parameterKey) {
        this.parameterKey = parameterKey;
        return this;
    }

    /**
     * <p>
     * The parameter value of a room skill parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return <p>
     *         The parameter value of a room skill parameter.
     *         </p>
     */
    public String getParameterValue() {
        return parameterValue;
    }

    /**
     * <p>
     * The parameter value of a room skill parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param parameterValue <p>
     *            The parameter value of a room skill parameter.
     *            </p>
     */
    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

    /**
     * <p>
     * The parameter value of a room skill parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param parameterValue <p>
     *            The parameter value of a room skill parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RoomSkillParameter withParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
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
        if (getParameterKey() != null)
            sb.append("ParameterKey: " + getParameterKey() + ",");
        if (getParameterValue() != null)
            sb.append("ParameterValue: " + getParameterValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getParameterKey() == null) ? 0 : getParameterKey().hashCode());
        hashCode = prime * hashCode
                + ((getParameterValue() == null) ? 0 : getParameterValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RoomSkillParameter == false)
            return false;
        RoomSkillParameter other = (RoomSkillParameter) obj;

        if (other.getParameterKey() == null ^ this.getParameterKey() == null)
            return false;
        if (other.getParameterKey() != null
                && other.getParameterKey().equals(this.getParameterKey()) == false)
            return false;
        if (other.getParameterValue() == null ^ this.getParameterValue() == null)
            return false;
        if (other.getParameterValue() != null
                && other.getParameterValue().equals(this.getParameterValue()) == false)
            return false;
        return true;
    }
}
