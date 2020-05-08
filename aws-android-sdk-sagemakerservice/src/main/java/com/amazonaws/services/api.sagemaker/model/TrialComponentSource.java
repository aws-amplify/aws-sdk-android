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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * The Amazon Resource Name (ARN) and job type of the source of a trial
 * component.
 * </p>
 */
public class TrialComponentSource implements Serializable {
    /**
     * <p>
     * The source ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:.*<br/>
     */
    private String sourceArn;

    /**
     * <p>
     * The source job type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     */
    private String sourceType;

    /**
     * <p>
     * The source ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:.*<br/>
     *
     * @return <p>
     *         The source ARN.
     *         </p>
     */
    public String getSourceArn() {
        return sourceArn;
    }

    /**
     * <p>
     * The source ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:.*<br/>
     *
     * @param sourceArn <p>
     *            The source ARN.
     *            </p>
     */
    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The source ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:.*<br/>
     *
     * @param sourceArn <p>
     *            The source ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialComponentSource withSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }

    /**
     * <p>
     * The source job type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @return <p>
     *         The source job type.
     *         </p>
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * <p>
     * The source job type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param sourceType <p>
     *            The source job type.
     *            </p>
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The source job type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param sourceType <p>
     *            The source job type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialComponentSource withSourceType(String sourceType) {
        this.sourceType = sourceType;
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
        if (getSourceArn() != null)
            sb.append("SourceArn: " + getSourceArn() + ",");
        if (getSourceType() != null)
            sb.append("SourceType: " + getSourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrialComponentSource == false)
            return false;
        TrialComponentSource other = (TrialComponentSource) obj;

        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null
                && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null
                && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        return true;
    }
}
