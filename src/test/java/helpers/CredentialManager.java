package helpers;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/credentials.properties"
})
public interface CredentialManager extends Config {

    @Config.Key("login")
    String getLogin();

    @Config.Key("password")
    String getPassword();

}
