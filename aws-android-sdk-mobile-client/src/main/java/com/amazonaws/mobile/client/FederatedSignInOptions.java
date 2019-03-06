package com.amazonaws.mobile.client;

public class FederatedSignInOptions {

    private final Builder builder;

    FederatedSignInOptions(final Builder builder) {
        this.builder = builder;
    }

    public String getCustomRoleARN() {
        return builder.customRoleARN;
    }

    public String getCognitoIdentityId() {
        return builder.cognitoIdentityId;
    }

    /**
     * Start creating a SignOutOptions object with this builder.
     *
     * @return a Builder used to specify options
     */
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String customRoleARN;
        private String cognitoIdentityId;

        public Builder() { }

        public Builder cognitoIdentityId(final String cognitoIdentityId) {
            this.cognitoIdentityId = cognitoIdentityId;
            return this;
        }

        public Builder customRoleARN(final String customRoleARN) {
            this.customRoleARN = customRoleARN;
            return this;
        }

        /**
         * Finalize the Builder and the options object will be returned.
         *
         * @return the options object containing the options specified
         */
        public FederatedSignInOptions build() {
            return new FederatedSignInOptions(this);
        }
    }
}
