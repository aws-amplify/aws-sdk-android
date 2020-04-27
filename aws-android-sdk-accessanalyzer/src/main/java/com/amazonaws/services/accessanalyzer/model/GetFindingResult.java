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

package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;

/**
 * <p>
 * The response to the request.
 * </p>
 */
public class GetFindingResult implements Serializable {
    /**
     * <p>
     * A <code>finding</code> object that contains finding details.
     * </p>
     */
    private Finding finding;

    /**
     * <p>
     * A <code>finding</code> object that contains finding details.
     * </p>
     *
     * @return <p>
     *         A <code>finding</code> object that contains finding details.
     *         </p>
     */
    public Finding getFinding() {
        return finding;
    }

    /**
     * <p>
     * A <code>finding</code> object that contains finding details.
     * </p>
     *
     * @param finding <p>
     *            A <code>finding</code> object that contains finding details.
     *            </p>
     */
    public void setFinding(Finding finding) {
        this.finding = finding;
    }

    /**
     * <p>
     * A <code>finding</code> object that contains finding details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param finding <p>
     *            A <code>finding</code> object that contains finding details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingResult withFinding(Finding finding) {
        this.finding = finding;
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
        if (getFinding() != null)
            sb.append("finding: " + getFinding());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFinding() == null) ? 0 : getFinding().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFindingResult == false)
            return false;
        GetFindingResult other = (GetFindingResult) obj;

        if (other.getFinding() == null ^ this.getFinding() == null)
            return false;
        if (other.getFinding() != null && other.getFinding().equals(this.getFinding()) == false)
            return false;
        return true;
    }
}
