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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a successful <a>GetUser</a> request.
 * </p>
 */
public class GetUserResult implements Serializable {
    /**
     * <p>
     * A structure containing details about the IAM user.
     * </p>
     * <important>
     * <p>
     * Due to a service issue, password last used data does not include password
     * use from May 3, 2018 22:50 PDT to May 23, 2018 14:08 PDT. This affects <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_finding-unused.html"
     * >last sign-in</a> dates shown in the IAM console and password last used
     * dates in the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_getting-report.html"
     * >IAM credential report</a>, and returned by this GetUser API. If users
     * signed in during the affected time, the password last used date that is
     * returned is the date the user last signed in before May 3, 2018. For
     * users that signed in after May 23, 2018 14:08 PDT, the returned password
     * last used date is accurate.
     * </p>
     * <p>
     * You can use password last used information to identify unused credentials
     * for deletion. For example, you might delete users who did not sign in to
     * AWS in the last 90 days. In cases like this, we recommend that you adjust
     * your evaluation window to include dates after May 23, 2018.
     * Alternatively, if your users use access keys to access AWS
     * programmatically you can refer to access key last used information
     * because it is accurate for all dates.
     * </p>
     * </important>
     */
    private User user;

    /**
     * <p>
     * A structure containing details about the IAM user.
     * </p>
     * <important>
     * <p>
     * Due to a service issue, password last used data does not include password
     * use from May 3, 2018 22:50 PDT to May 23, 2018 14:08 PDT. This affects <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_finding-unused.html"
     * >last sign-in</a> dates shown in the IAM console and password last used
     * dates in the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_getting-report.html"
     * >IAM credential report</a>, and returned by this GetUser API. If users
     * signed in during the affected time, the password last used date that is
     * returned is the date the user last signed in before May 3, 2018. For
     * users that signed in after May 23, 2018 14:08 PDT, the returned password
     * last used date is accurate.
     * </p>
     * <p>
     * You can use password last used information to identify unused credentials
     * for deletion. For example, you might delete users who did not sign in to
     * AWS in the last 90 days. In cases like this, we recommend that you adjust
     * your evaluation window to include dates after May 23, 2018.
     * Alternatively, if your users use access keys to access AWS
     * programmatically you can refer to access key last used information
     * because it is accurate for all dates.
     * </p>
     * </important>
     *
     * @return <p>
     *         A structure containing details about the IAM user.
     *         </p>
     *         <important>
     *         <p>
     *         Due to a service issue, password last used data does not include
     *         password use from May 3, 2018 22:50 PDT to May 23, 2018 14:08
     *         PDT. This affects <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_finding-unused.html"
     *         >last sign-in</a> dates shown in the IAM console and password
     *         last used dates in the <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_getting-report.html"
     *         >IAM credential report</a>, and returned by this GetUser API. If
     *         users signed in during the affected time, the password last used
     *         date that is returned is the date the user last signed in before
     *         May 3, 2018. For users that signed in after May 23, 2018 14:08
     *         PDT, the returned password last used date is accurate.
     *         </p>
     *         <p>
     *         You can use password last used information to identify unused
     *         credentials for deletion. For example, you might delete users who
     *         did not sign in to AWS in the last 90 days. In cases like this,
     *         we recommend that you adjust your evaluation window to include
     *         dates after May 23, 2018. Alternatively, if your users use access
     *         keys to access AWS programmatically you can refer to access key
     *         last used information because it is accurate for all dates.
     *         </p>
     *         </important>
     */
    public User getUser() {
        return user;
    }

