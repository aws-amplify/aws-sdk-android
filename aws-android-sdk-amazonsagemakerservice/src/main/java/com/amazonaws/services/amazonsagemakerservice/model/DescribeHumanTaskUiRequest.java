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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns information about the requested human task user interface.
 * </p>
 */
public class DescribeHumanTaskUiRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the human task user interface you want information about.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*<br/>
     */
    private String humanTaskUiName;

    /**
     * <p>
     * The name of the human task user interface you want information about.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*<br/>
     *
     * @return <p>
     *         The name of the human task user interface you want information
     *         about.
     *         </p>
     */
    public String getHumanTaskUiName() {
        return humanTaskUiName;
    }

    /**
     * <p>
     * The name of the human task user interface you want information about.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*<br/>
     *
     * @param humanTaskUiName <p>
     *            The name of the human task user interface you want information
     *            about.
     *            </p>
     */
    public void setHumanTaskUiName(String humanTaskUiName) {
        this.humanTaskUiName = humanTaskUiName;
    }

    /**
     * <p>
     * The name of the human task user interface you want information about.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*<br/>
     *
     * @param humanTaskUiName <p>
     *            The name of the human task user interface you want information
     *            about.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHumanTaskUiRequest withHumanTaskUiName(String humanTaskUiName) {
        this.humanTaskUiName = humanTaskUiName;
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
        if (getHumanTaskUiName() != null)
            sb.append("HumanTaskUiName: " + getHumanTaskUiName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHumanTaskUiName() == null) ? 0 : getHumanTaskUiName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeHumanTaskUiRequest == false)
            return false;
        DescribeHumanTaskUiRequest other = (DescribeHumanTaskUiRequest) obj;

        if (other.getHumanTaskUiName() == null ^ this.getHumanTaskUiName() == null)
            return false;
        if (other.getHumanTaskUiName() != null
                && other.getHumanTaskUiName().equals(this.getHumanTaskUiName()) == false)
            return false;
        return true;
    }
}
