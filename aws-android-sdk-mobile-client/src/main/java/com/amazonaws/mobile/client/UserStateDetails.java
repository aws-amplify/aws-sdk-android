/*
 * Copyright 2018-2018 Amazon.com, Inc. or its affiliates.
 * All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobile.client;

import java.util.Map;

public class UserStateDetails {

    private final UserState userState;
    private final Map<String, String> details;

    private Exception exception;

    public UserStateDetails(UserState userState, Map<String, String> details) {
        this.userState = userState;
        this.details = details;
    }

    public UserState getUserState() {
        return userState;
    }

    public Map<String, String> getDetails() {
        return details;
    }

    protected void setException(Exception exception) {
        this.exception = exception;
    }

    public Exception getException() {
        return this.exception;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof UserStateDetails) {
            final UserStateDetails other = (UserStateDetails) obj;

            if (!userState.equals(other.userState)) {
                return false;
            }

            if (other.details == this.details) {
                return true;
            } else if (this.details == null) {
                return false;
            } else {
                return this.details.equals(other.details);
            }
        } else {
            return super.equals(obj);
        }
    }
}
