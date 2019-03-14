package com.amazonaws.mobile.client;

import java.util.Map;

public class HostedUIOptions {

    private final Builder builder;

    HostedUIOptions(final Builder builder) {
        this.builder = builder;
    }

    public String[] getScopes() {
        return builder.scopes;
    }

    public String getIdentityProvider() {
        return builder.identityProvider;
    }

    public String getIdpIdentifier() {
        return builder.idpIdentifier;
    }

    public Boolean getFederationEnabled() {
        return builder.disableFederation;
    }

    public String getFederationProviderName() {
        return builder.federationProviderName;
    }

    public Map<String, String> getSignInQueryParameters() {
        return builder.signInQueryParameters;
    }

    public Map<String, String> getSignOutQueryParameters() {
        return builder.signOutQueryParameters;
    }

    public Map<String, String> getTokenQueryParameters() {
        return builder.tokenQueryParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String[] scopes;
        private String identityProvider;
        private String idpIdentifier;
        private Boolean disableFederation;
        private String federationProviderName;
        private Map<String, String> signInQueryParameters;
        private Map<String, String> signOutQueryParameters;
        private Map<String, String> tokenQueryParameters;

        public Builder() { }

        public Builder signInQueryParameters(final Map<String, String> signInQueryParameters) {
            this.signInQueryParameters = signInQueryParameters;
            return this;
        }

        public Builder signOutQueryParameters(final Map<String, String> signOutQueryParameters) {
            this.signOutQueryParameters = signOutQueryParameters;
            return this;
        }

        public Builder tokenQueryParameters(final Map<String, String> tokenQueryParameters) {
            this.tokenQueryParameters = tokenQueryParameters;
            return this;
        }

        public Builder scopes(final String... scopes) {
            this.scopes = scopes;
            return this;
        }

        /**
         * This is a Cognito specific parameter that can be specified.
         *
         * @param identityProvider i.e. Facebook, Google, AmazonLogin
         * @return
         */
        public Builder identityProvider(final String identityProvider) {
            this.identityProvider = identityProvider;
            return this;
        }

        public Builder idpIdentifier(final String idpIdentifier) {
            this.idpIdentifier = idpIdentifier;
            return this;
        }

        public Builder disableFederation(final boolean disableFederation) {
            this.disableFederation = disableFederation;
            return this;
        }

        public Builder federationProviderName(final String federationProviderName) {
            this.federationProviderName = federationProviderName;
            return this;
        }

        public HostedUIOptions build() {
            return new HostedUIOptions(this);
        }
    }
}
