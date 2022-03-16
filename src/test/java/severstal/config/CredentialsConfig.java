package severstal.config;

import org.aeonbits.owner.Config;

    @Config.Sources("classpath:config/ConfigServer.properties")
    public interface CredentialsConfig extends Config{
        String user();
        String password();
    }

