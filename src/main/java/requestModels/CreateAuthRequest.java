package requestModels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "username",
            "password"
    })

    @JsonIgnoreProperties(ignoreUnknown = true)

    public class CreateAuthRequest {
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty("username")
        public String username;
        @JsonProperty("password")
        public String password;

    }

