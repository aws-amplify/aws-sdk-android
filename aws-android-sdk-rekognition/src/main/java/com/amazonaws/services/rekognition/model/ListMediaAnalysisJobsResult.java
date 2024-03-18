/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

public class ListMediaAnalysisJobsResult implements Serializable {
    /**
     * <p>
     * Pagination token, if the previous response was incomplete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Contains a list of all media analysis jobs.
     * </p>
     */
    private java.util.List<MediaAnalysisJobDescription> mediaAnalysisJobs;

    /**
     * <p>
     * Pagination token, if the previous response was incomplete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         Pagination token, if the previous response was incomplete.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Pagination token, if the previous response was incomplete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param nextToken <p>
     *            Pagination token, if the previous response was incomplete.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token, if the previous response was incomplete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param nextToken <p>
     *            Pagination token, if the previous response was incomplete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMediaAnalysisJobsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Contains a list of all media analysis jobs.
     * </p>
     *
     * @return <p>
     *         Contains a list of all media analysis jobs.
     *         </p>
     */
    public java.util.List<MediaAnalysisJobDescription> getMediaAnalysisJobs() {
        return mediaAnalysisJobs;
    }

    /**
     * <p>
     * Contains a list of all media analysis jobs.
     * </p>
     *
     * @param mediaAnalysisJobs <p>
     *            Contains a list of all media analysis jobs.
     *            </p>
     */
    public void setMediaAnalysisJobs(
            java.util.Collection<MediaAnalysisJobDescription> mediaAnalysisJobs) {
        if (mediaAnalysisJobs == null) {
            this.mediaAnalysisJobs = null;
            return;
        }

        this.mediaAnalysisJobs = new java.util.ArrayList<MediaAnalysisJobDescription>(
                mediaAnalysisJobs);
    }

    /**
     * <p>
     * Contains a list of all media analysis jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mediaAnalysisJobs <p>
     *            Contains a list of all media analysis jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMediaAnalysisJobsResult withMediaAnalysisJobs(
            MediaAnalysisJobDescription... mediaAnalysisJobs) {
        if (getMediaAnalysisJobs() == null) {
            this.mediaAnalysisJobs = new java.util.ArrayList<MediaAnalysisJobDescription>(
                    mediaAnalysisJobs.length);
        }
        for (MediaAnalysisJobDescription value : mediaAnalysisJobs) {
            this.mediaAnalysisJobs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains a list of all media analysis jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mediaAnalysisJobs <p>
     *            Contains a list of all media analysis jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMediaAnalysisJobsResult withMediaAnalysisJobs(
            java.util.Collection<MediaAnalysisJobDescription> mediaAnalysisJobs) {
        setMediaAnalysisJobs(mediaAnalysisJobs);
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMediaAnalysisJobs() != null)
            sb.append("MediaAnalysisJobs: " + getMediaAnalysisJobs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getMediaAnalysisJobs() == null) ? 0 : getMediaAnalysisJobs().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMediaAnalysisJobsResult == false)
            return false;
        ListMediaAnalysisJobsResult other = (ListMediaAnalysisJobsResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMediaAnalysisJobs() == null ^ this.getMediaAnalysisJobs() == null)
            return false;
        if (other.getMediaAnalysisJobs() != null
                && other.getMediaAnalysisJobs().equals(this.getMediaAnalysisJobs()) == false)
            return false;
        return true;
    }
}
