package responseModels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "token"
    })
    @JsonIgnoreProperties(ignoreUnknown = true)

    public class CreateAuthResponse {
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty("token")
        public String token;
    }



