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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * Dashboard publish options.
 * </p>
 */
public class DashboardPublishOptions implements Serializable {
    /**
     * <p>
     * Ad hoc (one-time) filtering option.
     * </p>
     */
    private AdHocFilteringOption adHocFilteringOption;

    /**
     * <p>
     * Export to .csv option.
     * </p>
     */
    private ExportToCSVOption exportToCSVOption;

    /**
     * <p>
     * Sheet controls option.
     * </p>
     */
    private SheetControlsOption sheetControlsOption;

    /**
     * <p>
     * Ad hoc (one-time) filtering option.
     * </p>
     *
     * @return <p>
     *         Ad hoc (one-time) filtering option.
     *         </p>
     */
    public AdHocFilteringOption getAdHocFilteringOption() {
        return adHocFilteringOption;
    }

    /**
     * <p>
     * Ad hoc (one-time) filtering option.
     * </p>
     *
     * @param adHocFilteringOption <p>
     *            Ad hoc (one-time) filtering option.
     *            </p>
     */
    public void setAdHocFilteringOption(AdHocFilteringOption adHocFilteringOption) {
        this.adHocFilteringOption = adHocFilteringOption;
    }

    /**
     * <p>
     * Ad hoc (one-time) filtering option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param adHocFilteringOption <p>
     *            Ad hoc (one-time) filtering option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DashboardPublishOptions withAdHocFilteringOption(
            AdHocFilteringOption adHocFilteringOption) {
        this.adHocFilteringOption = adHocFilteringOption;
        return this;
    }

    /**
     * <p>
     * Export to .csv option.
     * </p>
     *
     * @return <p>
     *         Export to .csv option.
     *         </p>
     */
    public ExportToCSVOption getExportToCSVOption() {
        return exportToCSVOption;
    }

    /**
     * <p>
     * Export to .csv option.
     * </p>
     *
     * @param exportToCSVOption <p>
     *            Export to .csv option.
     *            </p>
     */
    public void setExportToCSVOption(ExportToCSVOption exportToCSVOption) {
        this.exportToCSVOption = exportToCSVOption;
    }

    /**
     * <p>
     * Export to .csv option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportToCSVOption <p>
     *            Export to .csv option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DashboardPublishOptions withExportToCSVOption(ExportToCSVOption exportToCSVOption) {
        this.exportToCSVOption = exportToCSVOption;
        return this;
    }

    /**
     * <p>
     * Sheet controls option.
     * </p>
     *
     * @return <p>
     *         Sheet controls option.
     *         </p>
     */
    public SheetControlsOption getSheetControlsOption() {
        return sheetControlsOption;
    }

    /**
     * <p>
     * Sheet controls option.
     * </p>
     *
     * @param sheetControlsOption <p>
     *            Sheet controls option.
     *            </p>
     */
    public void setSheetControlsOption(SheetControlsOption sheetControlsOption) {
        this.sheetControlsOption = sheetControlsOption;
    }

    /**
     * <p>
     * Sheet controls option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sheetControlsOption <p>
     *            Sheet controls option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DashboardPublishOptions withSheetControlsOption(SheetControlsOption sheetControlsOption) {
        this.sheetControlsOption = sheetControlsOption;
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
        if (getAdHocFilteringOption() != null)
            sb.append("AdHocFilteringOption: " + getAdHocFilteringOption() + ",");
        if (getExportToCSVOption() != null)
            sb.append("ExportToCSVOption: " + getExportToCSVOption() + ",");
        if (getSheetControlsOption() != null)
            sb.append("SheetControlsOption: " + getSheetControlsOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAdHocFilteringOption() == null) ? 0 : getAdHocFilteringOption().hashCode());
        hashCode = prime * hashCode
                + ((getExportToCSVOption() == null) ? 0 : getExportToCSVOption().hashCode());
        hashCode = prime * hashCode
                + ((getSheetControlsOption() == null) ? 0 : getSheetControlsOption().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DashboardPublishOptions == false)
            return false;
        DashboardPublishOptions other = (DashboardPublishOptions) obj;

        if (other.getAdHocFilteringOption() == null ^ this.getAdHocFilteringOption() == null)
            return false;
        if (other.getAdHocFilteringOption() != null
                && other.getAdHocFilteringOption().equals(this.getAdHocFilteringOption()) == false)
            return false;
        if (other.getExportToCSVOption() == null ^ this.getExportToCSVOption() == null)
            return false;
        if (other.getExportToCSVOption() != null
                && other.getExportToCSVOption().equals(this.getExportToCSVOption()) == false)
            return false;
        if (other.getSheetControlsOption() == null ^ this.getSheetControlsOption() == null)
            return false;
        if (other.getSheetControlsOption() != null
                && other.getSheetControlsOption().equals(this.getSheetControlsOption()) == false)
            return false;
        return true;
    }
}
