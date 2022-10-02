package br.treelogy.modelmicroservice.controllers;


import br.treelogy.modelmicroservice.models.UserModel;
import io.swagger.annotations.*;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.net.HttpURLConnection;

@Api(value = "Endpoint User Controller", protocols = "http")
@Validated
public interface OauthController {

    /**
     *  Endpoint that genereter users
     * @param id the user
     * @return object user
     */

    @ApiOperation(value = "Query the user by the registered id", notes = "User in json", response = UserModel.class)
    @ApiResponses(value = {
            @ApiResponse(code = HttpURLConnection.HTTP_OK, message = "Sucessful request", response = Void.class),
            @ApiResponse(code = HttpURLConnection.HTTP_BAD_REQUEST, message = "Bad request", response = Void.class),
            @ApiResponse(code = HttpURLConnection.HTTP_INTERNAL_ERROR, message = "Unexpected Error", response = Void.class)
    })
    @GetMapping(value = "/user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<UserModel>getUserById(
            @ApiParam(value = "Json input data", required = true) @PathVariable Long id
    ) throws Exception;



    /**
     *  Endpoint that create user
     * @param user the user
     * @return object user
     */

    @ApiOperation(value = "Query the user by the registered id", notes = "User in json", response = UserModel.class)
    @ApiResponses(value = {
            @ApiResponse(code = HttpURLConnection.HTTP_OK, message = "Sucessful request", response = Void.class),
            @ApiResponse(code = HttpURLConnection.HTTP_BAD_REQUEST, message = "Bad request", response = Void.class),
            @ApiResponse(code = HttpURLConnection.HTTP_INTERNAL_ERROR, message = "Unexpected Error", response = Void.class)
    })
    @PostMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<UserModel>createUser(
            @ApiParam(value = "Json input data", required = true) @RequestBody UserModel user
    ) throws Exception;

}
