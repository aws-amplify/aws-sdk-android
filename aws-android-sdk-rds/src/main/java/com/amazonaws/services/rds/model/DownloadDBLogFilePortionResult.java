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

/**
 * <p>
 * This data type is used as a response element to
 * <code>DownloadDBLogFilePortion</code>.
 * </p>
 */
public class DownloadDBLogFilePortionResult implements Serializable {
    /**
     * <p>
     * Entries from the specified log file.
     * </p>
     */
    private String logFileData;

    /**
     * <p>
     * A pagination token that can be used in a later DownloadDBLogFilePortion
     * request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * Boolean value that if true, indicates there is more data to be
     * downloaded.
     * </p>
     */
    private Boolean additionalDataPending;

    /**
     * <p>
     * Entries from the specified log file.
     * </p>
     *
     * @return <p>
     *         Entries from the specified log file.
     *         </p>
     */
    public String getLogFileData() {
        return logFileData;
    }

    /**
     * <p>
     * Entries from the specified log file.
     * </p>
     *
     * @param logFileData <p>
     *            Entries from the specified log file.
     *            </p>
     */
    public void setLogFileData(String logFileData) {
        this.logFileData = logFileData;
    }

    /**
     * <p>
     * Entries from the specified log file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logFileData <p>
     *            Entries from the specified log file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DownloadDBLogFilePortionResult withLogFileData(String logFileData) {
        this.logFileData = logFileData;
        return this;
    }

    /**
     * <p>
     * A pagination token that can be used in a later DownloadDBLogFilePortion
     * request.
     * </p>
     *
     * @return <p>
     *         A pagination token that can be used in a later
     *         DownloadDBLogFilePortion request.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * A pagination token that can be used in a later DownloadDBLogFilePortion
     * request.
     * </p>
     *
     * @param marker <p>
     *            A pagination token that can be used in a later
     *            DownloadDBLogFilePortion request.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A pagination token that can be used in a later DownloadDBLogFilePortion
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            A pagination token that can be used in a later
     *            DownloadDBLogFilePortion request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DownloadDBLogFilePortionResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * Boolean value that if true, indicates there is more data to be
     * downloaded.
     * </p>
     *
     * @return <p>
     *         Boolean value that if true, indicates there is more data to be
     *         downloaded.
     *         </p>
     */
    public Boolean isAdditionalDataPending() {
        return additionalDataPending;
    }

    /**
     * <p>
     * Boolean value that if true, indicates there is more data to be
     * downloaded.
     * </p>
     *
     * @return <p>
     *         Boolean value that if true, indicates there is more data to be
     *         downloaded.
     *         </p>
     */
    public Boolean getAdditionalDataPending() {
        return additionalDataPending;
    }

    /**
     * <p>
     * Boolean value that if true, indicates there is more data to be
     * downloaded.
     * </p>
     *
     * @param additionalDataPending <p>
     *            Boolean value that if true, indicates there is more data to be
     *            downloaded.
     *            </p>
     */
    public void setAdditionalDataPending(Boolean additionalDataPending) {
        this.additionalDataPending = additionalDataPending;
    }

    /**
     * <p>
     * Boolean value that if true, indicates there is more data to be
     * downloaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalDataPending <p>
     *            Boolean value that if true, indicates there is more data to be
     *            downloaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DownloadDBLogFilePortionResult withAdditionalDataPending(Boolean additionalDataPending) {
        this.additionalDataPending = additionalDataPending;
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
        if (getLogFileData() != null)
            sb.append("LogFileData: " + getLogFileData() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getAdditionalDataPending() != null)
            sb.append("AdditionalDataPending: " + getAdditionalDataPending());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLogFileData() == null) ? 0 : getLogFileData().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime
                * hashCode
                + ((getAdditionalDataPending() == null) ? 0 : getAdditionalDataPending().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DownloadDBLogFilePortionResult == false)
            return false;
        DownloadDBLogFilePortionResult other = (DownloadDBLogFilePortionResult) obj;

        if (other.getLogFileData() == null ^ this.getLogFileData() == null)
            return false;
        if (other.getLogFileData() != null
                && other.getLogFileData().equals(this.getLogFileData()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getAdditionalDataPending() == null ^ this.getAdditionalDataPending() == null)
            return false;
        if (other.getAdditionalDataPending() != null
                && other.getAdditionalDataPending().equals(this.getAdditionalDataPending()) == false)
            return false;
        return true;
    }
}
