package com.linhbui.myapp;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class project01Application extends Application<project01Configuration> {

    public static void main(final String[] args) throws Exception {
        new project01Application().run(args);

        DBFunctions db = new DBFunctions();
        db.connect_to_db("linhbuidb", "postgres", "Lb22032001..");
    }

    @Override
    public String getName() {
        return "project01";
    }

    @Override
    public void initialize(final Bootstrap<project01Configuration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final project01Configuration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
