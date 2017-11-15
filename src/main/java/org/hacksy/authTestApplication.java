package org.hacksy;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class authTestApplication extends Application<authTestConfiguration> {

    public static void main(final String[] args) throws Exception {
        new authTestApplication().run(args);
    }

    @Override
    public String getName() {
        return "authTest";
    }

    @Override
    public void initialize(final Bootstrap<authTestConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final authTestConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