    /**
     * <p>
     * A structure containing details about the IAM user.
     * </p>
     * <important>
     * <p>
     * Due to a service issue, password last used data does not include password
     * use from May 3, 2018 22:50 PDT to May 23, 2018 14:08 PDT. This affects <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_finding-unused.html"
     * >last sign-in</a> dates shown in the IAM console and password last used
     * dates in the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_getting-report.html"
     * >IAM credential report</a>, and returned by this GetUser API. If users
     * signed in during the affected time, the password last used date that is
     * returned is the date the user last signed in before May 3, 2018. For
     * users that signed in after May 23, 2018 14:08 PDT, the returned password
     * last used date is accurate.
     * </p>
     * <p>
     * You can use password last used information to identify unused credentials
     * for deletion. For example, you might delete users who did not sign in to
     * AWS in the last 90 days. In cases like this, we recommend that you adjust
     * your evaluation window to include dates after May 23, 2018.
     * Alternatively, if your users use access keys to access AWS
     * programmatically you can refer to access key last used information
     * because it is accurate for all dates.
     * </p>
     * </important>
     *
     * @param user <p>
     *            A structure containing details about the IAM user.
     *            </p>
     *            <important>
     *            <p>
     *            Due to a service issue, password last used data does not
     *            include password use from May 3, 2018 22:50 PDT to May 23,
     *            2018 14:08 PDT. This affects <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_finding-unused.html"
     *            >last sign-in</a> dates shown in the IAM console and password
     *            last used dates in the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_getting-report.html"
     *            >IAM credential report</a>, and returned by this GetUser API.
     *            If users signed in during the affected time, the password last
     *            used date that is returned is the date the user last signed in
     *            before May 3, 2018. For users that signed in after May 23,
     *            2018 14:08 PDT, the returned password last used date is
     *            accurate.
     *            </p>
     *            <p>
     *            You can use password last used information to identify unused
     *            credentials for deletion. For example, you might delete users
     *            who did not sign in to AWS in the last 90 days. In cases like
     *            this, we recommend that you adjust your evaluation window to
     *            include dates after May 23, 2018. Alternatively, if your users
     *            use access keys to access AWS programmatically you can refer
     *            to access key last used information because it is accurate for
     *            all dates.
     *            </p>
     *            </important>
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * <p>
     * A structure containing details about the IAM user.
     * </p>
     * <important>
     * <p>
     * Due to a service issue, password last used data does not include password
     * use from May 3, 2018 22:50 PDT to May 23, 2018 14:08 PDT. This affects <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_finding-unused.html"
     * >last sign-in</a> dates shown in the IAM console and password last used
     * dates in the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_getting-report.html"
     * >IAM credential report</a>, and returned by this GetUser API. If users
     * signed in during the affected time, the password last used date that is
     * returned is the date the user last signed in before May 3, 2018. For
     * users that signed in after May 23, 2018 14:08 PDT, the returned password
     * last used date is accurate.
     * </p>
     * <p>
     * You can use password last used information to identify unused credentials
     * for deletion. For example, you might delete users who did not sign in to
     * AWS in the last 90 days. In cases like this, we recommend that you adjust
     * your evaluation window to include dates after May 23, 2018.
     * Alternatively, if your users use access keys to access AWS
     * programmatically you can refer to access key last used information
     * because it is accurate for all dates.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param user <p>
     *            A structure containing details about the IAM user.
     *            </p>
     *            <important>
     *            <p>
     *            Due to a service issue, password last used data does not
     *            include password use from May 3, 2018 22:50 PDT to May 23,
     *            2018 14:08 PDT. This affects <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_finding-unused.html"
     *            >last sign-in</a> dates shown in the IAM console and password
     *            last used dates in the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_getting-report.html"
     *            >IAM credential report</a>, and returned by this GetUser API.
     *            If users signed in during the affected time, the password last
     *            used date that is returned is the date the user last signed in
     *            before May 3, 2018. For users that signed in after May 23,
     *            2018 14:08 PDT, the returned password last used date is
     *            accurate.
     *            </p>
     *            <p>
     *            You can use password last used information to identify unused
     *            credentials for deletion. For example, you might delete users
     *            who did not sign in to AWS in the last 90 days. In cases like
     *            this, we recommend that you adjust your evaluation window to
     *            include dates after May 23, 2018. Alternatively, if your users
     *            use access keys to access AWS programmatically you can refer
     *            to access key last used information because it is accurate for
     *            all dates.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUserResult withUser(User user) {
        this.user = user;
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
        if (getUser() != null)
            sb.append("User: " + getUser());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUserResult == false)
            return false;
        GetUserResult other = (GetUserResult) obj;

        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        return true;
    }
}
