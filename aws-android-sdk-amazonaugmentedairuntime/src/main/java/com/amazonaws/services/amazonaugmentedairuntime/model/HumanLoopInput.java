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

package com.amazonaws.services.amazonaugmentedairuntime.model;

import java.io.Serializable;

/**
 * <p>
 * An object containing the human loop input in JSON format.
 * </p>
 */
public class HumanLoopInput implements Serializable {
    /**
     * <p>
     * Serialized input from the human loop. The input must be a string
     * representation of a file in JSON format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 3145728<br/>
     */
    private String inputContent;

    /**
     * <p>
     * Serialized input from the human loop. The input must be a string
     * representation of a file in JSON format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 3145728<br/>
     *
     * @return <p>
     *         Serialized input from the human loop. The input must be a string
     *         representation of a file in JSON format.
     *         </p>
     */
    public String getInputContent() {
        return inputContent;
    }

    /**
     * <p>
     * Serialized input from the human loop. The input must be a string
     * representation of a file in JSON format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 3145728<br/>
     *
     * @param inputContent <p>
     *            Serialized input from the human loop. The input must be a
     *            string representation of a file in JSON format.
     *            </p>
     */
    public void setInputContent(String inputContent) {
        this.inputContent = inputContent;
    }

    /**
     * <p>
     * Serialized input from the human loop. The input must be a string
     * representation of a file in JSON format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 3145728<br/>
     *
     * @param inputContent <p>
     *            Serialized input from the human loop. The input must be a
     *            string representation of a file in JSON format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanLoopInput withInputContent(String inputContent) {
        this.inputContent = inputContent;
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
        if (getInputContent() != null)
            sb.append("InputContent: " + getInputContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInputContent() == null) ? 0 : getInputContent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HumanLoopInput == false)
            return false;
        HumanLoopInput other = (HumanLoopInput) obj;

        if (other.getInputContent() == null ^ this.getInputContent() == null)
            return false;
        if (other.getInputContent() != null
                && other.getInputContent().equals(this.getInputContent()) == false)
            return false;
        return true;
    }
}
