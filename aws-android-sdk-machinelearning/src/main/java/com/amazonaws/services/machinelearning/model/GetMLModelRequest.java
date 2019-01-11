/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns an <code>MLModel</code> that includes detailed metadata, data source
 * information, and the current status of the <code>MLModel</code>.
 * </p>
 * <p>
 * <code>GetMLModel</code> provides results in normal or verbose format.
 * </p>
 */
public class GetMLModelRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID assigned to the <code>MLModel</code> at creation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String mLModelId;

    /**
     * <p>
     * Specifies whether the <code>GetMLModel</code> operation should return
     * <code>Recipe</code>.
     * </p>
     * <p>
     * If true, <code>Recipe</code> is returned.
     * </p>
     * <p>
     * If false, <code>Recipe</code> is not returned.
     * </p>
     */
    private Boolean verbose;

    /**
     * <p>
     * The ID assigned to the <code>MLModel</code> at creation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The ID assigned to the <code>MLModel</code> at creation.
     *         </p>
     */
    public String getMLModelId() {
        return mLModelId;
    }

    /**
     * <p>
     * The ID assigned to the <code>MLModel</code> at creation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param mLModelId <p>
     *            The ID assigned to the <code>MLModel</code> at creation.
     *            </p>
     */
    public void setMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
    }

    /**
     * <p>
     * The ID assigned to the <code>MLModel</code> at creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param mLModelId <p>
     *            The ID assigned to the <code>MLModel</code> at creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLModelRequest withMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
        return this;
    }

    /**
     * <p>
     * Specifies whether the <code>GetMLModel</code> operation should return
     * <code>Recipe</code>.
     * </p>
     * <p>
     * If true, <code>Recipe</code> is returned.
     * </p>
     * <p>
     * If false, <code>Recipe</code> is not returned.
     * </p>
     *
     * @return <p>
     *         Specifies whether the <code>GetMLModel</code> operation should
     *         return <code>Recipe</code>.
     *         </p>
     *         <p>
     *         If true, <code>Recipe</code> is returned.
     *         </p>
     *         <p>
     *         If false, <code>Recipe</code> is not returned.
     *         </p>
     */
    public Boolean isVerbose() {
        return verbose;
    }

    /**
     * <p>
     * Specifies whether the <code>GetMLModel</code> operation should return
     * <code>Recipe</code>.
     * </p>
     * <p>
     * If true, <code>Recipe</code> is returned.
     * </p>
     * <p>
     * If false, <code>Recipe</code> is not returned.
     * </p>
     *
     * @return <p>
     *         Specifies whether the <code>GetMLModel</code> operation should
     *         return <code>Recipe</code>.
     *         </p>
     *         <p>
     *         If true, <code>Recipe</code> is returned.
     *         </p>
     *         <p>
     *         If false, <code>Recipe</code> is not returned.
     *         </p>
     */
    public Boolean getVerbose() {
        return verbose;
    }

    /**
     * <p>
     * Specifies whether the <code>GetMLModel</code> operation should return
     * <code>Recipe</code>.
     * </p>
     * <p>
     * If true, <code>Recipe</code> is returned.
     * </p>
     * <p>
     * If false, <code>Recipe</code> is not returned.
     * </p>
     *
     * @param verbose <p>
     *            Specifies whether the <code>GetMLModel</code> operation should
     *            return <code>Recipe</code>.
     *            </p>
     *            <p>
     *            If true, <code>Recipe</code> is returned.
     *            </p>
     *            <p>
     *            If false, <code>Recipe</code> is not returned.
     *            </p>
     */
    public void setVerbose(Boolean verbose) {
        this.verbose = verbose;
    }

    /**
     * <p>
     * Specifies whether the <code>GetMLModel</code> operation should return
     * <code>Recipe</code>.
     * </p>
     * <p>
     * If true, <code>Recipe</code> is returned.
     * </p>
     * <p>
     * If false, <code>Recipe</code> is not returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param verbose <p>
     *            Specifies whether the <code>GetMLModel</code> operation should
     *            return <code>Recipe</code>.
     *            </p>
     *            <p>
     *            If true, <code>Recipe</code> is returned.
     *            </p>
     *            <p>
     *            If false, <code>Recipe</code> is not returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLModelRequest withVerbose(Boolean verbose) {
        this.verbose = verbose;
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
        if (getMLModelId() != null)
            sb.append("MLModelId: " + getMLModelId() + ",");
        if (getVerbose() != null)
            sb.append("Verbose: " + getVerbose());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMLModelId() == null) ? 0 : getMLModelId().hashCode());
        hashCode = prime * hashCode + ((getVerbose() == null) ? 0 : getVerbose().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMLModelRequest == false)
            return false;
        GetMLModelRequest other = (GetMLModelRequest) obj;

        if (other.getMLModelId() == null ^ this.getMLModelId() == null)
            return false;
        if (other.getMLModelId() != null
                && other.getMLModelId().equals(this.getMLModelId()) == false)
            return false;
        if (other.getVerbose() == null ^ this.getVerbose() == null)
            return false;
        if (other.getVerbose() != null && other.getVerbose().equals(this.getVerbose()) == false)
            return false;
        return true;
    }
}
