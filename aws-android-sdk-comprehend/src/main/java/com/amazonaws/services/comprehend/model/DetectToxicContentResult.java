/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

public class DetectToxicContentResult implements Serializable {
    /**
     * <p>
     * Results of the content moderation analysis. Each entry in the results
     * list contains a list of toxic content types identified in the text, along
     * with a confidence score for each content type. The results list also
     * includes a toxicity score for each entry in the results list.
     * </p>
     */
    private java.util.List<ToxicLabels> resultList;

    /**
     * <p>
     * Results of the content moderation analysis. Each entry in the results
     * list contains a list of toxic content types identified in the text, along
     * with a confidence score for each content type. The results list also
     * includes a toxicity score for each entry in the results list.
     * </p>
     *
     * @return <p>
     *         Results of the content moderation analysis. Each entry in the
     *         results list contains a list of toxic content types identified in
     *         the text, along with a confidence score for each content type.
     *         The results list also includes a toxicity score for each entry in
     *         the results list.
     *         </p>
     */
    public java.util.List<ToxicLabels> getResultList() {
        return resultList;
    }

    /**
     * <p>
     * Results of the content moderation analysis. Each entry in the results
     * list contains a list of toxic content types identified in the text, along
     * with a confidence score for each content type. The results list also
     * includes a toxicity score for each entry in the results list.
     * </p>
     *
     * @param resultList <p>
     *            Results of the content moderation analysis. Each entry in the
     *            results list contains a list of toxic content types identified
     *            in the text, along with a confidence score for each content
     *            type. The results list also includes a toxicity score for each
     *            entry in the results list.
     *            </p>
     */
    public void setResultList(java.util.Collection<ToxicLabels> resultList) {
        if (resultList == null) {
            this.resultList = null;
            return;
        }

        this.resultList = new java.util.ArrayList<ToxicLabels>(resultList);
    }

    /**
     * <p>
     * Results of the content moderation analysis. Each entry in the results
     * list contains a list of toxic content types identified in the text, along
     * with a confidence score for each content type. The results list also
     * includes a toxicity score for each entry in the results list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resultList <p>
     *            Results of the content moderation analysis. Each entry in the
     *            results list contains a list of toxic content types identified
     *            in the text, along with a confidence score for each content
     *            type. The results list also includes a toxicity score for each
     *            entry in the results list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectToxicContentResult withResultList(ToxicLabels... resultList) {
        if (getResultList() == null) {
            this.resultList = new java.util.ArrayList<ToxicLabels>(resultList.length);
        }
        for (ToxicLabels value : resultList) {
            this.resultList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Results of the content moderation analysis. Each entry in the results
     * list contains a list of toxic content types identified in the text, along
     * with a confidence score for each content type. The results list also
     * includes a toxicity score for each entry in the results list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resultList <p>
     *            Results of the content moderation analysis. Each entry in the
     *            results list contains a list of toxic content types identified
     *            in the text, along with a confidence score for each content
     *            type. The results list also includes a toxicity score for each
     *            entry in the results list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectToxicContentResult withResultList(java.util.Collection<ToxicLabels> resultList) {
        setResultList(resultList);
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
        if (getResultList() != null)
            sb.append("ResultList: " + getResultList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResultList() == null) ? 0 : getResultList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectToxicContentResult == false)
            return false;
        DetectToxicContentResult other = (DetectToxicContentResult) obj;

        if (other.getResultList() == null ^ this.getResultList() == null)
            return false;
        if (other.getResultList() != null
                && other.getResultList().equals(this.getResultList()) == false)
            return false;
        return true;
    }
}
