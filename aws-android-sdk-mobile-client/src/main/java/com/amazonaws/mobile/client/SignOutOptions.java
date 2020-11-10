package com.amazonaws.mobile.client;

/**
 * This class provides options for the {@link AWSMobileClient#signOut(SignOutOptions)} method.
 */
public class SignOutOptions {

    private final Builder builder;

    SignOutOptions(final Builder builder) {
        this.builder = builder;
    }

    public boolean isSignOutGlobally() {
        return builder.signOutGlobally;
    }

    public boolean isInvalidateTokens() {
        return builder.invalidateTokens;
    }

    public String getBrowserPackage() { return builder.browserPackage; }

    /**
     * Start creating a SignOutOptions object with this builder.
     *
     * @return a Builder used to specify options
     */
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String browserPackage;
        private boolean signOutGlobally;
        private boolean invalidateTokens;

        public Builder() { }

        /**
         * Sign-out user from all active sessions across devices.
         * This is currently only supported with Cognito User Pools.
         *
         * @param signOutGlobally true if the user is to be signed-out globally
         * @return Builder object for chaining
         */
        public Builder signOutGlobally(final boolean signOutGlobally) {
            this.signOutGlobally = signOutGlobally;
            return this;
        }

        /**
         * If {@link #invalidateTokens} is true, this can optionally be used to specify which browser package should
         * perform the sign out action (e.g. "org.mozilla.firefox"). Defaults to the Chrome package if not specified.
         *
         * @param browserPackage String specifying the browser to open custom tabs.
         * @return Builder object for chaining
         */
        public Builder browserPackage(final String browserPackage) {
            this.browserPackage = browserPackage;
            return this;
        }

        /**
         * When the functionality is available, invalidate tokens on the server by making a call.
         * This is currently only supported with OAuth sessions that support this functionality.
         *
         * @param invalidateTokens true if the user's token should be invalidated
         * @return Builder object for chaining
         */
        public Builder invalidateTokens(final boolean invalidateTokens) {
            this.invalidateTokens = invalidateTokens;
            return this;
        }

        /**
         * Finalize the Builder and the options object will be returned.
         *
         * @return the options object containing the options specified
         */
        public SignOutOptions build() {
            return new SignOutOptions(this);
        }
    }
}
