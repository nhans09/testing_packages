package com.wolftech.lambdas;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Handler implements RequestHandler<Object, String> {

    @Override
    public String handleRequest(Object input, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Inside CtobProcessHandler function invoked with input: " + input);
        try {
            logger.log("Processing request...");
            String response = "Transaction Successfully";
            logger.log("Response: " + response);
            return response;
        } catch (Exception e) {
            logger.log("Error occurred: " + e.getMessage());
            throw e;
        } 
    }
}
