package com.itsupport.auth.model;

import lombok.*;

/**
 * Represents the authentication response containing the JWT token.
 *
 * This class is used to encapsulate the JWT token returned after a successful
 * authentication. It includes the token as a string which can be used for
 * subsequent authorisation requests.
 *
 * Created by Yolanda Yang
 *
 * Contact:
 * Email: yolanda9264d@hotmail.com
 
 */
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse {

    /**
     * The JWT token issued after successful authentication.
     */
    private String token;
}
