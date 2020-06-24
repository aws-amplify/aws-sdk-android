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

package com.amazonaws.services.amplify.model;

import java.io.Serializable;

public class GetAppResult implements Serializable {
    /**
     * <p>
     * Represents the different branches of a repository for building,
     * deploying, and hosting an Amplify app.
     * </p>
     */
    private App app;

    /**
     * <p>
     * Represents the different branches of a repository for building,
     * deploying, and hosting an Amplify app.
     * </p>
     *
     * @return <p>
     *         Represents the different branches of a repository for building,
     *         deploying, and hosting an Amplify app.
     *         </p>
     */
    public App getApp() {
        return app;
    }

    /**
     * <p>
     * Represents the different branches of a repository for building,
     * deploying, and hosting an Amplify app.
     * </p>
     *
     * @param app <p>
     *            Represents the different branches of a repository for
     *            building, deploying, and hosting an Amplify app.
     *            </p>
     */
    public void setApp(App app) {
        this.app = app;
    }

    /**
     * <p>
     * Represents the different branches of a repository for building,
     * deploying, and hosting an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param app <p>
     *            Represents the different branches of a repository for
     *            building, deploying, and hosting an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAppResult withApp(App app) {
        this.app = app;
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
        if (getApp() != null)
            sb.append("app: " + getApp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApp() == null) ? 0 : getApp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAppResult == false)
            return false;
        GetAppResult other = (GetAppResult) obj;

        if (other.getApp() == null ^ this.getApp() == null)
            return false;
        if (other.getApp() != null && other.getApp().equals(this.getApp()) == false)
            return false;
        return true;
    }
}
